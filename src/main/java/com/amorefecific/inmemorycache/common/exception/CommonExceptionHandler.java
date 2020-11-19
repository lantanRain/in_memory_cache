package com.amorefecific.inmemorycache.common.exception;

import com.amorefecific.inmemorycache.common.model.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ResponseEntity<ApiResponse> handleApiException(HttpServletRequest request, CommonException exception) {
        log.error(String.format("common exception handler: header : %s, key : %s", request.getHeader("User-Agent"), request.getParameter("key")), exception);
        ApiResponse apiResponse = ApiResponse.fail(exception.getHttpStatus(), exception.getMessage());
        return apiResponse.asResponseEntity();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse> handleException(HttpServletRequest request, Exception exception) {
        log.error(String.format("common exception handler: header : %s, key : %s", request.getHeader("User-Agent"), request.getParameter("key")), exception);
        ApiResponse apiResponse = ApiResponse.fail(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return apiResponse.asResponseEntity();
    }
}
