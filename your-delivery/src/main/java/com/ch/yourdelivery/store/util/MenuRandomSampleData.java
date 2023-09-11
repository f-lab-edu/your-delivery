package com.ch.yourdelivery.store.util;

import com.ch.yourdelivery.store.domain.model.Menu;

public class MenuRandomSampleData {

    private static final String[] CHICKEN_NAMES = {"후라이드치킨", "양념치킨", "반반치킨", "간장치킨", "달콤치킨"};
    private static final String[] TTEOKBOKKI_NAMES = {"마라떡볶이", "로제떡볶이", "치즈떡볶이", "기본떡볶이", "매운떡볶이"};

    private static final int[] SCORES = {1, 2, 3, 4, 5};
    private static final int[] PRICES = {18000, 25000, 17500, 19500, 21500};
    private static final int[] TIPS = {2500, 3000, 3500, 4000, 4500};

    public static Menu generateChickenMenu() {
        int randomIndex = (int) (Math.random() * 5);
        return Menu.builder()
            .name(CHICKEN_NAMES[randomIndex])
            .price(PRICES[randomIndex])
            .reviewScore(SCORES[randomIndex])
            .deliveryTip(TIPS[randomIndex])
            .build();
    }

    public static Menu generateTteokbokkiMenu() {
        int randomIndex = (int) (Math.random() * 5);
        return Menu.builder()
            .name(TTEOKBOKKI_NAMES[randomIndex])
            .price(PRICES[randomIndex])
            .reviewScore(SCORES[randomIndex])
            .deliveryTip(TIPS[randomIndex])
            .build();
    }

}
