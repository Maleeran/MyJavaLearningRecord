package src.day_28_threadsynchronized.src.model;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance; // 共享余额
    private final ReentrantLock lock = new ReentrantLock();

    public BankAccount(double balance){
        this.balance = balance;
    }

    // 使用synchronized 方法同步转账
    public void transfer(double amount){
        if(lock.tryLock()){
            try{
                if(balance >= amount){
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + "取款成功，取款金额：" + amount);
                }else {
                    System.out.println(Thread.currentThread().getName() + "余额不足！");
                }
            }finally{
                lock.unlock(); // 释放锁
            }
        }else {
            System.out.println(Thread.currentThread().getName() + "获取锁失败！");
        }
    }

    // 使用synchronized 代码块同步转账
    public void transferWithBlock(double amount){
        synchronized (this){ // 锁对象是this（当前实例）
            if(balance >= amount){
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + "取款成功，取款金额：" + amount);
            }else {
                System.out.println(Thread.currentThread().getName() + "余额不足！");
            }
        }
    }

    public double getBalance(){
        return balance;
    } // 获取余额
}



