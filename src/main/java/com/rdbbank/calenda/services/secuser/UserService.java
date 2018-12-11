package com.rdbbank.calenda.services.secuser;

import com.rdbbank.calenda.models.secusers.SecUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
public interface UserService {
    SecUser findUserByEmail(String email);

    void saveUser(SecUser secUser);

    List<SecUser> findAllUsers();

    SecUser getUserById(Long id);

    Page<SecUser> findAllPageable(Pageable pageable);

    void deleteUser(Long id);

    void updateUser(SecUser secUser, Long id);

    SecUser findByEmailAndPassword(String email, String password);
}
