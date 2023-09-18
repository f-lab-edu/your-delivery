package com.ch.yourdelivery.store.domain.dto;

import com.ch.yourdelivery.store.domain.model.DeliveryLocation;
import com.ch.yourdelivery.store.domain.model.Menu;
import com.ch.yourdelivery.store.domain.model.OperatingTimeInMonth;
import com.ch.yourdelivery.store.domain.model.Category;
import com.ch.yourdelivery.store.domain.model.StoreLocationXY;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StoreResponse {

    private Long id;
    private String name;
    private String image;

}
