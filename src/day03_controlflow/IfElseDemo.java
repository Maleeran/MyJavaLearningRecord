// IfElseDemo.java 示例代码
package src.day03_controlflow;

public class IfElseDemo {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}