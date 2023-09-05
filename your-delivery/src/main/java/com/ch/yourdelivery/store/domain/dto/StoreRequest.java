package com.ch.yourdelivery.store.domain.dto;

import com.ch.yourdelivery.store.domain.model.DeliveryLocation;
import com.ch.yourdelivery.store.domain.model.OperatingTimeInMonth;
import com.ch.yourdelivery.store.domain.model.StoreLocationXY;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StoreRequest {

    private String name;
    private List<OperatingTimeInMonth> operatingTimeList; //운영시간
    private String phoneNumber;
    private List<DeliveryLocation> deliveryLocation; //배달가능지역
    private String descriptionForNotification; //이벤트나, 공지사항등의 설명란
    private StoreLocationXY storeLocationXY; //가게 위치

}
