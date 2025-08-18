package src.day_23_customexception.src;

import src.day_23_customexception.src.exception.IllegalAgeException;
import src.day_23_customexception.src.util.AgeValidator;

public class Main3 {
    public static void main(String[] args) {
        try{
            AgeValidator.validateAge(15);
        } catch (IllegalAgeException e) {
            System.out.println("Caught exception" + e.getMessage());
        }
        try {
            AgeValidator.validateAge(123);
        }catch (IllegalAgeException e){
            System.out.println("Caught exception" + e.getMessage());
        }
    }
}
