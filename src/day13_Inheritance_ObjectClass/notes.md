# Day 13 学习笔记：继承与 Object 类

## ✅ 1. Java 中的继承（Inheritance）

### ➤ 基本语法：
```java
class 子类名 extends 父类名 {
    // 子类可以继承父类的 public/protected 成员
}
```
### ➤ 特性：
* 单继承：Java 不支持多继承，但支持多层继承
* 子类可以添加新的属性或方法
* 子类可以重写父类方法（Override）
* 子类构造函数中必须调用父类构造（默认或通过 super）

## ✅ 2. 构造函数调用顺序
* 创建子类对象时：
  1.先调用父类构造函数（通过 super(...)，默认无参）
  2.再执行子类构造逻辑

## ✅ 3. Object 类简介（所有类的父类）
Java 中所有类都默认继承 java.lang.Object

常用方法包括：

| 方法名              | 功能                            |
| ---------------- | ----------------------------- |
| `toString()`     | 返回对象的字符串表示，默认是 类名@哈希码         |
| `equals(Object)` | 比较两个对象是否相等，默认比较的是地址是否相同       |
| `hashCode()`     | 返回对象的哈希码，通常配合 `equals()` 一起重写 |


## ✅ 4. 重写 equals() 和 hashCode()
```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Student)) return false;
    Student s = (Student) obj;
    return this.name.equals(s.name) && this.studentId.equals(s.studentId);
}

@Override
public int hashCode() {
    return name.hashCode() + studentId.hashCode();
}
```
重写 equals() 时应同时重写 hashCode()，以保持集合类如 HashMap 的一致性原则

## 🧠 知识点对比总结

| 比较项	        |equals() 与 == 的区别|
|-------------|-----------------------|
| ==	         |比较的是内存地址（引用是否相同）|
| equals()	   |可以重写，比较内容是否相同|
| hashCode()	 |表示对象的散列值，适用于 HashSet/Map|

yaml
复制
编辑
