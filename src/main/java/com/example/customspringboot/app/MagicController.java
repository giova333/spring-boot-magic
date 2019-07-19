package com.example.customspringboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/magic")
public class MagicController {

    @GetMapping
    String magic() {
        return "magic";
    }

}
