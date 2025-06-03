package it.aulab.progetto_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progetto_spring.dtos.PostDto;
import it.aulab.progetto_spring.services.AuthorService;
import it.aulab.progetto_spring.services.PostService;

@Controller
@RequestMapping("/posts")
public class PostController {
    
    @Autowired
    private PostService postService;

    @Autowired
    private AuthorService authorService;
    
    @GetMapping
    public String getAll(Model model) {
        List<PostDto> posts = postService.readAll();
        model.addAttribute("posts", posts);
        return "posts";
    }
    
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("post", new PostDto());
        model.addAttribute("authors", authorService.readAll()); // Per la dropdown
        return "createPost";
    }
    
    @PostMapping("/create")
    public String createSubmit(@ModelAttribute("post") PostDto dto) {
        postService.create(dto);
        return "redirect:/posts";
    }
}
