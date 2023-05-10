Feature: Order
  As an admin
  I want to see list of product
  So that I can create new product

  Scenario: GET api endpoints for all orders
    Given I set GET api endpoints for all orders
    When I send GET HTTP request for all orders
    Then I receive valid HTTP response code 200 for all orders


  Scenario: POST endpoints for create new orders
    Given I set POST endpoints for create new orders
    When I send POST HTTP request for create new orders
    Then I receive a valid HTTP response code 200 in create new orders


  Scenario: GET api endpoints for orders by ID
    Given I set GET api endpoints for orders by ID
    When I send GET HTTP request for orders by ID
    Then I receive valid HTTP response code 200 for orders by ID