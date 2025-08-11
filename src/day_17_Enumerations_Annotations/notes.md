# Day 17 学习笔记：枚举类型与注解初识

### 1. 枚举类型知识点

- 使用 `enum` 定义枚举类型，枚举值是常量，且不可修改。

- 枚举可以有构造函数、属性和方法，但构造函数必须是 `private`。

- 枚举在 `switch` 语句中无需加 `enum` 前缀，直接使用常量名。

- 每个枚举值都是 `public` `static` `final` 的实例。

### 2. 内置注解

- `@Override`：表示方法覆盖父类方法，编译器会检查正确性。

- `@Deprecated`：表示方法过时，调用时会给出编译警告。

- `@SuppressWarnings`：抑制编译器警告，如 `@SuppressWarnings("unchecked"`)。

### 3. 自定义注解

- 组成：

  - `@interface `用于定义注解。

  - 元注解（`@Retention`、`@Target`）定义注解的生命周期和作用范围。

- 保留策略：

  - `SOURCE` ：只在源码中存在，编译后丢弃。

  - `CLASS`：编译器将注解存储在 `.class` 文件中，但运行时不可用（默认）。

  - `RUNTIME`：运行时可通过反射读取。

- 作用目标：

  - `ElementType.METHOD`：方法。

  - `ElementType.TYPE`：类、接口。

  - `ElementType.FIELD`：字段。