package com.jackson.rede_social.service;

import com.jackson.rede_social.entity.User;
import com.jackson.rede_social.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findALl(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    public void delete(Long id){
        User user = new User();
        user.setId(id);
        userRepository.delete(user);
    }

     public User update(Long id, User user){
        User userFound = findById(id);
        if (userFound != null){
            return userRepository.save(user);
        }else {
            return user;
        }
     }

    public User save(User user){
        return userRepository.save(user);
    }

}
