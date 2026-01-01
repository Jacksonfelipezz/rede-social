package com.jackson.rede_social.repository;

import com.jackson.rede_social.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
