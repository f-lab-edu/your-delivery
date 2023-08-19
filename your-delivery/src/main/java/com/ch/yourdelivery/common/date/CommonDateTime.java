package com.ch.yourdelivery.common.date;

import java.time.LocalDateTime;

// 공통 Date 관련 포맷
// 날짜/시간 관련하여, 기능 확장을 위해 객체를 만듦
public class CommonDateTime {

    LocalDateTime localDateTime;

    public CommonDateTime(String dateTime) {
        this.localDateTime = LocalDateTime.parse(dateTime);
    }

    public CommonDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

}
