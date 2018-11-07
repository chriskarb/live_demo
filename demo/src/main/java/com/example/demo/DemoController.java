package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static String MESSAGE = "Hello ABBS";

    @GetMapping("/demo/hello")
    public String getDemoMessage() {
        return MESSAGE;
    }
}
