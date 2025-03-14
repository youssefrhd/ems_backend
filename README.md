
## Description
**XTech** is a **Full-Stack eCommerce website** for purchasing electronics. The application allows users to browse a catalog of products, sign up and log in, make purchases, and manage their account. It is built using **Spring Boot** for the back-end, **Angular** for the front-end, and **MySQL** as the database.

The project utilizes **Spring Security** with **JWT Authentication** for secure user authentication, **Spring Data JPA** and **Hibernate ORM** for database interaction, and integrates a **payment gateway** for handling transactions.

---

## Table of Contents

1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Setup and Installation](#setup-and-installation)
4. [Database Configuration](#database-configuration)
5. [Running the Application](#running-the-application)
6. [Contributions](#contributions)
8. [Contact](#contact)

---

## Features

- **User Authentication**: Users can sign up, log in, and log out with JWT-based secure sessions.
- **Product Catalog**: Browse through a list of products available for purchase.
- **Cart and Checkout**: Users can add items to the cart, proceed to checkout, and place orders.
- **Payment Integration**: Integrates with secure payment systems like Stripe or PayPal for processing orders.
- **Admin Dashboard**: Admins can manage products, view orders, and perform administrative actions.
- **Responsive Design**: Mobile-friendly front-end built with Angular.

---

## Technologies Used

### Backend:
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate ORM**
- **Spring Security** with JWT Authentication
- **MySQL** Database
- **Maven** for Dependency Management
- **RESTful APIs** for communication

### Frontend:
- **Angular** (TypeScript)
- **HTML**, **CSS**, **Tailwind-CSS** for responsive design
- **Angular Services** for API communication
- **Angular Forms** for handling user input (login, registration, checkout)
- **PayPal SDK** Integrates PayPal for payment processing.

### Database:
- **MySQL** for storing product information, user details, orders, etc.

### Others:
- **Postman** for API testing
- **JWT** for securing API endpoints
- **PayPal** Enables secure payment processing for orders.

---

## Setup and Installation

### Prerequisites
- JDK 11 or higher (for Spring Boot)
- Node.js and npm (for Angular)
- MySQL server (locally or remotely)

### Backend Setup

1. Clone the backend repository:
   ```bash
   git clone https://github.com/your_username/ems_backend.git
   cd ems_backend `

1.  Open the project in your IDE (e.g., IntelliJ IDEA).

2.  Set up your MySQL database (you can name it `store_db` or anything you prefer). Example schema:

    `CREATE DATABASE store_db;`

3.  Add your database credentials in the `application.properties` file:

    `spring.datasource.url=jdbc:mysql://localhost:3306/store_db
    spring.datasource.username=${DB_USERNAME}
    spring.datasource.password=${DB_PASSWORD}
    spring.jpa.hibernate.ddl-auto=update`

4.  Run the Spring Boot application:

    `./mvnw spring-boot:run`

    The backend will be running at `http://localhost:8080`.

### Frontend Setup

1.  Clone the frontend repository:

    `git clone https://github.com/your_username/frontend_ems.git
    cd frontend_ems`

2.  Install dependencies:

    `npm install`

3.  Start the Angular development server:

    `ng serve`

    The front-end will be accessible at `http://localhost:4200`.

## Database Configuration

-   Set up a MySQL database to store user and product data.
-   Use the provided `application.properties` file for the Spring Boot configuration.
-   Example schema and tables are already set up in the backend project.

* * * * *

Running the Application
-----------------------

1.  **Backend**: Once the backend is up and running, make sure it is accessible through `http://localhost:8080`.
2.  **Frontend**: Once the front-end is running, access the website at `http://localhost:4200`.
3.  Use the **login page** to sign up or log in to the application.
4.  Browse products, add them to the cart, and proceed with checkout.

* * * * *

Contributions
-------------

Feel free to fork this project and create pull requests. Any contributions, bug reports, or suggestions are welcome.

1.  Fork the repository
2.  Create a new branch (`git checkout -b feature-branch`)
3.  Commit your changes (`git commit -m 'Add new feature'`)
4.  Push to your branch (`git push origin feature-branch`)
5.  Open a pull request

* * * * *

Contact
-------

If you have any questions, feel free to reach out to me:

-   Email: elrhadiry1@gmail.com
-   GitHub: https://github.com/youssefrhd
