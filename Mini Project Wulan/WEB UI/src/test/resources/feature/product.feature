Feature: As a user, I want delete an product
  So that I can see the product on my cart

  Scenario: As a user, I want delete an product from my cart
    Given I am on the home page
    When I click the cart icon
    And I delete the product
    Then I succeeded in delete the products on a cart