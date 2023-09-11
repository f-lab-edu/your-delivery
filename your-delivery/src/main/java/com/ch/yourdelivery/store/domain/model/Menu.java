package com.ch.yourdelivery.store.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Menu {

    private String name; // 메뉴 이름
    private int price; // 가격
    private String imagePath; // 이미지 경로
    private int reviewScore; // 리뷰 점수
    private int deliveryTip;//배달 팁

}