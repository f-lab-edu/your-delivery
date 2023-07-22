package com.ch.yourdelivery.user.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {

    private Long id;
    private String email;
    private String password;

}
