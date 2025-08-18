package src.day_23_customexception.src.exception;

public class InvalidScoreException extends Exception{
    public InvalidScoreException(String message) {
        super(message);
    }

    public InvalidScoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
