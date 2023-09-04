package com.ch.yourdelivery.store.repository;

import com.ch.yourdelivery.store.domain.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository public interface StoreRepository extends JpaRepository<Store, Long> {
    Store save(Store store);

    @Query("SELECT store " + "FROM Store store " + "WHERE store.ownerId =:ownerId")
    List<Store> findAllByOwnerId(@Param("ownerId") String ownerId);
}
