## Day21: 泛型（Generics）基础


---

## 学习目标
1. **理解泛型概念**：掌握泛型的定义、作用及类型安全的优势。
2. **掌握泛型类与方法**：能定义和使用泛型类、泛型方法，理解类型参数 `<T>`。
3. **熟悉通配符**：理解通配符 `<?>`、上界 `<? extends T>` 和下界 `<? super T>` 的用法。
4. **实践应用**：通过一个通用容器类项目，结合 Day20 的学生管理，应用泛型。
5. **面试准备**：熟悉泛型常见问题（如类型擦除、边界限制），为实习面试打基础。

---

### 1. 泛型基础
- **定义**：泛型允许类、接口、方法在定义时不指定具体类型，使用类型参数（如 `<T>`）表示通用类型。
- **作用**：
    - **类型安全**：编译时检查类型，减少运行时错误（如 `ClassCastException`）。
    - **代码复用**：同一类/方法可处理多种类型。
    - **简化代码**：无需强制类型转换。
- **语法**：
    - 泛型类：`class GenericBox<T> {...}`
    - 泛型方法：`public <T> void method(T param) {...}`
- **示例**：`List<String>` 是泛型接口的实例化，`String` 是类型参数。

### 2. 泛型类与泛型方法
- **泛型类**：
    - 定义：`class MyClass<T> { T field; }`
    - 使用：`MyClass<String> obj = new MyClass<>();`（Java 7+ 支持钻石操作符 `<>`）。
    - 注意：`T` 在编译时有效，运行时被擦除为 `Object`（类型擦除）。
- **泛型方法**：
    - 定义：在方法前声明类型参数，如 `<E> void printList(List<E> list)`。
    - 可在非泛型类中定义，灵活性高。
- **注意事项**：
    - 不能用基本类型（如 `int`）作为类型参数，需用包装类（如 `Integer`）。
    - 类型参数通常用单字母：`T`（Type）、`E`（Element）、`K`（Key）、`V`（Value）。

### 3. 通配符 (Wildcard)
- **无界通配符 `<?>`**：
    - 表示任意类型，如 `List<?> unknownList`。
    - 用途：只读数据，无法添加（除 `null`）。
    - 示例：`void printList(List<?> list)` 可打印任意类型的 `List`。
- **上界通配符 `<? extends T>`**：
    - 表示 `T` 或其子类，如 `List<? extends Number>` 可包含 `Integer`、`Double` 等。
    - 用途：读取数据，保证类型安全（如读取 `Number` 的子类）。
    - 限制：不能添加数据（因具体类型未知）。
- **下界通配符 `<? super T>`**：
    - 表示 `T` 或其父类，如 `List<? super Integer>` 可包含 `Number`、`Object`。
    - 用途：写入数据（如添加 `Integer` 到 `Number` 列表）。
    - 限制：读取时只能得到 `Object` 类型。
- **PECS 原则**：**Producer Extends, Consumer Super**。
    - 用 `extends` 用于读取（生产数据），如 `List<? extends Number>`。
    - 用 `super` 用于写入（消费数据），如 `List<? super Integer>`。

### 4. 类型擦除
- 泛型信息在编译后被擦除，运行时类型为 `Object` 或边界类型。
- 影响：
    - 不能用 `instanceof` 检查泛型类型（如 `obj instanceof List<String>`）。
    - 不能创建泛型类数组（如 `new List<String>[]`）。
- **应对**：用显式类型转换或通配符。

### 5. 应用场景
- 集合框架：`List<T>`, `Set<T>`, `Map<K,V>` 广泛使用泛型。
- 自定义容器：如 `GenericBox<T>` 可存储任意类型。
- 方法重用：泛型方法提高代码灵活性。
