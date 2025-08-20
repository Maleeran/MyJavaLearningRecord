package src.day_26_iostream.src;

import src.day_26_iostream.src.util.IOUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String sourceFile = "src/day_26_iostream/src/source.txt";
        String destFile = "src/day_26_iostream/src/destination.txt";
        String binarySource = "src/day_26_iostream/src/lena.png";
        String binaryDest = "src/day_26_iostream/src/lena_copy.png";

        try{
            // 测试字符流写入
            IOUtil.writeTextWithCharStream(sourceFile, "hello world!\nThis is a test.");

            // 测试字符流读取
            String content = IOUtil.readTextWithCharStream(sourceFile);
            System.out.println(content);

            // 测试字节流复制
            IOUtil.copyFileWithBuffer(binarySource, binaryDest);
            System.out.println("File copied successfully.");

            // 测试异常
            IOUtil.safeRead("nonexistent.txt");
        }catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
