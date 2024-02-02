package CafeMoa.global.exception;

import CafeMoa.global.code.GlobalErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GlobalException extends RuntimeException{

    private GlobalErrorCode globalErrorCode;
}
