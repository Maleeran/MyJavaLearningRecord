# Day 01~14 Summary

---

## 🧩 1. 场景化示例代码（Day 01~14 全覆盖）


| Day | 场景 | 关键代码片段 |
|---|---|---|
| 01 | 命令行编译运行 | `javac -encoding UTF-8 HelloWorld.java && java HelloWorld` |
| 02 | 自动装箱 NPE | `Integer x = null; int y = x; // NullPointerException` |
| 03 | 位运算快速乘 2 | `int n = 5; System.out.println(n << 1); // 10` |
| 04 | switch 穿透 | `switch(level){ case 3: case 2: System.out.println("中级"); break; }` |
| 05 | 双重循环打印三角形 | `for(int i=1;i<=5;i++){ for(int j=1;j<=i;j++) System.out.print("*"); }` |
| 06 | 数组工具类 | `int[] arr = {3,1,4}; Arrays.sort(arr);` |
| 07 | 冒泡排序可视化 | 在 IDEA 里打断点观察 `i, j, arr[j], arr[j+1]` 值变化 |
| 08 | 递归求阶乘 | `static long f(int n){ return n==1?1:n*f(n-1); }` |
| 09 | 构造链 | `this(name,18);` 调用同类另一个构造器 |
| 10 | 自定义包 | `package com.company.util;` 然后 `import static com.company.util.StrUtil.*;` |
| 11 | 多态经典例子 | `Animal dog = new Dog(); dog.shout(); // 运行看右边` |
| 12 | Override 注解 | `@Override public String toString(){...}` |
| 13 | super 调用父类构造 | `super(name);` 必须是子类构造器首行 |
| 14 | 策略模式接口 | `interface PayStrategy{ void pay(int cents); }` |

---

## 🎯 2. 高频面试题 & 自测题（速查版）

| 题目 | 答案一句话速查 |
|---|---|
| `==` 与 `.equals()` 区别 | 前者比较地址，后者比较内容（可重写） |
| Java 到底是值传递还是引用传递？ | 值传递，但引用变量的值是地址，所以看起来像引用传递 |
| 抽象类能实例化吗？ | 不能，但可拥有构造器供子类调用 |
| 接口可以继承接口吗？ | 可以，多继承 |
| `final, finally, finalize` 区别？ | 修饰符 / 异常块 / Object 方法 |
| `ArrayList vs LinkedList` | 数组 vs 双向链表，随机访问 vs 增删 |
| `break` 与 `continue` 区别？ | 跳出循环 vs 跳过本次 |
| 构造器能被继承吗？ | 不能，只能被调用 |
| `static` 方法能重载吗？能重写吗？ | 可重载，不可重写（属于类） |
| `StringBuilder vs StringBuffer` | 非线程安全 vs 线程安全 |

👉 每题延伸：
- 把答案写成 3 行代码 + 1 句话点评，贴进 Anki 卡片，每天 5 分钟闪记。

---

## 🔧 3. 调试技巧 / IDEA 快捷键

| 目标 | 快捷键 | 备注 |
|---|---|---|
| 快速生成 `main` 方法 | 输入 `psvm` + Tab | Postfix Completion |
| 查看变量运行时类型 | `Alt + 鼠标左键点击变量` | 弹出 Type Info |
| 条件断点 | 右键红点 → Condition | 如 `i==10` |
| Evaluate Expression | `Alt + F8` | 运行期计算任意表达式 |
| 查看继承树 | `Ctrl + H` | 对类名使用 |
| 一键格式化 | `Ctrl + Alt + L` | 拯救乱码缩进 |
| 快速覆写方法 | `Ctrl + O` | Override 神器 |

---

## ⚠️ 4. 常见运行时异常速查表（Day 01~14 范围）

| 异常 | 触发场景 | 快速定位技巧 |
|---|---|---|
| `NullPointerException` | 自动装箱拆箱、未初始化数组 | IDEA 行号 + 堆栈 |
| `ArrayIndexOutOfBoundsException` | 循环边界写错 | 断点调试看索引 |
| `ClassCastException` | 向下转型错误 | 用 `instanceof` 先判断 |
| `NumberFormatException` | `Integer.parseInt("abc")` | 正则或 try-catch |
| `StackOverflowError` | 递归无出口 | 看栈深度 |

---

## 🚀 5. 下一阶段衔接建议（第 15~21 天）

| Day | 主题 | 重点提要 | 关联 Day |
| --- | --- | --- | --- |
| 15 | 异常体系深度 | try-with-resources、自定义异常 | 14（抽象设计） |
| 16 | Java 常用类库 | `String, Math, BigDecimal, LocalDate` | 02/03 |
| 17 | 集合框架入门 | `List, Set, Map` 三大接口 | 06/07 |
| 18 | 泛型 & 迭代器 | 类型擦除、通配符 `<? extends T>` | 17 |
| 19 | Stream API | map/filter/reduce、惰性求值 | 17/18 |
| 20 | 文件与 IO | `Files, Path, NIO.2` | 16 |
| 21 | 单元测试 | JUnit5、断言、Mockito | 08/09 |

> 衔接练习：
> 1. 把第 07 天的排序算法改写成泛型方法，支持 `Integer, Double, String`。
> 2. 用 Stream 一行代码统计文本文件单词频率。
> 3. 给第 10 天的包结构写 JUnit 测试，覆盖率 ≥ 80%。
