package it.aulab.progetto_spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import it.aulab.progetto_spring.models.Comment;

public interface CommentRepository extends ListCrudRepository<Comment, Long>{

    
}