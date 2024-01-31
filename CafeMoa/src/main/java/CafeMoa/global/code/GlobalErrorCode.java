package CafeMoa.global.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum GlobalErrorCode {

    _INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "500", "서버 에러, 관리자에게 문의하세요"),
    _BAD_REQUEST(HttpStatus.BAD_REQUEST, "400", "잘못된 요청입니다"),
    _UNAUTHORIZED(HttpStatus.UNAUTHORIZED,"401","인증이 필요합니다"),
    _UNAUTHORIZED_TOKEN(HttpStatus.UNAUTHORIZED, "402", "유효하지 않은 토큰입니다"),
    _FORBIDDEN(HttpStatus.FORBIDDEN, "403", "금지된 요청입니다"),
    _ACCOUNT_NOT_FOUND(HttpStatus.NOT_FOUND, "404", "존재하지 않는 계정입니다"),
    _NO_CONTENTS(HttpStatus.NO_CONTENT, "404", "요청한 데이터가 존재하지 않습니다");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
