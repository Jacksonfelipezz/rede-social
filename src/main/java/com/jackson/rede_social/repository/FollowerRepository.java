package com.jackson.rede_social.repository;

import com.jackson.rede_social.entity.Follower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository<Follower, Long> {
}
