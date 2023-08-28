package com.ch.yourdelivery.store.repository;

import com.ch.yourdelivery.store.domain.model.Store;
import com.ch.yourdelivery.store.domain.model.StoreLocation;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class StoreRepositoryImpl implements StoreRepository {

    final HashMap<Long, Store> storeTable = new HashMap<Long, Store>();
    static long size = 0;

    @Override
    public Store save(Store store) {

        store.setId((Long.valueOf(++size)));
        storeTable.put(store.getId(), store);
        return store;
    }

    @Override
    public List<Store> findAll(StoreLocation storeLocation) {
        return null;
    }

}
