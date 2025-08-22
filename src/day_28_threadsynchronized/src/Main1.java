package src.day_28_threadsynchronized.src;


import src.day_28_threadsynchronized.src.model.SafeCounter;
import src.day_28_threadsynchronized.src.thread.RunnableCounter;

public class Main1 {
    public static void main(String[] args) {
        SafeCounter counter = new SafeCounter();

        RunnableCounter counter1 = new RunnableCounter(counter);
        RunnableCounter counter2 = new RunnableCounter(counter);

        Thread t1 = new Thread(counter1);
        Thread t2 = new Thread(counter2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is " + counter.getCount());
    }
}
