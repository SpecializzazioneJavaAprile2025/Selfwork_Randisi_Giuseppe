package it.aulab.progetto_spring.repositories;

import org.springframework.data.repository.ListCrudRepository;

import it.aulab.progetto_spring.models.Post;

public interface PostRepositorty extends ListCrudRepository<Post, Long>{
    
    
}
