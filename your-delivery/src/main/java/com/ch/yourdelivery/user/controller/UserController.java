package com.ch.yourdelivery.user.controller;

import com.ch.yourdelivery.user.domain.dto.UserRequest;
import com.ch.yourdelivery.user.domain.dto.UserResponse;
import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse signUp(@RequestBody UserRequest userRequest) {

        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());

        User savedUser = userService.saveUser(user);
        return UserResponse.builder()
                .id(savedUser.getId())
                .email(savedUser.getEmail())
                .build();
    }
}
