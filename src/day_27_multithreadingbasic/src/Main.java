package src.day_27_multithreadingbasic.src;

import src.day_27_multithreadingbasic.src.thread.FileDownloaderThread;
import src.day_27_multithreadingbasic.src.thread.RunnableDownloader;
import src.day_27_multithreadingbasic.src.util.IOHelper;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "src/day_27_multithreadingbasic/src/testvideo.mp4";
        String destFile = "src/day_27_multithreadingbasic/src/testvideo_copy.mp4";
        long fileSize = IOHelper.getFileSize(sourceFile);
        long segment = fileSize / 4;

        // 继承Thread 方式
        FileDownloaderThread thread1 = new FileDownloaderThread(sourceFile, destFile, 0, segment);
        FileDownloaderThread thread2 = new FileDownloaderThread(sourceFile, destFile, segment, 3* segment);
        FileDownloaderThread thread3 = new FileDownloaderThread(sourceFile, destFile, segment * 3, fileSize);

        thread1.start(); // 启动线程
        thread2.start();
        thread3.start();


      // 实现Runnable方式
        Thread runnable = new Thread(new RunnableDownloader(sourceFile, destFile, 0, segment));
        runnable.start();
        /** 错误方式 - 直接使用 RunnableDownloader
        RunnableDownloader runnable = new RunnableDownloader(sourceFile, destFile, 0, segment);
        runnable.start(); // 编译错误！RunnableDownloader 没有 start() 方法
        **/

        try{
            thread1.join(); // 等待线程结束
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            System.out.println("Thread interrupted: "+ e.getMessage());
        }
        System.out.println("Download completed.");
    }
}
