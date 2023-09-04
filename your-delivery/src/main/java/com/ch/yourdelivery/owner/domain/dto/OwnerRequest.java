package com.ch.yourdelivery.owner.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class OwnerRequest {

    @NonNull
    private final String email;

    @NonNull
    private final String password;
}
