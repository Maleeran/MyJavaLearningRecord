package src.day_28_threadsynchronized.src.thread;

import src.day_28_threadsynchronized.src.model.BankAccount;

public class TransferRunnable implements Runnable{
    private BankAccount account;
    private double amount;

    public TransferRunnable(BankAccount account, double amount)
    {
        this.account = account;
        this.amount = amount;
    }

    public void run()
    {
        for(int i = 0; i < 10; i++){
            account.transfer(amount);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
