package com.ch.yourdelivery.store.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StoreLocationXY {

    private String mapX;//지도 X축
    private String mapY;//지도 y축

}
