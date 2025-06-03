package it.aulab.progetto_spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.progetto_spring.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTitleContaining(String title);
}
