package com.ch.yourdelivery.user.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter @Builder public class LoginRequest {
    @NonNull private final String email;

    @NonNull private final String password;

}
