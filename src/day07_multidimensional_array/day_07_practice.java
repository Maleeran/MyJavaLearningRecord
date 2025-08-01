package src.day07_multidimensional_array;

public class day_07_practice {
    public static void main(String[] args) {
        Practice1.run();
        Practice2.run();
        Practice3.run();
    }
}

// 打印乘法表
class Practice1{
    public static void run() {
        System.out.println("练习一：打印乘法表 ");
       for (int i = 1; i <= 9; i++){
           for (int j = 1; j <= i; j++){
               System.out.print(j + "x" + i + "=" + (i*j) + "\t");
           }
           System.out.println();
       }
        System.out.println();
    }
}

// 找出每行的最大值
class Practice2{
    public static void run(){
        System.out.println("练习二：找出每行的最大值 ");
        int[][] scores = {
                {80, 90, 85},
                {78, 88, 91},
                {70, 60, 65}
        };
        int[] maxs = new int[scores.length];

        for (int i = 0 ; i < scores.length ; i++){
            for (int j = 0 ; j < scores[i].length ; j++){
                if (scores[i][j] > maxs[i]){
                    maxs[i] = scores[i][j];
                }
            }
            System.out.println("第"+ (i+1) +"行的最大值为：" + maxs[i]);
        }
    }
}

class Practice3{
    public static void run(){
        System.out.println("练习三：请计算所有学生的平均分");
        int[][] scores = {
                { 82, 90, 91 }, // 学生甲的语数英成绩
                { 68, 72, 64 }, // 学生乙的语数英成绩
                { 95, 91, 89 }, // ...
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        double sum = 0;
        int count = 0;
        for (int i = 0 ; i < scores.length ; i++){
            for (int j = 0 ; j < scores[i].length ; j++){
                sum += scores[i][j];
                count++;
            }
        }
        double mean = sum/count;
        System.out.println(mean);
        if (Math.abs(mean - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
