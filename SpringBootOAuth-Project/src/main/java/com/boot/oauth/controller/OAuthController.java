package com.boot.oauth.controller;

import org.springframework.security.core.context.SecurityContextHolder;

import java.security.Principal;

import org.springframework.security.core.Authentication;
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

	// Handles GET request to "/details" endpoint
	@GetMapping("/details")
	public Authentication showUserDetails(Principal principal) {

	    /*
	     * Principal:
	     * ---------
	     * - Represents the currently logged-in user
	     * - Holds the username of the authenticated user
	     * - Provided automatically by Spring Security
	     */
	    System.out.println("Logged in username: " + principal.getName());

	    /*
	     * SecurityContextHolder:
	     * ----------------------
	     * - Holds security information for the current thread
	     * - SecurityContext contains Authentication object
	     */
	    
	    /*
	     * Authentication:
	     * ---------------
	     * - Contains complete authentication details of the logged-in user
	     * - Includes:
	     *   - Username (principal)
	     *   - Credentials (password – usually hidden for security)
	     *   - Authorities / Roles
	     *   - Account status (enabled, locked, expired, etc.)
	     *   - Additional details
	     */
	    Authentication auth = SecurityContextHolder
	                              .getContext()
	                              .getAuthentication();

	    // Returning Authentication object gives full user details
	    return auth;
	}

	/*
	 * SUMMARY:
	 * --------
	 * Principal:
	 * - Gives only the logged-in user's username
	 *
	 * Authentication:
	 * - Gives complete security-related details of the logged-in user
	 * - Useful when roles, authorities, or account status are needed
	 */

}
