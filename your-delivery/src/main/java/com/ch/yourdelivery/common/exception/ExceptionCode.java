package com.ch.yourdelivery.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ExceptionCode {
    CONFLICT("CONFLICT", HttpStatus.CONFLICT);

    String message;
    HttpStatus httpStatus;
}
