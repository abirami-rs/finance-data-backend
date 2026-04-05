# Finance Data Processing Backend

## Overview

This project is a backend system for a finance dashboard that manages financial records, user roles, and summary analytics.

## Features

* User and role management (Admin, Analyst, Viewer)
* CRUD operations for financial records
* Role-based access control
* Dashboard summary APIs (income, expenses, balance)
* Input validation and error handling

## Tech Stack

* Java
* Spring Boot
* MySQL

## API Modules

* User Management APIs
* Financial Records APIs
* Dashboard Summary APIs

## Access Control

* Viewer: Read-only access
* Analyst: Read + analytics access
* Admin: Full access (CRUD + user management)

## Database Design

* Users table
* Roles table
* Financial Records table

## Assumptions

* Authentication is simplified
* Roles are predefined
* Data is stored in MySQL

## How to Run

1. Clone repository
2. Configure database in application.properties
3. Run Spring Boot application
4. Test APIs using Postman

## Notes

* Sensitive data like DB password is not stored in code
* Environment variables are used for configuration
