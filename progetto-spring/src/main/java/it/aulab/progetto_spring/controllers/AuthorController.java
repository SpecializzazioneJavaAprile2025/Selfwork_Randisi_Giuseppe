package it.aulab.progetto_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import it.aulab.progetto_spring.models.Author;
import it.aulab.progetto_spring.repositories.AuthorRepository;

//Ogni model VUOLE IL SUO CONTROLLER
//Qui metti i metodi/Handler = Gestori
@Controller 
public class AuthorController{

        @Autowired
        AuthorRepository authorRepository;

    public @ResponseBody List<Author> getAllAuthors(){

        return authorRepository.findAll();
    }
}
