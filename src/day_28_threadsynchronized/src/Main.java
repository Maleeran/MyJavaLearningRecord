package src.day_28_threadsynchronized.src;

import src.day_28_threadsynchronized.src.thread.TransferRunnable;
import src.day_28_threadsynchronized.src.model.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // 初始余额 1000

        TransferRunnable runnable1 = new TransferRunnable(account, 100);
        TransferRunnable runnable2 = new TransferRunnable(account, 200);
        Thread thread1 = new Thread(runnable1, "取款线程1");
        Thread thread2 = new Thread(runnable2, "取款线程2");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("账户余额: " + account.getBalance());
    }
}
