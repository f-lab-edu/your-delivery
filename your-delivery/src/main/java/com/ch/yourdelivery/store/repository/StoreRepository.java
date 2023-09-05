package com.ch.yourdelivery.store.repository;

import com.ch.yourdelivery.store.domain.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    Store save(Store store);
}
