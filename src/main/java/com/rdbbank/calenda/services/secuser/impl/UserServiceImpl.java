package com.rdbbank.calenda.services.secuser.impl;

import com.rdbbank.calenda.models.secusers.SecRole;
import com.rdbbank.calenda.models.secusers.SecUser;
import com.rdbbank.calenda.repositories.secuser.RoleRepository;
import com.rdbbank.calenda.repositories.secuser.UserRepository;
import com.rdbbank.calenda.services.secuser.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public SecUser findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(SecUser secUser) {
        secUser.setPassword(bCryptPasswordEncoder.encode(secUser.getPassword()));
        secUser.setActive(1);
        SecRole userRole = roleRepository.findByName("ADMIN");
        secUser.setRoles(new HashSet<SecRole>(Arrays.asList(userRole)));
        userRepository.save(secUser);
    }

    @Override
    public List<SecUser> findAllUsers() {
        return (List<SecUser>) userRepository.findAll();
    }

    @Override
    public SecUser getUserById(Long id) {
        return (SecUser) userRepository.findOne(id);
    }

    @Override
    public Page<SecUser> findAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void updateUser(SecUser secUser, Long id) {
        secUser.setId(id);
        userRepository.save(secUser);
    }

    @Override
    @Transactional
    public SecUser findByEmailAndPassword(String email, String password) {
        SecUser secUser = null;
        if ((!email.isEmpty() && email != null) && (!password.isEmpty() && password != null)) {
            secUser = userRepository.findByEmailAndPassword(email,password);
            return secUser;
        }
        return null;
    }
}
