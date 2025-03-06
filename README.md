# Airbnb Automation Project

This repository contains a Selenium-based automation framework for testing the Airbnb website. The project uses the Page Object Model (POM) design pattern to create a maintainable and scalable test automation solution.

## 🛠️ Technology Stack

- Java 8
- Selenium WebDriver 4.10.0
- TestNG 7.4.0
- Maven

## 📂 Project Structure

```
Airbnb_project/
├── src/
│   ├── main/java/
│   │   └── Pages/
│   │       ├── HomePage.java
│   │       ├── ListPage.java
│   │       ├── AppartmentPage.java
│   │       └── BookingPage.java
│   └── test/java/
│       ├── Base/
│       │   └── BaseTest.java
│       └── Search/
│           ├── DetailsTest.java
│           └── SearchTest.java
└── pom.xml
```

## 🏗️ Framework Architecture

### Page Objects

The framework follows the Page Object Model design pattern, with each page of the application represented by a dedicated class:

- **HomePage**: Handles interactions with the Airbnb home page, including search functionality and filters
- **ListPage**: Manages interactions with the search results page
- **AppartmentPage**: Handles interactions with the individual apartment listing page
- **BookingPage**: Manages interactions with the booking/reservation page

### Test Base

- **BaseTest**: Provides the foundation for all test classes, handling browser setup and teardown

### Test Classes

- **DetailsTest**: Tests the end-to-end flow from search to booking
- **SearchTest**: Reserved for additional search-related test cases

## ⚙️ Setup Instructions

1. Clone this repository
2. Ensure you have JDK 8 installed
3. Download and configure the appropriate WebDriver (currently using EdgeDriver)
4. Update the WebDriver path in `BaseTest.java` to match your local configuration:
   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/your/driver");
   ```
5. Run tests using Maven or TestNG

## 🚀 Running Tests

### Using Maven

```bash
mvn clean test
```

### Using TestNG

Run the `DetailsTest.java` file directly from your IDE.

## 📋 Current Test Scenarios

### Apartment Booking Flow Test

This test verifies the end-to-end flow of:
1. Searching for accommodations in "Al Haram"
2. Setting check-in and check-out dates
3. Adding guests (adults, children, and infants)
4. Selecting an apartment from search results
5. Handling window navigation and alerts
6. Initiating the booking process
7. Entering contact information


## 📝 Notes

- The current implementation uses Edge WebDriver
- Implicit wait is set to 5 seconds
- Window handling is implemented for multi-window scenarios

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
