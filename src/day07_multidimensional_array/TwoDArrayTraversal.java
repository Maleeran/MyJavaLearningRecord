package src.day07_multidimensional_array;

import java.util.Arrays;

class TwoDArrayTraversal {
    public static void main(String[] args) {
        int[][] ns = new int[3][4];

        for(int[]arr : ns){
            for(int n : arr){
                System.out.print(n);
                System.out.print(',');
            }
            System.out.println();
        }
    }
}

//使用Java标准库的Arrays.deepToString()

class ShowTwoDArray{
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.deepToString(ns));
    }
}

