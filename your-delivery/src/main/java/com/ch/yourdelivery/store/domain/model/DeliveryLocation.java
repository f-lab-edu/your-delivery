package com.ch.yourdelivery.store.domain.model;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Embeddable
public class DeliveryLocation {

    private Long id;

    private String name; // 동명
    private String pastAddress;//구주소(지번)
    private String roadNameAddress;//도로명 주소

}
