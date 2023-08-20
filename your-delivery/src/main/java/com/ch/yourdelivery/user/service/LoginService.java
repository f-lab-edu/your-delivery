package com.ch.yourdelivery.user.service;

import com.ch.yourdelivery.common.response.DeliveryResponse;
import com.ch.yourdelivery.user.domain.dto.UserRequest;
import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.repository.LoginRepository;
import com.ch.yourdelivery.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class LoginService {

    public static final String LOGIN_SUCCESS = "Login Success";
    private final LoginRepository loginRepository;

    public DeliveryResponse sessionLogin(@RequestBody UserRequest userRequest) {

        User user = loginRepository.getUserForLogin(userRequest);
        if (user.getPassword().equals(userRequest.getPassword())) {
            return new DeliveryResponse(LOGIN_SUCCESS, HttpStatus.ACCEPTED);
        } else {
            //develop에 Exception Merge되면 변경
            //BadRequest 예정
            throw new RuntimeException();
        }
    }
}
