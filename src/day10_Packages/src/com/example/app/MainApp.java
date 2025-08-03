package src.day10_Packages.src.com.example.app;

import src.day10_Packages.src.com.example.utils.Calculater;

public class MainApp {
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        System.out.println( "使用计算器计算 1 + 2 = " + calc.add(1, 2));
    }
}