package com.ch.yourdelivery.common.exception;

import lombok.Getter;
import org.springframework.core.NestedRuntimeException;

@Getter
public class DeliveryException extends NestedRuntimeException {
    private final ExceptionCode exceptionCode;

    public DeliveryException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
    }
}
