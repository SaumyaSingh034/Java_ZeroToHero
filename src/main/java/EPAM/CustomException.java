package EPAM;

import javax.imageio.IIOException;
import java.io.UncheckedIOException;

public class CustomException extends UncheckedIOException {

    public CustomException(){
        super();
    }

    public CustomException(String message){
        super();
    }

    public CustomException(String message, Throwable cause){
        super(message, cause);
    }
}
