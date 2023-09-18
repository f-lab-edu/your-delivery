package com.ch.yourdelivery.external;

import java.util.List;

public interface StoreClient {

    List<Store> findStoresByCategory(String category, int page, int size);
}
