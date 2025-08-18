package src.day_23_customexception.src.util;

import src.day_23_customexception.src.exception.EmptyInputException;

public class InputValidator {
    public static void validateInput(String input) throws EmptyInputException {
        if(input == null || input.trim().isEmpty()) { // trim() 去掉字符串首尾的空格
            throw new EmptyInputException("Input cannot be empty");
        }
        System.out.println("Input is valid: " + input);
    }
}
