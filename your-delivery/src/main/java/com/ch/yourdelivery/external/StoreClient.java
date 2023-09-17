package com.ch.yourdelivery.external;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import java.util.List;

public interface StoreClient {

    List<StoreResponse> findStoresByCategory(String category, int page, int size);
}
