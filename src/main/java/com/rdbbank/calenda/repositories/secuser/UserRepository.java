package com.rdbbank.calenda.repositories.secuser;

import com.rdbbank.calenda.models.secusers.SecUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Repository("userRepository")
public interface UserRepository extends PagingAndSortingRepository<SecUser, Long> {
    SecUser findByEmail(String email);

    SecUser findByEmailAndPassword(String email, String password);
}
