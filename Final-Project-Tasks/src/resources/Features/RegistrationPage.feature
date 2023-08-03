Feature: As a test project user I would like to register in this website using acceptable email and password

  Scenario: The user is able to register with valid email and password
    Given the browser is open
    And the user is on My Account page
    When the user is on the registration form section
    And the user provides acceptable email and password
    And the registration button is available
    Then the user gets message for successfully registration
