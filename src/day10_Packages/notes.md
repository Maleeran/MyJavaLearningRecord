# day10_packages 学习笔记


## 🎯 今日学习目标：
- 理解 `Java` 的 `package` 和 `import` 用法

- 掌握类的访问修饰符：`public` / `private` / `protected` / 默认（包内可见）

- 学会将类分散在不同包中并进行调用

## 学习内容

### 1. 什么是`package`
Java中的`package`是Java语言提供的一种组织代码的方式，将类、接口、枚举、注解、类声明等封装在一起，并定义其访问权限。通常一个 Java 文件的第一行是 `package xxx;`，声明当前类所在的包。

示例：
```java
package com.example;
```

### 2.import 用法
`import` 是 Java 语言提供的一种导入类的方式。`import` 语句用于导入一个包或一个类。

示例：
```java
import com.example.utils.Caculator;
```

### 3. 类的访问修饰符(总结表)
| 修饰符       | 同类 | 同包 | 子类 | 其他包 |
| --------- | -- | -- | -- | --- |
| public    | ✅  | ✅  | ✅  | ✅   |
| protected | ✅  | ✅  | ✅  | ❌   |
| 默认（无修饰）   | ✅  | ✅  | ❌  | ❌   |
| private   | ✅  | ❌  | ❌  | ❌   |

### 4.文件结构建议
每一个包对应一个文件夹，包名用小写字母+域名风格，如：`com.example.utils` -> 文件夹结构为`com/example/utils/`

### 5.注意事项
1. `package` 和 `import` 语句应该放在文件开头，并且放在其他代码之前。
2. 包名要和文件夹路径一致，否则编译时会报错。
3. 使用 `Java -d . *.java` 可以自动生成对应包的结构。
