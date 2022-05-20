Feature: As a user I want to post products

  Scenario: As a user, I want to post products with invalid data
    Given I set Post Api endpoint
    When I send Post HTTP request
    Then I receive valid http response code 400
    And I see all the detail products