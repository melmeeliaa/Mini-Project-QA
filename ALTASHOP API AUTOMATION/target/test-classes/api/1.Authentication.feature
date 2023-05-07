Feature: Authentication

  @Register
  Scenario: POST - As user I have be able to to get new user data from the register feature
    Given I set register api endpoint
    When I send register HTTP request
    Then I received valid HTTP response code 201 for register
    And I received valid data for register

  @Login
  Scenario: POST - As user I have be able to to get token data from the login feature
    Given I set login api endpoint
    When I send login HTTP request
    Then I received valid HTTP response code 201 for login
    And I received valid token data for login

  @GetUserInformation
  Scenario: GET - As user I have be able to get user information
    Given I have endpoint auth for get user information
    When I send endpoint auth for get user information and get token
    Then I set get user information api endpoint
    And I send get user information HTTP request
    Then I received valid HTTP response code 200 for get user information
    And I received valid data for get user information