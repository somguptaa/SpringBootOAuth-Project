# Spring Boot OAuth Learning Project

This is my **learning project** created to understand **Spring Boot Security** with **OAuth2 authentication**.  
The main goal of this project is to learn how authentication and authorization work in a Spring Boot application using **multiple OAuth providers**.

This project was built as part of my continuous learning and hands-on practice with **Spring Boot and Spring Security**.

---

## Project Purpose

I built this project to:
- Learn Spring Security configuration using `SecurityFilterChain`
- Understand how OAuth2 login works in Spring Boot
- Practice securing endpoints with authentication rules
- Explore multiple authentication mechanisms in a single application
- Learn how Spring Security integrates with third-party OAuth providers

---

## What This Project Does

- Provides a **public endpoint** (`/home`) accessible to everyone
- Provides a **secured endpoint** (`/user`) that requires authentication
- Supports multiple authentication methods:
  - OAuth2 login using **GitHub**
  - OAuth2 login using **Google**
  - OAuth2 login using **Facebook**
  - Default **form-based login**
  - **HTTP Basic authentication** (for testing)

---

## How It Works

1. When a user accesses `/home`, no authentication is required.
2. When a user accesses `/user`, Spring Security checks if the user is authenticated.
3. If the user is not authenticated, Spring Security redirects to the login page.
4. The user can authenticate using:
   - GitHub OAuth
   - Google OAuth
   - Facebook OAuth
   - Username and password
5. After successful authentication, the secured endpoint becomes accessible.

---

## Technologies Used

- Java
- Spring Boot
- Spring Security
- OAuth2 Client
  - GitHub
  - Google
  - Facebook
- Maven

---

## Project Structure Overview

### SecurityConfig
- Configures Spring Security using `SecurityFilterChain`
- Defines public and secured endpoints
- Enables:
  - OAuth2 login
  - Form-based login
  - HTTP Basic authentication

### Controller
- `/home` → Public endpoint
- `/user` → Secured endpoint (requires authentication)

### application.properties
- Application configuration
- Default Spring Security user credentials
- OAuth client IDs and secrets for:
  - GitHub
  - Google
  - Facebook

---

## Application Screenshots

### Public Home Page (`/home`)
This endpoint is accessible without authentication.

![Public Home Page](./screenshots/home.png)

---

### Login Page
Spring Security automatically redirects unauthenticated users to this login page.  
It supports both form login and OAuth2 login.

![Login Page](./screenshots/login_page.png)

---

### Secured User Page (`/user`)
Accessible only after successful authentication via OAuth or form login.

![User Page](./screenshots/user.png)

---

## My Learning Experience

Through this project, I learned:
- How Spring Security intercepts HTTP requests
- How to configure security using `SecurityFilterChain`
- How OAuth2 login works without managing passwords manually
- How Spring Boot simplifies OAuth2 integration
- How multiple OAuth providers can coexist in one application
- How different authentication mechanisms work together

This project helped me gain confidence with **Spring Security and OAuth2**, which I previously found challenging.

---

## Important Notes

- OAuth client secrets **must not be committed** in real-world applications
- Environment variables or external configuration should be used in production
- This project is intended only for **learning and experimentation**

---

## Future Learning Goals

- Display authenticated user details (name, email, OAuth provider)
- Implement role-based authorization
- Store users in a database
- Customize OAuth login success handling
- Add logout and session management

---
## Final Thoughts

This project reflects my hands-on learning journey with Spring Boot Security and OAuth2, turning complex concepts into practical understanding through real implementation.

