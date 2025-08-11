package src.day_16_StringHandling;

public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder 示例：可变字符串
        StringBuilder sb = new StringBuilder("Hello");

        // 字符串拼接
        sb.append(", World!");
        System.out.println(sb);

        // 插入字符串
        sb.insert(6, " Beautiful");
        System.out.println(sb);

        // 反转字符串
        sb.reverse();
        System.out.println(sb.toString());

        // 删除部分字符串
        sb.delete(6,13);
        System.out.println(sb.toString());

        System.out.println(sb);
    }
}
