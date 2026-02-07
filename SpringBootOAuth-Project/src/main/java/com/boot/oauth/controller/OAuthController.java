package com.boot.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RestController means this class handles HTTP requests
// and returns data (String/JSON) directly, not a view (JSP/HTML)
public class OAuthController {

    // Public endpoint (no authentication required)
    // This URL is allowed because it is permitted in SecurityConfig
    @GetMapping("/home")
    public String homePage() {

        // Simple response to confirm public access
        return "Welcome! This is a public home page. No login required.";
    }

    // Protected endpoint (authentication required)
    // User must log in using OAuth / form login / basic auth
    @GetMapping("/user")
    public String userPage() {

        // This response is shown only after successful login
        return "Welcome! You are successfully logged in using OAuth or Spring Security.";
    }
}
