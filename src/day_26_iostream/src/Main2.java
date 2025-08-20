package src.day_26_iostream.src;

import src.day_26_iostream.src.util.IOUtil;
import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "src/day_26_iostream/src/source2.txt";
        try{
            IOUtil.writeTextWithCharStream(filePath, "Hello, IO流. ");
            String content = IOUtil.readTextWithCharStream(filePath);
            System.out.println("Read content: " + content);
        }catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
