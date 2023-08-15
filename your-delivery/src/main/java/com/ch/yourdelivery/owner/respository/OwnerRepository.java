package com.ch.yourdelivery.owner.respository;

import com.ch.yourdelivery.owner.domain.model.Owner;

public interface OwnerRepository {

    Owner save(Owner owner);

    Owner findByEmail(String email);

}
