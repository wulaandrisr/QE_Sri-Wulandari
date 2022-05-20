Feature: As user I want to get categories

  Scenario: As user, I want to get categories
    Given I set Get Api endpoint
    When I send Get HTTP request
    Then I receive invalid http response code 200
    And I see all the detailed categories