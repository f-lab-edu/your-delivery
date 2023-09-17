package com.ch.yourdelivery.external.util;

import com.ch.yourdelivery.store.domain.model.DeliveryLocation;

import com.ch.yourdelivery.store.domain.model.OperatingTimeInMonth;
import com.ch.yourdelivery.store.domain.model.StoreLocationXY;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

public class StoreRandomSampleData {

    private static final Random random = new Random();

    public static StoreLocationXY generateStoreLocationXY() {
        return StoreLocationXY.builder()
            .mapX(Double.toString(random.nextDouble()))
            .mapY(Double.toString(random.nextDouble()))
            .build();
    }

    private static OperatingTimeInMonth generateOperatingTimeInMonth(){
        return OperatingTimeInMonth.builder()
            .dayOfTheWeek(UUID.randomUUID().toString())
            .startTime(Integer.toString(random.nextInt(8, 11)))
            .endTime(Integer.toString(random.nextInt(19, 23)))
            .build();
    }
    public static List<OperatingTimeInMonth>  generateOperatingTimeInMonthList(int count) {
        return IntStream.range(0, count)
            .mapToObj(i -> generateOperatingTimeInMonth())
            .toList();
    }

    public static DeliveryLocation generateDeliveryLocation() {
        return DeliveryLocation.builder()
            .name(UUID.randomUUID().toString())
            .pastAddress(UUID.randomUUID().toString())
            .roadNameAddress(UUID.randomUUID().toString())
            .build();
    }

    public static List<DeliveryLocation> generateDeliveryLocationList(int count) {
        return IntStream.range(0, count)
            .mapToObj(i -> generateDeliveryLocation())
            .toList();
    }
}

