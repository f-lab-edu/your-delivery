package com.ch.yourdelivery.common.handler;

import com.ch.yourdelivery.common.exception.ExceptionCode;
import com.ch.yourdelivery.common.exception.UserException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DeliveryExceptionHandler {

    private final String CONTEXT_TYPE = "application/json;charset=UTF-8";

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(value = UserException.class)
    public void conflictExceptionHandler(HttpServletRequest request, HttpServletResponse response, UserException userException){
        response.setContentType(CONTEXT_TYPE);

        if(userException.getExceptionCode().equals(ExceptionCode.CONFLICT)){
            response.setStatus(HttpStatus.CONFLICT.value());
        }else{
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        }

    }
}