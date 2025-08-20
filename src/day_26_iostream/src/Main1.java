package src.day_26_iostream.src;

import src.day_26_iostream.src.util.IOUtil;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        String sourceFil = "src/day_26_iostream/src/source1.txt";
        String byteDest = "src/day_26_iostream/src/byte_copy.txt";
        String charDest = "src/day_26_iostream/src/char_copy.txt";

        try{
            // 写入文件
            IOUtil.writeTextWithCharStream(sourceFil, "Hello World！\nThis is a test.");
            // 用字节流复制文件
            IOUtil.copyFileWithByteStream(sourceFil, byteDest);
            // 用字符流复制文件
            IOUtil.copyFileWithCharStream(sourceFil, charDest);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());;
        }
    }
}
