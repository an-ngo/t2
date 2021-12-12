package com.example.webnetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WebnetflixApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebnetflixApplication.class, args);
    }

}
