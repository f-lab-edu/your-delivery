package com.ch.yourdelivery.user.repository;

import com.ch.yourdelivery.user.domain.dto.UserRequest;
import com.ch.yourdelivery.user.domain.model.User;

public interface LoginRepository {

    User getUserForLogin(String email, String password);

}
