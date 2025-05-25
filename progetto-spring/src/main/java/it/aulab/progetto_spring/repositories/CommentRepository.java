package it.aulab.progetto_spring.repositories;

import org.springframework.data.repository.CrudRepository;

import it.aulab.progetto_spring.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

    
}