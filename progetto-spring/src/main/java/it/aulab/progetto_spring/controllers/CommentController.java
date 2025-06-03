package it.aulab.progetto_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progetto_spring.dtos.CommentDto;
import it.aulab.progetto_spring.services.CommentService;
import it.aulab.progetto_spring.services.PostService;

@Controller
@RequestMapping("/comments")
public class CommentController {
    
    
    @Autowired
    private CommentService commentService;
    
    @Autowired
    private PostService postService;
    
    @GetMapping
    public String getAll(Model model) {
        List<CommentDto> comments = commentService.readAll();
        model.addAttribute("comments", comments);
        return "comments";
    }
    
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("comment", new CommentDto());
        model.addAttribute("posts", postService.readAll()); 
        return "createComment";
    }
    
    @PostMapping("/create")
    public String createSubmit(@ModelAttribute("comment") CommentDto dto) {
        commentService.create(dto);
        return "redirect:/comments";
    }
}
