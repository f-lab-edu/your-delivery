package com.ch.yourdelivery.owner.service;

import com.ch.yourdelivery.owner.domain.model.Owner;
import com.ch.yourdelivery.owner.respository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public Owner emailSignUp(Owner owner) {
//aaa
        //save... A  table
        //save... B table
        //update ...
        if (ownerRepository.findByEmail(owner.getEmail()).getEmail() == null) {
            return ownerRepository.save(owner);
        } else {
            throw new RuntimeException();
        }
    }
}
