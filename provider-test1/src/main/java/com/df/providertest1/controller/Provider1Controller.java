package com.df.providertest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("provider")
@RestController
public class Provider1Controller {

    @GetMapping("test1")
    public String test1() {
        return "test1";
    }
}
