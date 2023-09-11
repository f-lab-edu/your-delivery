package com.ch.yourdelivery.external;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.domain.model.DeliveryLocation;
import com.ch.yourdelivery.store.domain.model.Menu;
import com.ch.yourdelivery.store.domain.model.OperatingTimeInMonth;
import com.ch.yourdelivery.store.service.StoreClient;
import com.ch.yourdelivery.external.util.StoreRandomSampleData;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreClientImpl implements StoreClient {

    public static final String CHICKEN = "치킨";

    private List<StoreResponse> storeResponseList = new ArrayList<>();
    private List<OperatingTimeInMonth> operatingTimeInMonthList = new ArrayList<>();
    private  List<DeliveryLocation> deliveryLocationList = new ArrayList<>();

    @PostConstruct
    public void init(){
        operatingTimeInMonthList.add(StoreRandomSampleData.generateOperatingTimeInMonth());
        operatingTimeInMonthList.add(StoreRandomSampleData.generateOperatingTimeInMonth());

        deliveryLocationList.add(StoreRandomSampleData.generateDeliveryLocation());
        deliveryLocationList.add(StoreRandomSampleData.generateDeliveryLocation());

        for (int i = 0; i < Math.random() * 10; i++) {
            String storeName = StoreRandomSampleData.generateStoreName();

            StoreResponse storeResponse = StoreResponse.builder()
                    .id(StoreRandomSampleData.generateRandomId())
                    .ownerId(StoreRandomSampleData.generateOwnerIndex())
                    .name(storeName)
                    .operatingTimeList(operatingTimeInMonthList)
                    .phoneNumber(StoreRandomSampleData.generatePhoneNumber())
                    .deliveryLocation(deliveryLocationList)
                    .descriptionForNotification(StoreRandomSampleData.generateDescription())
                    .storeLocationXY(StoreRandomSampleData.generateStoreLocationXY())
                    .menus(MenuRandomSampleData.generateRandomMenus(5))
                    .build();

            storeResponseList.add(storeResponse);
        }
    }

    @Override
    public List<StoreResponse> findAllStores() {
        //size 5
        //page 3
        // 11 = size * (page-1) + 1
        // 15 = size * page
        //validation 해야함...
        //return storeResponseList.subList(size * (page-1) + 1,  size * page);
        return storeResponseList;
    }


}
