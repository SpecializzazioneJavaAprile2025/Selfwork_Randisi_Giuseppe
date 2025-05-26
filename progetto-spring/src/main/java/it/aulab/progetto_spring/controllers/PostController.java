package it.aulab.progetto_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import it.aulab.progetto_spring.models.Post;
import it.aulab.progetto_spring.repositories.PostRepositorty;

//Ogni model VUOLE IL SUO CONTROLLER
//Qui metti i metodi/Handler = Gestori
@Controller 
public class PostController{

        @Autowired
        PostRepositorty postRepository;


    @RequestMapping(value ="/post", method = RequestMethod.GET)
    public @ResponseBody List<Post> getAllPosts(){
        return postRepository.findAll();
    }
}
