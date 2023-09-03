package com.ch.yourdelivery.user.repository;

import com.ch.yourdelivery.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

    User findByEmail(String email);
}
