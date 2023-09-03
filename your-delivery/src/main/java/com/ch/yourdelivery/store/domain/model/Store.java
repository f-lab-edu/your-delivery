package com.ch.yourdelivery.store.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter @Builder @Entity @Table(name = "stores") @NoArgsConstructor(access = AccessLevel.PROTECTED)
//JPA Entity의 필수 요구사항
@AllArgsConstructor(access = AccessLevel.PRIVATE)//JPA에서 Builder를 사용할때 필수, 하지만 외부 노출 안되도록 private
public class Store {

    @Id @Column(name = "store_id") @GeneratedValue(strategy = GenerationType.IDENTITY) private Long
            id;

    private String name;

    @ElementCollection// Embedded class가 Collection인 경우
    private List<OperatingTimeInMonth> operatingTimeList; //운영시간
    private String phoneNumber;

    @ElementCollection// Embedded class가 Collection인 경우
    private List<DeliveryLocation> deliveryLocation; //배달가능지역
    private String descriptionForNotification; //이벤트나, 공지사항등의 설명란

    @Embedded private StoreLocationXY storeLocationXY; //가게 위치

}
