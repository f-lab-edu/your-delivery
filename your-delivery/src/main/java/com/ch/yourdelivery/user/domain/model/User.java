package com.ch.yourdelivery.user.domain.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class User {

    private Long id;
    private String email;
    private String password;

}
