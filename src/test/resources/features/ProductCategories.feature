Feature: Product Categories
  As an admin
  I want to see list of product
  So that I can create new product

  Scenario: GET api endpoints for all categories
    Given I set GET api endpoints for all categories
    When I send GET HTTP request for all categories
    Then I receive valid HTTP response code 200 for all categories


  Scenario: GET api endpoints for categories by ID
    Given I set GET api endpoints for categories by ID
    When I send GET HTTP request for categories by ID
    Then I receive valid HTTP response code 200 for categories by ID


  Scenario: POST HTTP request for create categories
    Given I send POST HTTP request for create categories
    When I receive a valid HTTP response code 200 in create a categories
    Then I receive valid data for a categories


  Scenario: DELETE api endpoints for a categories
    Given I set DELETE api endpoints for a categories
    When I send DELETE HTTP request for a categories
    Then I receive valid HTTP response code 204 for a categories