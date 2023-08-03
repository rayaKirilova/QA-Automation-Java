Feature: As a test project user I would like to open the home page of the website, to see three slides and to go to My Account page

  Scenario: The user is able to open the home page and discover 3 slides
    Given the browser is open
    And the user is on the home page
    When the user is on the slide section
    Then the user discovers three slides

  Scenario: The user is able to open the home page and find "My Account" button
    Given the user is on the home page
    When the user is on the navigation menu
    And the user finds "My Account" button and clicks on it
    Then the user is taken to the "My Account"page
