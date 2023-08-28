package com.ch.yourdelivery.store.repository;

import com.ch.yourdelivery.store.domain.model.Store;
import com.ch.yourdelivery.store.domain.model.StoreLocation;

import java.util.List;

public interface StoreRepository {

    Store save(Store store);

    List<Store> findAll(StoreLocation storeLocation);
}
