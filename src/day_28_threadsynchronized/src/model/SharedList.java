package src.day_28_threadsynchronized.src.model;

import java.util.List;
import java.util.ArrayList;

public class SharedList {
    private List<Integer> list = new ArrayList<>();

    public void addElement(int element) {
        synchronized (list){
            list.add(element);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }
}
