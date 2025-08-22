package src.day_28_threadsynchronized.src.model;

public class SafeCounter {
    private int count = 0;

    public synchronized void increment()
    {
        count++; // 原子操作，受 synchronized 保护
    }

    public int getCount()
    {
        return count;
    }
}
