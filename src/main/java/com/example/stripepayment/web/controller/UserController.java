package com.example.stripepayment.web.controller;

import com.example.stripepayment.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/estimatedamount")

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/EstimatedAmount/{id}")
    public double getestimatedAmount(@PathVariable Long id) {
       return userService.getestimatedAmount(id);
    }

}
