package com.ch.yourdelivery.external;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import com.ch.yourdelivery.store.domain.model.Menu;
import java.util.List;

public interface StoreClient {

    List<StoreResponse> findStoresByCategory(String category, int page, int size);

    List<Menu> findMenusByStoreId(String storeId, int page, int size);
}
