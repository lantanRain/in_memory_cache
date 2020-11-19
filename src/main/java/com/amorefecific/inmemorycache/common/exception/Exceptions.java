package com.amorefecific.inmemorycache.common.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Exceptions {

    CommonException newExcepton(String message) {
        return newExceptionInstance(message, null, null);
    }

    public static CommonException newExcepton(Object... args) {
        return newExceptionInstance(null, null, args);
    }

    public static CommonException newExcepton(Throwable t, Object... args) {
        return newExceptionInstance(null, t, args);
    }

    public static CommonException newExcepton(String message, Throwable t, Object... args) {
        return newExceptionInstance(message, t, args);
    }

    private static CommonException newExceptionInstance(String message, Throwable t, Object... args) {
        return new CommonException(message, t, args);
    }
}
