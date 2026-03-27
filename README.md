[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project
Student Attendance Management System 
## Problem Statement (max 150 words)
Inefficient and prone to errors, this traditional method of tracking attendance is a thing of the past. This project aims to move beyond the general concept of CRUD operations, i.e., it goes beyond general data management by incorporating Business Logic Layers. It ensures that all Data Mutations, i.e., all updates, are validated in accordance with encapsulated rules, thus avoiding integrity issues that plague simple implementations." It aims to introduce a more reliable and efficient "Modular Attendance Management System" through a strong "Object-Oriented Architecture." It utilizes "Inheritance, Encapsulation, and Custom Exception Handling" to ensure a secure, reliable, and crash-proof framework for academic records.
## Target User
Faculty / Teachers - 	Marks daily attendance, views class statistics, and identifies "At-Risk" students.
Students - 	Views own attendance percentage, checks if below 75%.	Uses Student class for Read-Only access to own data.
Administrator - 	Adds or removes students/teachers from system, maintains database.
## Core Features
Secure Login: Role-based access for Teachers, Students, and Administrators.
Bulk Attendance Entry: Effective ways to mark multiple students present/absent in a single session.
Proactive Analytics: Automatically identifies students with less than 75% attendance for intervention.
Persistent Storage: Java File Input/Output operations are used to permanently store the attendance in .txt format.
Input Validation: Mechanisms to prevent invalid IDs or impossible attendance percentages.
## OOP Concepts Used
- Abstraction:
-  Implementation: Developed an abstract base class named User and an interface for AttendanceOperations.

   Why: This abstracts away the complicated internal implementation of how something is stored. In other words, the system understands that every user can perform a login() or viewDashboard(), but it does not need to know specifics about a Student versus a Teacher at that level. It is focused on "what" rather than "how."

- Inheritance:
- Implementation: A parent class "User" has been defined to hold the common attributes such as "name" and "id." Then the specific classes "Student" and "Teacher" are derived from this parent class.

  Why: This concept helps in Code Reusability. We don't need to write the same code for "name" and "id" twice. We are using the parent class "User" to hold the attributes "name" and "id." Hence, if we make any changes to the basic structure of the "User" class, it will reflect in both "Student" and "Teacher" classes.

- Polymorphism:
- Implementation: Used Method Overriding for the displayDashboard() method. Though both Student and Teacher are subclasses of Users, they have different implementations for this method.

  Why: The importance lies in keeping it flexible. We can call user.displayDashboard() for any user object without knowing beforehand whether it is a student or teacher. The JVM itself will decide which method to call (Dynamic Binding), depending on whether it is student or teacher. The correct interface will be displayed to the correct user.

- Exception Handling:
- Implementation: Created custom exceptions such as InvalidAttendanceException and used try-catch-finally blocks for all File I/O operations.

  Why: The system is now Robust. The program will not crash when the user enters text in a field where they need to enter a number, or when they forget to include a required file. The system catches these errors and provides a friendly message for the user to try again.

- Collections / Threads:
Collections: Using a HashMap for O(1) student lookups and an ArrayList for dynamic lists.
Multithreading: Background threads for automated report generation and data persistence.

## Proposed Architecture Description
The design follows a Three-Tier Modular Architecture with a good "Separation of Concerns" approach:
Presentation Layer/UI: It consists of a menu-driven console interface to facilitate interaction between Students and Faculty.
Logic Layer/Core: It consists of Java classes to handle the hierarchy in Object Oriented Programming, business rules, and "At Risk" analytics computations.
Data Persistence Layer/I/O: It consists of specific handlers to ensure the permanent storage of attendance records in .txt or .csv files.

## How to Run
Clone the project: git clone <your-repo-link>
Compile the source code:
javac src/com/attendance/main/Main.java
Run the application:
java com.attendance.main.Main
---
## Git Discipline Notes
Atomic Commits: Small, single-purpose updates (one feature per commit).
Conventional Commits: Used standard prefixes (feat:, fix:, docs:) for clarity.
Version History: 10+ commits to demonstrate a non-linear, authentic workflow.
Integrity: No bulk uploads; strictly followed the "No ZIP" submission rule.
