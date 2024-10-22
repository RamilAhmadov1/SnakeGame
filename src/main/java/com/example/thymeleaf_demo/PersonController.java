package com.example.thymeleaf_demo;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model) {
        model.addAttribute("something", "this is the contreller");
        model.addAttribute("people",
                Arrays.asList(new Person("John", 50), new Person("Elvin", 28), new Person("Sarah", 35)));
        return "people";
    }

    

}
