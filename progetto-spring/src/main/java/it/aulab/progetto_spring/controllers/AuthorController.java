package it.aulab.progetto_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progetto_spring.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;

        @GetMapping
        public String index(Model viewModel){ 
            //Occhio a cosa importi su Model;
            //SERVE PER FORZA: ui.Model;
            viewModel.addAttribute("title", "Authors");
            viewModel.addAttribute("authors", authorService.readAll());
            return "authors";
            //Basta usare il nome della vista
            //Presente in: resources/templates/
            //in questo caso auhtors.html
        }
    }
