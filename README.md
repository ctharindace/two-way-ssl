# Readme

### Requirements
* JDK version 11
* Gradle version 8.3

### Getting Started
* Import the project into an IDE of your choosing for code changes.
* Navigate to the project home directory.
* Run the following, which will start the application.
```bash
gradle bootRun
```
* Navigate to a rest client of your choosing.
* Enter the URl and call the microservice.

![](/Users/ctharinda/Desktop/Screenshot 2023-10-18 at 1.23.28 PM.png)

## Improvements
Following are the improvements that can be done in the implementation:

* Add observability (Zipkin or ELK)
* Containerise the project for deployment flexibility.
* Use a configuration server instead of in project configs.
* Refrain fom committing the keystore and credentials.
* Improve unit tests.
* Add fault tolerance.

