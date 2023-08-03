Feature: As a registered user I would like to use my email and password and to log in to my dashboard

  Scenario: the registered user is able to log in with correct email and password
    Given the browser is open
    And the user is on My Account page
    When the user is on the login form section
    And the user provides correct email and password
    And the login button is available
    Then the user gets message for successfully login
