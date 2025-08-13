package src.day_19_ListInterface.Practice;

import java.util.Vector;

public class IntegerVector {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        synchronized (nums){
            for (int num: nums){
                System.out.println(num);
            }
        }
    }
}
