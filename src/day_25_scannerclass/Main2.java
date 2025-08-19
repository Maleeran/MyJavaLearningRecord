package src.day_25_scannerclass;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter input: ");
        sc2.nextLine(); //准备读取
        System.out.println("Enter 'John 25': ");
        String input1 = sc2.next();
        sc2.nextLine();
        String input2 = sc2.nextLine();

        System.out.println("Using next(): " + input1);
        System.out.println("Using nextLine() after next(): " + input2);

        sc2.close();
    }
}
