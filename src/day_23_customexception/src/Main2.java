package src.day_23_customexception.src;

import src.day_23_customexception.src.exception.EmptyInputException;
import src.day_23_customexception.src.util.InputValidator;

public class Main2 {
    public static void main(String[] args) {
        try{
            InputValidator.validateInput(""); // 测试空输入
        }catch (EmptyInputException e){
            System.out.println("Caught exception" + e.getMessage());
        }
        try{
            InputValidator.validateInput(null); // 测试null输入
        } catch (EmptyInputException e) {
            System.out.println("Caught exception" + e.getMessage());
        }
        try{
            InputValidator.validateInput("Hello World");
        } catch (EmptyInputException e) {
            System.out.println("Caught exception" + e.getMessage());
        }
    }
}
