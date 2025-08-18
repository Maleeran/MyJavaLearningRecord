package src.day_23_customexception.src.exception;

public class DuplicateIDException extends  Exception {
    public DuplicateIDException(String message) {
        super(message); // 调用父类构造方法
    }

    public DuplicateIDException(String message, Throwable cause) {
        super(message, cause); // 支持链式异常
    }
}
