package src.day_22_exceptionhadling.src.util;

import src.day_22_exceptionhadling.src.model.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileHandler {
    //读取文件并解析学生数据
    public Map<String, Student> readStudents(String filePath) throws IOException{
        Map<String, Student> students = new HashMap<>();
        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if (parts.length == 3){
                    students.put(parts[0],new Student(parts[0], parts[1], Double.parseDouble(parts[2])));
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("文件未找到" + e.getMessage());
            throw e; // 传播异常
        }catch (IOException e){
            System.out.println("IO异常" + e.getMessage());
            throw e;// 传播 IOException
        }finally {
            if(reader != null){
                try{
                    reader.close();
                } catch (IOException e){
                    System.out.println("关闭文件异常" + e.getMessage());
                }
            }
        }
        return students;
    }

    // 写入学生数据到文件
    public void writeStudents(String filePath, Map<String, Student> students) throws IOException{
        BufferedWriter writer = null;
        try{
           writer = new BufferedWriter(new FileWriter(filePath));
           for (Student student : students.values()){
               writer.write(student.getId() + "," + student.getName() + "," + student.getScore());
               writer.newLine();
           }
        }catch (IOException e){
            System.out.println("IO异常" + e.getMessage());
            throw e; // 传播异常
        }finally {
            if(writer != null){
                try{
                    writer.close();
                } catch (IOException e){
                    System.out.println("关闭文件异常" + e.getMessage());
                }
            }
        }
    }


}



