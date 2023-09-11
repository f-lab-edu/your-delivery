package com.ch.yourdelivery.store.service;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;

import java.util.List;

public interface StoreClient {
    List<StoreResponse> findAllStores();
}
