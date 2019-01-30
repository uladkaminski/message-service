package com.uladkaminski.messageservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${values.test}")
    private String value;
    @GetMapping("/test")
    public String test(){
        return value;
    }
}
