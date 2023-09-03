package com.ch.yourdelivery.store.service;

import com.ch.yourdelivery.store.domain.model.Store;
import com.ch.yourdelivery.store.domain.model.StoreLocationXY;
import com.ch.yourdelivery.store.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StoreService {
    private final StoreRepository storeRepository;

    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }

    public List<Store> findAllByOwnerId(String ownerId) {
        return storeRepository.findAllByOwnerId(ownerId);
    }
}
