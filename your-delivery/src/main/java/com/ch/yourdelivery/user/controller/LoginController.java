package com.ch.yourdelivery.user.controller;

import com.ch.yourdelivery.common.response.DeliveryResponse;
import com.ch.yourdelivery.user.domain.dto.LoginRequest;
import com.ch.yourdelivery.user.domain.dto.UserRequest;
import com.ch.yourdelivery.user.domain.dto.UserResponse;
import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.service.LoginService;
import com.ch.yourdelivery.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public DeliveryResponse sessionLogin(@RequestBody LoginRequest loginRequest) {
        UserRequest userRequest = UserRequest.builder()
                .email(loginRequest.getEmail())
                .password(loginRequest.getPassword())
                .build();

        return loginService.sessionLogin(userRequest);
    }

}
