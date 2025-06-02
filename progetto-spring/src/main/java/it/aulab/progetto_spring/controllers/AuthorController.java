package it.aulab.progetto_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progetto_spring.models.Author;
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
       
        @GetMapping("create")
        public String createAuthorView(Model viewModel){ 
            viewModel.addAttribute("title", "Crea Autore");
            viewModel.addAttribute("author", new Author());
            return "createAuthor";
            }

        @PostMapping
        public String create(@ModelAttribute("author") Author author){
            authorService.create(author);
            //Metodo di aggancio a rotte di tipo POST,PUT,PATCH,DELETE
             //Necessitano PER FORZA un redirect verso una rotta di tipo GET (Obbligatorio)
            return "redirect:/authors";
        }
       
    }
