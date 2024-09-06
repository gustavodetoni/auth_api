# Auth API

Auth API is an authentication API developed in Java using the Spring Boot framework. The application implements user authentication and authorization based on JSON Web Tokens (JWT). The project includes endpoints for user registration, authentication, and restricted access based on roles (`ADMIN` and `USER`).

## Features

- **User Registration**: Allows new users to register in the application, including secure password storage using BCrypt hashing.
- **Authentication**: Generates JWT tokens for authenticated users.
- **Authorization**: Protects endpoints based on defined roles (`ADMIN` and `USER`), allowing access only to users with the correct permissions.
- **Token Validation**: Validates JWT tokens in each request to ensure token authenticity and integrity.

## Technologies Used

- **Java 17**
- **Spring Boot 3**
- **Spring Security**
- **JWT (using Auth0)**
- **BCrypt**
- **Maven**
