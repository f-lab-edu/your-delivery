package com.ch.yourdelivery.store.service;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreClient storeClient;

    public List<StoreResponse> findAllStores() {
        return storeClient.findAllStores();
    }

}
