package com.ch.yourdelivery.store.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Store {

    private Long id;
    private String name;
    private List<OperatingTimeInMonth> operatingTimeList; //운영시간
    private String phoneNumber;
    private List<String> deliveryLocation; //배달가능지역
    private String descriptionForNotification; //이벤트나, 공지사항등의 설명란
    private StoreLocation storeLocation; //가게 위치

}
