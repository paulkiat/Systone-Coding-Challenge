# Systone Coding Challenge

## Project Overview
This project addresses a unit conversion problem for science teachers. It allows teachers to input numerical values, input and target units, and student responses to determine if the answers are correct. The system supports temperature and volume conversions across various units.

### Functional Requirements
1. Input numerical value, input unit of measure, target unit of measure, and student’s numeric response.
2. The system indicates whether the response is correct, incorrect, or invalid.
3. Optional CI/CD pipeline for seamless deployment and peer code review.

## Developer Setup
1. **Clone the repository:**
    ```bash
    git clone https://github.com/paulkiat/systone-coding-challenge.git
    cd systone-coding-challenge
    ```

2. **Install dependencies:**
    - **Maven:** Make sure you have Maven installed.
    - **JUnit:** Ensure JUnit is available in your `pom.xml` file.

3. **Set up the project:**
    - Import the project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
    - Ensure the project structure is correct and dependencies are resolved.

4. **Dependencies:**
    - Java 8 or higher
    - Maven
    - JUnit

5. **Environment Variables:**
    - Set up any necessary environment variables.

## Testing Setup
1. **To run the tests:**
    ```bash
    mvn test
    ```

2. **Testing Framework:**
    - JUnit is used for testing.
    - How to add new tests: Add test methods to `src/test/java/com/example/conversion/ConversionTest.java`.
   

## Web Access App
1. **Starting the Web Application:**
    - If applicable, provide instructions on how to start the web server.
    ```bash
    mvn spring-boot:run
    ```

2. **Endpoints:**
    - List and describe any available endpoints and how to use them.
    - Example requests and responses.

## Storage
1. **Database Setup:**
    - Instructions for setting up the database (if applicable).
    - Configuration details.

2. **File Storage:**
    - Information on where and how files are stored.

| Path                                             | Description                           |
|--------------------------------------------------|---------------------------------------|
| `├── src`                                        | Root directory for source files       |
| `│   ├── main`                                   | Main source directory                 |
| `│   │   └── java`                               | Java source files                     |
| `│   │   └── com`                                | Package directory                     |
| `│   │   └── example`                            | Example package directory             |
| `│   │   └── conversion`                         | Conversion package directory          |
| `│   │   └── Conversion.java`                    | Contains the conversion methods       |
| `│   ├── test`                                   | Test source directory                 |
| `│   │   └── java`                               | Java test files                       |
| `│   │   └── com`                                | Package directory                     |
| `│   │   └── example`                            | Example package directory             |
| `│   │   └── conversion`                         | Conversion test package directory     |
| `│   │   └── ConversionTest.java`                | Contains the test cases               |
| `├── README.md`                                  | Project documentation                 |
| `├── pom.xml`                                    | Maven configuration file              |


- src/main/java: Contains the main code files.
- src/test/java: Contains the test files.
- README.md: Project documentation.
- pom.xml: Maven configuration file with project dependencies.

## Prioritized Improvement Tasks
1. **Implement additional unit conversions:**
    - Add support for more units (e.g., weight, length).

2. **Enhance the user interface:**
    - Develop a graphical user interface (GUI) for easier interaction.

3. **Improve validation logic:**
    - Enhance the validation to handle edge cases more effectively.

4. **Add more test cases:**
    - Expand the test coverage to include all possible scenarios.

5. **Implement CI/CD pipeline:**
    - Set up continuous integration and deployment for automated testing and deployment.

