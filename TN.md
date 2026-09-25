# BỘ ĐỀ THI TRẮC NGHIỆM CUỐI MÔN
## Môn học: [K24-IT213] AI Integration in Action
- **Thời gian:** 30 phút
- **Dạng bài:** TRẮC NGHIỆM (100 câu)
- **Tổng điểm:** 400

---

## BẢNG ĐÁP ÁN NHANH (1 - 100)

- **1: A** | **2: B** | **3: C** | **4: D** | **5: A** | **6: B** | **7: C** | **8: D** | **9: A** | **10: B**
- **11: C** | **12: D** | **13: A** | **14: B** | **15: C** | **16: D** | **17: A** | **18: B** | **19: C** | **20: D**
- **21: A** | **22: B** | **23: C** | **24: D** | **25: A** | **26: B** | **27: C** | **28: D** | **29: A** | **30: B**
- **31: C** | **32: D** | **33: A** | **34: B** | **35: C** | **36: D** | **37: A** | **38: B** | **39: C** | **40: D**
- **41: A** | **42: B** | **43: C** | **44: D** | **45: A** | **46: B** | **47: C** | **48: D** | **49: A** | **50: B**
- **51: C** | **52: D** | **53: A** | **54: B** | **55: C** | **56: D** | **57: A** | **58: B** | **59: C** | **60: D**
- **61: A** | **62: B** | **63: C** | **64: D** | **65: A** | **66: B** | **67: C** | **68: D** | **69: A** | **70: B**
- **71: C** | **72: D** | **73: A** | **74: B** | **75: C** | **76: D** | **77: A** | **78: B** | **79: C** | **80: D**
- **81: A** | **82: B** | **83: C** | **84: D** | **85: A** | **86: B** | **87: C** | **88: D** | **89: A** | **90: B**
- **91: C** | **92: D** | **93: A** | **94: B** | **95: C** | **96: D** | **97: A** | **98: B** | **99: C** | **100: D**

---

## NỘI DUNG CHI TIẾT CÂU HỎI VÀ ĐÁP ÁN

### Câu 1: `[Dễ]`
Trong kiến trúc Spring AI, interface nào đóng vai trò là abstraction cốt lõi để gửi prompt và nhận phản hồi từ các mô hình ngôn ngữ lớn (LLM)?

- [x] **A. ChatModel**  *(Đáp án đúng)*
- [ ] B. VectorStore
- [ ] C. EmbeddingModel
- [ ] D. PromptTemplate

👉 **Đáp án: A**

---

### Câu 2: `[Dễ]`
Khi triển khai mô hình AI cục bộ qua công cụ Ollama, cổng mạng (port) mặc định nào được Ollama sử dụng để lắng nghe các yêu cầu REST API?

- [ ] A. 8080
- [x] **B. 11434**  *(Đáp án đúng)*
- [ ] C. 5432
- [ ] D. 9092

👉 **Đáp án: B**

---

### Câu 3: `[Dễ]`
Khái niệm 'Token' trong các mô hình ngôn ngữ lớn (LLM) được định nghĩa chính xác nhất là gì?

- [ ] A. Mã định danh duy nhất của mỗi người dùng trong phiên làm việc với ChatClient
- [ ] B. Chuỗi ký tự bảo mật dùng để xác thực và phân quyền truy cập vào API của LLM
- [x] **C. Đơn vị cơ bản (từ hoặc cụm ký tự) mà mô hình dùng để biểu diễn và xử lý văn bản**  *(Đáp án đúng)*
- [ ] D. Số byte dữ liệu nhị phân chính xác của một gói tin HTTP truyền tải qua mạng

👉 **Đáp án: C**

---

### Câu 4: `[Trung bình]`
Tham số `temperature` trong cấu hình `ChatOptions` của Spring AI có tác động trực tiếp như thế nào đến phản hồi của mô hình ngôn ngữ?

- [ ] A. Giới hạn số lượng token tối đa mà LLM được phép sinh ra trong một phản hồi
- [ ] B. Cấu hình thời gian timeout tối đa cho mỗi kết nối HTTP gửi tới máy chủ AI
- [ ] C. Điều chỉnh số lượng câu trả lời song song được tạo ra trong một lượt gọi API
- [x] **D. Kiểm soát độ ngẫu nhiên và tính sáng tạo của câu trả lời do LLM sinh ra**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 5: `[Trung bình]`
Trong dự án Spring Boot, giải pháp nào là chuẩn nhất để chuyển đổi linh hoạt giữa việc gọi Ollama (local) và OpenRouter (cloud) mà không cần thay đổi mã nguồn Java?

- [x] **A. Sử dụng Spring Profiles kết hợp các file application-local.properties và application-cloud.properties**  *(Đáp án đúng)*
- [ ] B. Viết các cấu trúc điều kiện if-else trong Controller để kiểm tra biến môi trường hệ thống máy chủ
- [ ] C. Tạo nhiều file cấu hình XML và nạp thủ công thông qua BeanFactory khi khởi động máy chủ Spring
- [ ] D. Khởi chạy hai máy chủ Spring Boot độc lập trên hai cổng mạng khác nhau rồi cấu hình reverse proxy

👉 **Đáp án: A**

---

### Câu 6: `[Trung bình]`
Trong Spring AI, sự khác biệt cốt lõi về mặt vai trò giữa `SystemMessage` và `UserMessage` là gì?

- [ ] A. SystemMessage chỉ áp dụng cho Cloud LLM, còn UserMessage chỉ áp dụng cho Local LLM
- [x] **B. SystemMessage thiết lập ngữ cảnh và luật ứng xử, còn UserMessage chứa truy vấn của người dùng**  *(Đáp án đúng)*
- [ ] C. SystemMessage chứa câu hỏi thực tế của người dùng, còn UserMessage quy định hạn ngạch token
- [ ] D. SystemMessage được gửi sau khi nhận kết quả, còn UserMessage được gửi ở lượt đầu tiên

👉 **Đáp án: B**

---

### Câu 7: `[Khó]`
Điền phương thức còn thiếu vào vị trí `______` để khởi tạo đối tượng `ChatClient` từ bean `ChatClient.Builder` được Spring Boot tự động tiêm (inject):

```java
@Autowired private ChatClient.Builder chatClientBuilder; public ChatService(ChatClient.Builder builder) { this.chatClient = builder.______(); }
```

- [ ] A. create()
- [ ] B. init()
- [x] **C. build()**  *(Đáp án đúng)*
- [ ] D. getClient()

👉 **Đáp án: C**

---

### Câu 8: `[Khó]`
Khi cấu hình gọi Cloud LLM qua OpenRouter với `spring.ai.openai.base-url=https://openrouter.ai/api/v1` nhưng bỏ trống thuộc tính `api-key`, ứng dụng sẽ nhận mã lỗi HTTP nào từ server OpenRouter?

- [ ] A. 400 Bad Request
- [ ] B. 403 Forbidden
- [ ] C. 404 Not Found
- [x] **D. 401 Unauthorized**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 9: `[Khó]`
Trong Spring AI, đối tượng nào đại diện cho phản hồi hoàn chỉnh trả về từ phương thức gọi đồng bộ `chatModel.call(Prompt prompt)`?

- [x] **A. ChatResponse**  *(Đáp án đúng)*
- [ ] B. Generation
- [ ] C. AssistantMessage
- [ ] D. ModelResult

👉 **Đáp án: A**

---

### Câu 10: `[Khó]`
Một ứng dụng Spring Boot gặp lỗi vượt giới hạn Context Window của LLM khi lưu giữ lịch sử trò chuyện quá dài. Giải pháp kỹ thuật nào sau đây là tối ưu nhất?

- [ ] A. Tăng giá trị tham số temperature lên mức 1.0 để mô hình tự động nén nội dung phản hồi
- [x] **B. Áp dụng kỹ thuật Message Window (cửa sổ trượt) hoặc tóm tắt hội thoại định kỳ cho phiên chat**  *(Đáp án đúng)*
- [ ] C. Tăng giá trị max-tokens trong ChatOptions lên mức tối đa mà phần cứng máy chủ cho phép
- [ ] D. Chuyển đổi định dạng prompt từ văn bản thuần sang mã hóa Base64 nén dữ liệu trước khi gửi

👉 **Đáp án: B**

---

### Câu 11: `[Khó]`
Xem đoạn mã cấu hình `ChatOptions` dưới đây. Nhận định nào mô tả chính xác nhất hành vi của LLM khi nhận cấu hình này?

```java
ChatOptions options = ChatOptions.builder() .temperature(0.0) .topP(0.1) .build();
```

- [ ] A. Mô hình sẽ phản hồi ngẫu nhiên rất cao và sinh ra nhiều biến thể văn phong phong phú cho mỗi lần gọi
- [ ] B. Mô hình tự động chuyển sang chế độ phát luồng SSE nhằm tăng tốc độ hiển thị từng từ cho client
- [x] **C. Mô hình hoạt động ở chế độ xác định cao (deterministic), ưu tiên câu trả lời chính xác và ít sáng tạo**  *(Đáp án đúng)*
- [ ] D. Mô hình sẽ từ chối xử lý và ném ngoại lệ vì tham số temperature bắt buộc phải nhận giá trị lớn hơn 0

👉 **Đáp án: C**

---

### Câu 12: `[Khó]`
Quan sát đoạn mã Spring AI sử dụng `ChatClient` fluent API dưới đây và chỉ ra nhận định CHÍNH XÁC nhất về tính hợp lệ của đoạn mã:

```java
String response = chatClient.prompt() .system("Bạn là chuyên gia tư vấn tuyển sinh") .user("Học phí ngành CNTT là bao nhiêu?") .call() .content();
```

- [ ] A. Phương thức .system(...) không tồn tại trong cấu trúc RequestSpec của ChatClient khi gọi API
- [ ] B. Phương thức .call() bắt buộc phải nhận tham số đầu vào là một đối tượng Prompt được tạo thủ công
- [ ] C. Phương thức .content() phải đổi tên thành .getText() thì mới lấy được chuỗi kết quả từ response trả về
- [x] **D. Đoạn mã hoàn toàn đúng chuẩn cú pháp Fluent API của ChatClient trong Spring AI ở phiên bản hiện đại**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 13: `[Dễ]`
Trong Spring WebFlux và Spring AI, kiểu dữ liệu reactive nào được sử dụng để phát luồng dữ liệu văn bản từ LLM về phía client theo thời gian thực?

- [x] **A. Flux<String>**  *(Đáp án đúng)*
- [ ] B. CompletableFuture<String>
- [ ] C. Mono<String>
- [ ] D. List<String>

👉 **Đáp án: A**

---

### Câu 14: `[Dễ]`
Để trình duyệt web nhận diện và xử lý được phản hồi dạng Server-Sent Events (SSE) từ Spring Controller, thuộc tính `produces` cần được thiết lập giá trị nào?

- [ ] A. MediaType.APPLICATION_JSON_VALUE
- [x] **B. MediaType.TEXT_EVENT_STREAM_VALUE**  *(Đáp án đúng)*
- [ ] C. MediaType.TEXT_HTML_VALUE
- [ ] D. MediaType.APPLICATION_OCTET_STREAM_VALUE

👉 **Đáp án: B**

---

### Câu 15: `[Dễ]`
Quy trình ETL xử lý dữ liệu với sự hỗ trợ của LLM gồm 3 giai đoạn theo đúng thứ tự logic là gì?

- [ ] A. Nạp vào CSDL (Load) -> Tinh chỉnh Prompt (Transform) -> Thu thập kết quả xử lý (Extract)
- [ ] B. Huấn luyện mô hình (Extract) -> Chuyển đổi Token (Transform) -> Lưu trữ vào Vector DB (Load)
- [x] **C. Trích xuất dữ liệu thô (Extract) -> Biến đổi bằng LLM (Transform) -> Nạp vào CSDL đích (Load)**  *(Đáp án đúng)*
- [ ] D. Biến đổi dữ liệu (Transform) -> Trích xuất ngữ nghĩa (Extract) -> Nạp vào bộ nhớ Cache (Load)

👉 **Đáp án: C**

---

### Câu 16: `[Trung bình]`
Thành phần nào trong Spring AI chịu trách nhiệm chuyển đổi trực tiếp văn bản JSON do LLM sinh ra thành đối tượng Java POJO có kiểu dữ liệu tường minh?

- [ ] A. StringOutputConverter
- [ ] B. VectorStoreConverter
- [ ] C. PromptTemplateTransformer
- [x] **D. BeanOutputConverter<T>**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 17: `[Trung bình]`
Mục đích chính của phương thức `converter.getFormat()` khi được chèn vào prompt gửi cho LLM là gì?

- [x] **A. Cung cấp hướng dẫn định dạng và JSON Schema để ép LLM trả về đúng cấu trúc yêu cầu của hệ thống**  *(Đáp án đúng)*
- [ ] B. Mã hóa toàn bộ nội dung prompt thành chuỗi Base64 trước khi gửi đi qua đường truyền mạng công cộng
- [ ] C. Thiết lập giới hạn số lượng ký tự tối đa mà LLM được phép sinh ra trong văn bản phản hồi của mình
- [ ] D. Gửi thông tin chứng thực API key trực tiếp qua nội dung prompt thay cho header của HTTP request

👉 **Đáp án: A**

---

### Câu 18: `[Trung bình]`
Khi triển khai ứng dụng Spring Boot phát SSE qua Nginx reverse proxy, hiện tượng dữ liệu bị dồn lại rồi hiển thị cùng lúc thay vì hiển thị từng từ (streaming) bắt nguồn từ nguyên nhân nào?

- [ ] A. Nginx tự động giải mã và mã hóa SSL nhiều lần làm chậm tốc độ truyền các gói tin nhỏ trên mạng
- [x] **B. Cơ chế Proxy Buffering của Nginx đang giữ lại dữ liệu trong bộ đệm trước khi gửi về cho client**  *(Đáp án đúng)*
- [ ] C. Phiên bản giao thức HTTP của Nginx không hỗ trợ việc truyền tải các gói tin văn bản dạng phát luồng
- [ ] D. Spring WebFlux tự động chuyển sang chế độ đồng bộ khi phát hiện ứng dụng đang đứng sau reverse proxy

👉 **Đáp án: B**

---

### Câu 19: `[Trung bình]`
Header HTTP nào cần được cấu hình phía server Spring Boot hoặc Nginx để vô hiệu hóa tính năng buffering trên Nginx đối với kết nối SSE?

- [ ] A. Cache-Control: max-age=3600
- [ ] B. Content-Encoding: gzip
- [x] **C. X-Accel-Buffering: no**  *(Đáp án đúng)*
- [ ] D. Transfer-Mode: continuous

👉 **Đáp án: C**

---

### Câu 20: `[Trung bình]`
Trong đối tượng `ChatResponse` của Spring AI, phương thức nào trả về đối tượng `Generation` chứa nội dung phản hồi chính của mô hình?

- [ ] A. getPayload()
- [ ] B. getAnswer()
- [ ] C. getBody()
- [x] **D. getResult()**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 21: `[Trung bình]`
Trong `BeanOutputConverter`, JSON Schema được tự động sinh ra dựa trên cơ chế nào của nền tảng Java?

- [x] **A. Cơ chế Java Reflection kết hợp thư viện Jackson JSON Schema Generator từ class định nghĩa sẵn**  *(Đáp án đúng)*
- [ ] B. Cơ chế biên dịch Bytecode nâng cao của Spring CGLIB để quét các thuộc tính khi runtime khởi chạy
- [ ] C. Tự động đọc dữ liệu mẫu từ database schema khi máy chủ ứng dụng Spring Boot bắt đầu khởi động
- [ ] D. Gửi request thăm dò lên server OpenAI để yêu cầu trả về định nghĩa cấu trúc JSON tương ứng

👉 **Đáp án: A**

---

### Câu 22: `[Khó]`
Điền phương thức còn thiếu vào vị trí `______` để hoàn thiện luồng phát dữ liệu streaming bằng `ChatClient` trong Spring AI:

```java
@GetMapping(value = "/stream-chat", produces = MediaType.TEXT_EVENT_STREAM_VALUE) public Flux streamChat(@RequestParam String prompt) { return chatClient.prompt() .user(prompt) .stream() .______(); }
```

- [ ] A. toList()
- [x] **B. content()**  *(Đáp án đúng)*
- [ ] C. text()
- [ ] D. toString()

👉 **Đáp án: B**

---

### Câu 23: `[Khó]`
Khi sử dụng `BeanOutputConverter`, trường hợp nào dưới đây thường xuyên gây ra ngoại lệ `JsonParseException` khi nhận kết quả từ LLM?

- [ ] A. LLM trả về phản hồi chứa tiếng Việt có dấu đúng chuẩn định dạng ký tự quốc tế UTF-8
- [ ] B. Đối tượng POJO có chứa các trường kiểu dữ liệu nguyên thủy như int, double hoặc boolean
- [x] **C. LLM tự động bọc chuỗi JSON kết quả trong các khối định dạng markdown như ```json ... ```**  *(Đáp án đúng)*
- [ ] D. Prompt đã chỉ định rõ ràng và chi tiết cấu trúc JSON Schema cần phản hồi cho mô hình AI

👉 **Đáp án: C**

---

### Câu 24: `[Khó]`
Biểu thức Regular Expression nào dưới đây loại bỏ hiệu quả các thẻ mở và đóng khối mã markdown (```json và ```) để lấy chuỗi JSON thuần túy?

- [ ] A. text.split(",")[0].trim()
- [ ] B. text.substring(0, 10).trim()
- [ ] C. text.replace("{", "").replace("}", "")
- [x] **D. text.replaceAll("^```[a-zA-Z]*\\n|\\n```$", "").trim()**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 25: `[Khó]`
Khi sử dụng phương thức `chatClient.prompt().user(...).call().entity(MyDto.class)`, nếu JSON do LLM trả về có thêm thuộc tính lạ chưa khai báo trong `MyDto`, hành vi mặc định của Jackson là gì nếu chưa cấu hình bỏ qua thuộc tính lạ?

- [x] **A. Ném ra ngoại lệ UnrecognizedPropertyException làm gián đoạn luồng xử lý của ứng dụng**  *(Đáp án đúng)*
- [ ] B. Tự động thêm các trường lạ đó vào một Map nội bộ ẩn bên trong đối tượng POJO đã tạo
- [ ] C. Bỏ qua các trường đó trong im lặng và tự động gán giá trị null cho tất cả thuộc tính
- [ ] D. Tự động sửa lại định nghĩa cấu trúc class Java trong bộ nhớ khi đang chạy chương trình

👉 **Đáp án: A**

---

### Câu 26: `[Khó]`
Khi người dùng đóng tab trình duyệt trong lúc `Flux` đang stream nội dung từ LLM về, Spring WebFlux sẽ xử lý tín hiệu hủy luồng này như thế nào?

- [ ] A. Tiếp tục stream đến khi hoàn tất phản hồi rồi lưu tạm vào bộ nhớ đệm của máy chủ web
- [x] **B. Gửi tín hiệu hủy (cancel signal) ngược lên upstream để dừng việc nhận tiếp dữ liệu từ LLM**  *(Đáp án đúng)*
- [ ] C. Ném ra ngoại lệ OutOfMemoryError do luồng reactive bị gián đoạn đột ngột giữa chừng xử lý
- [ ] D. Khởi động lại toàn bộ tiến trình Spring Boot để giải phóng kết nối mạng bị rò rỉ bộ nhớ

👉 **Đáp án: B**

---

### Câu 27: `[Khó]`
Quan sát đoạn mã Spring Boot thực hiện tác vụ ETL sau. Lỗ hổng nghiêm trọng nào về mặt quản lý tài nguyên cơ sở dữ liệu đang tồn tại?

```java
@Transactional public void processCustomerData(String rawText) { CustomerEntity entity = customerRepository.findById(1L).orElseThrow(); Prompt prompt = new Prompt("Phân tích thông tin: " + rawText); ChatResponse response = chatModel.call(prompt); // Gọi API LLM qua mạng (3-5 giây) entity.setSummary(response.getResult().getOutput().getContent()); customerRepository.save(entity); }
```

- [ ] A. Phương thức findById không thể hoạt động hợp lệ bên trong phạm vi khai báo của annotation @Transactional
- [ ] B. Đối tượng ChatResponse không thể lấy được chuỗi nội dung thông qua phương thức getContent() của lớp Output
- [x] **C. Giữ Database Connection quá lâu trong lúc chờ gọi API LLM gây cạn kiệt Connection Pool (Connection Starvation)**  *(Đáp án đúng)*
- [ ] D. JPA Repository bắt buộc phải gọi lệnh flush() thủ công thì dữ liệu mới được lưu xuống database của hệ thống

👉 **Đáp án: C**

---

### Câu 28: `[Khó]`
Để tối ưu chi phí token và tốc độ phản hồi khi trích xuất dữ liệu có cấu trúc từ văn bản dài bằng LLM, biện pháp kỹ thuật nào sau đây là hiệu quả nhất?

- [ ] A. Đặt tham số temperature = 1.0 để mô hình tự do chọn lựa định dạng câu trả lời ngắn nhất có thể trong ngữ cảnh
- [ ] B. Gửi kèm toàn bộ mã nguồn Java của class DTO vào prompt để LLM tự đối chiếu và xác định kiểu dữ liệu tương ứng
- [ ] C. Thực hiện gọi LLM nhiều lần độc lập liên tiếp, mỗi lần chỉ trích xuất duy nhất một trường dữ liệu nhỏ trong văn bản
- [x] **D. Tiền xử lý lọc bỏ các đoạn văn không liên quan và chỉ định JSON Schema với các trường ngắn gọn cần thiết**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 29: `[Khó]`
Tại sao việc gọi phương thức `.block()` trên một `Mono` hoặc `Flux` bên trong luồng xử lý của Netty (Reactive Event Loop) bị coi là một anti-pattern nghiêm trọng?

- [x] **A. Vì phương thức .block() sẽ làm khóa luồng Event Loop, khiến server không thể tiếp nhận các request khác và gây treo ứng dụng**  *(Đáp án đúng)*
- [ ] B. Vì WebFlux bắt buộc phải sử dụng kiến trúc đa luồng đồng bộ truyền thống của máy chủ web Apache Tomcat khi hoạt động
- [ ] C. Vì phương thức .block() luôn ném ra ngoại lệ NullPointerException trong mọi tình huống khi gọi trên luồng Event Loop
- [ ] D. Vì dữ liệu nhận về qua .block() sẽ tự động bị xóa sạch khỏi bộ nhớ RAM của hệ thống sau khi đọc xong nội dung

👉 **Đáp án: A**

---

### Câu 30: `[Khó]`
Để khắc phục triệt để vấn đề Connection Starvation trong quy trình ETL gọi LLM, cách tái cấu trúc mã nguồn nào sau đây là chuẩn mực nhất?

- [ ] A. Tăng kích thước Database Connection Pool lên gấp 10 lần trong file cấu hình application.properties của dự án
- [x] **B. Tách việc gọi LLM thành phương thức riêng không có @Transactional, chỉ mở transaction ngắn khi lưu dữ liệu đã biến đổi**  *(Đáp án đúng)*
- [ ] C. Thêm chú thích @Async vào trực tiếp phương thức chứa @Transactional hiện tại của service xử lý nghiệp vụ
- [ ] D. Chuyển đổi toàn bộ cơ sở dữ liệu quan hệ sang dạng in-memory H2 database để tăng tốc độ thực thi các thao tác ghi

👉 **Đáp án: B**

---

### Câu 31: `[Dễ]`
Khái niệm 'Function Calling' (hay Tool Calling) trong kiến trúc AI Agent cho phép LLM thực hiện khả năng gì?

- [ ] A. Tự động sửa mã nguồn Java của ứng dụng khi phát hiện các lỗi cú pháp biên dịch trong chương trình
- [ ] B. Tự biên dịch lại mã bytecode để tối ưu tốc độ sinh token trên phần cứng máy chủ cục bộ khi xử lý
- [x] **C. Quyết định gọi các hàm hoặc công cụ bên ngoài với tham số có cấu trúc khi cần truy xuất thông tin hoặc tạo hành động**  *(Đáp án đúng)*
- [ ] D. Tự động sao lưu cơ sở dữ liệu định kỳ mỗi khi người dùng gửi một tin nhắn mới vào phiên chat của hệ thống

👉 **Đáp án: C**

---

### Câu 32: `[Dễ]`
Annotation nào trong Spring AI được đặt trên method `@Bean` để cung cấp mô tả ngữ nghĩa chi tiết giúp LLM hiểu khi nào cần sử dụng công cụ đó?

- [ ] A. @Qualifier
- [ ] B. @Service
- [ ] C. @Value
- [x] **D. @Description**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 33: `[Dễ]`
Điểm khác biệt cốt lõi giữa `InMemoryChatMemory` và giải pháp lưu trữ `ChatMemory` trên CSDL quan hệ hoặc Redis là gì?

- [x] **A. InMemoryChatMemory sẽ mất toàn bộ dữ liệu lịch sử hội thoại khi ứng dụng hoặc server khởi động lại**  *(Đáp án đúng)*
- [ ] B. InMemoryChatMemory hoàn toàn không hỗ trợ việc lưu trữ các tin nhắn dạng văn bản thuần túy của người dùng
- [ ] C. Giải pháp CSDL không cho phép tìm kiếm và truy xuất danh sách tin nhắn theo định danh conversationId
- [ ] D. InMemoryChatMemory chỉ hoạt động được khi máy chủ có kết nối mạng Internet ổn định và liên tục với bên ngoài

👉 **Đáp án: A**

---

### Câu 34: `[Trung bình]`
Trong Spring AI, khi định nghĩa một Tool dạng Function Bean, interface chuẩn nào của Java thường được sử dụng để nhận request và trả về response?

- [ ] A. java.lang.Runnable
- [x] **B. java.util.function.Function<Request, Response>**  *(Đáp án đúng)*
- [ ] C. java.util.concurrent.Callable<Response>
- [ ] D. java.util.function.Consumer<Request>

👉 **Đáp án: B**

---

### Câu 35: `[Trung bình]`
Vòng lặp Agent Loop trong kiến trúc AI Agent diễn ra theo trình tự các bước cơ bản nào?

- [ ] A. Thực thi toàn bộ Tool -> Tổng hợp dữ liệu thành file text -> Gửi một lần duy nhất cho LLM -> Đóng kết nối mạng
- [ ] B. Nhận truy vấn -> Nén prompt thành vector -> Lưu vào Database -> Trả về mã thành công HTTP 200 cho client
- [x] **C. Nhận truy vấn -> LLM phân tích -> Yêu cầu gọi Tool -> Ứng dụng thực thi Tool -> Gửi kết quả cho LLM -> LLM phản hồi cuối**  *(Đáp án đúng)*
- [ ] D. Gửi truy vấn lên LLM -> Lưu trực tiếp phản hồi vào ChatMemory mà không qua bước kiểm tra định dạng dữ liệu

👉 **Đáp án: C**

---

### Câu 36: `[Trung bình]`
Interface nào trong Spring AI cung cấp hợp đồng (contract) chuẩn để lưu trữ và truy xuất lịch sử hội thoại nhiều lượt giữa người dùng và AI?

- [ ] A. ConversationSession
- [ ] B. MessageCache
- [ ] C. HistoryStore
- [x] **D. ChatMemory**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 37: `[Trung bình]`
Trong Spring AI `ChatMemory`, định danh nào được dùng để phân tách và quản lý phiên hội thoại độc lập của từng người dùng?

- [x] **A. conversationId**  *(Đáp án đúng)*
- [ ] B. transactionId
- [ ] C. threadNumber
- [ ] D. promptKey

👉 **Đáp án: A**

---

### Câu 38: `[Trung bình]`
Khi LLM quyết định gọi một Tool, phản hồi ban đầu mà LLM trả về cho ứng dụng Spring AI chứa nội dung gì?

- [ ] A. Câu trả lời hoàn chỉnh kèm theo kết quả tính toán chi tiết của Tool cho người dùng đầu cuối
- [x] **B. Tên của Tool cần gọi cùng chuỗi JSON chứa các đối số (arguments) truyền vào hàm tương ứng**  *(Đáp án đúng)*
- [ ] C. Mã nhị phân đã được biên dịch của phương thức Java tương ứng trên máy chủ backend của hệ thống
- [ ] D. Toàn bộ nội dung của database schema và cấu trúc các bảng liên quan trong hệ thống cơ sở dữ liệu

👉 **Đáp án: B**

---

### Câu 39: `[Khó]`
Điền annotation còn thiếu vào vị trí `______` để khai báo mô tả chức năng của Tool cho LLM:

```java
@Configuration public class ToolConfig { @Bean @______("Tra cứu giá vàng hiện tại theo từng khu vực địa lý") public Function getGoldPrice() { return request -> new GoldPriceResponse(request.region(), 85000000.0); } }
```

- [ ] A. @ToolName
- [ ] B. @FunctionDoc
- [x] **C. @Description**  *(Đáp án đúng)*
- [ ] D. @Schema

👉 **Đáp án: C**

---

### Câu 40: `[Khó]`
Khi định nghĩa Record tham số cho một Tool: `public record OrderStatusRequest(String orderId) {}`, việc bổ sung `@JsonPropertyDescription` cho trường `orderId` mang lại tác dụng gì?

- [ ] A. Tự động mã hóa giá trị orderId bằng thuật toán băm SHA-256 an toàn trong bộ nhớ của tiến trình
- [ ] B. Đổi tên trường thành chữ in hoa khi lưu vào cơ sở dữ liệu quan hệ của hệ thống quản lý đơn hàng
- [ ] C. Bắt buộc người dùng phải xác thực mật khẩu OTP trước khi gọi hàm thực thi Tool trên máy chủ
- [x] **D. Cung cấp chỉ dẫn cụ thể về ý nghĩa và định dạng của trường giúp LLM trích xuất tham số chính xác**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 41: `[Khó]`
Điền tên bean còn thiếu vào vị trí `______` để kích hoạt Tool có tên bean là `weatherFunction` khi gọi `ChatClient`:

```java
String reply = chatClient.prompt() .user("Thời tiết Hà Nội hôm nay thế nào?") .functions("______") .call() .content();
```

- [x] **A. weatherFunction**  *(Đáp án đúng)*
- [ ] B. WeatherService.class
- [ ] C. executeWeather
- [ ] D. getWeatherBean

👉 **Đáp án: A**

---

### Câu 42: `[Khó]`
Một hệ thống AI Agent cung cấp Tool thực hiện hành động nhạy cảm (như chuyển tiền ngân hàng, cập nhật dữ liệu quan trọng). Kiến trúc nào sau đây là an toàn và chuẩn mực nhất?

- [ ] A. Cho phép Agent tự động thực thi và ghi log thông báo sau khi đã hoàn tất giao dịch tài chính trên máy chủ
- [x] **B. Áp dụng mô hình Human-in-the-loop: Agent tạo yêu cầu chờ xác nhận từ con người trước khi thực thi lệnh quan trọng**  *(Đáp án đúng)*
- [ ] C. Giảm temperature về 0 để đảm bảo LLM không bao giờ đưa ra các quyết định sai lầm khi gọi các hàm nghiệp vụ
- [ ] D. Tăng thời gian timeout của kết nối HTTP lên 120 giây để chờ hệ thống hoàn tất xử lý các tác vụ phức tạp

👉 **Đáp án: B**

---

### Câu 43: `[Khó]`
Khi xây dựng AI Agent hỗ trợ gọi Tool, giải pháp nào dưới đây là bắt buộc để ngăn chặn Agent rơi vào vòng lặp gọi công cụ vô tận (Infinite Tool Loop)?

- [ ] A. Tăng giá trị tham số top_p lên 1.0 trong cấu hình ChatOptions khi khởi tạo ứng dụng Spring Boot
- [ ] B. Bỏ qua kết quả trả về của Tool và luôn trả về chuỗi rỗng cho mô hình ngôn ngữ lớn trong mỗi chu kỳ
- [x] **C. Thiết lập giới hạn số lần lặp tối đa (max iterations) và cơ chế ngắt khi vượt ngưỡng cho phép**  *(Đáp án đúng)*
- [ ] D. Xóa bỏ toàn bộ annotation @Description của các Tool đã đăng ký trong dự án để LLM không tự gọi lại

👉 **Đáp án: C**

---

### Câu 44: `[Khó]`
Cơ chế `MessageWindowChatMemory` trong Spring AI giúp quản lý bộ nhớ hội thoại theo nguyên lý nào?

- [ ] A. Lưu trữ không giới hạn toàn bộ tin nhắn từ khi tài khoản người dùng được tạo trên hệ thống ứng dụng
- [ ] B. Tự động xóa sạch tin nhắn sau mỗi 5 giây kể từ khi nhận được phản hồi từ máy chủ AI của nhà cung cấp
- [ ] C. Chỉ lưu lại duy nhất các tin nhắn do SystemMessage của quản trị viên hệ thống sinh ra trong phiên chat
- [x] **D. Chỉ giữ lại N tin nhắn gần nhất trong cửa sổ trượt để tránh tràn Context Window của LLM khi trò chuyện**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 45: `[Khó]`
Nếu một Java Function Tool bị ném ngoại lệ `RuntimeException` trong quá trình thực thi mà ứng dụng không bắt (catch) và xử lý, hậu quả trực tiếp là gì?

- [x] **A. Vòng lặp Agent bị ngắt đột ngột và ném lỗi 500 thay vì trả thông điệp lỗi cho LLM để mô hình tự điều chỉnh**  *(Đáp án đúng)*
- [ ] B. LLM tự động bỏ qua lỗi và tự sáng tạo ra dữ liệu giả định trả về cho người dùng trong phiên trò chuyện
- [ ] C. Máy chủ Spring Boot tự động khởi động lại toàn bộ container Docker chứa ứng dụng đang chạy trên máy chủ
- [ ] D. Toàn bộ dữ liệu lịch sử trong ChatMemory của người dùng bị xóa trắng ngay lập tức khi xảy ra ngoại lệ

👉 **Đáp án: A**

---

### Câu 46: `[Khó]`
Kỹ thuật Parallel Tool Calling (gọi công cụ song song) của các mô hình LLM hiện đại đem lại lợi ích nổi bật nào?

- [ ] A. Tăng gấp đôi dung lượng bộ nhớ RAM khả dụng của máy chủ ứng dụng Java khi chạy các tác vụ tải nặng
- [x] **B. Cho phép LLM yêu cầu thực thi đồng thời nhiều Tool độc lập trong cùng một lượt phản hồi giúp giảm độ trễ**  *(Đáp án đúng)*
- [ ] C. Loại bỏ hoàn toàn sự cần thiết của thành phần ChatMemory trong kiến trúc hệ thống phát triển AI Agent
- [ ] D. Đảm bảo tỷ lệ chính xác 100% không bao giờ xảy ra lỗi khi gọi các Tool của bên thứ ba qua mạng Internet

👉 **Đáp án: B**

---

### Câu 47: `[Dễ]`
Thuật ngữ RAG trong lĩnh vực phát triển ứng dụng Generative AI là viết tắt của cụm từ nào?

- [ ] A. Real-time Agent Generation
- [ ] B. Recursive Automated Graph
- [x] **C. Retrieval-Augmented Generation**  *(Đáp án đúng)*
- [ ] D. Relational Augmented Gateway

👉 **Đáp án: C**

---

### Câu 48: `[Dễ]`
Vector Embedding trong xử lý ngôn ngữ tự nhiên và AI được hiểu là gì?

- [ ] A. Một khóa chính tự tăng dạng số nguyên trong bảng cơ sở dữ liệu quan hệ của hệ thống quản lý
- [ ] B. Đoạn mã hash MD5 dùng để kiểm tra tính toàn vẹn của tệp tài liệu PDF trên máy chủ lưu trữ
- [ ] C. Cấu trúc cây thư mục phân cấp lưu trữ các tệp văn bản trên ổ đĩa máy chủ backend của ứng dụng
- [x] **D. Một mảng các số thực biểu diễn tọa độ ngữ nghĩa của một đoạn văn bản trong không gian đa chiều**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 49: `[Dễ]`
Để kích hoạt tính năng lưu trữ và tìm kiếm vector trong cơ sở dữ liệu PostgreSQL, câu lệnh SQL nào cần được thực thi?

- [x] **A. CREATE EXTENSION IF NOT EXISTS vector;**  *(Đáp án đúng)*
- [ ] B. ENABLE MODULE pg_ai_search;
- [ ] C. INSTALL PLUGIN vector_store;
- [ ] D. ALTER SYSTEM SET vector_enabled = true;

👉 **Đáp án: A**

---

### Câu 50: `[Dễ]`
Hiện tượng 'Hallucination' (ảo tưởng) của LLM trong các ứng dụng thực tế được định nghĩa là gì?

- [ ] A. Hiện tượng LLM phản hồi với tốc độ quá nhanh khiến đường truyền mạng bị nghẽn cục bộ tạm thời
- [x] **B. Mô hình tự tin đưa ra thông tin sai sự thật hoặc hoàn toàn không có thực trong dữ liệu thực tế**  *(Đáp án đúng)*
- [ ] C. LLM từ chối trả lời tất cả các câu hỏi liên quan đến lập trình phần mềm của người dùng gửi lên
- [ ] D. Sự cố máy chủ LLM bị quá tải và trả về mã lỗi HTTP 503 cho ứng dụng gọi API từ xa của hệ thống

👉 **Đáp án: B**

---

### Câu 51: `[Trung bình]`
Đoạn mã SQL nào tạo bảng lưu trữ vector đúng chuẩn trong PostgreSQL pgvector với 1536 chiều?

- [ ] A. CREATE TABLE items (id BIGSERIAL PRIMARY KEY, content TEXT, embedding ARRAY_FLOAT[1536]);
- [ ] B. CREATE TABLE items (id BIGSERIAL PRIMARY KEY, content TEXT, embedding BLOB(1536));
- [x] **C. CREATE TABLE items (id BIGSERIAL PRIMARY KEY, content TEXT, embedding vector(1536));**  *(Đáp án đúng)*
- [ ] D. CREATE TABLE items (id BIGSERIAL PRIMARY KEY, content TEXT, embedding JSONB_VECTOR(1536));

👉 **Đáp án: C**

---

### Câu 52: `[Trung bình]`
Tại sao trong quy trình Ingestion của RAG, chúng ta bắt buộc phải chia nhỏ tài liệu dài thành nhiều đoạn (Chunking) trước khi lưu vào Vector Database?

- [ ] A. Vì cơ sở dữ liệu vector không thể lưu trữ các chuỗi ký tự dài hơn 50 từ trong một bản ghi của bảng
- [ ] B. Để giảm chi phí lưu trữ ổ cứng của máy chủ cơ sở dữ liệu xuống mức thấp nhất có thể cho hệ thống
- [ ] C. Vì các mô hình embedding chỉ xử lý được đúng 1 từ duy nhất cho mỗi lần gọi hàm mã hóa dữ liệu
- [x] **D. Giúp tăng độ chính xác khi tìm kiếm ngữ nghĩa cục bộ và phù hợp với giới hạn Context Window của LLM**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 53: `[Trung bình]`
Trong Spring AI, interface nào đại diện cho dịch vụ chuyển đổi chuỗi văn bản thuần túy thành vector embedding?

- [x] **A. EmbeddingModel**  *(Đáp án đúng)*
- [ ] B. VectorModel
- [ ] C. TokenizerModel
- [ ] D. SemanticModel

👉 **Đáp án: A**

---

### Câu 54: `[Trung bình]`
Phương pháp nào sau đây trong Prompt Engineering là giải pháp trực tiếp và hiệu quả nhất để giảm thiểu hiện tượng Hallucination khi triển khai RAG?

- [ ] A. Tăng giá trị tham số temperature lên 1.5 để mô hình mở rộng tri thức và suy luận đa dạng cho các câu trả lời
- [x] **B. Sử dụng Grounding Prompt: ép mô hình chỉ trả lời dựa trên ngữ cảnh (Context) được cung cấp, nếu không có thì trả lời không biết**  *(Đáp án đúng)*
- [ ] C. Không cung cấp tài liệu tham khảo mà để mô hình tự suy luận từ tập dữ liệu huấn luyện ban đầu của nhà phát triển
- [ ] D. Chuyển đổi toàn bộ câu hỏi của người dùng sang dạng chữ in hoa trước khi gửi đi qua giao thức kết nối API

👉 **Đáp án: B**

---

### Câu 55: `[Trung bình]`
Trong cơ sở dữ liệu vector (như `pgvector`), chỉ mục `HNSW` (Hierarchical Navigable Small World) có ưu điểm nổi bật nào so với chỉ mục `IVFFlat`?

- [ ] A. Dung lượng bộ nhớ RAM tiêu thụ luôn ít hơn 10 lần so với cấu trúc bảng gốc ban đầu của cơ sở dữ liệu
- [ ] B. Hoàn toàn không cần xây dựng chỉ mục trước khi thực hiện các câu truy vấn tìm kiếm dữ liệu trên bảng
- [x] **C. Tốc độ truy vấn tìm kiếm láng giềng gần nhất (kNN) cực nhanh và độ thu hồi (recall) vượt trội trên tập dữ liệu lớn**  *(Đáp án đúng)*
- [ ] D. Chỉ hỗ trợ kiểu dữ liệu văn bản thuần chứ không hỗ trợ các mảng số thực vector đa chiều của mô hình nhúng

👉 **Đáp án: C**

---

### Câu 56: `[Trung bình]`
Trong lớp `Document` của Spring AI, thuộc tính nào được thiết kế để lưu giữ các thông tin bổ trợ có cấu trúc như `author`, `source_file`, `page_number`?

- [ ] A. content
- [ ] B. id
- [ ] C. vector
- [x] **D. metadata**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 57: `[Khó]`
Điền phương thức còn thiếu vào vị trí `______` để thực hiện tìm kiếm các đoạn tài liệu có nội dung tương đồng trong `VectorStore` của Spring AI:

```java
List similarDocs = vectorStore.______( SearchRequest.builder() .query("Chính sách bảo hành sản phẩm") .topK(3) .build() );
```

- [x] **A. similaritySearch**  *(Đáp án đúng)*
- [ ] B. searchByText
- [ ] C. findNearest
- [ ] D. queryVector

👉 **Đáp án: A**

---

### Câu 58: `[Khó]`
Khi cấu hình bảng `vector_store` trong PostgreSQL với kiểu dữ liệu `vector(1536)`, nếu `EmbeddingModel` của ứng dụng sinh ra vector có 768 chiều, lỗi nào sẽ xảy ra khi thực thi truy vấn?

- [ ] A. PostgreSQL tự động chèn thêm 768 số 0 vào cuối vector để khớp kích thước yêu cầu của bảng dữ liệu
- [x] **B. Cơ sở dữ liệu ném ra ngoại lệ SQL báo lỗi không khớp số chiều vector (Dimension mismatch)**  *(Đáp án đúng)*
- [ ] C. Ứng dụng tự động chuyển sang tìm kiếm bằng từ khóa SQL LIKE truyền thống trong bảng dữ liệu tương ứng
- [ ] D. PostgreSQL tự động cắt bớt cấu trúc bảng dữ liệu về kích thước 768 để tương thích với model ứng dụng

👉 **Đáp án: B**

---

### Câu 59: `[Khó]`
Điền phương thức còn thiếu vào vị trí `______` để thiết lập ngưỡng tương đồng tối thiểu trong đối tượng `SearchRequest` của Spring AI:

```java
SearchRequest request = SearchRequest.builder() .query("Quy chế thi kết thúc học phần") .topK(5) .______(0.75) .build();
```

- [ ] A. minScore(0.75)
- [ ] B. distanceFilter(0.75)
- [x] **C. similarityThreshold(0.75)**  *(Đáp án đúng)*
- [ ] D. confidenceLevel(0.75)

👉 **Đáp án: C**

---

### Câu 60: `[Khó]`
Đoạn code xây dựng prompt cho RAG sau đây tiềm ẩn nguy cơ bảo mật hoặc lỗi logic nào nghiêm trọng nhất?

```java
String prompt = "Dựa vào tài liệu sau: " + retrievedDocs + ". Hãy trả lời: " + userInput;
```

- [ ] A. Chuỗi nối chuỗi trong Java luôn ném ra ngoại lệ StringIndexOutOfBoundsException khi runtime thực thi
- [ ] B. retrievedDocs bắt buộc phải được mã hóa dạng số nguyên thì LLM mới hiểu được ngữ nghĩa của văn bản
- [ ] C. Không thể gửi chuỗi dài hơn 20 ký tự lên các mô hình ngôn ngữ lớn qua đường truyền mạng hiện nay
- [x] **D. Không phân tách rõ ràng vai trò System/User khiến ứng dụng dễ bị tấn công Prompt Injection từ dữ liệu người dùng**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 61: `[Khó]`
Để chỉ tìm kiếm các tài liệu thuộc chuyên mục 'Công nghệ thông tin' trong Spring AI `VectorStore`, lập trình viên cấu hình phương thức nào trên `SearchRequest`?

- [x] **A. filterExpression(...)**  *(Đáp án đúng)*
- [ ] B. whereClause(...)
- [ ] C. sqlCondition(...)
- [ ] D. categoryFilter(...)

👉 **Đáp án: A**

---

### Câu 62: `[Khó]`
Toán tử nào trong extension `pgvector` của PostgreSQL được sử dụng để tính khoảng cách Cosine Distance giữa hai vector?

- [ ] A. <+>
- [x] **B. <=>**  *(Đáp án đúng)*
- [ ] C. <->
- [ ] D. <#>

👉 **Đáp án: B**

---

### Câu 63: `[Khó]`
Kỹ thuật 'Chunk Overlap' (độ chồng lấp giữa các đoạn văn bản) khi chia nhỏ tài liệu giải quyết vấn đề kỹ thuật nào trong RAG?

- [ ] A. Giúp giảm một nửa số lượng vector cần lưu trữ trong cơ sở dữ liệu của hệ thống quản lý tài liệu
- [ ] B. Tăng tốc độ tính toán vector embedding lên gấp hai lần khi thực thi trên phần cứng CPU máy chủ
- [x] **C. Ngăn ngừa hiện tượng đứt gãy và mất mát ngữ cảnh quan trọng nằm ngay tại ranh giới cắt giữa hai đoạn văn liền kề**  *(Đáp án đúng)*
- [ ] D. Tự động dịch tài liệu sang nhiều ngôn ngữ khác nhau trước khi lưu trữ vào CSDL của hệ thống

👉 **Đáp án: C**

---

### Câu 64: `[Khó]`
Khi số lượng vector trong bảng CSDL tăng lên hàng triệu bản ghi nhưng không tạo chỉ mục (Index) vector, hệ thống sẽ gặp sự cố hiệu năng nào?

- [ ] A. CSDL tự động xóa bớt các vector cũ để duy trì tốc độ hoạt động của hệ thống máy chủ ứng dụng
- [ ] B. Tất cả các truy vấn tìm kiếm đều trả về kết quả rỗng null cho mọi người dùng khi thực hiện tìm kiếm
- [ ] C. Mọi vector mới thêm vào đều bị gán giá trị mặc định là 0 trong bảng CSDL của hệ thống lưu trữ
- [x] **D. CSDL phải thực hiện quét tuần tự toàn bảng (Sequential Scan) làm tăng vọt độ trễ truy vấn và nghẽn CPU/Disk I/O**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 65: `[Khó]`
Một hệ thống RAG trích xuất văn bản từ tài liệu PDF có nhiều bảng biểu phức tạp. Sau khi nạp vào Vector DB, người dùng hỏi số liệu thống kê trong bảng thì LLM trả lời sai. Nguyên nhân cốt lõi ở bước Ingestion là gì?

- [x] **A. Bộ Text Splitter cắt ngang dòng/cột của bảng làm phá vỡ cấu trúc quan hệ ngữ nghĩa giữa tiêu đề cột và ô dữ liệu**  *(Đáp án đúng)*
- [ ] B. Mô hình Embedding không có khả năng mã hóa các chữ số thập phân trong văn bản tài liệu nạp vào hệ thống
- [ ] C. Thuật toán Cosine Similarity không hoạt động với văn bản kỹ thuật có chứa số liệu thống kê trong bảng
- [ ] D. PostgreSQL tự động làm tròn các số thực trong văn bản về số nguyên khi lưu trữ vào bảng dữ liệu của hệ thống

👉 **Đáp án: A**

---

### Câu 66: `[Khó]`
Trong kiến trúc Advanced RAG, việc bổ sung bước 'Reranking' (sử dụng Cross-Encoder Model) sau khi lấy kết quả từ Vector Store mang lại lợi ích gì?

- [ ] A. Tự động dịch toàn bộ tài liệu sang ngôn ngữ máy Bytecode để CPU thực thi nhanh hơn trong các tác vụ tính toán
- [x] **B. Đánh giá lại và tái sắp xếp độ liên quan ngữ nghĩa sâu sắc giữa câu hỏi và từng đoạn văn, giúp đưa các đoạn tài liệu chất lượng nhất lên đầu**  *(Đáp án đúng)*
- [ ] C. Giảm dung lượng của cơ sở dữ liệu PostgreSQL trên đĩa cứng máy chủ lưu trữ của hệ thống quản lý tài liệu
- [ ] D. Thay thế hoàn toàn vai trò của ChatModel trong hệ thống phản hồi câu hỏi tự động cho người dùng ứng dụng

👉 **Đáp án: B**

---

### Câu 67: `[Dễ]`
Mô hình kiến trúc phân lớp chuẩn trong dự án Spring Boot tích hợp AI thường tuân theo luồng gọi phụ thuộc nào?

- [ ] A. Database -> Controller -> Service -> ChatClient
- [ ] B. ChatClient -> Controller -> Database -> Service
- [x] **C. Controller -> Service -> ChatClient / VectorStore -> Data Source (LLM / Database)**  *(Đáp án đúng)*
- [ ] D. VectorStore -> Entity -> Controller -> Service

👉 **Đáp án: C**

---

### Câu 68: `[Dễ]`
Khái niệm 'Prompt Injection' trong bảo mật ứng dụng LLM được định nghĩa là gì?

- [ ] A. Kỹ thuật chèn mã độc vào file bytecode của JVM khi ứng dụng đang chạy trên máy chủ backend của hệ thống
- [ ] B. Phương pháp nén kích thước prompt trước khi gửi qua giao thức HTTP mạng diện rộng để tăng tốc đường truyền
- [ ] C. Cơ chế tự động thêm các biến môi trường vào file cấu hình của Spring Boot khi ứng dụng khởi chạy hệ thống
- [x] **D. Kỹ thuật kẻ tấn công chèn câu lệnh độc hại vào đầu vào của người dùng nhằm chiếm quyền điều khiển hoặc ghi đè System Prompt của LLM**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 69: `[Trung bình]`
Kỹ thuật 'Model Fallback' trong kiến trúc hệ thống AI cấp doanh nghiệp nhằm giải quyết tình huống nào?

- [x] **A. Tự động chuyển hướng gọi sang một LLM dự phòng khi mô hình chính gặp sự cố mạng, quá tải (Rate Limit) hoặc ngừng hoạt động**  *(Đáp án đúng)*
- [ ] B. Tự động hạ xung nhịp CPU của máy chủ khi tải ứng dụng tăng cao đột biến trong giờ cao điểm để tiết kiệm điện
- [ ] C. Chuyển đổi mã nguồn từ Java sang ngôn ngữ C++ để chạy với hiệu năng cao hơn khi xử lý các tác vụ phức tạp
- [ ] D. Tự động xóa bộ nhớ cache sau mỗi 60 giây để giải phóng dung lượng RAM cho máy chủ web của hệ thống

👉 **Đáp án: A**

---

### Câu 70: `[Trung bình]`
Khi tích hợp LLM trong Spring Boot, kỹ thuật nào giúp bảo vệ ứng dụng khỏi nguy cơ rò rỉ API Key khi đẩy mã nguồn lên Git repository?

- [ ] A. Đặt API key trực tiếp trong mã nguồn Java của lớp Controller để dễ dàng debug lỗi khi phát triển
- [x] **B. Sử dụng biến môi trường (Environment Variables) hoặc công cụ quản lý bí mật (như Spring Cloud Vault) kết hợp file .gitignore**  *(Đáp án đúng)*
- [ ] C. Đổi tên file cấu hình properties thành định dạng file văn bản thuần .txt để tránh bị quét tự động
- [ ] D. Ghi API key vào file tài liệu hướng dẫn README.md của dự án để tiện cho người dùng cấu hình khi chạy

👉 **Đáp án: B**

---

### Câu 71: `[Khó]`
Thư viện nào trong hệ sinh thái Java Spring Boot thường được dùng để cấu hình Circuit Breaker và Retry cho các cuộc gọi API LLM từ xa?

- [ ] A. Hibernate Validator
- [ ] B. Lombok
- [x] **C. Resilience4j**  *(Đáp án đúng)*
- [ ] D. MapStruct

👉 **Đáp án: C**

---

### Câu 72: `[Khó]`
Một Controller REST API thực hiện tác vụ sinh báo cáo bằng AI kéo dài 40 giây được viết theo cơ chế blocking đồng bộ. Vấn đề gì sẽ xảy ra khi có hàng trăm người dùng gửi request cùng lúc?

- [ ] A. Ứng dụng tự động tăng tốc độ xử lý của từng request lên gấp nhiều lần để đáp ứng nhu cầu truy cập của người dùng
- [ ] B. Cơ sở dữ liệu quan hệ tự động bị ngắt toàn bộ kết nối vĩnh viễn do quá tải bộ nhớ RAM trên máy chủ lưu trữ
- [ ] C. Mọi request đều nhận về mã trạng thái HTTP 200 thành công ngay lập tức mà không cần chờ tiến trình hoàn tất
- [x] **D. Thread Pool của máy chủ web (như Tomcat) bị cạn kiệt, khiến server bị nghẽn và từ chối toàn bộ request mới đến**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 73: `[Khó]`
Để giải quyết triệt để bài toán xử lý tác vụ AI nặng kéo dài hàng chục giây ở trên, mô hình kiến trúc xử lý nào sau đây là tối ưu nhất?

- [x] **A. Xử lý bất đồng bộ (@Async / Message Queue), trả về jobId ngay cho client và thông báo kết quả qua WebSocket/SSE hoặc Polling**  *(Đáp án đúng)*
- [ ] B. Ép buộc client duy trì kết nối HTTP liên tục không có thời gian chờ timeout để tránh bị ngắt kết nối giữa chừng
- [ ] C. Tăng giá trị server.tomcat.threads.max lên 1.000.000 luồng trong cấu hình máy chủ ứng dụng để đáp ứng mọi request
- [ ] D. Giảm dung lượng RAM của máy chủ để ép hệ thống giải phóng luồng nhanh hơn khi xử lý các tác vụ dài hạn

👉 **Đáp án: A**

---

### Câu 74: `[Khó]`
Kỹ thuật 'Semantic Caching' trong hệ thống AI mang lại lợi ích nổi bật nào so với caching theo từ khóa chính xác (Exact Key Caching)?

- [ ] A. Xóa bỏ hoàn toàn sự cần thiết của việc cấu hình bảo mật cho toàn bộ hệ thống máy chủ ứng dụng khi vận hành
- [x] **B. Tái sử dụng kết quả đã sinh cho các câu hỏi có cùng ý nghĩa ngữ nghĩa dù cách dùng từ khác nhau, giúp tiết kiệm chi phí và giảm độ trễ**  *(Đáp án đúng)*
- [ ] C. Tự động dịch toàn bộ câu trả lời trong cache sang tiếng Anh để tối ưu hóa bộ nhớ RAM của máy chủ lưu trữ
- [ ] D. Lưu trữ vĩnh viễn mọi dữ liệu người dùng mà không bao giờ hết hạn trên máy chủ ứng dụng của hệ thống

👉 **Đáp án: B**

---

### Câu 75: `[Dễ]`
Khái niệm LLMOps trong kỹ thuật phần mềm hiện đại là viết tắt của cụm từ nào?

- [ ] A. Low Level Memory Optimization
- [ ] B. Linked Language Module Object System
- [x] **C. Large Language Model Operations**  *(Đáp án đúng)*
- [ ] D. Logical Learning Machine Optimizer

👉 **Đáp án: C**

---

### Câu 76: `[Dễ]`
Trong nền tảng quan sát (Observability) Langfuse, một `Trace` đại diện cho đối tượng nào?

- [ ] A. Một phép tính số thực duy nhất trong card đồ họa GPU của máy chủ backend khi thực hiện suy luận
- [ ] B. Một tài khoản người dùng đăng ký trên hệ thống phần mềm quản trị của doanh nghiệp đang hoạt động
- [ ] C. Một dòng log lỗi duy nhất được ghi vào tệp nhật ký hệ thống cục bộ trên máy chủ ứng dụng
- [x] **D. Toàn bộ vòng đời xử lý của một yêu cầu (request) từ lúc bắt đầu đến khi kết thúc trong hệ thống**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 77: `[Dễ]`
Để khởi chạy nhanh chóng một cụm máy chủ Langfuse cục bộ (Self-hosted) phục vụ mục đích học tập và phát triển, công cụ nào thường được sử dụng?

- [x] **A. Docker Compose**  *(Đáp án đúng)*
- [ ] B. Apache Tomcat
- [ ] C. Jenkins CI/CD
- [ ] D. Nginx standalone

👉 **Đáp án: A**

---

### Câu 78: `[Trung bình]`
Sự khác biệt cốt lõi giữa `Span` và `Generation` trong mô hình dữ liệu của Langfuse là gì?

- [ ] A. Span chỉ dùng để ghi log lỗi, còn Generation dùng để lưu trữ file tài liệu PDF trên máy chủ lưu trữ của hệ thống
- [x] **B. Span đại diện cho một bước xử lý logic chung, còn Generation là một span chuyên biệt ghi lại chi tiết cuộc gọi LLM (prompt, tokens, model, cost)**  *(Đáp án đúng)*
- [ ] C. Generation chỉ chạy được trên môi trường local, còn Span chỉ chạy trên các dịch vụ đám mây công cộng
- [ ] D. Span chứa thông tin thanh toán tiền tệ, còn Generation chứa mã nguồn Java của ứng dụng đang phát triển

👉 **Đáp án: B**

---

### Câu 79: `[Trung bình]`
Tính năng 'Prompt Hub' trong các nền tảng LLMOps như Langfuse mang lại lợi ích vượt trội nào cho quy trình vận hành phần mềm?

- [ ] A. Tự động chuyển đổi mã nguồn Java sang ngôn ngữ Python trên server ứng dụng khi biên dịch mã nguồn
- [ ] B. Xóa bỏ hoàn toàn chi phí sử dụng API của các nhà cung cấp cloud LLM hiện nay trên thị trường
- [x] **C. Quản lý, gắn phiên bản (versioning) và cập nhật prompt tập trung mà không cần sửa mã nguồn hay redeploy ứng dụng**  *(Đáp án đúng)*
- [ ] D. Tự động tăng tốc độ đường truyền mạng Internet của người dùng đầu cuối khi truy cập hệ thống ứng dụng

👉 **Đáp án: C**

---

### Câu 80: `[Trung bình]`
Ba chỉ số (metrics) kỹ thuật cốt lõi nào cần được giám sát chặt chẽ nhất trong các cuộc gọi LLM ở môi trường Production?

- [ ] A. Tốc độ quạt tản nhiệt, Số dòng mã nguồn Java của dự án, và Kích thước file JAR khi đóng gói ứng dụng
- [ ] B. Số lượng thuộc tính trong POJO, Tỷ lệ comment code trong project, và Phiên bản JDK đang dùng trên server
- [ ] C. Số lần người dùng click chuột, Độ phân giải màn hình máy khách, và Tần số âm thanh của loa ngoài thiết bị
- [x] **D. Độ trễ (Latency), Số lượng Token tiêu thụ (Cost), và Tỷ lệ lỗi (Error Rate) của các cuộc gọi mô hình**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 81: `[Trung bình]`
Tính năng 'Token Cost Attribution' trong Langfuse hỗ trợ nhà quản trị hệ thống thực hiện nghiệp vụ nào?

- [x] **A. Tính toán chi phí tài chính chi tiết của từng user, từng tính năng hoặc từng model dựa trên số token input/output thực tế**  *(Đáp án đúng)*
- [ ] B. Tự động thanh toán hóa đơn điện toán đám mây qua tài khoản ngân hàng của doanh nghiệp khi đến hạn định kỳ
- [ ] C. Giảm giá cước token của các nhà cung cấp cloud API xuống 50% cho tất cả người dùng trong hệ thống phần mềm
- [ ] D. Chuyển đổi chi phí token thành điểm thưởng tích lũy cho lập trình viên trong công ty để khuyến khích phát triển

👉 **Đáp án: A**

---

### Câu 82: `[Khó]`
Điền cổng dịch vụ mặc định còn thiếu vào vị trí `______` để hoàn tất cấu hình biến môi trường kết nối tới máy chủ Langfuse self-hosted:

```properties
LANGFUSE_PUBLIC_KEY=pk-lf-... LANGFUSE_SECRET_KEY=sk-lf-... LANGFUSE_HOST=http://localhost:______
```

(Biết Langfuse Web UI mặc định chạy trên cổng 3000)

- [ ] A. 8080
- [x] **B. 3000**  *(Đáp án đúng)*
- [ ] C. 5432
- [ ] D. 11434

👉 **Đáp án: B**

---

### Câu 83: `[Khó]`
Khi tải Prompt từ Langfuse Prompt Hub, nếu tên prompt không tồn tại trên server, giải pháp lập trình phòng thủ nào sau đây là chuẩn mực nhất?

- [ ] A. Cho phép ứng dụng ném ngoại lệ dừng khởi động ngay lập tức để lập trình viên sửa lỗi trong mã nguồn
- [ ] B. Tự động gửi prompt rỗng "" lên cho LLM xử lý mà không cần thông báo lỗi cho hệ thống giám sát
- [x] **C. Bắt ngoại lệ và sử dụng một Fallback Prompt cục bộ đã được định nghĩa sẵn trong mã nguồn của ứng dụng**  *(Đáp án đúng)*
- [ ] D. Tự động tạo một prompt mới trên server với nội dung ngẫu nhiên do hệ thống tự sinh ra khi chạy

👉 **Đáp án: C**

---

### Câu 84: `[Khó]`
Trong Spring AI, cơ chế nào cho phép tự động chặn (intercept) mọi cuộc gọi `ChatClient` để ghi lại telemetry và gửi trace sang Langfuse một cách trong suốt?

- [ ] A. Servlet Filter cấu hình trong file web.xml truyền thống của ứng dụng Spring Web
- [ ] B. JDBC Connection Pool Listener trong cấu hình quản lý kết nối database của hệ thống
- [ ] C. Garbage Collection Finalizer của máy ảo Java JVM khi thực hiện thu hồi vùng nhớ heap
- [x] **D. ChatClient Request Advisor / Interceptor của Spring AI trong chuỗi xử lý gọi mô hình**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 85: `[Khó]`
Trong Langfuse, việc sử dụng các 'Release Tags' (như `production`, `staging`) khi quản lý Prompt cho phép đạt được mục tiêu nào?

- [x] **A. Giúp ứng dụng ở từng môi trường tự động tải đúng phiên bản prompt được chỉ định mà không bị ảnh hưởng bởi các bản nháp đang chỉnh sửa**  *(Đáp án đúng)*
- [ ] B. Tự động xóa bỏ các tài khoản người dùng cũ trên hệ thống máy chủ khi có phiên bản prompt mới được phát hành
- [ ] C. Khóa mã nguồn của ứng dụng không cho phép lập trình viên chỉnh sửa trên môi trường Git của dự án
- [ ] D. Tăng số lượng token tối đa của mô hình lên mức không giới hạn cho các tài khoản VIP trong hệ thống

👉 **Đáp án: A**

---

### Câu 86: `[Khó]`
Để ghi nhận phản hồi đánh giá của người dùng (ví dụ: Thumbs Up / Thumbs Down hoặc điểm 1-5 sao) vào đúng lượt xử lý trên Langfuse, ứng dụng cần gửi kèm thông tin nào?

- [ ] A. Địa chỉ MAC của máy chủ database lưu trữ dữ liệu ứng dụng của hệ thống phần mềm
- [x] **B. Mã traceId của phiên xử lý tương ứng cùng với tên điểm số (score name) và giá trị (value)**  *(Đáp án đúng)*
- [ ] C. Toàn bộ mã nhị phân của file cấu hình application.properties của dự án Spring Boot
- [ ] D. Mật khẩu tài khoản admin của hệ điều hành Linux đang chạy máy chủ ứng dụng của doanh nghiệp

👉 **Đáp án: B**

---

### Câu 87: `[Khó]`
Khi ứng dụng phục vụ lượng truy cập lớn (hàng triệu request/ngày), kiến trúc gửi trace telemetry sang Langfuse cần được thiết kế như thế nào để không làm chậm API nghiệp vụ?

- [ ] A. Gửi tuần tự từng bản ghi đồng bộ trước khi trả kết quả về cho người dùng đầu cuối để đảm bảo dữ liệu không bị mất
- [ ] B. Tạm dừng toàn bộ ứng dụng mỗi 5 phút để xả dữ liệu trace qua mạng cho máy chủ Langfuse xử lý
- [x] **C. Gửi dữ liệu theo cơ chế bất đồng bộ (Asynchronous) thông qua hàng đợi bộ đệm và gom lô (Batching) trước khi truyền đi**  *(Đáp án đúng)*
- [ ] D. Lưu trực tiếp trace vào bảng users trong cơ sở dữ liệu quan hệ của hệ thống quản lý

👉 **Đáp án: C**

---

### Câu 88: `[Dễ]`
Chuẩn giao thức mở MCP do tổ chức Anthropic khởi xướng là viết tắt của cụm từ nào?

- [ ] A. Multi-Channel Processing
- [ ] B. Machine Control Protocol
- [ ] C. Master Cache Provider
- [x] **D. Model Context Protocol**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 89: `[Dễ]`
Kiến trúc tổng thể của giao thức MCP bao gồm 3 thành phần cốt lõi nào?

- [x] **A. Host (Ứng dụng chủ), Client (Phía gọi), và Server (Phía cung cấp tài nguyên/công cụ)**  *(Đáp án đúng)*
- [ ] B. Compiler (Trình biên dịch), Linker (Trình liên kết), và Loader (Trình nạp)
- [ ] C. Model (Dữ liệu), View (Giao diện), và Controller (Bộ điều khiển)
- [ ] D. Source (Mã nguồn), Intermediate (Mã trung gian), và Binary (Mã nhị phân)

👉 **Đáp án: A**

---

### Câu 90: `[Trung bình]`
Trong giao thức MCP, phương thức truyền tải (Transport) `stdio` hoạt động theo nguyên lý nào?

- [ ] A. Gửi dữ liệu qua sóng Bluetooth giữa các thiết bị ngoại vi kết nối với máy chủ ứng dụng của hệ thống
- [x] **B. Giao tiếp hai chiều thông qua các luồng Standard Input và Standard Output của tiến trình con chạy cục bộ**  *(Đáp án đúng)*
- [ ] C. Truyền nhận gói tin UDP qua mạng diện rộng Internet không cần xác nhận gói tin từ phía máy chủ
- [ ] D. Đọc và ghi dữ liệu trực tiếp vào thanh ghi phần cứng của chip CPU máy tính khi thực thi lệnh

👉 **Đáp án: B**

---

### Câu 91: `[Trung bình]`
Phương thức truyền tải `SSE` (Server-Sent Events qua HTTP) trong giao thức MCP phù hợp nhất với kịch bản triển khai nào?

- [ ] A. Khi MCP Server chỉ chạy trên thiết bị nhúng không có kết nối mạng Internet với thế giới bên ngoài
- [ ] B. Khi cần giao tiếp nội bộ giữa hai luồng trong cùng một máy ảo Java JVM của ứng dụng backend
- [x] **C. Khi MCP Server được triển khai trên máy chủ từ xa qua mạng và phục vụ nhiều client kết nối đồng thời**  *(Đáp án đúng)*
- [ ] D. Khi ứng dụng không hỗ trợ bất kỳ giao thức mạng chuẩn nào của hệ điều hành máy chủ đang dùng

👉 **Đáp án: C**

---

### Câu 92: `[Trung bình]`
Trong chuẩn giao thức MCP, khái niệm `Resource` đại diện cho đối tượng nào sau đây?

- [ ] A. Hàm thực thi có khả năng thay đổi trạng thái và ghi dữ liệu vào hệ thống backend của ứng dụng
- [ ] B. Khóa API bảo mật của tài khoản người dùng đăng ký trên hệ thống quản lý doanh nghiệp
- [ ] C. Dung lượng bộ nhớ RAM còn trống của máy chủ tại thời điểm hiện tại khi kiểm tra tài nguyên
- [x] **D. Dữ liệu ngữ cảnh chỉ đọc (Read-only data) như file, bản ghi CSDL được định danh bằng một URI duy nhất**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 93: `[Trung bình]`
Điểm khác biệt căn bản nhất giữa `Resource` và `Tool` trong giao thức MCP là gì?

- [x] **A. Resource là dữ liệu đọc thụ động qua URI, còn Tool là hàm thực thi có thể nhận tham số và tạo ra side-effect**  *(Đáp án đúng)*
- [ ] B. Resource bắt buộc viết bằng ngôn ngữ C, còn Tool bắt buộc viết bằng ngôn ngữ Java trên nền tảng máy chủ
- [ ] C. Tool chỉ dùng cho ứng dụng web, còn Resource chỉ dùng cho ứng dụng desktop trên hệ điều hành máy tính
- [ ] D. Resource có thể gọi đệ quy vô tận, còn Tool chỉ được gọi duy nhất một lần trong toàn bộ phiên làm việc

👉 **Đáp án: A**

---

### Câu 94: `[Trung bình]`
Chuẩn định dạng thông điệp (Message Format) nào được giao thức MCP quy định để đóng gói các yêu cầu và phản hồi giữa Client và Server?

- [ ] A. SOAP XML
- [x] **B. JSON-RPC 2.0**  *(Đáp án đúng)*
- [ ] C. Protocol Buffers v1
- [ ] D. YAML Frontmatter

👉 **Đáp án: B**

---

### Câu 95: `[Khó]`
Trong giao thức MCP, các Resource thường được định danh bằng cấu trúc URI nào sau đây?

- [ ] A. SELECT * FROM table_name WHERE id = 1
- [ ] B. {"type": "resource", "action": "read"}
- [x] **C. custom-scheme://path/to/resource (Ví dụ: mysql://tables/customers hoặc file:///logs/app.log)**  *(Đáp án đúng)*
- [ ] D. MD5:e4d909c290d0fb1ca068ffaddf22cbd0

👉 **Đáp án: C**

---

### Câu 96: `[Khó]`
Khi viết một Java MCP Server chạy qua cơ chế `stdio`, nếu lập trình viên sử dụng `System.out.println("Log thông tin")` trong mã nguồn, sự cố nghiêm trọng nào sẽ xảy ra?

- [ ] A. Khiến hệ điều hành lập tức tắt nguồn máy tính của người dùng đang vận hành máy chủ ứng dụng
- [ ] B. Toàn bộ file mã nguồn Java tự động bị mã hóa không thể đọc được bởi trình biên dịch của dự án
- [ ] C. Không gây ra bất kỳ ảnh hưởng nào vì System.out luôn được tự động bỏ qua bởi tiến trình mẹ của Host
- [x] **D. Làm hỏng định dạng JSON-RPC trên luồng stdout, khiến MCP Host không thể phân tích thông điệp và ngắt kết nối**  *(Đáp án đúng)*

👉 **Đáp án: D**

---

### Câu 97: `[Khó]`
Khi cấu hình kết nối MCP Server trên Claude Desktop hoặc Spring AI MCP Client, tệp cấu hình JSON thường khai báo các thông tin nào cho một server `stdio`?

- [x] **A. Tên lệnh thực thi (command), danh sách tham số khởi chạy (args), và các biến môi trường (env)**  *(Đáp án đúng)*
- [ ] B. Mật khẩu tài khoản root của máy chủ và mã PIN bảo mật của quản trị viên hệ thống quản lý
- [ ] C. Địa chỉ IP card mạng và tốc độ quạt chip CPU của máy chủ tại thời điểm cấu hình dịch vụ
- [ ] D. Danh sách toàn bộ các class Java có trong thư mục cài đặt JDK của hệ điều hành máy chủ

👉 **Đáp án: A**

---

### Câu 98: `[Khó]`
Để ghi log chẩn đoán an toàn trong một Java MCP Server giao tiếp qua luồng `stdio`, giải pháp kỹ thuật nào sau đây là chuẩn xác nhất?

- [ ] A. Ghi đè log trực tiếp lên luồng Standard Input (System.in) của tiến trình ứng dụng máy chủ
- [x] **B. Ghi log ra luồng Standard Error (System.err) hoặc sử dụng logger ghi thẳng vào file riêng biệt trên ổ đĩa**  *(Đáp án đúng)*
- [ ] C. Chuyển nội dung log vào tham số temperature của ChatModel khi gửi request xử lý mô hình
- [ ] D. Tắt hoàn toàn tính năng ghi log và không ghi nhận bất kỳ thông tin nào khi tiến trình đang chạy

👉 **Đáp án: B**

---

### Câu 99: `[Khó]`
Một MCP Server cung cấp Tool thực thi câu lệnh SQL trực tiếp từ chuỗi do LLM sinh ra mà không qua kiểm tra quyền đọc (Read-only check). Rủi ro an ninh nghiêm trọng nhất là gì?

- [ ] A. Làm tăng số lượng token tiêu thụ lên gấp 10 lần cho mỗi câu truy vấn của người dùng trong hệ thống
- [ ] B. Làm sai lệch cấu hình múi giờ của máy chủ Spring Boot khi ghi nhận thời gian giao dịch của người dùng
- [x] **C. Bị tấn công SQL Injection hoặc LLM vô tình thực thi câu lệnh DROP TABLE/DELETE phá hủy toàn bộ cơ sở dữ liệu**  *(Đáp án đúng)*
- [ ] D. Gây tràn bộ nhớ RAM do câu lệnh SELECT trả về quá nhiều kết quả cùng một lúc trên máy chủ backend

👉 **Đáp án: C**

---

### Câu 100: `[Khó]`
Lợi ích kiến trúc lớn nhất mà chuẩn giao thức MCP mang lại cho ngành công nghiệp phát triển ứng dụng AI là gì?

- [ ] A. Thay thế hoàn toàn mọi ngôn ngữ lập trình truyền thống bằng văn bản tự nhiên của con người trong tương lai
- [ ] B. Đảm bảo các mô hình AI đạt độ chính xác 100% trong mọi tác vụ nghiệp vụ phức tạp của doanh nghiệp
- [ ] C. Miễn phí hoàn toàn chi phí phần cứng máy chủ trên toàn cầu cho tất cả nhà phát triển phần mềm ứng dụng
- [x] **D. Cung cấp chuẩn kết nối cắm-rút (Plug-and-Play) thống nhất, giúp một LLM Client bất kỳ kết nối mọi công cụ mà không cần code riêng**  *(Đáp án đúng)*

👉 **Đáp án: D**

---
