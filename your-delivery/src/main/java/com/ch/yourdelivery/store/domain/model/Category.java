package com.ch.yourdelivery.store.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Category {

    private long id; // 카테고리 id
    private String name; // 카테고리 이름

}
