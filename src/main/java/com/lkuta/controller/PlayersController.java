package com.lkuta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/players/")
public class PlayersController {

    @GetMapping
    public String welcome(){
        return "DartsAppWelcome";
    }
}

