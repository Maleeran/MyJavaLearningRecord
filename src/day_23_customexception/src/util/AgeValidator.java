package src.day_23_customexception.src.util;

import src.day_23_customexception.src.exception.IllegalAgeException;
public class AgeValidator  {
    public static void validateAge(int age) throws IllegalAgeException{
        if(age < 0 || age > 120){
            throw new IllegalAgeException("Age must be between 0 and 120: " + age);
        }
        System.out.println("Age is valid: " + age);
    }
}
