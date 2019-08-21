Feature: verifying reports

  Scenario: My demo report validation in jenkins today
    Given TestMe is up and running
    Then user enters valid credentials
    And verifies for the login status for his credentials
