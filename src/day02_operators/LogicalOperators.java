// LogicalOperators.java 示例代码
package src.day02_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 24;
        boolean isStudent = true;

        System.out.println("If you are an adult and a student: " + (age >= 18 && isStudent));
        System.out.println("Whether you are a minor or a student " + (age < 18 ||isStudent));
        System.out.println("Not a student: "+ (!isStudent));
        System.out.println("If you are a student: "+ (isStudent));
    }
}