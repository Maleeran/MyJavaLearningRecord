package src.day_27_multithreadingbasic.src;

import src.day_27_multithreadingbasic.src.thread.LoggerThread;

public class Main4 {
    public static void main(String[] args) throws InterruptedException {
        String logFile ="src/day_27_multithreadingbasic/src/thread_log.txt";
        LoggerThread loggerThread1 = new LoggerThread(logFile);
        LoggerThread loggerThread2 = new LoggerThread(logFile);

        loggerThread1.start();
        loggerThread2.start();

        loggerThread1.join();
        loggerThread2.join();
        System.out.println("Logging completed.");
    }
}
