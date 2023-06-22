package com.example.oAuth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class OAuth2DemoApplication {

    @GetMapping("/")
    public String getUser(Principal principal) {
        return "Hi " + principal.getName() + " welcome to SpringOauthDemo";
    }

    public static void main(String[] args) {
        SpringApplication.run(OAuth2DemoApplication.class, args);
    }
}
