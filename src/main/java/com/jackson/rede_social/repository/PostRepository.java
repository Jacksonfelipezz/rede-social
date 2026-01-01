package com.jackson.rede_social.repository;

import com.jackson.rede_social.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
