package com.ch.yourdelivery.common.response;

import lombok.Getter;

@Getter
public class DeliveryResponse<T> {
    T data;

    public DeliveryResponse(T data) {
        this.data = data;
    }

    public static <T> DeliveryResponse<T> of(T data) {
        return new DeliveryResponse<>(data);
    }
}
