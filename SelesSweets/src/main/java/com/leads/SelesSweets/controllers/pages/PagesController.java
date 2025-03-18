package com.leads.SelesSweets.controllers.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    // pasta/nome_arquivo

    @GetMapping("/")
    public String forms(){
        return "forms/forms";
    }

    @GetMapping("/agradecimento")
    public String agradecimento(){
        return "forms/agradecimento";
    }

    @GetMapping("/login")
    public String login(){
        return "login/login";
    }
}
