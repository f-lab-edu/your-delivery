package com.ch.yourdelivery.store.domain.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Builder
public class OperatingTimeInMonth {
    String dayOfTheWeek;
    String startTime;
    String endTime;
}

