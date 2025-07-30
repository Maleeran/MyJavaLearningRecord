# day03_controlflow_if 学习笔记

## 学习内容

| 目标                    | 内容                           |
| --------------------- | ---------------------------- |
| 🎯 掌握基本条件控制语句         | `if` / `if-else` / `else if` |
| 🎯 理解并使用三元运算符         | `a > b ? a : b`              |
| 🎯 熟练使用 `switch-case` | 并了解 `break` 和 `default`      |

### if-else 小结
- if ... else可以做条件判断，else是可选的；

- 不推荐省略花括号{}；

- 多个if ... else串联要特别注意判断顺序；

- 要注意if的边界条件；

- 要注意浮点数判断相等不能直接用==运算符；

- 引用类型判断内容相等要使用equals()，注意避免NullPointerException。

### Switch语句 小结
- switch语句可以做多重选择，然后执行匹配的case语句后续代码；

- switch的计算结果必须是整型、字符串或枚举类型；

- 注意千万不要漏写break，建议打开fall-through警告；

- 总是写上default，建议打开missing default警告；

- 从Java 14开始，switch语句正式升级为表达式，不再需要break，并且允许使用yield返回值。

### 三元运算符
- 格式：（关系运算符）？表达式 1 ：表达式 2
- 根据关系运算符的结果，来判断，如果关系运算符的结果为true，则值为表达式1，否则为表达式2。

