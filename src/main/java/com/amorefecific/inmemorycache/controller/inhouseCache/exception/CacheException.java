package com.amorefecific.inmemorycache.controller.inhouseCache.exception;

import com.amorefecific.inmemorycache.common.exception.CommonException;

public class CacheException extends CommonException {

    public CacheException(String message) {
        super(message, null, null);
    }
}
