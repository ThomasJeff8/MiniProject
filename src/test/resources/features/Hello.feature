Feature: Hello
  As an admin
  I want to see list of product
  So that I can create new product

  Scenario: GET api endpoints for index
    Given I set GET api endpoints for index
    When I send GET HTTP request for index
    Then I receive valid HTTP response code 200 for index