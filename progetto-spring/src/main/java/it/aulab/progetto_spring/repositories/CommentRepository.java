package it.aulab.progetto_spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.progetto_spring.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBodyContaining(String body);
}
