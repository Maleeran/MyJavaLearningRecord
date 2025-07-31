// TwoDArrayBasics.java 示例代码
package src.day07_multidimensional_array;

public class TwoDArrayBasics {
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        int[] arr0 = ns[0];
        System.out.println(arr0.length);

        // 访问二维数组的某个元素使用 array[row][col]
        System.out.println(ns[2][2]); // 11
    }
}