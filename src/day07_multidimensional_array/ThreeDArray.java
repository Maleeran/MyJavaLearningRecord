package src.day07_multidimensional_array;

public class ThreeDArray {
    public static void main(String[] args) {
        // 三维数组就是二维数组的数组。可以这么定义一个三维数组
        int[][][] ns = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11},
                        {12, 13}
                },
                {
                        {14, 15, 16},
                        {17, 18},
                        {19}
                }
                /*
                如果我们要访问三维数组的某个元素，例如，ns[2][0][1]，
                只需要顺着定位找到对应的最终元素15即可。
                 */
        };
    }
}
