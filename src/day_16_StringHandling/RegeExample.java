package src.day_16_StringHandling;

import java.util.regex.*;

public class RegeExample {
    public static void main(String[] args) {
        // 正则表达式使用示例
        String str = "Java 8 is here.";

        // 查找包含数字的部分
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);

        if (m.find()){
            System.out.println("包含数字的部分：" + m.group());
        }else {
            System.out.println("没有包含数字的部分");
        }

        // 分割字符串
        String[] words = str.split(",");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
