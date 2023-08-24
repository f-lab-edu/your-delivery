package com.ch.yourdelivery.user.service;

import com.ch.yourdelivery.user.domain.dto.LoginRequest;
import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class LoginService {

    public static final String LOGIN_SUCCESS = "Login Success";
    private final LoginRepository loginRepository;

    public User sessionLogin(@RequestBody LoginRequest loginRequest) {

        User user = loginRepository.getUserForLogin(loginRequest.getEmail(), loginRequest.getPassword());
        if (user == null) {
            //develop에 Exception Merge되면 변경
            //BadRequest 예정
            throw new RuntimeException();
        } else {
            return user;
        }
    }
}
