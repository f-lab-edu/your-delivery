package com.ch.yourdelivery.user.domain.model;

import lombok.Builder;
import lombok.Getter;

/**
 * com.ch.yourdelivery.user.domain
 * User
 *
 * @author : ted
 * @date : 2023/07/10
 * @tags :
 */
@Builder
@Getter
public class User {

    private final String userNnumber;
    private final String id;
    private final String password;

}
