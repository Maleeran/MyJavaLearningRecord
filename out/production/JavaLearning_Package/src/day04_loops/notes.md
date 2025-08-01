# day04_Loops 学习笔记
---
## 1. while loop

```java
while (条件表达式) {
    循环语句
}
// 继续执行后续代码
```
- `while`循环在每次循环开始前，首先判断条件是否成立。如果计算结果为`true`，就把循环体内的语句执行一遍，如果计算结果为`false`，那就直接跳到`while`循环的末尾，继续往下执行。
### 小结
- `while`循环先判断循环条件是否满足，再执行循环语句；

- `while`循环可能一次都不执行；
---
## 2. do while loop
- `do while`循环则是先执行循环，再判断条件，条件满足时继续循环，条件不满足时退出。
```java
do {
    执行循环语句
} while (条件表达式);
```
### 小结
- `do while`循环会至少执行一次,先执行循环，再判断条件。

---

## 3. for loop
- `for`循环的功能非常强大，它使用计数器实现循环。`for`循环会先初始化计数器，然后，在每次循环前检测循环条件，在每次循环后更新计数器。计数器变量通常命名为`i`。
```java
for (初始条件; 循环检测条件; 循环后更新计数器) {
    // 执行语句
}
```
### 小结
- `for`循环通过计数器可以实现复杂循环；

- `for each`循环可以直接遍历数组的每个元素；
- 执行次数固定（如九九乘法表，10 次打印等）

- 三段式结构：初始化→判断→执行→更新→判断...