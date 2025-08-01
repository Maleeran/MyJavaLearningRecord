# day08_class_object 学习笔记

## 学习目标 
| 任务编号 | 内容                          | 完成打勾 |
| ---- | --------------------------- | ---- |
| T1   | 理解 Java 中如何获取命令行参数          | ☐    |
| T2   | 学会在 Java 中通过 `args` 接受命令行输入 | ☐    |
| T3   | 学习类和对象的基本概念                 | ☐    |
| T4   | 学会定义类、创建对象、访问属性和方法          | ☐    |
| T5   | 实现一个简单的类（如：学生类）并进行实例化       | ☐    |
| T6   | 总结命令行参数与面向对象编程的联系           | ☐    |

## 学习内容

### 1. 命令行参数的使用

在Java中，可以通过`main`方法的`Sring[] args`获取命令行传入的参数。

**e.g.1:** 
```java
public class CommandLineArgs {
    public static void main(String[] args) {
        // 打印所有命令行参数
        for (String arg : args) {
            System.out.println("命令行参数: " + arg);
        }
    }
}
```
上面的程序必须在命令行中执行，需要编译它：
``` bash
$ javac Main.java
```
然后，执行的时候可以传递参数 `Hello World`
```bash
$ java Main Hello World

命令行参数: Hello
命令行参数: World
```
### 2. 面向对象编程（OOP）入门

面向对象编程是 Java 的核心思想，主要涉及以下几个概念：

 1. **类（Class）：** 用来定义对象的蓝图。
 2. **对象（Object）：** 类的实例。
 3. **属性（Attributes/Fields）：** 类的特征，用来描述对象的状态。
 4. **方法（Methods）：** 类的行为，用来定义对象的操作。

### 3. 面向对象的核心特性：封装、继承、多态
 
**封装（Encapsulation）:** 封装是将对象的属性（字段）和方法隐藏在类内部，只通过公开的接口（方法）与外界交互。
**继承（Inheritance）:** 继承是面向对象编程的一个重要特性，允许你从现有类派生出新类。
**多态（Polymorphism）：** 多态是指同一方法调用，在不同对象上表现出不同的行为。

