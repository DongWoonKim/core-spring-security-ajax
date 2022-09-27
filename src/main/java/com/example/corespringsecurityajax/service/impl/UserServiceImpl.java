package com.example.corespringsecurityajax.service.impl;

import com.example.corespringsecurityajax.domain.Account;
import com.example.corespringsecurityajax.repository.UserRepository;
import com.example.corespringsecurityajax.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(Account account) {
        userRepository.save( account );
    }
}
