Feature: As a registered user I would like to sign out from my account

  Scenario: the registered user is able to log out from account page
    Given the browser is open
    And the user is on My Account page
    When the user provides email and password
    And the user logs in
    Then the user clicks on Sign out link

