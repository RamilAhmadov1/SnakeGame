package com.example.thymeleaf_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    @GetMapping()
    String getHome(Model model) {

        model.addAttribute("home");
        return "home";
    }

    @GetMapping("/game")
    String getGame(Model model) {

        model.addAttribute("game");
        return "game";
    }

    @GetMapping("/signup")
    String getSignup(Model model) {

        model.addAttribute("signup");
        return "signup";
    }

    @GetMapping("/nosignup")
    String getNosignup(Model model) {

        model.addAttribute("nosignup");
        return "nosignup";
    }

    @GetMapping("/gameover")
    String getGameover(Model model) {

        model.addAttribute("gameover");
        return "gameover";
    }
}
