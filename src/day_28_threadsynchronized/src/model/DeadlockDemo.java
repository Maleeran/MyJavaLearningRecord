package src.day_28_threadsynchronized.src.model;

public class DeadlockDemo {
    public static void main(String[] args) {
        String resource1 = "resource1";
        String resource2 = "resource2";

        Thread t1 = new Thread(() -> {
          synchronized (resource1){
              System.out.println("Thread 1: locked "+ resource1);
              try{
                  Thread.sleep(100);
              }catch (Exception e){
              }synchronized (resource2){
                  System.out.println("Thread 1: locked "+ resource2);
              }
          }
        },"Thread-1" );
        Thread t2 = new Thread(() -> {
            synchronized (resource1){
                System.out.println("Thread 2: locked "+resource1);
                try {
                    Thread.sleep(100);
                }catch(Exception e){
                }synchronized (resource2){
                    System.out.println("Thread 2: locked "+resource2);
                }
            }
        },"Thread-2");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
        }
    }
}
