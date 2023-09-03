package com.ch.yourdelivery.store.controller;

import com.ch.yourdelivery.store.domain.dto.StoreRequest;
import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.domain.model.Store;
import com.ch.yourdelivery.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    //가게정보 단건저장
    @PostMapping("/store")
    public StoreResponse createStore(@RequestBody StoreRequest storeRequest) {

        Store store = Store.builder()
                .name(storeRequest.getName())
                .ownerId(storeRequest.getOwnerId())
                .operatingTimeList(storeRequest.getOperatingTimeList())
                .phoneNumber(storeRequest.getPhoneNumber())
                .deliveryLocation(storeRequest.getDeliveryLocation())
                .descriptionForNotification(storeRequest.getDescriptionForNotification())
                .storeLocationXY(storeRequest.getStoreLocationXY())
                .build();

        store = storeService.saveStore(store);

        return StoreResponse.builder()
                .id(store.getId())
                .ownerId(store.getOwnerId())
                .name(store.getName())
                .operatingTimeList(store.getOperatingTimeList())
                .phoneNumber(store.getPhoneNumber())
                .deliveryLocation(store.getDeliveryLocation())
                .descriptionForNotification(store.getDescriptionForNotification())
                .storeLocationXY(store.getStoreLocationXY())
                .build();
    }

    //가게정보 다건조회
    @GetMapping("/stores")
    public List<Store> findStores(@RequestParam("ownerId") String ownerId) {
        return storeService.findAllByOwnerId(ownerId);
    }

}
