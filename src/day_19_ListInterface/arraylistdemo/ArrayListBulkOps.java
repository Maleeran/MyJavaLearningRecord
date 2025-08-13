package src.day_19_ListInterface.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBulkOps {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Mike", "Tom", "Drake"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Mike", "Jerry","Allen"));

        // 合并
        list1.addAll(list2);
        System.out.println("After addAll: " + list1);

        // 删除list2中所有出现的元素
        list1.removeAll(list2);
        System.out.println("After removeAll: " + list1);

        // 保留list2中出现的元素
        list1.addAll(Arrays.asList("Mike", "Jerry")); // asList()作用：将数组转换成List
        System.out.println("After addAll: " + list1);
        list1.retainAll(list2); //retain 保留list2中出现的元素
        System.out.println("After retainAll: " + list1);
    }
}
