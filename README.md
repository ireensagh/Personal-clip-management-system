# Backend for Personal-clip-management-system

This is the backend for the Personal-clip-management-system application. It consumes the Omni Studio API, persists data every 2 hours to the store, and returns a RESTful JSON file to the frontend to display user stories.

## Prerequisites

1. Java 11 or later
2. Maven 3.9.1

## Build and run the application

1. Clone the repository:

git clone https://github.com/ireensagh/Personal-clip-management-system.git

2. Navigate to the project directory:

cd Personal-clip-management-system

3. Build the project using Maven:

mvn clean install

4. Run the application:

mvn spring-boot:run

The backend application will start and be available at `http://localhost:8080`.

## Frontend

The frontend for this application is located in a separate repository. To set up and run the frontend, please follow the instructions provided in its README file.

Repository link: [Frontend Repository](https://github.com/your-frontend-repository)
