package com.boot.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
// Marks this class as a security configuration class
public class SecurityConfig {

    @Bean
    // Spring calls this method at startup to create security rules
    // SecurityFilterChain decides which requests are allowed or blocked
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            // Defines authorization rules for incoming HTTP requests
            .authorizeHttpRequests(auth ->

                // Public URL: user can access "/home" without logging in
                auth.requestMatchers("/home").permitAll()

                    // Protected URL: user must be logged in to access "/user"
                    // Login can be via form login, OAuth2, or basic auth
                    .requestMatchers("/user").authenticated()
            )

            // Enables OAuth2 login support
            // Example: Login with Facebook, Google, GitHub using client-id and secret
            .oauth2Login(withDefaults())

            // Enables default Spring Security login page
            // Used for username/password authentication
            .formLogin(withDefaults())

            // Enables HTTP Basic authentication
            // Mostly used for REST APIs or testing with tools like Postman
            .httpBasic(withDefaults());

        // Final step: build the security filter chain
        return http.build();
    }
}
