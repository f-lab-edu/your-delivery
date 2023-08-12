package com.ch.yourdelivery.common.exception;

import lombok.Getter;
import org.springframework.core.NestedRuntimeException;

@Getter
public class UserException extends NestedRuntimeException {
    private final ExceptionCode exceptionCode;

    public UserException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
    }
}
