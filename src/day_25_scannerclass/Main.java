package src.day_25_scannerclass;

import com.sun.source.tree.CaseTree;
import src.day_25_scannerclass.src.util.StudentManager;
import src.day_25_scannerclass.src.exception.InputException;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner consoleScanner = new Scanner(System.in);

        while(true){
            System.out.println("\n1. 添加学生");
            System.out.println("2. 更新成绩");
            System.out.println("3. 显示所有学生");
            System.out.println("4. 搜索学生");
            System.out.println("5. 退出");
            System.out.print("请选择：");

            int choice = 0;
            try{
                choice = consoleScanner.nextInt();
                consoleScanner.nextLine(); // 消费换行符
            }catch (Exception e){
                consoleScanner.nextLine(); // 消费无效输入
                System.out.println("输入错误，请重新输入！");
                continue;
            }

            try{
                switch(choice){
                    case 1:
                        manager.addStudent();
                        break;
                    case 2:
                        System.out.println("2.更新成绩");
                        String id = consoleScanner.nextLine();
                        manager.updateScore(id);
                        break;

                    case 3:
                        System.out.println("3. 显示所有学生");
                        manager.displayStudents();
                        break;

                    case 4:
                        System.out.println("4. 搜索学生");
                        manager.searchStudent();
                        break;

                    case 5:
                        manager.close();
                        consoleScanner.close();
                        System.out.println("退出");
                    default:
                        System.out.println("无效的选择，请重新输入！");
                }
            }catch (InputException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
