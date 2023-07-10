package com.ch.yourdelivery.user.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/**
 * com.ch.yourdelivery.user.domain.dto
 * UserDto
 *
 * @author : ted
 * @date : 2023/07/10
 * @tags :
 */
@Getter
@Builder
public class UserInDto {

    @NonNull
    private final String id;

    @NonNull
    private final String password;
}
