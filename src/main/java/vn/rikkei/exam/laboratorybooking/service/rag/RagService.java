package vn.rikkei.exam.laboratorybooking.service.rag;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class RagService {

    private final VectorStore vectorStore;
    private final ResourceLoader resourceLoader;

    private static final String CORPUS_PATH = "classpath:tai_lieu_noi_bo.md";
    private static final String SOURCE_NAME = "tai_lieu_noi_bo.md";

    @PostConstruct
    public void ingestCorpusOnStartup() {
        try {
            Resource resource = resourceLoader.getResource(CORPUS_PATH);
            if (!resource.exists()) {
                log.warn("Corpus file {} not found, skipping ingestion.", CORPUS_PATH);
                return;
            }

            String content;
            try (InputStream is = resource.getInputStream()) {
                content = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            }

            // Tách các section theo dấu ## để chunk theo mục chính sách có ý nghĩa
            String[] parts = content.split("(?=## )");
            List<Document> documents = new ArrayList<>();

            int index = 1;
            for (String part : parts) {
                String trimmed = part.trim();
                if (trimmed.isEmpty() || trimmed.startsWith("# Sổ tay")) {
                    continue;
                }

                String sectionTitle = trimmed.split("\n")[0].replace("##", "").trim();
                // Dùng deterministic ID để chống nạp trùng
                String docId = "tai_lieu_noi_bo_chunk_" + index;

                Map<String, Object> metadata = new HashMap<>();
                metadata.put("source", SOURCE_NAME);
                metadata.put("section", sectionTitle);

                Document doc = Document.builder()
                        .id(docId)
                        .text(trimmed)
                        .metadata(metadata)
                        .build();

                documents.add(doc);
                index++;
            }

            if (!documents.isEmpty()) {
                vectorStore.add(documents);
                log.info("Ingested {} policy chunks from {} into PgVectorStore with deterministic IDs.", documents.size(), SOURCE_NAME);
            }
        } catch (Exception e) {
            log.error("Failed to ingest corpus into VectorStore: {}", e.getMessage(), e);
        }
    }

    public List<Document> search(String query) {
        try {
            SearchRequest request = SearchRequest.builder()
                    .query(query)
                    .topK(2)
                    .similarityThreshold(0.4)
                    .build();
            return vectorStore.similaritySearch(request);
        } catch (Exception e) {
            log.error("Error during similarity search: {}", e.getMessage());
            return Collections.emptyList();
        }
    }
}
