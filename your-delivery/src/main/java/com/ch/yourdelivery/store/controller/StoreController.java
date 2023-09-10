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

    //유저 입장에서 모든 가게정보를 다건으로 조회한다.
    @GetMapping("/stores")
    public List<StoreResponse> findStores() {
        return storeService.findAllStores();
    }

}
