package com.ch.yourdelivery.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionCode {
    CONFLICT("CONFLICT");

    String message;
}
