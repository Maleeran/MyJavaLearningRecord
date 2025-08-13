package src.day_19_ListInterface.vectordemo;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);

        // synchronized 作用：保证线程安全
        synchronized (numbers){
            for (Integer number : numbers){
                System.out.println(number);
            }
        }
    }
}
