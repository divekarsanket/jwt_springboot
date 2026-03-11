package com.jwt.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/profile")
    public String profile() {
        return "This is a protected API";
    }
}
