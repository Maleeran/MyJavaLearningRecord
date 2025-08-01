# day02_operators 学习笔记

## 学习目标：运算符与表达式

### 运算符总结

| 运算符类型 | 运算符                                                                      | 描述                                                                     | 示例                                             |
| :--------- |:-------------------------------------------------------------------------|:-----------------------------------------------------------------------|:-----------------------------------------------|
| **算术运算符** | `+`                                                                      | 加法                                                                     | `5 + 3 = 8`                                    |
| | `-`                                                                      | 减法                                                                     | `5 - 3 = 2`                                    |
| | `*`                                                                      | 乘法                                                                     | `5 * 3 = 15`                                   |
| | `/`                                                                      | 除法                                                                     | `5 / 3 = 1`                                    |
| | `/(double)a/b`                                                           | 除法 (浮点数)                                                               | `5 / 2 = 2.5`                                  |
| | `%`                                                                      | 取模（余数）                                                                 | `5 % 2 = 1`                                    |
| **自增/自减运算符** | `++` (前缀)                                                                | **先**将变量值加1，**然后**使用新值。                                                | `int a = 5; int b = ++a;` (`a` 变为 6, `b` 变为 6) |
| | `--` (前缀)                                                                | **先**将变量值减1，**然后**使用新值。                                                | `int a = 5; int b = --a;` (`a` 变为 4, `b` 变为 4) |
| | `++` (后缀)                                                                | **先**使用变量的当前值，**然后**将变量值加1。                                            | `int a = 5; int b = a++;` (`b` 变为 5, `a` 变为 6) |
| | `--` (后缀)                                                                | **先**使用变量的当前值，**然后**将变量值减1。                                            | `int a = 5; int b = a--;` (`b` 变为 5, `a` 变为 4) |
| **关系运算符** | `==`                                                                     | 等于                                                                     | `5 == 3` (假)                                   |
| | `!=`                                                                     | 不等于                                                                    | `5 != 3` (真)                                   |
| | `>`                                                                      | 大于                                                                     | `5 > 3` (真)                                    |
| | `<`                                                                      | 小于                                                                     | `5 < 3` (假)                                    |
| | `>=`                                                                     | 大于等于                                                                   | `5 >= 3` (真)                                   |
| | `<=`                                                                     | 小于等于                                                                   | `5 <= 3` (假)                                   |
| **逻辑运算符** | `&&`                                                                     | 逻辑与 (AND)：当两个操作数都为真时，结果为真。                                             | `(5 > 3) && (2 < 4)` (真)                       |
| | ` `                                              |                                                                        | `                                              | 逻辑或 (OR)：当至少一个操作数为真时，结果为真。 | `(5 > 3) || (2 > 4)` (真) |
| | `!`                                                                      | 逻辑非 (NOT)：反转操作数的逻辑状态。                                                  | `!(5 == 3)` (真)                                |
| **赋值运算符与复合运算** | `=`                                                                      | 简单赋值                                                                   | `a = 5`                                        |
| | `+=`                                                                     | 加法赋值：`a += b` 等同于 `a = a + b`                                          | `a = 2; a += 3;` (`a` 变为 5)                    |
| | `-=`                                                                     | 减法赋值：`a -= b` 等同于 `a = a - b`                                          | `a = 5; a -= 2;` (`a` 变为 3)                    |
| | `*=`                                                                     | 乘法赋值：`a *= b` 等同于 `a = a * b`                                          | `a = 2; a *= 3;` (`a` 变为 6)                    |
| | `/=`                                                                     | 除法赋值：`a /= b` 等同于 `a = a / b`                                          | `a = 6; a /= 3;` (`a` 变为 2)                    |
| | `%=`                                                                     | 取模赋值：`a %= b` 等同于 `a = a % b`                                          | `a = 7; a %= 3;` (`a` 变为 1)                    |
| | **赋值链式表达**                                                               | 多个赋值操作可以在一行进行，计算顺序从右向左。                                                | `a = b = c = 10;` (a, b, c 都变为 10)             |
| **运算符优先级与括号** | **优先级**                                                                  | 不同的运算符有不同的优先级，优先级高的运算符会**先**执行。例如，乘除法通常高于加减法。                          | `2 + 3 * 4 = 14` (先乘后加)                        |
| | **括号**                                                                   | 括号可以改变表达式的求值顺序，**括号内的表达式会优先计算**。                                       | `(2 + 3) * 4 = 20` (先加后乘)                      |
| **表达式求值顺序** | **从左到右/从右到左**                                                            | 大多数运算符遵循从左到右的结合性，但赋值运算符和一些特殊运算符（如条件运算符）遵循从右到左的结合性。了解结合性对于复杂表达式的求值至关重要。 | `a - b + c` (从左到右); `a = b = c` (从右到左)         |

---
### ✅ 今日目标
- 掌握各种常用运算符
- 理解自增自减符号的前后缀区别
- 掌握逻辑与关系运算
- 学会使用复合赋值符号
- 熟悉表达式优先级

### 💡 知识点备注
- `a++` 是先使用后加；`++a` 是先加后使用
- `&&` 短路与：前一个为 false，则后一个不执行
- 表达式中的优先级可以使用括号清晰表达

### 💪 今日练习建议（可加到笔记里）
1. 写一个表达式判断一个人的身高是否在 160cm ~ 190cm 且年龄在 18~25 之间。
2. 写一个程序，模拟余额转账过程，使用 -= 运算符更新余额。
3. 写一个小程序演示 a += b++ * 2 和 a += ++b * 2 有何不同。
