package it.aulab.progetto_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.progetto_spring.dtos.AuthorDto;
import it.aulab.progetto_spring.models.Author;
import it.aulab.progetto_spring.services.AuthorService;


//Usiamo come nome AuthorRestController perchè 
//questi controller gestiscono le chiamate API

@RestController
@RequestMapping("/api/authors")
public class AuthorRestController {

    // @Autowired
    // AuthorRepository authorRepository; Ormai le chiamate sono su Author Service
    //Da ora in poi tutti i metodi commentati sono quelli relativi al vecchio metood (Controller che chiama il repo)
    //Invece ora segui il Pattern di Spring (Model->Controller->Service->Repository)
    
    @Autowired
    AuthorService authorService;

    @GetMapping
    public List<AuthorDto> getAllAuthors() {
        //return authorRepository.findAll();
        return authorService.readAll();
    }

    @GetMapping("{id}")
    public AuthorDto geAuthor(@PathVariable("id") Long id) {
        //return authorRepository.findById(id).get();
        return authorService.read(id);
    }

    @PostMapping
    public AuthorDto createAuthor(@RequestBody Author author) {
        //return authorRepository.save(author);
        return authorService.create(author);
    }

    @PutMapping("{id}")
    public AuthorDto updateAuthor(@PathVariable("id") Long id, @RequestBody Author author) {
        // author.setId(id);
        // return authorRepository.save(author);
        return authorService.update(id, author);
    }

    @DeleteMapping("{id}")
    public void deleteAuthor(@PathVariable("id") Long id) {
        // if (authorRepository.existsById(id)) {
        //     Author author = authorRepository.findById(id).get();
        //     List<Post> authorPosts = author.getPosts();
        //     for (Post post : authorPosts) {
        //         post.setAuthor(null);
        //     }
        //     authorRepository.deleteById(id);
        // } else {
        //     throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Author not Found");
        // } tutto questo popo di metodo con controllo è gia presente in SERVICEIMPL
        authorService.delete(id);
    }
}
