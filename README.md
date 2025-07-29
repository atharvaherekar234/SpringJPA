# Spring Boot JPA CRUD Example

This is a simple **Spring Boot application** demonstrating **CRUD (Create, Read, Update, Delete)** operations using **Spring Data JPA** and a relational database (H2/MySQL/PostgreSQL).

---

## Features

- RESTful API for managing entities (e.g., `User`, `Product`, etc.)
- Uses **Spring Boot**, **Spring Data JPA**, and **Hibernate**
- In-memory database (H2) for easy testing (can switch to MySQL/PostgreSQL)
- Standard CRUD endpoints:
  - `POST /api/entities` - Create a new record
  - `GET /api/entities` - Retrieve all records
  - `GET /api/entities/{id}` - Retrieve a record by ID
  - `PUT /api/entities/{id}` - Update an existing record
  - `DELETE /api/entities/{id}` - Delete a record by ID

---

## Technologies Used

- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA**
- **Hibernate**
- **H2/MySQL/PostgreSQL**
- **Maven**

---



