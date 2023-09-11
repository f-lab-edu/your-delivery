package com.ch.yourdelivery.store.controller;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.service.StoreService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    //가게정보 단건저장
    @PostMapping("/store")
    public StoreResponse createStore(
        @RequestBody StoreRequest storeRequest) {

        Store store =
            Store.builder().name(storeRequest.getName()).ownerId(storeRequest.getOwnerId())
                .operatingTimeList(storeRequest.getOperatingTimeList())
                .phoneNumber(storeRequest.getPhoneNumber())
                .deliveryLocation(storeRequest.getDeliveryLocation())
                .descriptionForNotification(storeRequest.getDescriptionForNotification())
                .storeLocationXY(storeRequest.getStoreLocationXY()).build();

        store = storeService.saveStore(store);

        return StoreResponse.builder().id(store.getId()).ownerId(store.getOwnerId())
            .name(store.getName()).operatingTimeList(store.getOperatingTimeList())
            .phoneNumber(store.getPhoneNumber()).deliveryLocation(store.getDeliveryLocation())
            .descriptionForNotification(store.getDescriptionForNotification())
            .storeLocationXY(store.getStoreLocationXY()).build();
    }

    //가게정보 다건조회
    @GetMapping("/stores")
    public List<StoreResponse> findStores() {
        return storeService.findAllStores();
    }

}
