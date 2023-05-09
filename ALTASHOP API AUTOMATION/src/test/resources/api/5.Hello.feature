Feature: Hello

  @Hello-API-Positive
  Scenario: GET - As user I have be able to get data hello
    Given I set index API endpoint
    When I send index HTTP request
    Then I received valid HTTP response code 200 for index
    And I received valid data for index