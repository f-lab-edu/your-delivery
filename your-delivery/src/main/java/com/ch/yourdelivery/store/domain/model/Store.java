package com.ch.yourdelivery.store.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@Entity
@Table(name = "stores")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//JPA Entity의 필수 요구사항
@AllArgsConstructor(access = AccessLevel.PRIVATE)//JPA에서 Builder를 사용할때 필수, 하지만 외부 노출 안되도록 private
public class Store {

    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long
        id;

    private Long ownerId;

    private String name;

    @ElementCollection(fetch = FetchType.EAGER)// EAGER는 성능에 문제를 일으킬 수 있기 때문에, 추후 다른 해결법을 찾을 예정
    private List<OperatingTimeInMonth> operatingTimeList; //운영시간
    private String phoneNumber;

    @ElementCollection(fetch = FetchType.EAGER)// EAGER는 성능에 문제를 일으킬 수 있기 때문에, 추후 다른 해결법을 찾을 예정
    private List<DeliveryLocation> deliveryLocation; //배달가능지역
    private String descriptionForNotification; //이벤트나, 공지사항등의 설명란

    @Embedded
    private StoreLocationXY storeLocationXY; //가게 위치

}
