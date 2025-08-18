package src.day_23_customexception.src.exception;

public class IllegalAgeException extends RuntimeException {
    public IllegalAgeException(String message) {
        super(message);
    }
}
