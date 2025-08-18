##  **Day24 文件读取与写入** 

---

### 学习目标
1. **理解文件操作基础**：掌握 `File` 类的基本用法，用于文件和目录管理。
2. **熟练使用 BufferedReader**：学习从文件中高效读取数据，处理字符流。
3. **掌握 BufferedWriter**：实现高效写入文件，处理字符输出。
4. **实践应用**：通过学生数据文件读写项目，整合 Day20-23 的知识。
5. **异常处理**：结合 Day22-23，正确处理文件操作中的 IO 异常。
---

#### 1. 文件操作基础
- **File 类**：
    - 表示文件或目录，常用方法：`exists()`（检查文件是否存在）、`createNewFile()`（创建文件）、`isFile()`/`isDirectory()`。
    - 不直接读写内容，仅用于文件管理。
- **字符流 vs 字节流**：`BufferedReader`/`BufferedWriter` 处理字符流，适合文本文件；字节流（如 `FileInputStream`）适合二进制文件。

#### 2. BufferedReader
- **定义**：包装 `FileReader`，提供高效读取字符数据。
- **常用方法**：
    - `readLine()`：读取一行，返回 `String` 或 `null`（文件末尾）。
    - 缓冲区减少 I/O 操作，提高性能。
- **使用场景**：读取配置文件、日志文件。
- **异常**：可能抛出 `IOException`（文件未找到、读错误）。

#### 3. BufferedWriter
- **定义**：包装 `FileWriter`，提供高效写入字符数据。
- **常用方法**：
    - `write(String)`：写入字符串。
    - `newLine()`：写入换行符。
    - `flush()`：强制刷新缓冲区到文件。
- **使用场景**：写入日志、保存数据。
- **异常**：可能抛出 `IOException`（写错误、磁盘满）。

#### 4. 异常处理
- **与 Day22-23 衔接**：使用 try-catch-finally 确保资源关闭，结合自定义 `FileOperationException` 处理业务异常。
- **资源管理**：finally 块关闭 `BufferedReader`/`BufferedWriter`，避免资源泄漏。

### 5. 应用场景
- 数据持久化：保存学生信息到文件。
- 日志记录：写入操作日志。
- 配置管理：读取属性文件。

---

### 练习题
1. **基础题**：
    - 使用 `File` 类检查指定路径下是否存在文件，并创建新文件 `test.txt`。
    - 写一个方法 `readFile(String path)`，用 `BufferedReader` 读取文件内容并打印每一行。

2. **进阶题**：
    - 实现 `BufferedWriter` 写入方法 `appendToFile(String path, String content)`，追加内容到文件末尾。
    - 修改 `FileManager.readStudents`，添加对文件格式错误的检查，抛出 `FileOperationException`。

3. **项目题**：
    - 扩展 `FileManager`，添加方法 `backupFile(String sourcePath, String backupPath)`，复制文件内容。
    - 创建一个类 `LogWriter`，用 `BufferedWriter` 记录每次文件操作的日志（如“Read at 2025-08-18”）。

4. **LeetCode 练习**：
    - **LeetCode 158**：Read N Characters Given Read4 II（模拟文件读取）。
    - **LeetCode 477**：Total Hamming Distance（结合文件输入处理数组）。

---