package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyFirstApplication {
    @RequestMapping("/")
    String home() {
        return "<h1>Hello World!<h1/>";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyFirstApplication.class, args);
    }
}

