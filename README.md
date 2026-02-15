# Spring Boot OAuth Learning Project

This is my **learning project** created to understand **Spring Boot Security** with **OAuth2 authentication**.  
The main goal of this project is to learn how **authentication and authorization** work in a Spring Boot application using **multiple OAuth providers**, and how to **access authenticated user details after login**.

This project was built as part of my continuous learning and hands-on practice with **Spring Boot and Spring Security**.

---

## Project Purpose

I built this project to:

- Learn Spring Security configuration using `SecurityFilterChain`
- Understand how OAuth2 login works in Spring Boot
- Practice securing endpoints with authentication rules
- Explore multiple authentication mechanisms in a single application
- Learn how Spring Security integrates with third-party OAuth providers
- Understand how to access logged-in user details using `Principal` and `Authentication`
- Identify OAuth provider information (GitHub, Google, Facebook) after login

---

## What This Project Does

- Provides a **public endpoint** (`/home`) accessible to everyone
- Provides **secured endpoints** (`/user`, `/details`) that require authentication
- Displays **authenticated user details** after login
- Supports multiple authentication methods:
  - OAuth2 login using **GitHub**
  - OAuth2 login using **Google**
  - OAuth2 login using **Facebook**
  - Default **form-based login**
  - **HTTP Basic authentication** (for testing)

---

## How It Works

1. When a user accesses `/home`, no authentication is required.
2. When a user accesses `/user` or `/details`, Spring Security checks if the user is authenticated.
3. If the user is not authenticated, Spring Security redirects to the login page.
4. The user can authenticate using:
   - GitHub OAuth
   - Google OAuth
   - Facebook OAuth
   - Username and password (form login)
5. After successful authentication:
   - Secured endpoints become accessible
   - Logged-in user details are displayed
   - OAuth provider information can be identified

---

## User Details & OAuth Provider Handling

This project demonstrates how to:

- Access the logged-in user using:
  - `Principal`
  - `Authentication`
  - `SecurityContextHolder`
- Retrieve:
  - Username
  - Authorities / roles
  - Authentication status
  - OAuth attributes (name, email, provider-specific details)
- Detect which OAuth provider was used for login (GitHub, Google, Facebook)

### Key Learning

- **`Principal`** → Provides only the logged-in username  
- **`Authentication`** → Provides complete security-related details of the user

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
- `/user` → Secured endpoint
- `/details` → Displays authenticated user details and OAuth provider information

### application.properties
- Application configuration
- Default Spring Security user credentials
- OAuth client IDs and secrets for:
  - GitHub
  - Google
  - Facebook

---

## 📸 Application Screenshots

### Public Home Page (`/home`)
Accessible without authentication.

![Home Page](screenshots/home.png)

---

### Login Page
Automatically shown for unauthenticated users.  
Supports form login and OAuth2 login with multiple providers.

![Login Page](screenshots/login_page.png)

---

### Secured User / Details Page
Accessible only after successful authentication.  
Displays logged-in user information and OAuth provider details.

![User Page](screenshots/user.png)


---

## My Learning Experience

Through this project, I learned:

- How Spring Security intercepts and secures HTTP requests
- How to configure security using `SecurityFilterChain`
- How OAuth2 login works without managing passwords manually
- How Spring Boot simplifies OAuth2 integration
- How multiple OAuth providers can coexist in one application
- How to access authenticated user information using Spring Security
- How `Principal`, `Authentication`, and `SecurityContextHolder` differ
- How OAuth provider-specific user attributes are exposed

This project helped me gain confidence with **Spring Security and OAuth2**, which I previously found challenging.

---

## Important Notes

- OAuth client secrets **must not be committed** in real-world applications
- Environment variables or external configuration should be used in production
- This project is intended only for **learning and experimentation**

---

## Future Learning Goals

- Implement role-based authorization
- Store authenticated users in a database
- Customize OAuth login success handling
- Add logout and session management
---

## Final Thoughts

This project reflects my hands-on learning journey with **Spring Boot Security and OAuth2**, gradually building understanding by implementing real features like **user detail extraction and OAuth provider identification**.

Each enhancement made the internal working of Spring Security clearer and more practical.
