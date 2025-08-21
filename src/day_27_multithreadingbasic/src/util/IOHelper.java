package src.day_27_multithreadingbasic.src.util;

import java.io.File;

public class IOHelper {
    public static long getFileSize(String filePath){
        File file = new File(filePath);
        return file.length();
    }

}
