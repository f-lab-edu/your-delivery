package com.ch.yourdelivery.user.repository;

import com.ch.yourdelivery.user.domain.model.User;
import org.springframework.stereotype.Repository;

/**
 * com.ch.yourdelivery.user.repository
 * UserRepository
 *
 * @author : ted
 * @date : 2023/07/10
 * @tags :
 */
@Repository
public interface UserRepository {

    String insertUser(User user);

}
