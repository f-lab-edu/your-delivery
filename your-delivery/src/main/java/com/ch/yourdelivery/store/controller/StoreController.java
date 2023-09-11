package com.ch.yourdelivery.store.controller;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.service.StoreService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    //가게정보 다건조회
    @GetMapping("/stores")
    public List<StoreResponse> findStores(@RequestParam String category, Pageable pageable) {
        return storeService.findAllStores();
    }

}
