package CafeMoa.global.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessCode {

    _OK(HttpStatus.OK, "OK", "응답에 성공하였습니다");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
