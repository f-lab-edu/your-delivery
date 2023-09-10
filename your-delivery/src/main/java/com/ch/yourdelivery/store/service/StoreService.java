package com.ch.yourdelivery.store.service;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.domain.model.DeliveryLocation;
import com.ch.yourdelivery.store.domain.model.OperatingTimeInMonth;
import com.ch.yourdelivery.store.util.StoreRandomSampleData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    // StoreResponse list 를 반환해주는 함수 작성예정
    // 다른 Interface 에서 가져온 데이터로 가정(ex. API, Interface)
    public List<StoreResponse> findAllStores() {

        List<StoreResponse> storeResponseList = new ArrayList<>();
        List<OperatingTimeInMonth> operatingTimeInMonthList = new ArrayList<>();
        List<DeliveryLocation> deliveryLocationList = new ArrayList<>();

        operatingTimeInMonthList.add(StoreRandomSampleData.generateOperatingTimeInMonth());
        operatingTimeInMonthList.add(StoreRandomSampleData.generateOperatingTimeInMonth());

        deliveryLocationList.add(StoreRandomSampleData.generateDeliveryLocation());
        deliveryLocationList.add(StoreRandomSampleData.generateDeliveryLocation());

        for (int i = 0; i < Math.random() * 10; i++) {

            StoreResponse storeResponse = StoreResponse.builder()
                .id(StoreRandomSampleData.generateRandomId())
                .ownerId(StoreRandomSampleData.generateOwnerIndex())
                .name(StoreRandomSampleData.generateStoreName())
                .operatingTimeList(operatingTimeInMonthList)
                .phoneNumber(StoreRandomSampleData.generatePhoneNumber())
                .deliveryLocation(deliveryLocationList)
                .descriptionForNotification(StoreRandomSampleData.generateDescription())
                .storeLocationXY(StoreRandomSampleData.generateStoreLocationXY())
                .build();

            storeResponseList.add(storeResponse);
        }

        return storeResponseList;
    }

}
