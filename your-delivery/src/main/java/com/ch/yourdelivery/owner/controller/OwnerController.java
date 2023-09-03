package com.ch.yourdelivery.owner.controller;

import com.ch.yourdelivery.owner.domain.dto.OwnerRequest;
import com.ch.yourdelivery.owner.domain.dto.OwnerResponse;
import com.ch.yourdelivery.owner.domain.model.Owner;
import com.ch.yourdelivery.owner.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/owners") @RequiredArgsConstructor public class OwnerController {

    private final OwnerService ownerService;

    @PostMapping public ResponseEntity signUp(@RequestBody OwnerRequest ownerRequest) {

        Owner owner = new Owner();
        owner.setEmail(ownerRequest.getEmail());
        owner.setPassword(ownerRequest.getPassword());

        Owner savedOwner = ownerService.emailSignUp(owner);

        return new ResponseEntity<>(
                OwnerResponse.builder().id(savedOwner.getId()).email(savedOwner.getEmail()).build(),
                HttpStatus.CREATED);
    }
}
