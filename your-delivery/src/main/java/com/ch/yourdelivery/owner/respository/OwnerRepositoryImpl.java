package com.ch.yourdelivery.owner.respository;

import com.ch.yourdelivery.owner.domain.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

    final ConcurrentHashMap<Long, Owner> ownerTable = new ConcurrentHashMap<>();
    final ConcurrentHashMap<String, Long> ownerUniqueIndex = new ConcurrentHashMap<>();

    AtomicLong id = new AtomicLong(0);

    @Override
    public Owner save(Owner owner) {

        String email = owner.getEmail();
        owner.setId(id.incrementAndGet());
        ownerTable.put(owner.getId(), owner);
        ownerUniqueIndex.put(email, owner.getId());
        return owner;
    }

    @Override
    public Owner findByEmail(String email) {
        //이전에는 new Owner() 를 리턴함
        //지금은 null 리턴함.
        return ownerTable.get(ownerUniqueIndex.get(email));
    }
}
