package com.ch.yourdelivery.store.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OperatingTimeInMonth {
    String dayOfTheWeek;
    String startTime;
    String endTime;
}

