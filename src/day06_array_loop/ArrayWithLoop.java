// ArrayWithLoop.java 示例代码
package src.day06_array_loop;

public class ArrayWithLoop {
    public static void main(String[] args) {
        int[] socres = {85, 98, 78, 92, 88};

        // 普通 for 循环
        System.out.println("使用 for 循环打印成绩");
        for (int i = 0;i < socres.length; i++){
            System.out.println("第"+ (i+1)+ "个成绩是"+ socres[i]);
        }

        // for-each 循环
        System.out.println("使用 for-each 循环打印成绩");
        for (int score : socres){
            System.out.println("成绩："+ score);
        }
    }
}