package com.ch.yourdelivery.common.response;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class DeliveryResponse {

    String message;
    Object data;
    HttpStatus httpStatus;
    public DeliveryResponse(String message, HttpStatus httpStatus) {//추가 생성자
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
