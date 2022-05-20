Feature: As user I want to login and receive my account

  Scenario: As user, I want to login with valid email and invalid password
    Given I set Post Api endpoint
    When I send Post HTTP request
    Then I receive invalid http response code 400
    And I receive error message for detail user