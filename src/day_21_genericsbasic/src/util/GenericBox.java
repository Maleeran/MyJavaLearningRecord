package src.day_21_genericsbasic.src.util;

import java.util.ArrayList;
import java.util.List;

public class GenericBox<T> {
    private List<T> items = new ArrayList<>();

    // 添加元素
    public void add(T item) {
        items.add(item);
    }

    // 获取元素
    public T get(int index) {
        if (index >= 0 && index < items.size()){
            return items.get(index);
        }
        return null;
    }

    // 获取所有元素
    public List<T> getAll(){
        return new ArrayList<>(items);
    }


    // 泛型方法：打印任意类型列表
    public static <E> void  printlist(List<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
    }

    // 使用通配符？extends T: 读取 Number 类型及其子类
    public static void printNumber(List<? extends Number> list){
        for (Number item : list) {
            System.out.println(item);
        }
    }


    // 使用通配符？super T: 添加Comparable 类型及其子类
    public static <T> void addAll(List<? super T> list, T item) {
        list.add(item);
    }

    public int size() {
        return items.size();
    }
}
