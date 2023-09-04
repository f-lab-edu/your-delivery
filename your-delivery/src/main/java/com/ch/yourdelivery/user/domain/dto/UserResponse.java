package com.ch.yourdelivery.user.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class UserResponse {

    private final Long id;

    @NonNull
    private final String email;
}
