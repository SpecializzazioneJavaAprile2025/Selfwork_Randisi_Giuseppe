package it.aulab.progetto_spring.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aulab.progetto_spring.dtos.CommentDto;
import it.aulab.progetto_spring.models.Comment;
import it.aulab.progetto_spring.models.Post;
import it.aulab.progetto_spring.repositories.CommentRepository;
import it.aulab.progetto_spring.repositories.PostRepository;

@Service
public class CommentServiceImpl implements CommentService {
    
    @Autowired
    private CommentRepository commentRepository;
    
    @Autowired
    private PostRepository postRepository;
    
    @Override
    public List<CommentDto> readAll() {
        return commentRepository.findAll().stream().map((c) -> {
            CommentDto dto = new CommentDto();
            dto.setId(c.getId());
            dto.setBody(c.getBody());
            dto.setEmail(c.getEmail());
            dto.setPostId(c.getPost().getId());
            dto.setPostTitle(c.getPost().getTitle()); 
            return dto;
        }).collect(Collectors.toList());
    }
    
    
    @Override
    public CommentDto create(CommentDto commentDto) {
        Comment c = new Comment();
        c.setBody(commentDto.getBody());
        
        Post post = postRepository.findById(commentDto.getPostId()).orElseThrow();
        c.setPost(post);
        
        Comment saved = commentRepository.save(c);
        
        CommentDto result = new CommentDto();
        result.setId(saved.getId());
        result.setBody(saved.getBody());
        result.setPostId(saved.getPost().getId());
        
        return result;
    }
}
