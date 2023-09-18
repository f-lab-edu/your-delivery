package com.ch.yourdelivery.store.service;

import com.ch.yourdelivery.external.StoreClient;
import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.domain.model.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreClient storeClient;

    public List<StoreResponse> findStoresByCategory(String category, int page, int size) {
        return storeClient.findStoresByCategory(category, page, size);
    }

    public List<Menu> findMenusByStoreId(String storeId, int page, int size) {
        return storeClient.findMenusByStoreId(storeId, page, size);
    }
}
