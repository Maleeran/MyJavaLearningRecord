package src.day_16_StringHandling;

public class StringExample {
    public static void main(String[] args) {
        // String类常用方法
        String str1 = "Hello World!";

        // 获取字符串长度
        System.out.println("Length: " + str1.length());

        // 查找子字符串的位置
        System.out.println("Index of 'World': " + str1.indexOf("World"));

        // 字符串替换
        String newStr = str1.replace("World", "Java");
        System.out.println("Replaced String: " + newStr);

        // 字符串比较
        String str2 = "Hello World!";
        System.out.println("Equal: " + str2.equals(str1));

        // 大小写转换
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 去除空格
        String str3 = "   Hello World!   ";
        System.out.println("Trimmed String: " + str3.trim());
    }
}
