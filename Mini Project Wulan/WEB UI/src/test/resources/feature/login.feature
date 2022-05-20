Feature: As a user, I want to login
  So that I can see my home page

  Scenario: As a user, I want to login using invalid username and password
    Given I am on the login page
    When I input invalid email
    And I input invalid password
    And I click login button
    Then I receive error message "record not found"