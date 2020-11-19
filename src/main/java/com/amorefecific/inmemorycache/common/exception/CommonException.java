package com.amorefecific.inmemorycache.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.Objects;

@Getter
public class CommonException extends RuntimeException {
    private HttpStatus httpStatus;
    private Object[] args;

    // todo : errorCode 및 exception case에 대해 ENUM 형태로 명시적 관리 필요. 현재는 500 status으로 통일.
    public CommonException(String message, Throwable t, Object[] args) {
        super(message, t);
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        if (Objects.nonNull(args)) {
            this.args = Arrays.copyOf(args, args.length);
        }
    }
}
