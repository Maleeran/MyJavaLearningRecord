package src.day_16_StringHandling;

public class StringBufferExample {
    public static void main(String[] args) {
        // StringBuffer 示例：线程安全的可变字符串
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(", World!");
        System.out.println(sb.toString());

        sb.insert(6, " Beautiful");
        System.out.println(sb.toString());

        /*
        这是Java中常见的区间表示方法：
           - 包含起始索引
           - 不包含结束索引
           - 区间长度 = end - start
         */

        sb.replace(0, 5, "Hi");
        System.out.println("Hello --> Hi : " + sb.toString());


    }
}
