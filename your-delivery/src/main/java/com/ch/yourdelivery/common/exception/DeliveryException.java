package com.ch.yourdelivery.common.exception;

import lombok.Getter;
import org.springframework.core.NestedRuntimeException;

@Getter
public class DeliveryException extends NestedRuntimeException {

    private final ExceptionCode exceptionCode;
    private final Object requestObject;

    public DeliveryException(Object requestObject, ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.requestObject = requestObject;
        this.exceptionCode = exceptionCode;
    }
}
