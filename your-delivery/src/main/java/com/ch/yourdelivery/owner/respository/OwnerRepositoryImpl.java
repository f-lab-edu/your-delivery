package com.ch.yourdelivery.owner.respository;

import com.ch.yourdelivery.owner.domain.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

    final HashMap<Long, Owner> ownerTable = new HashMap<>();
    final HashMap<String, Long> ownerUniqueIndex = new HashMap<>();
    long size = 0;

    @Override
    public Owner save(Owner owner) {

        String email = owner.getEmail();
        owner.setId((Long.valueOf(++size)));
        ownerTable.put(owner.getId(), owner);
        ownerUniqueIndex.put(email, owner.getId());
        return owner;
    }

    @Override
    public Owner findByEmail(String email) {
        return ownerTable.get(ownerUniqueIndex.get(email));
    }
}
