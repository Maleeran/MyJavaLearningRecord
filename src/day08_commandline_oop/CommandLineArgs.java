// CommandLineArgs.java 示例代码
// 移除这行包声明
// package src.day08_commandline_oop;

public class CommandLineArgs {
    public static void main(String[] args) {
        String sum = "0";
        // 打印所有命令行参数
        for (String arg : args) {
            System.out.println("数值: " + arg);
            sum += arg;
        }
    }
}