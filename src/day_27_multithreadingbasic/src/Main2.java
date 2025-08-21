package src.day_27_multithreadingbasic.src;

import src.day_27_multithreadingbasic.src.thread.RunnableSum;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        RunnableSum sum = new RunnableSum();
        Thread t1 = new Thread(sum);
        t1.start();// 启动线程
        t1.join(); // 等待线程结束
        System.out.println("Main thread: Sum is " + sum.getSum());
    }
}
