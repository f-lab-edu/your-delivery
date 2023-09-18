package com.ch.yourdelivery.store.service;

import com.ch.yourdelivery.external.StoreForCategoryDto;
import com.ch.yourdelivery.external.StoreClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreClient storeClient;

    public List<StoreForCategoryDto> findStoresByCategory(String category, int page, int size) {
        return storeClient.findStoresByCategory(category, page, size);
    }

}
