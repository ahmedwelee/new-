package com.codewithme.store.Home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homepage {

    @RequestMapping("/")
    public String home() {
        return "hello everyone im ahmed and welcome to my ";
    }

}
