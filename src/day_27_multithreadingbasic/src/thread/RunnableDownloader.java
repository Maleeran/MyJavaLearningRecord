package src.day_27_multithreadingbasic.src.thread;

import java.io.*;

public class RunnableDownloader implements Runnable{
    private String sourceFile;
    private String destFile;
    private long startPos;
    private long endPos;

    public RunnableDownloader(String sourceFile, String destFile, long startPos, long endPos){
        this.sourceFile = sourceFile;
        this.destFile = destFile;
        this.startPos = startPos;
        this.endPos = endPos;
    }

    @Override
    public void run() {
        try(RandomAccessFile source = new RandomAccessFile(sourceFile, "r");
            RandomAccessFile dest = new RandomAccessFile(destFile, "rw")){
            source.seek(startPos);
            dest.seek(startPos);
            byte[]buffer = new byte[1024];
            long currentPos = startPos;
            int bytesRead;
            while((bytesRead = source.read(buffer))!= -1 && currentPos < endPos){
                dest.write(buffer,0,bytesRead);
                currentPos += bytesRead;
            }
            System.out.println("Runnable thread finished downloading segment.");
        }catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
