package it.aulab.progetto_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import it.aulab.progetto_spring.models.Comment;
import it.aulab.progetto_spring.models.Post;
import it.aulab.progetto_spring.repositories.PostRepositorty;

//Ogni model VUOLE IL SUO CONTROLLER
//Qui metti i metodi/Handler = Gestori
@Controller 
@RequestMapping("/posts")
public class PostController{

        @Autowired
        PostRepositorty postRepository;


    @GetMapping
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @GetMapping("{id}")
    public Post getPost(@PathVariable("id") Long id){
        return postRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not Found"));
        }
    
    @PostMapping
        public Post createPost(@RequestBody Post post){
            return postRepository.save(post);
        }

    @PutMapping("{id}")
     public Post updateComment(@PathVariable("id") Long id, @RequestBody Post post){
        post.setId(id);
        return postRepository.save(post);
     }

     @DeleteMapping("{id}")
     public void deletePost(@PathVariable("id") Long id){
        if(postRepository.existsById(id)){
            postRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post Not Found");
        }
     }



    }


