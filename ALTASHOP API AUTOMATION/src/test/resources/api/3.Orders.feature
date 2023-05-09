Feature: Orders

  @Orders01-API-Positive
  Scenario: POST - As user I have be able to to create a new order
    Given I have endpoint auth for create a new order
    When I send endpoint auth create a new order
    Then I set create a new order api endpoint
    And I send create a new order HTTP request
    Then I received valid HTTP response code 201 for create a new order
    And I received valid data for create a new order

  @Orders02-API-Positive
  Scenario: GET - As user I have be able to get all orders
    Given I have endpoint auth for get all orders
    When I send endpoint auth for get all orders
    Then I set get all orders api endpoint
    And I send get all orders HTTP request
    Then I received valid HTTP response code 200 for get all orders
    And I received valid data for get all orders

  @Orders03-API-Positive
  Scenario: GET - As user I have be able to get order by ID
    Given I have endpoint auth for get order by ID
    When I send endpoint auth for get order by ID
    Then I set get order by ID api endpoint
    And I send get order by ID HTTP request
    Then I received valid HTTP response code 200 for get order by ID
    And I received valid data for get order by ID