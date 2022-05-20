Feature: As user I want to create new account

  Scenario: As user, I want to register without input fullname
    Given I set Post Api endpoint
    When I send Post HTTP request
    Then I receive invalid http response code 400
    And I receive error message for register