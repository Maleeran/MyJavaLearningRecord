 **Day25 用户输入与 Scanner 类** 
---

## 学习目标
1. **理解 Scanner 类**：掌握 `Scanner` 的基本用法，用于从控制台获取用户输入。
2. **熟练使用输入方法**：学习 `next()`、`nextLine()` 等方法，处理不同类型输入。
3. **掌握 next 与 nextLine 区别**：理解两者的行为差异，解决常见输入问题。
4. **实践应用**：通过一个交互式学生信息管理程序，整合 Day20-24 的知识。
5. **异常处理**：结合 Day22-23，处理 `Scanner` 相关的输入异常。

---

## 学习笔记

### 1. Scanner 类基础
- **定义**：`java.util.Scanner` 用于从各种输入源（如控制台、文件）获取数据。
- **构造方法**：`Scanner(System.in)` 从标准输入读取。
- **常用方法**：
    - `next()`：读取下一个标记（以空白分隔）。
    - `nextLine()`：读取整行（包括空白）。
    - `nextInt()`、`nextDouble()`：读取特定类型。
    - `hasNext()`、`hasNextLine()`：检查是否有下一个输入。

### 2. next 与 nextLine 区别
- **next()**：
    - 读取输入直到遇到空白（空格、制表符、换行符）。
    - 不消费换行符，留到下次读取。
    - 适合读取单个单词或标记。
- **nextLine()**：
    - 读取整行直到换行符（`\n`），包括空白。
    - 消费换行符，适合读取句子或多词输入。
- **常见问题**：
    - `next()` 后调用 `nextLine()` 可能跳过输入，因为换行符未处理。
    - 解决：`scanner.nextLine()` 消费残留换行符。
- **示例**：
  ```java
  Scanner scanner = new Scanner(System.in);
  String word = scanner.next(); // 读取 "Hello"
  String line = scanner.nextLine(); // 读取 "World\n"，需注意换行
  ```

### 3. 异常处理
- **InputMismatchException**：当输入类型不匹配（如输入字母到 `nextInt()`）时抛出。
- **NoSuchElementException**：当没有更多输入时抛出。
- **与 Day22-23 衔接**：用 try-catch 处理，定义 `InputException` 自定义异常。

### 4. 应用场景
- 交互式程序：获取用户命令、数据。
- 数据验证：检查输入格式。
- 与 Day24 结合：从文件读取后，交互修改数据。

---

## 练习题
1. **基础题**：
    - 写一个程序，用 `Scanner` 获取用户输入的姓名和年龄，打印结果。
    - 比较 `next()` 和 `nextLine()` 的行为，输入 "John 25" 后分别使用两种方法读取。

2. **进阶题**：
    - 实现一个方法 `getValidInt(Scanner scanner)`，用循环确保输入是有效整数。
    - 修改 `StudentManager.addStudent`，用 `next()` 读取 ID 和 name，比较与 `nextLine()` 的效果。

3. **项目题**：
    - 扩展 `StudentManager`，添加方法 `searchStudent()`，用 `Scanner` 输入 ID 查找学生。
    - 整合 Day24 的 `FileManager`，用 `Scanner` 输入文件名，读取并显示学生数据。

4. **LeetCode 练习**：
    - **LeetCode 66**：Plus One（从用户输入数组）。
    - **LeetCode 217**：Contains Duplicate（从用户输入检查重复）。

