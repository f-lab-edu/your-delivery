package com.ch.yourdelivery.external;

import java.util.List;

public interface StoreClient {

    List<StoreForCategoryDto> findStoresByCategory(String category, int page, int size);
}
