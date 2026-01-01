package com.jackson.rede_social.repository;

import com.jackson.rede_social.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
