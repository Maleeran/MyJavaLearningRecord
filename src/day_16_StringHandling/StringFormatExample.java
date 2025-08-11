package src.day_16_StringHandling;

public class StringFormatExample {
    public static void main(String[] args) {
        int x = 10,y = 20;
        System.out.printf("x = %d, y = %d",x,y);
            String result = String.format("\nThe sum of %d and %d is %d. ", x , y , x+y);
        System.out.println(result);// 输出：The sum of 10 and 20 is 30.
    }
}
