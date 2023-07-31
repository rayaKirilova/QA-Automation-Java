Feature: As a testProject user I would like to login my account

  Scenario Outline: The user is able to login with correct credentials
    Given the browser is open
    And the user is on the login page
    And the login button is usable
    When the user enters their username <username> and password <password>
    And the login button is clicked
    Then the user is transferred to the login home page

    Examples:
    | username | password |
    | Mark | 12345 |
    | Jeff | 12345 |