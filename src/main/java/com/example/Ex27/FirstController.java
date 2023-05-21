package com.example.Ex27;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Autowired
    private FirstService firstService;

    @GetMapping("/")
    public String welcome() {
        return firstService.getWelcomeMessage();
    }

    @GetMapping("/exp")
    public int exponent() {
        return firstService.getExponent();
    }


    @GetMapping("/get-errors")
    public void errors() {
        throw new MyCustomException("Some custom Errors!!! :(");
    }
}
