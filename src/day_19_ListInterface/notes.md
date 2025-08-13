## Day 19：List 接口详解

### 🎯 今日学习目标

1. 深入理解 **`List` 接口** 的特性：

    * 元素有序，可重复。
    * 支持索引访问。
2. 掌握常用实现类：

    * **`ArrayList`**（动态数组实现）
    * **`LinkedList`**（双向链表实现）
    * **`Vector`**（线程安全，但性能较差）
3. 掌握 List 常用方法：

    * 增删改查：`add()`、`remove()`、`set()`、`get()`。
    * 批量操作：`addAll()`、`removeAll()`、`retainAll()`。
    * 查询与判断：`contains()`、`indexOf()`、`lastIndexOf()`、`isEmpty()`。
4. 掌握 List 的遍历方式：

    * `for` 循环、增强 `for` 循环、`Iterator`、`ListIterator`、Lambda。

---

### **1. List 接口特点**

* **有序集合**：按照添加顺序存储元素。
* **可重复元素**：允许存储相同的对象。
* **支持索引访问**：可以通过 `get(index)` 直接访问。

---

### **2. 常用实现类**

| 实现类        | 底层结构       | 优势     | 劣势           |
| ---------- | ---------- | ------ | ------------ |
| ArrayList  | 动态数组       | 查询快    | 插入、删除慢（中间位置） |
| LinkedList | 双向链表       | 插入、删除快 | 查询慢          |
| Vector     | 动态数组（线程安全） | 线程安全   | 性能差          |

---

### **3. 常用方法**

* **添加**：`add(E e)`、`add(int index, E e)`、`addAll(Collection c)`
* **删除**：`remove(Object o)`、`remove(int index)`、`removeAll(Collection c)`
* **修改**：`set(int index, E e)`
* **查询**：`get(int index)`、`contains(Object o)`、`indexOf(Object o)`、`lastIndexOf(Object o)`
* **批量操作**：`retainAll(Collection c)`（保留交集）

---

### **4. 遍历方式**

* **for 循环**（按索引）
* **增强 for 循环**
* **Iterator**
* **ListIterator**（可逆向遍历）
* **forEach(Lambda)**

---

