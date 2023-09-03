package com.ch.yourdelivery.common.handler;

import com.ch.yourdelivery.common.exception.DeliveryException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice public class DeliveryExceptionHandler {

    private final String CONTEXT_TYPE = "application/json;charset=UTF-8";

    @ExceptionHandler(value = DeliveryException.class)
    public void conflictExceptionHandler(HttpServletResponse response,
            DeliveryException deliveryException) {
        response.setContentType(CONTEXT_TYPE);

        deliveryException.getExceptionCode().getMessage();//공통 response 후 사용

        //변경이 enum에서만 일어나도록 변경
        HttpStatus status = deliveryException.getExceptionCode().getHttpStatus();
        response.setStatus(status.value());
    }
}
