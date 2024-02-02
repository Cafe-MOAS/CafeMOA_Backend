package CafeMoa.global.exception;

import CafeMoa.global.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice(annotations = {RestController.class})
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    // GlobalException 예외 처리 핸들러
    @ExceptionHandler(value = {GlobalException.class})
    protected ApiResponse<String> handleGlobalException(GlobalException e) {
        log.error(e.getMessage() + ": " + e.getGlobalErrorCode());
        return ApiResponse.onFailure(e.getGlobalErrorCode(), "");
    }
}
