package src.day_27_multithreadingbasic.src;

import src.day_27_multithreadingbasic.src.thread.CounterRunnable;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
    CounterRunnable task = new CounterRunnable();
    Thread t1 = new Thread(task, "Thread 1");
    Thread t2 = new Thread(task, "Thread 2");

    t1.start();
    t2.start();

    t1.join();
    t2.join();
    System.out.println("Main thread: Count is " + task.getCount());
    }
}
