Feature: Autentication
  As an admin
  I want to see list of product
  So that I can create new product

  Scenario: GET api endpoints for autentication
    Given I set GET api endpoints for autentication
    When I send GET HTTP request for autentication
    Then I receive valid HTTP response code 200 for autentication


  Scenario: POST operational for login
    Given I perform POST operational for login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200 for login


  Scenario: register using the correct data
    Given I register using the correct data
    When I submit a POST request to "/auth/register" with fullname "Fullname Lastname", email "1someone@mail.com" and password "123123"
    Then I receive valid HTTP response code register 200

  Scenario: register using incorrect data
    Given I send POST HTTP request registerr
    Then I receive valid HTTP response code 400 register
