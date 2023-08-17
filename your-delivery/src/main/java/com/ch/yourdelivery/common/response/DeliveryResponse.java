package com.ch.yourdelivery.common.response;

import org.springframework.http.HttpStatus;

public class DeliveryResponse {

    String message;
    Object data;
    HttpStatus httpStatus;

    public DeliveryResponse(String message, Object data, HttpStatus httpStatus) {
        this.message = message;
        this.data = data;
        this.httpStatus = httpStatus;
    }

    public DeliveryResponse(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
