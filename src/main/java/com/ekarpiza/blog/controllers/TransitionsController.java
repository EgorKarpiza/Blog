package com.ekarpiza.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransitionsController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title","Главнвя страница");
        return "home";
    }

    @GetMapping("/about_us")
    public String aboutUs(Model model){
        model.addAttribute("title","О нас");
        return "about_us";
    }

    @GetMapping("/contacts")
    public String contacts(Model model){
        model.addAttribute("title","Контакты");
        return "contacts";
    }
}
