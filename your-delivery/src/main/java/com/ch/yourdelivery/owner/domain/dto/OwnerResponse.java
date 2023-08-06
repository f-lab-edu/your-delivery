package com.ch.yourdelivery.owner.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class OwnerResponse {

    private final Long id;

    @NonNull
    private final String email;
}