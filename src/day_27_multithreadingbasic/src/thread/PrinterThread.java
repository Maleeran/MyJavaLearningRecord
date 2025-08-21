package src.day_27_multithreadingbasic.src.thread;

import java.io.IOException;

public class PrinterThread extends Thread{
    private String message;

    public PrinterThread(String message)
    {
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message + "- Count: " + (i+1));
        }
    }
}
