package it.aulab.progetto_spring.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aulab.progetto_spring.dtos.PostDto;
import it.aulab.progetto_spring.models.Author;
import it.aulab.progetto_spring.models.Post;
import it.aulab.progetto_spring.repositories.AuthorRepository;
import it.aulab.progetto_spring.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<PostDto> readAll() {
        return postRepository.findAll().stream().map((p) -> {
            PostDto dto = new PostDto();
            dto.setId(p.getId());
            dto.setTitle(p.getTitle());
            dto.setBody(p.getBody());
            dto.setAuthorId(p.getAuthor().getId());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public PostDto create(PostDto postDto) {
        Post p = new Post();
        p.setTitle(postDto.getTitle());
        p.setBody(postDto.getBody());

        Author author = authorRepository.findById(postDto.getAuthorId()).orElseThrow();
        p.setAuthor(author);

        Post saved = postRepository.save(p);

        PostDto result = new PostDto();
        result.setId(saved.getId());
        result.setTitle(saved.getTitle());
        result.setBody(saved.getBody());
        result.setAuthorId(saved.getAuthor().getId());

        return result;
    }
}
