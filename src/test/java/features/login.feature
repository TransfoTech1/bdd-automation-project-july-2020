Feature: Login functionality of the application

  Scenario: User being able to click on login button from homepage
    Given user has opened a web browser and navigated to aa.com
    When user clicks on the login button from homepage
    Then login page comes up
    And user close the browser

  Scenario: User being able to fill required data in login page
    Given user has opened a web browser and navigated to aa.com
    When user clicks on the login button from homepage
    Then login page comes up
    And user validates username, last name & password is displayed
    And user fills username, last name & password field
    And user close the browser