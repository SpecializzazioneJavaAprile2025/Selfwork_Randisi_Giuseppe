package it.aulab.progetto_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import it.aulab.progetto_spring.models.Comment;
import it.aulab.progetto_spring.repositories.CommentRepository;

//Ogni model VUOLE IL SUO CONTROLLER
//Qui metti i metodi/Handler = Gestori
@Controller 
public class CommentController{

        @Autowired
        CommentRepository commentRepository;


    @RequestMapping(value ="/comment", method = RequestMethod.GET)
    public @ResponseBody List<Comment> getAllComments(){
        return commentRepository.findAll();
    }
}
