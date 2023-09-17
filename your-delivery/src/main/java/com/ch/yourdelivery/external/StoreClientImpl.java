package com.ch.yourdelivery.external;

import com.ch.yourdelivery.external.util.MenuRandomSampleData;
import com.ch.yourdelivery.external.util.StoreRandomSampleData;
import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class StoreClientImpl implements StoreClient {


    private static final Random random = new Random();
    private static final List<StoreResponse> list = new ArrayList<>();

    @PostConstruct
    public void init() {
        for (int i = 0; i < random.nextInt(10); i++) {
            StoreResponse storeResponse = StoreResponse.builder()
                .id(random.nextLong())
                .ownerId(random.nextLong())
                .name(UUID.randomUUID().toString())
                .operatingTimeList(StoreRandomSampleData.generateOperatingTimeInMonthList(3))
                .phoneNumber(UUID.randomUUID().toString())
                .deliveryLocation(StoreRandomSampleData.generateDeliveryLocationList(3))
                .descriptionForNotification(UUID.randomUUID().toString())
                .storeLocationXY(StoreRandomSampleData.generateStoreLocationXY())
                .menus(MenuRandomSampleData.generateRandomMenus(5))
                .category(StoreRandomSampleData.generateCategory())
                .build();

            list.add(storeResponse);
        }
    }

    @Override
    public List<StoreResponse> findStoresByCategory(String category) {
        //size 5
        //page 3
        // 11 = size * (page-1) + 1
        // 15 = size * page
        //validation 해야함...
        //return storeResponseList.subList(size * (page-1) + 1,  size * page);
        return list.stream().filter(
                storeResponse ->
                    storeResponse.getCategory().getName().equals(category))
            .collect(Collectors.toList());
    }

}
