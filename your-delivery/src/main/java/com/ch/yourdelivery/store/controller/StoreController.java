package com.ch.yourdelivery.store.controller;

import com.ch.yourdelivery.store.domain.dto.StoreRequest;
import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.domain.model.Store;
import com.ch.yourdelivery.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor public class StoreController {

    private final StoreService storeService;

    //가게정보 단건저장
    @PostMapping("/store") public StoreResponse createStore(
            @RequestBody StoreRequest storeRequest) {

        Store store = Store.builder().name(storeRequest.getName())
                .operatingTimeList(storeRequest.getOperatingTimeList())
                .phoneNumber(storeRequest.getPhoneNumber())
                .deliveryLocation(storeRequest.getDeliveryLocation())
                .descriptionForNotification(storeRequest.getDescriptionForNotification())
                .storeLocationXY(storeRequest.getStoreLocationXY()).build();

        store = storeService.saveStore(store);

        return StoreResponse.builder().id(store.getId()).name(store.getName())
                .operatingTimeList(store.getOperatingTimeList()).phoneNumber(store.getPhoneNumber())
                .deliveryLocation(store.getDeliveryLocation())
                .descriptionForNotification(store.getDescriptionForNotification())
                .storeLocationXY(store.getStoreLocationXY()).build();
    }

}
