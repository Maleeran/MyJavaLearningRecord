## Day20: Set 与 Map 入门

### 学习目标
1. **理解 Set 接口**：掌握 HashSet 的去重原理，了解其底层哈希表结构及应用场景。
2. **掌握 Map 接口**：熟练使用 HashMap 进行键值对的增删查改操作，理解键的唯一性。
3. **熟练遍历方式**：学会 Set 和 Map 的常见遍历方法（如 for-each、迭代器、entrySet）。
4. **实践应用**：通过一个简单项目（学生信息管理），实现 Set 和 Map 的实际应用。
5. **解决常见问题**：理解 HashSet 的 equals 和 hashCode 机制，HashMap 的键冲突处理。


### 学习内容

#### 1. Set 接口与 HashSet
- **定义**：Set 是 Collection 的子接口，不允许重复元素，无序（不保证插入顺序）。
- **HashSet 原理**：
    - 底层基于 HashMap，元素存储在 HashMap 的键中，值是固定对象（PRESENT）。
    - 去重机制：通过 `hashCode()` 和 `equals()` 判断元素是否相同。
    - 时间复杂度：增删查平均 O(1)，最坏 O(n)（哈希冲突严重时）。
- **应用场景**：
    - 去重：如存储唯一用户ID。
    - 快速查找：检查元素是否存在。
- **注意事项**：
    - 自定义对象（如 Student）需重写 `equals` 和 `hashCode`，否则去重无效。
    - HashSet 不保证遍历顺序。

#### 2. Map 接口与 HashMap
- **定义**：Map 存储键值对，键唯一，值可重复。
- **HashMap 原理**：
    - 底层是哈希表（数组+链表/红黑树）。
    - 键冲突处理：JDK7 用链表，JDK8 当链表长度>8时转为红黑树，降低最坏情况复杂度。
    - 时间复杂度：增删查平均 O(1)，最坏 O(log n)（红黑树）。
- **常用方法**：
    - `put(K, V)`：添加/更新键值对。
    - `get(K)`：获取键对应的值。
    - `remove(K)`：删除键值对。
    - `containsKey(K)`：检查键是否存在。
- **遍历方式**：
    - `keySet()`：遍历所有键。
    - `entrySet()`：遍历键值对（推荐，效率高）。
    - `values()`：遍历所有值。
- **应用场景**：
    - 快速查找：如学号到学生的映射。
    - 键值关系：如配置表、缓存。

#### 3. 遍历技巧
- **Set 遍历**：
  ```java
  Set<String> set = new HashSet<>();
  // for-each
  for (String s : set) { System.out.println(s); }
  // 迭代器
  Iterator<String> iterator = set.iterator();
  while (iterator.hasNext()) { System.out.println(iterator.next()); }
  ```
- **Map 遍历**：
  ```java
  Map<String, String> map = new HashMap<>();
  // keySet
  for (String key : map.keySet()) { System.out.println(key + ": " + map.get(key)); }
  // entrySet（推荐）
  for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
  }
  ```

#### 4. 注意事项
- **HashSet 去重**：重写 `equals` 和 `hashCode` 时，需确保一致性（若 equals 相等，hashCode 必须相同）。
- **HashMap 键不可变**：键的对象（如 String）不可修改其影响 hashCode 的字段。
- **线程安全**：HashSet 和 HashMap 非线程安全，多线程场景需用 `Collections.synchronizedSet/Map` 或 `ConcurrentHashMap`。
- **性能优化**：HashMap 初始化时指定容量（如 `new HashMap<>(16)`），减少扩容开销。
