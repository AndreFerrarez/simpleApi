package com.example.simpleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Kubernetes!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running!";
    }

    @GetMapping("/version")
    public String version() {
        return "v1.0.0";
    }

    @GetMapping("/author")
    public String author() {
        return "Developed by André Ferrarez";
    }

    @GetMapping("/time")
    public String time() {
        return java.time.LocalDateTime.now().toString();
    }
}
