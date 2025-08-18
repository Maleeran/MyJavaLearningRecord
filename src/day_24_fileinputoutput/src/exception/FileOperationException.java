package src.day_24_fileinputoutput.src.exception;

import java.io.File;
import java.io.IOException;

public class FileOperationException extends IOException {
    public FileOperationException(String message){
        super(message);
    }

    public FileOperationException(String message, Throwable cause){
        super(message, cause);
    }
}
