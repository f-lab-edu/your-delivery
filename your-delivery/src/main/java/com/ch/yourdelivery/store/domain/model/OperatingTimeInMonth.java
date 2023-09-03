package com.ch.yourdelivery.store.domain.model;

import jakarta.persistence.Embeddable;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

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

