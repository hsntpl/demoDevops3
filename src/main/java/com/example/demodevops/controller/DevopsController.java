package com.example.demodevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DevopsController {

    @GetMapping
    public String devopsHello(){
        return "Hello Devops HSN";
    }

    @GetMapping("info")
    public String info(){
        return "Hello INFO HSN versiyon 1.0.1 oldu"  + LocalDateTime.now();
    }
}
