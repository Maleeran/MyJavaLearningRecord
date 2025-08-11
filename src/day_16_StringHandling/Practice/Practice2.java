package src.day_16_StringHandling.Practice;

import java.util.regex.*;

public class Practice2 {
    public static void main(String[] args) {
        String str = "The price of 3 apples is 100 dollars and 50 cents.";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);

        while(m.find())
            System.out.println("Found number: "+ m.group());
        // 用while比用if更方便

        /*if(m.find()){
            System.out.println(m.group());
        }else{
            System.out.println("没有匹配到数字");
        }*/
    }
}
