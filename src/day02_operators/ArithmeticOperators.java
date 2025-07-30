package src.day02_operators;

public class ArithmeticOperators{
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b)); // Addition
        System.out.println("Subtraction: " + (a - b)); // Subtraction
        System.out.println("Multiplication: " + (a * b)); // Multiplication
        System.out.println("Division: " + (a/b)); // Division
        System.out.println("Take remainder: " + (a % b)); // Take remainder
        System.out.println("Float-point division : " + ((double)a/b)); // Float-point division

        int x = 5;
        System.out.println("Initial x: " + x);
        System.out.println("x++: "+ (x++)); // Suffix ++, use first then add 1
        int y = x++; // y = x + 1
        System.out.println("y: " + y);

        x = 5; // reset x
        System.out.println("Reset x:" + x);
        System.out.println("++x: "+ (++x)); // Prefix ++, add 1 before use
    }
}
