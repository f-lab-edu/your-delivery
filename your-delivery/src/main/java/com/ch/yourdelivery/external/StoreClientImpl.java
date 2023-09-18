package com.ch.yourdelivery.external;

import com.ch.yourdelivery.external.util.StoreRandomSampleData;
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
    private static final List<Store> list = new ArrayList<>();

    @PostConstruct
    public void init() {
        for (int i = 0; i < random.nextInt(100, 1000); i++) {
            Store store = Store.builder()
                    .id(random.nextLong())
                    .name(UUID.randomUUID().toString())
                    .phoneNumber(UUID.randomUUID().toString())
                    .category(StoreRandomSampleData.generateCategory())
                    .build();

            list.add(store);
        }
    }

    @Override
    public List<Store> findStoresByCategory(String category, int page, int size) {
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

}
