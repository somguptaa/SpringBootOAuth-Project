# Spring Boot OAuth Learning Project

This is my **learning project** created to understand **Spring Boot Security** with **OAuth2 authentication** using Facebook.  
The main goal of this project is to learn how authentication and authorization work in a Spring Boot application.

---

## Project Purpose

I built this project to:
- Learn Spring Security configuration using `SecurityFilterChain`
- Understand how OAuth2 login works in Spring Boot
- Practice securing endpoints with authentication rules
- Explore different login methods provided by Spring Security

This project is purely for **learning and practice**.

---

## What This Project Does

- Provides a **public endpoint** (`/home`) that anyone can access
- Provides a **secured endpoint** (`/user`) that requires authentication
- Supports multiple authentication methods:
  - OAuth2 login using Facebook
  - Default form-based login
  - HTTP Basic authentication (mainly for testing)

---

## How It Works

1. When a user accesses `/home`, no login is required.
2. When a user accesses `/user`, Spring Security checks authentication.
3. If the user is not logged in, Spring redirects to the login page.
4. The user can log in using Facebook OAuth or username/password.
5. After successful login, the secured endpoint becomes accessible.

---

## Technologies Used

- Java
- Spring Boot
- Spring Security
- OAuth2 Client (Facebook)
- Maven

---

## Project Structure Overview

- **SecurityConfig**
  - Defines which endpoints are public and which are secured
  - Enables OAuth2 login, form login, and HTTP Basic authentication

- **Controller**
  - `/home` → public endpoint
  - `/user` → secured endpoint

- **application.properties**
  - Application name configuration
  - Default Spring Security user credentials
  - Facebook OAuth client ID and secret

---

## My Learning Experience

Through this project, I learned:
- How Spring Security intercepts HTTP requests
- How to configure security rules using `SecurityFilterChain`
- The difference between public and secured endpoints
- How OAuth2 login works without handling passwords manually
- How Spring Boot simplifies OAuth integration using configuration properties
- How multiple authentication methods can coexist in one application

This project helped me build confidence in working with **Spring Security and OAuth2**, which I previously found confusing.

---

## Important Notes

- OAuth client secrets should not be committed in real-world projects
- Environment variables or external configuration should be used in production
- This project is intended only for learning and experimentation

---

## Future Learning Goals

- Google and GitHub OAuth login
- Display logged-in user details on secured pages
- Implement role-based authorization
- Connect authentication with a database

---

#### This project was built by me as part of my learning journey with Spring Boot and Spring Security.
