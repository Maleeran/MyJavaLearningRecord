package src.day_26_iostream.src;

import src.day_26_iostream.src.util.IOUtil;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        String byteFile = "src/day_26_iostream/src/source3.txt";
        String charFile = "src/day_26_iostream/src/converted.txt";
        try{
            IOUtil.convertByteToChar(byteFile, charFile);
            String content = IOUtil.readTextWithCharStream(charFile);
            System.out.println("Read content: " + content);
        }catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
