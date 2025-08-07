# Day 14 学习笔记：抽象类与接口

---

## ✅ 抽象类（abstract class）

### ➤ 特点
- 不能被实例化
- 可以包含构造方法、成员变量、普通方法、抽象方法
- 子类必须实现所有抽象方法，除非子类也是抽象类
- 可以有访问控制符（如 private、protected）

### ➤ 使用场景
- 抽象出共有属性和功能，但留给子类具体实现
- 强调“是一个”关系（如：Dog 是一个 Animal）

---

## ✅ 接口（interface）

### ➤ 特点
- 使用 `interface` 定义
- 所有方法默认 `public abstract`（Java 8+ 可以有默认实现方法）
- 所有变量默认 `public static final`
- 类可以实现多个接口（解决 Java 不能多继承的问题）

### ➤ 接口的新特性（Java 8+）
- 默认方法：`default` 修饰，有方法体
- 静态方法：接口中可以定义静态工具方法

```java
interface A {
    default void show() {
        System.out.println("Default method in A");
    }
}
```

## ✅ 抽象类 vs 接口 对比总结
| 特性      | 抽象类          | 接口                         |
| ------- | ------------ | -------------------------- |
| 继承关系    | 单继承          | 多实现                        |
| 是否可包含变量 | 可以（非 final）  | 只能是 public static final 常量 |
| 是否有构造方法 | 有            | 没有                         |
| 方法类型    | 普通方法 + 抽象方法  | 抽象方法 + 默认方法 + 静态方法         |
| 设计意图    | 建立父子类关系，提取共性 | 定义行为规范，强调能力                |

## ✅ 多实现示例
```java
interface USB {
void connect();
}

interface Chargeable {
void charge();
}

class Phone implements USB, Chargeable {
public void connect() {
System.out.println("Phone connected via USB");
}

    public void charge() {
        System.out.println("Phone is charging...");
    }
}
```