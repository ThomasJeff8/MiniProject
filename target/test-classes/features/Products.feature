Feature: Product
  As an admin
  I want to see list of product
  So that I can create new product

  Scenario: GET As admin I have be able to get all product
    Given I set GET api endpoints for all products
    When I send GET HTTP request for all products
    Then I receive valid HTTP response code 200 for all products


  Scenario: GET api endpoints for products by ID
    Given I set GET api endpoints for products by ID
    When I send GET HTTP request for products by ID
    Then I receive valid HTTP response code 200 for products by ID


  Scenario: DELETE api endpoints
    Given I set DELETE api endpoints for a products
    When I send DELETE HTTP request for a products
    Then I receive valid HTTP response code 204 for a products


  Scenario: POST endpoints for create new products
    Given I set POST endpoints for create new products
    When I send POST HTTP request for create new products
    Then I receive a valid HTTP response code 200 in create new products


  Scenario: GET api endpoints for products ratings
    Given I set GET api endpoints for products ratings
    When I send GET HTTP request for products ratings
    Then I receive valid HTTP response code 200 for products ratings


  Scenario: GET api endpoints for products comments
    Given I set GET api endpoints for products comments
    When I send GET HTTP request for products comments
    Then I receive valid HTTP response code 200 for products comments


  Scenario: POST api endpoints for assign a product ratings
    Given I set POST api endpoints for assign a product ratings
    When I send POST HTTP request for assign a product ratings
    Then I receive valid HTTP response code 200 for assign a product ratings


  Scenario: POST api endpoints for create comment for products
    Given I set POST api endpoints for create comment for products
    When I send POST HTTP request for create comment for products
    Then I receive valid HTTP response code 200 for create comment for products