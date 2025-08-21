package src.day_27_multithreadingbasic.src.thread;

import java.io.*;

public class RunnableSum implements Runnable{
    private long sum;

    @Override
    public void run() {
        sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("RunnableSum sum: " + sum);
    }

    public long getSum() {
        return sum;
    }
}
