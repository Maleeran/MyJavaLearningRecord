## Day26: Java IO 流体系

---

## 学习目标
1. **理解 IO 流体系**：掌握 Java 中输入输出（IO）流的整体结构，就像了解一个“水管系统”——数据像水一样流动。
2. **区分字节流和字符流**：知道字节流处理“原始数据”（如图片、音频），字符流处理“文本数据”（如字符串），并学会选择使用。
3. **熟练使用 InputStream/OutputStream**：能操作输入流（读取数据）和输出流（写入数据），包括文件、网络等场景。
4. **实践应用**：通过一个文件复制和转换的项目，整合 Day24 的 BufferedReader/Writer 和 Day25 的 Scanner，实现数据读写。
5. **异常处理**：结合 Day22-23，正确处理 IO 操作中的异常，如文件未找到或读写错误。

---

## 学习笔记

### 1. IO 流体系基础（像水管系统一样理解）
想象 Java 的 IO 就像一个水管网络，数据是水，从源头（如文件、键盘）流到目的地（如屏幕、文件）。IO 流分成“输入”（进水）和“输出”（出水），目的是让程序能读写数据。

- **流的概念**：流（Stream）是数据流动的通道。数据按顺序流动，不能随机访问（不像数组）。为什么叫“流”？因为数据像水流一样，一点一点地来。
- **分类**：
    - **按数据单位**：
        - **字节流**：处理最小单位“字节”（8 位二进制），适合所有数据，尤其是非文本（如图片、音频、视频）。基类：`InputStream` 和 `OutputStream`。
        - **字符流**：处理“字符”（如 A、B、汉字），适合文本数据。基类：`Reader` 和 `Writer`。字符流内部用字节流，但自动转换编码（避免乱码）。
    - **按方向**：
        - **输入流**：从外部读入程序（如从文件读数据）。
        - **输出流**：从程序写出到外部（如写文件）。
    - **按功能**：
        - **节点流**：直接连接数据源（如 `FileInputStream`）。
        - **处理流**：包装节点流，提高效率（如 `BufferedInputStream` 添加缓冲）。

简单比喻：字节流像“自来水管”，直接运水；字符流像“净水器”，处理后喝水。

### 2. 字节流详解（InputStream/OutputStream）
- **InputStream**：抽象类，输入字节流基类。像“吸管”，从源头吸数据。
    - 常用子类：`FileInputStream`（从文件读字节）。
    - 核心方法：
        - `int read()`：读一个字节，返回 -1 表示结束。
        - `int read(byte[] b)`：读多个字节到数组，返回读取数量。
        - `close()`：关闭流，释放资源。
    - 通俗：读数据像“一口一口喝汤”，每次读字节数组作为“碗”。

- **OutputStream**：抽象类，输出字节流基类。像“水龙头”，放水到目的地。
    - 常用子类：`FileOutputStream`（写字节到文件）。
    - 核心方法：
        - `void write(int b)`：写一个字节。
        - `void write(byte[] b)`：写字节数组。
        - `flush()`：强制输出缓冲数据。
        - `close()`：关闭流。
    - 通俗：写数据像“倒水”，flush() 是“冲水”确保全倒完。

- **缓冲**：用 `BufferedInputStream`/`BufferedOutputStream` 包装，提高速度（像大水桶一次性运水，而非一滴一滴）。
- **try-with-resources**：Java 7+ 自动关闭流，写成 `try (InputStream is = new FileInputStream(...)) { ... }`，简单防资源泄漏。

### 3. 字符流详解（Reader/Writer）
- **Reader**：抽象类，输入字符流基类。像“读书眼镜”，专门读文本。
    - 常用子类：`FileReader`（从文件读字符）。
    - 核心方法：`int read()`、`int read(char[] cbuf)`、`close()`。
    - 包装：用 `BufferedReader` 添加 `readLine()` 方法，读整行（超实用！）。

- **Writer**：抽象类，输出字符流基类。
    - 常用子类：`FileWriter`（写字符到文件）。
    - 核心方法：`void write(char[] cbuf)`、`void write(String str)`、`flush()`、`close()`。
    - 包装：用 `BufferedWriter` 添加 `newLine()` 方法，写换行。

- **字节 vs 字符**：字节流读图片不会乱码，但读文本可能乱码（因编码问题）。字符流自动处理编码（如 UTF-8），适合中文/英文文本。
- **转换**：`InputStreamReader` 把字节流转字符流（读文件时用）；`OutputStreamWriter` 把字符流转字节流（写时用）。

### 4. 异常处理和最佳实践
- **常见异常**：`IOException`（文件不存在、权限不足）、`FileNotFoundException`。
- **与 Day22-23 衔接**：用 try-catch-finally 或 try-with-resources 处理。自定义异常如 `FileOperationException` 包装 IO 异常。
- **最佳实践**：
    - 总是关闭流（用 try-with-resources）。
    - 用缓冲流提升性能。
    - 处理大文件时用循环读写，避免内存溢出。
    - 路径用相对或绝对，避免硬编码。

- **与 Day24/Day25 衔接**：Day24 的 BufferedReader/Writer 是字符流的处理流；Day25 的 Scanner 基于 InputStream，可从文件读输入。

### 5. 应用场景
- **字节流**：复制图片、下载文件、网络传输。
- **字符流**：读写配置文件、日志、CSV 数据。
- **实习中**：后端处理上传文件（字节流）、日志记录（字符流）。

---

## 练习题
1. **基础题**：
    - 用字节流 `FileInputStream` 和 `FileOutputStream` 复制一个文本文件，比较与字符流的差异。
    - 写一个方法 `readFileWithInputStream(String path)`，用 `InputStream` 读取文件字节并转换为字符串。

2. **进阶题**：
    - 用 `BufferedInputStream` 和 `BufferedOutputStream` 优化文件复制，测量时间差异（用 System.currentTimeMillis()）。
    - 实现一个方法 `convertByteToChar(String byteFile, String charFile)`，用 `InputStreamReader` 将字节流文件转换为字符流文件。

3. **项目题**：
    - 扩展 `IOUtil`，添加方法 `mergeFiles(String file1, String file2, String output)`，用字符流合并两个文本文件。
    - 整合 Day25 的 `Scanner`，用 `Scanner(new FileInputStream(file))` 从文件读取学生数据并解析。

4. **LeetCode 练习**：
    - **LeetCode 125**：Valid Palindrome（用字符流读取输入字符串）。
    - **LeetCode 709**：To Lower Case（用字节流处理字符串转换）。

---
