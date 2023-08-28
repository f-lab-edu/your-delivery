package com.ch.yourdelivery.store.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class StoreLocation {

    private String mapX;//지도 X축
    private String mapY;//지도 y축

    private String pastAddress;//지번
    private String roadNameAddress;//도로명 주소

}
