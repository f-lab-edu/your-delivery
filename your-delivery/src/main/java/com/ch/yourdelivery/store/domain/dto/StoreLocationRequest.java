package com.ch.yourdelivery.store.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StoreLocationRequest {

    private String pastAddress;//지번
    private String roadNameAddress;//도로명 주소
}
