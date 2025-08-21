package src.day_27_multithreadingbasic.src.thread;

public class CounterRunnable implements Runnable{
    private int count = 0; //共享变量

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count++;
            System.out.println(Thread.currentThread().getName()+"counter: " + count);
        }
    }

    public int getCount() {
        return count;
    }
}

