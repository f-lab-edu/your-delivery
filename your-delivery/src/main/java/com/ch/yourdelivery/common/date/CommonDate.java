package com.ch.yourdelivery.common.date;

import java.time.LocalDate;

// 공통 Date 관련 포맷
// 날짜 관련하여, 기능 확장을 위해 객체를 만듦
public class CommonDate {
    LocalDate localDate;

    public CommonDate(String date) {
        this.localDate = LocalDate.parse(date);
    }

    public CommonDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
