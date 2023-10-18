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

<img width="659" alt="Screenshot 2023-10-18 at 1 41 41 AM" src="https://github.com/ctharindace/two-way-ssl/assets/3063347/ccd71989-5d34-40f7-bfb6-ddc44f83c030">

## Improvements
Following are the improvements that can be done in the implementation:

* Add observability.
* Containerise the project for deployment flexibility.
* Use a configuration server instead of in project configs.
* Refrain fom committing the keystore and credentials.
* Improve unit tests.
* Add fault tolerance.
