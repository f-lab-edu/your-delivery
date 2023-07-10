package com.ch.yourdelivery.user.controller;

import com.ch.yourdelivery.user.domain.dto.UserInDto;
import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.ch.yourdelivery.user.controller
 * UserController
 *
 * @author : ted
 * @date : 2023/07/10
 * @tags :
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public String postUser(@RequestBody UserInDto userInDto) {

        User user = User.builder()
                .id(userInDto.getId())
                .password(userInDto.getPassword())
                .build();

        return userService.saveUser(user);
    }
}
