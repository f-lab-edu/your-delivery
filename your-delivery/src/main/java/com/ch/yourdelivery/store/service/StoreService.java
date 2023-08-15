package com.ch.yourdelivery.store.service;

import com.ch.yourdelivery.store.domain.model.Store;
import com.ch.yourdelivery.store.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StoreService {
    private final StoreRepository storeRepository;
    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }
}