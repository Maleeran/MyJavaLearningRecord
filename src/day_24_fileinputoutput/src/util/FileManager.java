package src.day_24_fileinputoutput.src.util;

import src.day_24_fileinputoutput.src.model.Student;
import src.day_24_fileinputoutput.src.exception.FileOperationException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileManager {
    private final String filePath;

    public FileManager(String filePath){
        this.filePath = filePath;
    }

    // 读取学生数据
    public Map<String, Student> readStudents()throws FileOperationException{
        Map<String, Student>students = new HashMap<>();
        File file = new File(filePath);
        BufferedReader reader = null;

        try{
            if(!file.exists()){
                throw new FileOperationException("文件不存在" + filePath);
            }
            reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine())!= null){
                Student student = Student.fromString(line);
                if (student != null){
                    students.put(student.getId(), student);
                }
            }
        }catch(IOException e){
            throw new FileOperationException("文件操作异常" + e.getMessage(), e);
        }finally {
            if (reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    throw new FileOperationException("关闭文件异常" + e.getMessage(), e);
                }
            }
        }
        return students;
    }

    // 写入学生数据
    public void writeStudents(Map<String,Student> students)throws FileOperationException{
        File file = new File(filePath);
        BufferedWriter writer = null;

        try{
            writer = new BufferedWriter(new FileWriter(file));
            for(Student student: students.values()){
                writer.write(student.toString());
                writer.newLine();
            }
        }catch (IOException e){
            throw new FileOperationException("文件操作异常" + e.getMessage(), e);
        }finally{
            if(writer != null){
                try{
                    writer.close();
                }catch (IOException e){
                    throw new FileOperationException("关闭文件异常" + e.getMessage(), e);
                }
            }
        }
    }
    // 更新学生成绩
    public void updateStudentScore(String id, double newScore)throws FileOperationException{
        Map<String, Student> students = readStudents();
        Student student = students.get(id);
        if (student != null){
            student.setScore(newScore);
            writeStudents(students);
            System.out.println("更新ID " + id + " 的分数" + newScore);
        }else{
            throw new FileOperationException("学生ID " + id + " 不存在");
        }
    }
}
