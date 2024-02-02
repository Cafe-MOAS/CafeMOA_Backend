package CafeMoa.global.response;

import CafeMoa.global.code.GlobalErrorCode;
import CafeMoa.global.code.SuccessCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponse<T> {
    private final Boolean isSuccess;
    private final String code;
    private final String message;
    private final T data;

    //성공 시 응답
    public static <T>ApiResponse<T> onSuccess(String message, T result){
        return new ApiResponse<>(true, SuccessCode._OK.getCode(), message, result);
    }

    //실패 시  응답
    public static <T>ApiResponse<T> onFailure(GlobalErrorCode globalErrorCode, T result){
        return new ApiResponse<>(false, globalErrorCode.getCode(), globalErrorCode.getMessage(), result);
    }
}
