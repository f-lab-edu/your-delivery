package com.ch.yourdelivery.user.repository;

import com.ch.yourdelivery.user.domain.model.User;

import java.util.HashMap;

public interface UserRepository {

    User save(User user);

    User findByEmail(String email);

    User getUserForLogin(String email, String password);
}
