package com.ch.yourdelivery.store.domain.model;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)//JPA Entity의 필수 요구사항
@AllArgsConstructor(access = AccessLevel.PRIVATE)//JPA에서 Builder를 사용할때 필수, 하지만 외부 노출 안되도록 private
public class OperatingTimeInMonth {

    String dayOfTheWeek; //평일, 주말, 휴일 등 enum으로 Date관련 공통 포맷 만들면서 관리예정
    String startTime;
    String endTime;

}

