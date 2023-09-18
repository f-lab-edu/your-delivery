package com.ch.yourdelivery.external;

import com.ch.yourdelivery.external.util.MenuRandomSampleData;
import com.ch.yourdelivery.external.util.StoreRandomSampleData;
import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.domain.model.Menu;
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
        for (int i = 0; i < random.nextInt(100, 1000); i++) {
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
    public List<StoreResponse> findStoresByCategory(String category, int page, int size) {
        int start = size * (page - 1);
        int end = size * page;

        List storesByCategories = list.stream().filter(
                storeResponse ->
                    storeResponse.getCategory().getName().equals(category))
            .collect(Collectors.toList());

        //end의 사이즈가 끝을 지나는 경우는 마지막 페이지를 리턴(Validation 역할도 함)
        if (storesByCategories.size() < end) {
            start = (storesByCategories.size() / size) * size;
            end = start + storesByCategories.size() % size;
            return storesByCategories.subList(start, end);
        } else {
            return storesByCategories.subList(start, end);
        }
    }

    @Override
    public List<Menu> findMenusByStoreId(String storeId, int page, int size) {
        return null;
    }

}
