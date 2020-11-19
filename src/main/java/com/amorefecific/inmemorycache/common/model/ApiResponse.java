package com.amorefecific.inmemorycache.common.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<R extends ApiResultDto> {

    private boolean success;
    private int status;
    private String message;
    private R result;

    public static <R> ApiResponse success(R result) {
        HttpStatus status = HttpStatus.OK;
        return getInstance(true, status, result);
    }

    public static <T> ApiResponse fail(HttpStatus status, T arg) {
        return getInstance(false, status, arg);
    }

    public ResponseEntity<ApiResponse<R>> asResponseEntity() {
        return ResponseEntity.status(this.status).body(this);
    }

    private static <R> ApiResponse getInstance(boolean success, HttpStatus httpStatus, R result) {
        ApiResponse instance = new ApiResponse();

        instance.success = success;
        instance.status = httpStatus.value();
        instance.message = httpStatus.getReasonPhrase();
        instance.result = (ApiResultDto) result;

        return instance;
    }
}
