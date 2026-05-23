package com.wante.sbms_spring_security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @GetMapping("/")
    public String welcomeMsg(){
        String msg = "Welcome to Ashok It";

        return msg;
    }
}
