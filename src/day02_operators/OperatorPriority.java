package src.day02_operators;

public class OperatorPriority {
    public static void main(String[] args) {
        int result = 3 + 5 * 2;
        int resultwithParentheses = (3 + 5) * 2;

        System.out.println("WithParentheses: "+ result);
        System.out.println("WithoutParentheses: "+ resultwithParentheses);
    }
}
