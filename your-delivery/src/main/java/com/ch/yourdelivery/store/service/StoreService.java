package com.ch.yourdelivery.store.service;

import com.ch.yourdelivery.store.domain.dto.StoreResponse;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    // StoreResponse list 를 반환해주는 함수 작성예정
    // 다른 Interface 에서 가져온 데이터로 가정(ex. API, Interface)
    public List<StoreResponse> findAllByOwnerId(String ownerId) {
        return Collections.EMPTY_LIST;
    }
}
