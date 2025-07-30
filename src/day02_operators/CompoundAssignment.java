package src.day02_operators;

public class CompoundAssignment {
    public static void main(String[] args) {
        int num = 100;

        num += 20; //Equivalent to num = num + 20
        System.out.println("After +=: " + num);

        num *= 2;
        System.out.println("After *=: " + num);

        num /= 3;
        System.out.println("After /=: " + num);

        num %= 6;
        System.out.println("After %=: " + num);
    }
}
