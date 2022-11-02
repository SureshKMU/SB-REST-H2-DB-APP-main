package in.ashokit.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value=NoProductFoundException.class)
    public ResponseEntity handleNoproductfoundexception(){
        AppError appError = new AppError(404,"Bad Request",new Date());
        return new ResponseEntity(appError,HttpStatus.BAD_REQUEST);
    }
}
