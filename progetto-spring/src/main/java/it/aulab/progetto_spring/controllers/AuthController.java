package it.aulab.progetto_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") //indichi che la prima cosa a cui rimandi quando qualcuno vuole andare al sito
// "/" indica la radice del sito

public class AuthController {

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("title", "Login");
        return "login";
    }

}
