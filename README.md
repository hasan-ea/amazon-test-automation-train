# Amazon Test Automation Project

This is a training project developed for educational purposes. The automation tests are written using Java, Selenium WebDriver, TestNG, and Cucumber (BDD).

## Purpose

The goal of this project is to test an end-to-end scenario on Amazon.com: searching for a product and adding it to the shopping cart. The scenario simulates user behavior step by step.

## Technologies Used

- Java  
- Maven  
- Selenium WebDriver  
- TestNG  
- Cucumber (Gherkin syntax)

##  Project Structure
## 📁 Project Structure

```
src/
├── main/
│   └── java/
│       ├── testRunners/
│       │   └── runner.java
│       └── util/
│           ├── ConfigReader.java
│           ├── DriverFactory.java
│           ├── ElementHelper.java
│           └── Hooks.java
│
├── test/
│   └── java/
│       ├── Features/
│       │   └── Amazon.feature
│       ├── Pages/
│       │   └── AmazonPages.java
│       └── StepDefinitions/
│           └── AmazonStep.java
│
├── resources/
│   ├── config.properties
│   └── TestNG.xml
```
