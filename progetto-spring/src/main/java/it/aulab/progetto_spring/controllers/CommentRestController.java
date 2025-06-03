package it.aulab.progetto_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.progetto_spring.dtos.CommentDto;
import it.aulab.progetto_spring.services.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentRestController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<CommentDto> getAll() {
        return commentService.readAll();
    }

    @PostMapping
    public CommentDto create(@RequestBody CommentDto dto) {
        return commentService.create(dto);
    }
}
