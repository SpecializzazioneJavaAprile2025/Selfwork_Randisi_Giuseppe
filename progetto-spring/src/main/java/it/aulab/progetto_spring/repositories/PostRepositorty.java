package it.aulab.progetto_spring.repositories;

import org.springframework.data.repository.CrudRepository;

import it.aulab.progetto_spring.models.Post;

public interface PostRepositorty extends CrudRepository<Post, Long>{
    
}
