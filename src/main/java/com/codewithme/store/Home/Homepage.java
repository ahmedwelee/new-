package com.codewithme.store.Home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homepage {

    @RequestMapping("/bye")
    public String home() {
        return "goodbye";
    }

}
