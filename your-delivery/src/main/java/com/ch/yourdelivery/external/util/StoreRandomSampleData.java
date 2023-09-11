package com.ch.yourdelivery.external.util;

import com.ch.yourdelivery.store.domain.model.DeliveryLocation;
import com.ch.yourdelivery.store.domain.model.OperatingTimeInMonth;
import com.ch.yourdelivery.store.domain.model.StoreLocationXY;

public class StoreRandomSampleData {

    //Sample Data
    private static final String DESCRIPTION = "리뷰 이벤트 중입니다. 캔 음료 1캔 증정";
    private static final String NUMBER_010 = "010";
    private static final String WEEKS_DAYS = "Weekdays";
    private static final String STORE_POST_FIX = "호점";
    private static final String[] START_TIMES = {"08:00:00", "09:00:00", "10:00:00"};
    private static final String[] END_TIMES = {"21:00:00", "22:00:00", "23:00:00"};
    private static final String[] DONG_NAMES = {" 대치동", " 논현동", " 개포동", " 도곡동", " 삼성동"};
    private static final String[] GIL_NAMES = {" 선릉로", " 역삼로", " 교대로", " 서초로", " 테헤란로"};
    private static final String[] STORE_NAMES = {"치킨은요리다", "바베큐치킨", "라면떡볶이", "맛있는떡볶이", "김밥라라"};
    private static final String PAST_ADDRESS_PREFIX = "서울특별시 강남구";

    public static StoreLocationXY generateStoreLocationXY() {
        return StoreLocationXY.builder()
            .mapX(Double.toString(Math.random()))
            .mapY(Double.toString(Math.random()))
            .build();
    }

    public static String generateDescription() {
        return DESCRIPTION;
    }

    public static String generatePhoneNumber() {
        return NUMBER_010 + (int) ((Math.random() * 10000) + 1) + (int) ((Math.random() * 10000)
            + 1);
    }

    public static Long generateOwnerIndex() {
        return (long) (Math.random() * 100) + 1L;
    }

    public static String generateStoreName() {
        return STORE_NAMES[(int) (Math.random() * 5)] + generateRandomId() + STORE_POST_FIX;
    }

    public static long generateRandomId() {
        return (long) (Math.random() * 100) + 1L;
    }

    public static OperatingTimeInMonth generateOperatingTimeInMonth() {
        return OperatingTimeInMonth.builder()
            .dayOfTheWeek(WEEKS_DAYS)
            .startTime(START_TIMES[(int) (Math.random() * 3)])//HH:mm:ss
            .endTime(END_TIMES[(int) (Math.random() * 3)])
            .build();
    }


    public static DeliveryLocation generateDeliveryLocation() {
        String dongName = DONG_NAMES[(int) (Math.random() * 5)];
        return DeliveryLocation.builder()
            .name(DONG_NAMES[(int) (Math.random() * 5)])
            .pastAddress(
                PAST_ADDRESS_PREFIX
                    + dongName
                    + (int) (Math.random() * 100))
            .roadNameAddress(
                PAST_ADDRESS_PREFIX
                    + dongName
                    + GIL_NAMES[(int) (Math.random() * 5)]
            )
            .build();
    }
}

