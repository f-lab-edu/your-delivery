package com.ch.yourdelivery.store.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class OperatingTimeInMonth {

    String dayOfTheWeek; //평일, 주말, 휴일 등 enum으로 Date관련 공통 포맷 만들면서 관리예정
    LocalDateTime startTime;
    LocalDateTime endTime;

}
