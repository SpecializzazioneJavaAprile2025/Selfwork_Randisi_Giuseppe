package it.aulab.progetto_spring.services;

import java.util.List;

import it.aulab.progetto_spring.dtos.CommentDto;

public interface CommentService {
    List<CommentDto> readAll();
    CommentDto create(CommentDto commentDto);
}
