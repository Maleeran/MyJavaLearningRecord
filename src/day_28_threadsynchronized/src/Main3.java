package src.day_28_threadsynchronized.src;

import src.day_28_threadsynchronized.src.model.SharedList;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        SharedList list = new SharedList();
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                list.addElement((int)(Math.random()*100));
                System.out.println(Thread.currentThread().getName()+ "added" + list.getList());
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("List is " + list.getList());
    }
}
