# Banking System

A robust and secure banking application designed to simulate real-world banking operations.

---

## Overview

This project aims to provide a comprehensive banking system that supports various banking operations, ensuring a seamless and secure user experience.

---

## Features

- **Account Management**
  - Create and manage multiple bank accounts.
  - View account details and transaction history.

- **Transactions**
  - Deposit and withdraw funds.
  - Transfer money between accounts.

- **Security**
  - User authentication and authorization.
  - Role-based access control.

- **Reporting**
  - Generate transaction reports.
  - View account statements.

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- Docker (optional, for containerization)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/ADS4-Software-Development-Team/Banking-System.git
    cd Banking-System
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    mvn spring-boot:run
    ```

The application will start on [http://localhost:8080](http://localhost:8080).

---

## Testing

Unit and integration tests are included in the project. To run the tests:

```bash
mvn test
