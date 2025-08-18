
## **Day22 异常处理机制** 

---

### 学习目标
1. **理解异常处理基础**：掌握 Java 中异常的定义、分类（Checked/Unchecked）及其处理机制。
2. **熟练使用 try-catch-finally**：能正确编写 try-catch 块，理解 finally 的作用。
3. **掌握多 catch 块**：处理多种异常类型，理解异常匹配规则。
4. **理解异常传播**：掌握异常的抛出和传递机制，学习 throws 关键字。
5. **实践应用**：通过一个文件操作项目，结合 Day20-21 的知识，处理异常并优化代码。

---

### 学习笔记

#### 1. 异常处理基础
- **定义**：异常是程序运行时出现的错误（如文件未找到、类型转换失败），Java 用 `Throwable` 及其子类表示。
- **分类**：
    - **Checked Exception**：需显式处理（如 `IOException`），由编译器强制检查。
    - **Unchecked Exception**：运行时异常（如 `NullPointerException`），可选择处理。
- **异常层次**：`Throwable` -> `Error`（系统错误，如 `OutOfMemoryError`） / `Exception`（程序错误）。

#### 2. try-catch-finally
- **try 块**：包含可能抛出异常的代码。
- **catch 块**：捕获特定异常，处理逻辑（如打印错误信息）。
    - 可有多个 catch，匹配从子类到父类顺序（避免覆盖）。
- **finally 块**：无论是否抛出异常都执行，常用于资源清理（如关闭文件）。
- **示例**：
  ```java
  try {
      // 可能抛出异常的代码
  } catch (Exception e) {
      // 处理异常
  } finally {
      // 清理资源
  }
  ```

#### 3. 多 catch 块
- **用法**：按异常类型捕获，如 `catch (FileNotFoundException)` 和 `catch (IOException)`。
- **规则**：
    - 从具体异常到通用异常排列（如 `FileNotFoundException` 在 `IOException` 之前）。
    - 可用 `catch (Exception e)` 捕获所有异常（最后使用）。
- **示例**：
  ```java
  try {
      // 可能抛出多种异常
  } catch (NumberFormatException e) {
      System.out.println("Number format error");
  } catch (IOException e) {
      System.out.println("IO error");
  }
  ```

#### 4. 异常传播
- **机制**：若方法未捕获异常，异常向上传播至调用者，直到 main 方法或 JVM 处理。
- **throws 关键字**：声明方法可能抛出的异常，交给调用者处理。
- **示例**：
  ```java
  public void readFile() throws IOException {
      // 可能抛出 IOException
  }
  ```
- **注意**：Checked Exception 需用 try-catch 或 throws 处理，Unchecked Exception 可选择性处理。

#### 5. 应用场景
- 文件操作：处理 `IOException`（文件未找到、读写错误）。
- 数据解析：处理 `NumberFormatException`（格式错误）。
- 网络通信：处理 `SocketException`（连接失败）。
- 与 Day21 结合：泛型方法可抛出异常，需用 try-catch 处理。

---

### 练习题
1. **基础题**：
    - 写一个方法 `divide(int a, int b)`，用 try-catch 处理除以 0 的 `ArithmeticException`，返回结果。
    - 创建一个方法 `readLine()`，模拟读取一行文本，抛出 `IOException`，用 try-catch-finally 处理。

2. **进阶题**：
    - 修改 `FileHandler.readStudents`，添加多 catch 块，分别处理 `FileNotFoundException` 和 `NumberFormatException`，并在 finally 中记录关闭状态。
    - 实现一个方法 `propagateException()`，故意抛出 `IllegalArgumentException`，观察异常传播至 main 方法。

3. **项目题**：
    - 扩展 `FileHandler`，添加方法 `appendStudent(String filePath, Student student)`，处理文件追加写入时的异常。
    - 创建一个类 `ErrorLogger`，用 try-catch 捕获异常并记录到文件中（使用 BufferedWriter）。

4. **LeetCode 练习**：
    - **LeetCode 125**：Valid Palindrome（处理非法输入异常）。
    - **LeetCode 49**：Group Anagrams（处理空数组异常）。