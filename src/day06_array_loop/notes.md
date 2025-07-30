# day06_loops_while_do 学习笔记
---
## 学习内容

### 1.什么是数组？

数组是用来**存一组相同类型变量的容器**。
```java
int[] scores = new int[5];  //一个存5个整数的数组
```
你可以想象成：
```csharp
scores:
索引       内容
[0]    -> 0
[1]    -> 0
[2]    -> 0
[3]    -> 0
[4]    -> 0

```
也可以初始化为：
```java
int[] ages = {23, 24, 24, 25, 17};
```
### 2.怎么访问数字元素

```java
System.out.println(ages[2]);  // 打印第3个元素：24

```
- 注意索引是从0开始的
- 如果超出索引范围，就会抛出异常

### 3. 如何用循环来访问数组？
最常用的是 for 循环：

```java
for (int i = 0; i < ages.length; i++) {
System.out.println("第" + i + "个年龄：" + ages[i]);
}
```
也可以使用增强型 for（更简洁）：

```java
for (int age : ages) {
System.out.println("年龄是：" + age);
}
```
**说明：**
- 普通 for 循环：需要下标控制
- for-each 循环：更简洁，但不能访问索引


