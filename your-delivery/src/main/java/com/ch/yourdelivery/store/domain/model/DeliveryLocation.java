package com.ch.yourdelivery.store.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DeliveryLocation {

    private String name; // 동명
    private String pastAddress;//구주소(지번)
    private String roadNameAddress;//도로명 주소

}
