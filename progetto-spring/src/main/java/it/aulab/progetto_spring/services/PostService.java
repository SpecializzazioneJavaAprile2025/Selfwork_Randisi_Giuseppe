package it.aulab.progetto_spring.services;

import java.util.List;

import it.aulab.progetto_spring.dtos.PostDto;

public interface PostService {
    List<PostDto> readAll();
    PostDto create(PostDto postDto);
}
