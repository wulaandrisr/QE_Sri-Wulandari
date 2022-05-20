Feature: As a user, I want to register
  So that I can create new account

  Scenario: As a user, I want to register with invalid username
    Given I am on the register page
    When I input invalid username
    And I input valid email
    And I input valid password
    And I click register button
    Then I receive error notification "fullname is required"
