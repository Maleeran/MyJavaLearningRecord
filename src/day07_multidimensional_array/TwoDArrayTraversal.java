package src.day07_multidimensional_array;

import java.util.Arrays;

class TwoDArrayTraversal {
    public static void main(String[] args) {
        // for loop
        int [][] matrix ={
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println("for loop: ");
        for(int i = 0; i< matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // for-each loop

        int[][] ns = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        System.out.println("for-each loop: ");
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

