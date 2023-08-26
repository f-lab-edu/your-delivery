package com.ch.yourdelivery.user.controller;

import com.ch.yourdelivery.common.response.DeliveryResponse;
import com.ch.yourdelivery.user.domain.dto.LoginRequest;
import com.ch.yourdelivery.user.domain.dto.UserResponse;
import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.service.LoginService;
import lombok.RequiredArgsConstructor;
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
    public DeliveryResponse<UserResponse> sessionLogin(@RequestBody LoginRequest loginRequest) {

        User user = loginService.sessionLogin(loginRequest);
        return DeliveryResponse.of(UserResponse.builder().id(user.getId()).email(user.getEmail()).build());
    }

}
