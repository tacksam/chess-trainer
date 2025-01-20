package com.tacksam.chess.chess_trainer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/src/main/resources/templates/index.html")
    public String index() {
        return "index"; // Renders index.html
    }
}