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
