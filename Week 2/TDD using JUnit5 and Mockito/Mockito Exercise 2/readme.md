# VerifyInteractionTest

This project demonstrates **Mockito interaction verification** using **JUnit 5** and **Mockito**.

## Exercise Description

**Goal:** Verify that a method in a dependency is called with the correct arguments.

### Steps Performed
1. Created a mock object using Mockito.
2. Called the method on the system under test (`MyService`).
3. Verified that the external dependency (`ExternalApi`) method was called.

## Folder Structure

VerifyInteractionTest/
├── pom.xml
├── src/
│ ├── ExternalApi.java
│ └── MyService.java
└── test/
└── MyServiceTest.java


## Requirements

- Java 8+
- Maven
- JUnit 5
- Mockito 5

## How to Run

1. Clone or download the project.
2. Navigate to the root folder:

   cd VerifyInteractionTest
   
Run the tests:

mvn test