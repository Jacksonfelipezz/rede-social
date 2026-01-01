package com.jackson.rede_social.repository;

import com.jackson.rede_social.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
