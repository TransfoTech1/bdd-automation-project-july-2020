Feature: Homepage feature validations

  Scenario: User being able to see and click on plan travel
    Given user has opened a web browser and navigated to aa.com
    When user can see plan travel is displayed
    Then user clicks on the plan travel
    And user validates plan travel submenu displayed
    And user close the browser

  Scenario: User being able to choose round trip or one way from booking
    Given user has opened a web browser and navigated to aa.com
    When user validates book is clicked
    Then user can see round trip and one way options
    And user can click on both of the round trip and one way buttons

