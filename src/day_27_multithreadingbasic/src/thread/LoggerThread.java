package src.day_27_multithreadingbasic.src.thread;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerThread extends Thread{
    private String logFile;

    public LoggerThread(String logFile) {
        this.logFile = logFile;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String logEntry = sdf.format(new Date()) + " - Thread " + getName() + " executed.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) { // true 表示追加
            writer.write(logEntry);
            writer.newLine();
            System.out.println("Logged: " + logEntry);
        } catch (IOException e) {
            System.out.println("Error logging: " + e.getMessage());
        }
    }
}
