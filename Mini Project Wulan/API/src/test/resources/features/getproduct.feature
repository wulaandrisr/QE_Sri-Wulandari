Feature: As user I want to get products

  Scenario:	As user, I have be able to get detail product
    Given I set Get Api endpoint
    When I send Get HTTP request
    Then I receive valid http response code 200
    And I see all the products