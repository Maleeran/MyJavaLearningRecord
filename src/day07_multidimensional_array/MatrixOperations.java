package src.day07_multidimensional_array;

public class MatrixOperations {
    public static void main(String[] args) {
        // Matrix Sum
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0; // Initial sum
        for (int i = 0; i < matrix.length; i++){
            for (int j =0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println("总和为: "+ sum);

        // 求最大值及其坐标
        int max = matrix[0][0];
        int row = 0, col = 0;
            for (int i = 0;i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    if (matrix[i][j] > max){
                        max = matrix[i][j];
                        row = i;
                        col = j;
                    }
                }
            }
        System.out.println("最大值为："+ max + ", 坐标为：" + "(" + row + ", "+col +")");
    }
}

