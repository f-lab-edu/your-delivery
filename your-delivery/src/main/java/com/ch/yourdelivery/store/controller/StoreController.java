package com.ch.yourdelivery.store.controller;

import com.ch.yourdelivery.store.domain.dto.StoreLocationRequest;
import com.ch.yourdelivery.store.domain.dto.StoreRequest;
import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.domain.model.Store;
import com.ch.yourdelivery.store.domain.model.StoreLocation;
import com.ch.yourdelivery.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

import java.lang.reflect.Parameter;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    //가게정보 단건저장
    @PostMapping("/store")
    public StoreResponse createStore(@RequestBody StoreRequest storeRequest){

        //객체변환 작업은 추후, 일괄 변경 예정
        Store store = Store.builder()
        .name(storeRequest.getName())
        .operatingTimeList(storeRequest.getOperatingTimeList())
        .phoneNumber(storeRequest.getPhoneNumber())
        .deliveryLocation(storeRequest.getDeliveryLocation())
        .descriptionForNotification(storeRequest.getDescriptionForNotification())
        .storeLocation(storeRequest.getStoreLocation())
        .build();

        store = storeService.saveStore(store);

        return StoreResponse.builder()
                .id(store.getId())
                .name(store.getName())
                .operatingTimeList(store.getOperatingTimeList())
                .phoneNumber(store.getPhoneNumber())
                .deliveryLocation(store.getDeliveryLocation())
                .descriptionForNotification(store.getDescriptionForNotification())
                .storeLocation(store.getStoreLocation())
                .build();
    }

    //가게정보 다건조회
    @GetMapping("/stores")
    public List<Store> searchStores(StoreLocationRequest storeLocationRequest,
                                    @RequestParam("category")String category,
                                    @RequestParam("search")String search){

        //객체변환 작업은 추후, 일괄 변경 예정
        StoreLocation storeLocation = StoreLocation.builder()
        .pastAddress(storeLocationRequest.getPastAddress())
        .roadNameAddress(storeLocationRequest.getRoadNameAddress())
        .build();

        return storeService.findAllStores(storeLocation);
    }

}
