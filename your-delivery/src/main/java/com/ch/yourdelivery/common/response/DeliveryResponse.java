package com.ch.yourdelivery.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class DeliveryResponse {

    String message;
    Object data;
    HttpStatus httpStatus;
    public DeliveryResponse(String message, HttpStatus httpStatus) {//추가 생성자
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
