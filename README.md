# Employee Management System

This is a **Full Stack Employee Management System** developed using **Spring Boot (Backend)** and **Angular (Frontend)**. It allows employees to be **registered, viewed, and searched by ID**. 

## Features
### Frontend:
- Add new employees
- View the employee list
- Search for an employee by ID
- Responsive UI using Angular and Bootstrap

### Backend:
- RESTful API for employee management
- Exception handling for employee-related errors
- Database integration using Spring Data JPA

## Technologies Used
### Backend:
- **Spring Boot** (REST API Development)
- **Spring Data JPA** (Database Integration)
- **H2 Database/MySQL** (Changeable Database Support)
- **Lombok** (For reducing boilerplate code)
- **Exception Handling** (Global Exception Handling)

### Frontend:
- **Angular** (User Interface)
- **TypeScript, HTML, CSS**
- **Bootstrap** (UI Styling)

## Project Structure
### Backend - Spring Boot
```
com.employee
├── controller
│   ├── EmployeeController.java
├── entity
│   ├── Employee.java
├── exception
│   ├── GlobalException.java
│   ├── NoDataFoundException.java
│   ├── EmployeeAlreadyExistException.java
│   ├── EmployeeNotFoundException.java
├── repository
│   ├── EmployeeRepository.java
├── service
│   ├── EmployeeService.java
```

### Frontend - Angular
```
Employee_Frontend
├── src
│   ├── app
│   │   ├── header
│   │   ├── main
│   │   ├── employeelist
│   │   ├── employeeregister
│   │   ├── employeesearch
│   ├── assets
│   ├── environments
│   ├── index.html
│   ├── main.ts
│   ├── styles.css
├── angular.json
├── package.json
├── tsconfig.json
```

## Screenshots
### Home Page
<img src="assets/Screenshot 2025-03-12 193357.png" alt="">

### Register Employee Page
<img src="assets/Screenshot 2025-03-12 193454.png" alt="">

### Employee List Page
<img src="assets/Screenshot 2025-03-12 193508.png" alt="">

### Search Employee by ID
<img src="assets/Screenshot 2025-03-12 193546.png" alt="">

## Installation and Setup
### Backend Setup
1. Clone the repository
   ```sh
   git clone https://github.com/yourusername/employee-management-system.git
   ```
2. Navigate to the backend directory and run the application
   ```sh
   cd employee-management-backend
   mvn spring-boot:run
   ```

### Frontend Setup
1. Navigate to the frontend directory and install dependencies
   ```sh
   cd employee-management-frontend
   npm install
   ```
2. Start the Angular development server
   ```sh
   ng serve
   ```
3. Open `http://localhost:4200` in your browser.

## API Endpoints
- `GET /employees` → Fetch all employees
- `GET /employees/{id}` → Fetch employee by ID
- `POST /employees/employee` → Register a new employee

