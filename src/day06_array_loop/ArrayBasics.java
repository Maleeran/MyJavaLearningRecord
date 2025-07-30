// ArrayBasics.java 示例代码
package src.day06_array_loop;

public class ArrayBasics {
    public static void main(String[] args) {
        // 一维数组定义
        int[] ages = {18, 20, 25, 30};

        // 访问数组元素
        System.out.println("第一个元素是：" + ages[0]);

        // 修改数组元素
        ages[2] = 26;
        System.out.println("修改后的第三个元素是：" + ages[2]);

        // 打印数组长度
        System.out.println("数组长度为：" + ages.length);
    }
}
