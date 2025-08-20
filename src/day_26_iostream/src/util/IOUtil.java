package src.day_26_iostream.src.util;

import java.io.*;

public class IOUtil {
   public static void copyFileWithBuffer(String srcPath, String destPath) throws IOException{
       try(InputStream input = new FileInputStream(srcPath);
           OutputStream output = new FileOutputStream(destPath)){
           byte[] buffer = new byte[1024]; // 创建缓冲区
           int bytesRead;
           while ((bytesRead = input.read(buffer))!= -1){
               output.write(buffer, 0, bytesRead); // 写入读取的数据
           }
           System.out.println("File copied using btye stream: " + destPath);
       }// try-with-resources 自动关闭输入输出流
   }

   public static void copyFileWithByteStream(String srcPath, String destPath) throws IOException{
       try(BufferedReader reader = new BufferedReader(new FileReader(srcPath));
       BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))){
           String line;
           while((line = reader.readLine())!=null){
               writer.write(line);
               writer.newLine();
           }
           System.out.println("File copied using byte stream: " + destPath);
       }
   }
   public static void copyFileWithCharStream(String srcPath, String destPath) throws IOException{
       try(BufferedReader reader = new BufferedReader(new FileReader(srcPath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))){
           String line;
           while((line = reader.readLine())!=null){
               writer.write(line);
               writer.newLine(); // 添加换行符
           }
           System.out.println("File copied using char stream: " + destPath);
       }
   }

   // 用字符流读取文本文件（适合纯文本，如学生数据）
   public static String readTextWithCharStream(String filePath)throws IOException{
       StringBuilder content = new StringBuilder();
        try(Reader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader)){ // BufferedReader 包装 Reader，提高效率
            String line;
            while((line = bufferedReader.readLine())!= null){ //readline() 读取一行
                content.append(line).append("\n");
            }
        }
        return content.toString();
   }
   // 用InputStream读取文件字节并转换为字符串。
    public static String readFileWithInputStream(String filePath) throws IOException{
       try(FileInputStream input = new FileInputStream(filePath);){
           byte[] buffer = new byte[1024];
           StringBuilder content =new StringBuilder();
           int bytesRead;
           while((bytesRead = input.read(buffer)) != -1){
               // 转换为字符串，假设使用UTF-8编码
               content.append(new String(buffer, 0, bytesRead, "UTF-8"));
           }
           return content.toString();
       }
    }
   // 用字符流写入文本文件
   public static void writeTextWithCharStream(String filePath, String content)throws IOException{
       try(Writer writer = new FileWriter(filePath);
          BufferedWriter bufferedWriter = new BufferedWriter(writer)){
           bufferedWriter.write(content); // write() 写入字符串
           bufferedWriter.flush();
           System.out.println("Text written to file: " + filePath);
       }
   }
   // 将字节流文件转换为字符流文件
    public static void convertByteToChar(String byteFile, String charFile) throws IOException{
       try(InputStream input = new FileInputStream(byteFile);
           Reader reader = new InputStreamReader(input, "UTF-8");
           BufferedReader bufferedReader = new BufferedReader(reader);
           Writer writer = new FileWriter(charFile);
           BufferedWriter bufferedWriter = new BufferedWriter(writer)){
           String line;
           while((line = bufferedReader.readLine())!= null){
               bufferedWriter.write(line);
               bufferedWriter.newLine();
           }
           System.out.println("转换文件："+charFile);
       }
    }

   // 异常处理示例：读取不存在的文件
    public static void safeRead(String filePath){
       try{
           readTextWithCharStream(filePath);
       }catch (IOException e){
           System.out.println("文件未找到 " + e.getMessage());
       }
    }
}
