package com.ch.yourdelivery.user.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class Login {

    @NonNull
    private final String email;

    @NonNull
    private final String password;

}
