package src.day_27_multithreadingbasic.src;

import src.day_27_multithreadingbasic.src.thread.PrinterThread;

public class Main1 {
    public static void main(String[] args) {
        PrinterThread pt1 = new PrinterThread("Hello From Thread!");
        pt1.start();
    }
}
