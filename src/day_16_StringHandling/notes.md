# Day 16 学习笔记：常用类库：字符串处理

## 🎯 **今日学习目标说明**

**目标：**

* 了解 Java 中 `String` 类的常用方法。
* 掌握 `StringBuilder` 和 `StringBuffer` 的使用场景及差异。
* 掌握 `String.format()` 的使用，学习如何进行格式化字符串输出。
* 掌握如何进行字符串分割、拼接、替换等操作，掌握正则表达式的简单应用。

**重点难点：**

* **String** 的不可变性及其对性能的影响。
* **StringBuilder** 和 **StringBuffer** 的区别以及在并发环境中的选择。
* 使用 **正则表达式** 进行复杂字符串匹配。


### ✅ 1. String 类

#### ➤ 字符串的不可变性：
- `String` 在 Java 中是不可变的，每次修改都会创建一个新的对象。
- 适用于较少修改字符串的场景，确保线程安全。

#### ➤ 常用方法：
| 方法            | 描述          |
|---------------|-------------|
| `toString()`  |  转换为字符串|
| `length()`    | 获取字符串长度     |
| `indexOf()`   | 查找子字符串的索引   |
| `replace()`   | 替换字符串中的子字符串 |
| `toUpperCase()` | 转换为大写       |
| `toLowerCase()` | 转换为小写       |
| `trim()`      | 去除前后的空白字符   |
| `equals()`    | 判断字符串是否相等   |
---

### ✅ 2. StringBuilder 和 StringBuffer

#### ➤ StringBuilder
- 适用于单线程场景。
- 高效的字符串拼接、插入、删除等操作。

#### ➤ StringBuffer
- 线程安全的 `StringBuilder`，但是性能较差。
- 适用于多线程环境。

#### ➤ 方法：
- `toString()`: 转换为字符串
- `append()`: 添加内容
- `insert()`: 插入内容
- `delete()`: 删除内容
- `reverse()`: 反转内容
- `replace()`: 替换内容
---

### ✅ 3. String.format()

#### ➤ 使用 `String.format()` 进行格式化输出：
```java
String.format("格式化内容: %d", variable);
```

---

### ✅ 4. 正则表达式（Regex）

#### ➤ 正则表达式用于模式匹配：

* `Pattern`：定义正则表达式。
* `Matcher`：在字符串中查找匹配的部分。

常用方法：

* `matcher.find()`：查找匹配项。
* `split()`：根据分隔符分割字符串。

```java
Pattern p = Pattern.compile("\\d+");  // 匹配数字
Matcher m = p.matcher("abc 123");
```


