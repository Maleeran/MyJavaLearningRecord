package src.day_28_threadsynchronized.src.thread;

import src.day_28_threadsynchronized.src.model.SafeCounter;

public class RunnableCounter implements Runnable{
    private SafeCounter counter;

    public RunnableCounter(SafeCounter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            counter.increment();
        }
    }
}
