package com.ch.yourdelivery.external.util;

import com.ch.yourdelivery.store.domain.model.Menu;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;


public class MenuRandomSampleData {
    private static final Random random = new Random();

    public static Menu generateRandomMenu() {

        return Menu.builder()
                .id(random.nextLong())
                .name(UUID.randomUUID().toString())
                .price(random.nextInt()%10000)
                .reviewScore(random.nextInt()%5)
                .deliveryTip(random.nextInt()%5000)
                .build();
    }


    public static List<Menu> generateRandomMenus(Integer count) {
        return IntStream.range(0, count)
                .mapToObj(i -> generateRandomMenu())
                .toList();
    }
}
