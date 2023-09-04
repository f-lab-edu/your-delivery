package com.ch.yourdelivery.store.domain.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Builder
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)//JPA Entity의 필수 요구사항
@AllArgsConstructor(access = AccessLevel.PRIVATE)//JPA에서 Builder를 사용할때 필수, 하지만 외부 노출 안되도록 private
public class StoreLocationXY {

    private String mapX;//지도 X축
    private String mapY;//지도 y축

}
