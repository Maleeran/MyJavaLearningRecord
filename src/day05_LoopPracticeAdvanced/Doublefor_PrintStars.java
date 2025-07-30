package src.day05_LoopPracticeAdvanced;

public class Doublefor_PrintStars {
    public static void main(String[] args) {
        // 打印一个三角形
        for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}

// 直角的
class PrintHollowstars {
    public static void main(String[] args) {
        for (int i = 1;i <= 5;i++){
            for (int j = 1;j <= i;j++){
                if (!(j == 1) && (j < i) && !(i == 5)) System.out.print(" ");
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

// 等腰的
class PrintHollowTriangle {
    public static void main(String[] args) {
        int n = 5; // 高度（行数）

        for (int i = 1; i <= n; i++) {
            // 打印前导空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 打印星号和空格
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

class HollowInvertedTriangle{
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++){
            for (int j = 1;j <= i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*(n-i)+1; k++){
                if(k == 1 || k == 2*(n-i)+1 || i==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

class HollowPyramid {
    public static void main(String[] args) {
        int n = 6; // 层数

        for (int i = 1; i <= n; i++) {
            // 打印空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 打印金字塔体
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
