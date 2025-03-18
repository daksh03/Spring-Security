#Spring Security
@EnableWebSecurity is a marker annotation. It allows Spring to find (it's a @Configuration and, therefore, @Component) and automatically apply the class to the global WebSecurity. Used with @Configuration: The class annotated with @EnableWebSecurity is usually marked with @Configuration to define Spring beans. @Configuration public class SecurityConfiguration {

@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests((authz) -> authz
            .anyRequest().authenticated()
        )
        .httpBasic(withDefaults());
    return http.build();
}

#JWT
JSON Web Token (JWT) is an open standard that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA. Here we are using HMACSha algorithm.

---

# Spring Security Implementation

This project demonstrates the implementation of Spring Security in a Spring Boot application, featuring role-based access control, JWT-based authentication, and user management.

---

## **Features**

1. **User Authentication**
   - Basic authentication with password hashing.
   - JWT-based token generation and validation.

2. **Endpoints**
   - User Registration.
   - User Login.
   - Get User Details by ID.
   - Delete User by ID.
   - Fetch All Users.
---

## **Technologies Used**

- **Spring Boot**: Backend framework.
- **Spring Security**: For authentication and authorization.
- **JWT (JSON Web Tokens)**: Token-based authentication.
- **JUnit & Mockito**: Unit and integration testing.

---

## **Endpoints**

| Endpoint            | Method   | Description                       | 
|---------------------|----------|-----------------------------------|
| `/register`         | POST     | Register a new user               | 
| `/login`            | POST     | Login and receive a JWT token     | 
| `/allUsers`         | GET      | Fetch all registered users        | 
| `/{id}`             | GET      | Fetch user details by ID          | 
| `/id`               | DELETE   | Delete a user by ID               |          

---

## **Security Details**

1. **Password Hashing**
   - Passwords are hashed using `BCryptPasswordEncoder` before being stored in the database.

2. **JWT Authentication**
   - Tokens are issued at login and used for subsequent requests.
   - Tokens contain user roles for authorization.
