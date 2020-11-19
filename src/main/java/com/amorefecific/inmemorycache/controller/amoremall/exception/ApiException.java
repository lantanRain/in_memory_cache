package com.amorefecific.inmemorycache.controller.amoremall.exception;

import com.amorefecific.inmemorycache.common.exception.CommonException;

public class ApiException extends CommonException {

    public ApiException(String message) {
        super(message, null, null);
    }
}
