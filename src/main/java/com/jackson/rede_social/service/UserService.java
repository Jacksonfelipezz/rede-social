package com.jackson.rede_social.service;

import com.jackson.rede_social.entity.User;
import com.jackson.rede_social.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

}
