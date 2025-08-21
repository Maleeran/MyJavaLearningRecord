# Day27: 多线程基础

以下是针对 **Day27 多线程基础** 的详细学习内容，包含学习目标、项目结构、Java 示例代码、学习笔记以及配套练习题。内容基于你的学习计划（Day27：继承 Thread、实现 Runnable、线程生命周期，日期 2025/8/21），结合 Java 后端开发实习需求，注重实用性并衔接 Day26（IO 流体系）的文件操作知识。我会讲解得详细、通俗易懂，像聊天一样解释概念：多线程就像厨师同时做几道菜（并行处理任务），避免一个任务堵塞整个程序。学习时间建议为 4-5 小时（多线程稍抽象，多实践），内容循序渐进，从基础到应用。

---

## 学习目标
1. **理解多线程基础**：掌握线程的概念，为什么需要多线程，以及 Java 中的线程模型。
2. **熟练创建线程**：学会两种方式——继承 `Thread` 类和实现 `Runnable` 接口，理解它们的区别。
3. **掌握线程生命周期**：熟悉线程的 5 个状态（新建、就绪、运行、阻塞、终止），知道如何管理线程状态。
4. **实践应用**：通过一个多线程文件下载模拟项目，结合 Day26 的 IO 流，实现并发任务。
5. **异常处理**：结合 Day22-23，处理线程中的异常和中断。

---

## 项目结构
创建一个多线程文件下载模拟项目，演示线程创建和生命周期管理，扩展 Day26 的 IO 流：
- **功能**：模拟多个线程并发下载文件片段（用 IO 流读写），展示线程启动、运行和终止。
- **结构**：
  ```
  MultiThreadDemo/
  ├── src/
  │   ├── thread/
  │   │   └── FileDownloaderThread.java  # 继承 Thread 的下载线程
  │   │   └── RunnableDownloader.java    # 实现 Runnable 的下载线程
  │   ├── util/
  │   │   └── IOHelper.java              # IO 辅助类，结合 Day26
  │   └── Main.java                      # 测试多线程下载
  ```

---

## Java 示例代码

### 1. FileDownloaderThread.java (继承 Thread)
继承 `Thread` 类，实现下载任务。

```java
package thread;

import java.io.*;

public class FileDownloaderThread extends Thread {
    private String sourceFile;
    private String destFile;
    private long startPos;
    private long endPos;

    public FileDownloaderThread(String sourceFile, String destFile, long startPos, long endPos) {
        this.sourceFile = sourceFile;
        this.destFile = destFile;
        this.startPos = startPos;
        this.endPos = endPos;
    }

    @Override
    public void run() { // 重写 run() 方法，线程执行体
        try (RandomAccessFile source = new RandomAccessFile(sourceFile, "r");
             RandomAccessFile dest = new RandomAccessFile(destFile, "rw")) {
            source.seek(startPos); // 从指定位置读
            dest.seek(startPos); // 从指定位置写
            byte[] buffer = new byte[1024];
            long currentPos = startPos;
            int bytesRead;
            while ((bytesRead = source.read(buffer)) != -1 && currentPos < endPos) {
                dest.write(buffer, 0, bytesRead);
                currentPos += bytesRead;
            }
            System.out.println("Thread " + getName() + " finished downloading segment.");
        } catch (IOException e) {
            System.out.println("Error in thread " + getName() + ": " + e.getMessage());
        }
    }
}
```

### 2. RunnableDownloader.java (实现 Runnable)
实现 `Runnable` 接口，实现下载任务。

```java
package thread;

import java.io.*;

public class RunnableDownloader implements Runnable {
    private String sourceFile;
    private String destFile;
    private long startPos;
    private long endPos;

    public RunnableDownloader(String sourceFile, String destFile, long startPos, long endPos) {
        this.sourceFile = sourceFile;
        this.destFile = destFile;
        this.startPos = startPos;
        this.endPos = endPos;
    }

    @Override
    public void run() { // run() 方法同上
        try (RandomAccessFile source = new RandomAccessFile(sourceFile, "r");
             RandomAccessFile dest = new RandomAccessFile(destFile, "rw")) {
            source.seek(startPos);
            dest.seek(startPos);
            byte[] buffer = new byte[1024];
            long currentPos = startPos;
            int bytesRead;
            while ((bytesRead = source.read(buffer)) != -1 && currentPos < endPos) {
                dest.write(buffer, 0, bytesRead);
                currentPos += bytesRead;
            }
            System.out.println("Runnable thread finished downloading segment.");
        } catch (IOException e) {
            System.out.println("Error in runnable thread: " + e.getMessage());
        }
    }
}
```

### 3. IOHelper.java (结合 Day26 IO 流)
辅助类，用于文件大小计算。

```java
package util;

import java.io.File;

public class IOHelper {
    public static long getFileSize(String filePath) {
        File file = new File(filePath);
        return file.length();
    }
}
```

### 4. Main.java
测试多线程下载。

```java
import thread.FileDownloaderThread;
import thread.RunnableDownloader;
import util.IOHelper;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "source.dat"; // 假设一个大文件
        String destFile = "dest.dat";
        long fileSize = IOHelper.getFileSize(sourceFile);
        long segmentSize = fileSize / 2; // 分成 2 段

        // 继承 Thread 方式
        FileDownloaderThread thread1 = new FileDownloaderThread(sourceFile, destFile, 0, segmentSize);
        FileDownloaderThread thread2 = new FileDownloaderThread(sourceFile, destFile, segmentSize, fileSize);

        thread1.start(); // 启动线程
        thread2.start();

        // 实现 Runnable 方式
        Thread runnableThread = new Thread(new RunnableDownloader(sourceFile, destFile, 0, segmentSize));
        runnableThread.start();

        try {
            thread1.join(); // 等待线程结束
            thread2.join();
            runnableThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("All threads completed.");
    }
}
```

**运行输出示例**（假设文件存在）：
```
Thread Thread-0 finished downloading segment.
Runnable thread finished downloading segment.
Thread Thread-1 finished downloading segment.
All threads completed.
```

**通俗解释**：像两个厨师同时切菜（线程1 和线程2），`start()` 是“开始切”，`join()` 是“等他们切完再上菜”。

---

## 学习笔记

### 1. 多线程基础（为什么需要多线程？）
想象单线程像一个人做饭：洗菜、切菜、炒菜，一个一个来。如果切菜卡住了（比如等水烧开），整个过程停滞。多线程像多个厨师分工：一个人洗菜，另一个人切菜，同时进行，提高效率。

- **线程概念**：线程是程序执行的最小单位，一个进程（如 Java 程序）可有多个线程。Java 默认主线程（main 方法）。
- **多线程优势**：
    - **并发**：同时处理多个任务（如下载文件时还能响应用户输入）。
    - **效率**：利用 CPU 多核，加速计算密集任务。
    - **响应性**：UI 程序中，主线程处理界面，子线程处理后台任务。
- **缺点**：线程切换有开销，需处理同步问题（Day28 会学）。
- **Java 线程模型**：Java 用 `Thread` 类表示线程，基于 OS 线程。

### 2. 创建线程的两种方式（详细对比）
Java 提供两种创建线程的方式，就像两种做饭方式：一种是直接雇厨师（继承 Thread），另一种是雇助手（实现 Runnable）。

- **继承 Thread 类**：
    - 步骤：定义类继承 `Thread`，重写 `run()` 方法（线程执行体），创建对象调用 `start()` 启动。
    - 通俗：`run()` 是“菜谱”，`start()` 是“开火”。
    - 示例：`class MyThread extends Thread { public void run() { System.out.println("Running"); } }`；`MyThread t = new MyThread(); t.start();`。
    - 优点：简单，直接用 `this` 访问线程属性。
    - 缺点：Java 单继承，无法继承其他类。

- **实现 Runnable 接口**：
    - 步骤：定义类实现 `Runnable`，实现 `run()` 方法；创建 `Thread` 对象传入 Runnable 实例，调用 `start()`。
    - 通俗：Runnable 是“菜谱接口”，Thread 是“厨师”执行菜谱。
    - 示例：`class MyRunnable implements Runnable { public void run() { System.out.println("Running"); } }`；`Thread t = new Thread(new MyRunnable()); t.start();`。
    - 优点：可继承其他类，灵活；多个线程共享 Runnable 对象。
    - 缺点：需额外创建 Thread 对象。

- **区别**：
    - 继承 Thread：类本身是线程，适合简单任务。
    - 实现 Runnable：接口方式，适合复杂类或共享数据。
    - 优先用 Runnable（Java 官方推荐），因为接口灵活。
- **常见方法**：
    - `start()`：启动线程，调用 run()。
    - `run()`：线程体，不要直接调用（会当普通方法执行）。
    - `sleep(long millis)`：暂停线程（静态方法）。
    - `getName()`、`setName()`：线程名称。
    - `getState()`：获取线程状态。

### 3. 线程生命周期（5 个状态，像人的一生）
线程生命周期像人的一生：出生、上学、工作、休息、去世。Java 线程有 5 个状态（用 `Thread.State` 枚举表示）：

- **新建（NEW）**：创建线程对象，但未调用 `start()`。像婴儿出生，还没上学。
    - 示例：`Thread t = new Thread();`。

- **就绪（RUNNABLE）**：调用 `start()` 后，线程等待 CPU 调度。像上学准备好，但等老师点名。
    - 可运行，但不一定在运行（取决于 OS 调度）。

- **运行（RUNNING）**：线程获得 CPU 执行 `run()`。像上课中，积极发言。
    - 这是就绪状态的子状态（Java API 中 RUNNABLE 包括就绪和运行）。

- **阻塞（BLOCKED/TIMED_WAITING/WAITING）**：线程暂停执行，等待资源。
    - **BLOCKED**：等待锁（Day28 同步）。
    - **TIMED_WAITING**：`sleep()` 或 `join(timeout)`，有时间限制。
    - **WAITING**：`join()` 或 `wait()`，无限等待。
    - 通俗：像休息或等别人（阻塞是“卡住”）。

- **终止（TERMINATED）**：`run()` 执行完或异常终止。像毕业或退休，无法复活。
    - 示例：线程正常结束或抛出未捕获异常。

- **状态转换**：
    - 新建 -> start() -> 就绪 -> CPU 调度 -> 运行。
    - 运行 -> sleep()/wait() -> 阻塞 -> 唤醒 -> 就绪。
    - 运行 -> 结束 -> 终止。
- **查询状态**：`thread.getState()`，调试时用。

- **中断**：`interrupt()` 发送中断信号，线程可检查 `isInterrupted()` 处理。像“叫醒”睡觉的线程。

### 4. 应用场景和注意事项
- **场景**：下载文件（多线程分段下载）、服务器处理请求（每个请求一个线程）。
- **与 Day26 衔接**：IO 流在多线程中需小心同步（Day28），避免并发读写文件。
- **常见问题**：线程安全（共享数据冲突）、死锁（互相等待）。先学基础，日后深入。
- **最佳实践**：用 Runnable；用 try-catch 处理 run() 异常；避免直接调用 run()。

---

## 练习题
1. **基础题**：
    - 用继承 Thread 创建一个线程，打印 "Hello from thread!" 10 次。
    - 用实现 Runnable 创建线程，计算 1 到 1000 的和，并在 main 线程中等待它结束（用 join()）。

2. **进阶题**：
    - 修改 `FileDownloaderThread`，添加 sleep() 模拟下载延迟，观察线程生命周期（用 getState() 打印状态）。
    - 实现一个计数器线程，用 Runnable 共享计数器变量，运行两个线程同时递增，观察结果（引入同步问题预习）。

3. **项目题**：
    - 扩展项目，用 3 个线程分段下载文件，整合 Day26 的 IO 流。
    - 创建一个多线程日志记录器，用字符流写入日志文件，每个线程记录自己的执行时间。

4. **LeetCode 练习**：
    - **LeetCode 1114**：Print in Order（用线程控制打印顺序）。
    - **LeetCode 1195**：Fizz Buzz Multithreaded（多线程打印 Fizz Buzz）。

---

## 学习建议
- **实践**：运行示例代码，创建大文件测试下载。设置断点（Day25 学过）在 `run()` 和 `start()`，观察线程状态变化。用 `Thread.currentThread().getState()` 打印。
- **时间分配**：4-5 小时：
    - 1.5 小时：阅读笔记，理解生命周期（画状态图）。
    - 2 小时：实现并调试示例代码，多用 System.out 观察线程顺序。
    - 1 小时：完成练习题，尤其是进阶题。
- **记录**：用 Anki 卡片：
    - 正面：继承 Thread 和实现 Runnable 的区别？  
      背面：继承 Thread 是类本身线程，限制继承；Runnable 是接口，灵活可共享。
    - 正面：线程生命周期的 5 个状态？  
      背面：NEW（新建）、RUNNABLE（就绪/运行）、BLOCKED/WAITING/TIMED_WAITING（阻塞）、TERMINATED（终止）。
- **复习**：结合 Day26，复习 IO 在多线程中的使用；结合 Day25，用 Scanner 控制线程输入。
- **资源**：参考《Java 核心技术卷 I》第 14 章，或 B站“Java 多线程基础”视频（搜索“Java 线程生命周期图”）。

---

### 补充说明
- **代码运行**：在 IntelliJ IDEA 中创建项目，运行 `Main.java`。准备一个大文件（如 10MB dat 文件）测试分段下载。注意线程执行顺序不确定（OS 调度）。
- **常见坑**：不要直接调用 `run()`（不会新线程）；sleep() 抛 InterruptedException，需 catch。
- **与后续学习衔接**：
    - Day28（同步锁）解决共享数据问题。
    - Day30（项目实战）可复用多线程优化。
- **面试准备**：多线程是 Java 后端面试重点，掌握生命周期和创建方式。

如果你需要某部分的详细讲解（如 LeetCode 1114 的代码）、练习题的实现，或调试帮助，随时告诉我！