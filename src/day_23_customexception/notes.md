## **Day23 自定义异常类** 

---

### 学习目标
1. **理解自定义异常**：掌握自定义异常类的定义及继承 `Exception` 或 `RuntimeException` 的选择。
2. **掌握 throw 和 throws**：能正确使用 `throw` 抛出异常和 `throws` 声明异常。
3. **实现业务异常**：创建与业务逻辑相关的异常类，增强代码可读性和扩展性。
4. **实践应用**：通过学生管理系统扩展，处理自定义业务异常（如学号重复）。
5. **面试准备**：熟悉自定义异常的场景和设计原则，为实习面试打基础。

---

### 学习笔记

#### 1. 自定义异常基础
- **定义**：通过继承 `Exception`（Checked）或 `RuntimeException`（Unchecked）创建自定义异常类。
- **选择**：
    - 继承 `Exception`：强制调用者处理（如文件操作错误），适合外部异常。
    - 继承 `RuntimeException`：非强制处理（如业务逻辑错误），适合内部异常。
- **构造方法**：通常包含 `message` 参数，支持 `Throwable cause` 用于链式异常。

#### 2. throw 关键字
- **用法**：手动抛出异常，如 `throw new DuplicateIdException("ID exists")`。
- **场景**：业务逻辑验证（如学号重复、数据无效）。
- **注意**：抛出后，当前方法执行终止，异常向上传播。

#### 3. throws 关键字
- **用法**：在方法签名声明可能抛出的异常，如 `public void addStudent() throws DuplicateIdException`。
- **作用**：通知调用者处理异常，避免编译器报错（针对 Checked Exception）。
- **示例**：`FileHandler.readStudents` 用 `throws IOException`。

#### 4. 自定义业务异常
- **定义**：针对特定业务场景创建异常，如 `DuplicateIdException` 表示学号冲突。
- **优势**：
    - 提高代码可读性，明确异常含义。
    - 便于日志记录和错误处理。
- **设计原则**：
    - 提供有意义的错误消息。
    - 支持链式异常，保留原始错误信息。
- **与 Day22 衔接**：扩展 try-catch-finally，处理自定义异常。

#### 5. 应用场景
- 学号/用户名重复：`DuplicateIdException`。
- 数据验证失败：`InvalidScoreException`。
- 网络请求超时：自定义 `TimeoutException`。
- 数据库约束违反：`ConstraintViolationException`。

---

## 练习题
1. **基础题**：
    - 创建一个自定义异常 `EmptyInputException`，继承 `Exception`，在方法中用 `throw` 抛出当输入为空时。
    - 写一个方法 `validateAge(int age)`，用 `throws` 声明 `IllegalAgeException`，检查年龄范围（0-120）。

2. **进阶题**：
    - 修改 `StudentService.addStudent`，添加 `StudentNotFoundException`（当删除不存在的学生时抛出）。
    - 实现一个方法 `processScore(double score)`，用 `throw` 抛出 `InvalidScoreException` 和 `throw new RuntimeException()`，比较两者的处理。

3. **项目题**：
    - 扩展 `FileHandler`，添加方法 `deleteStudent(String filePath, String id)`，抛出 `StudentNotFoundException` 和 `IOException`。
    - 创建一个类 `BusinessValidator`，用自定义异常验证学生数据（如姓名长度、成绩范围）。

4. **LeetCode 练习**：
    - **LeetCode 204**：Count Primes（处理输入无效时的异常）。
    - **LeetCode 136**：Single Number（添加异常处理防止空数组）。

