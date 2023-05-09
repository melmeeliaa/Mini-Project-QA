Feature: Product Categories

  @PCategories01-API-Positive
  Scenario: POST - As user I have be able to create a category
    Given I set create a category api endpoint
    When I send create a category HTTP request
    Then I received valid HTTP response code 201 for create a category
    And I received valid data for create a category

  @PCategories02-API-Positive
  Scenario: GET - As user I have be able to get category by ID
    Given I set get category by ID api endpoint
    When I send get category by ID HTTP request
    Then I received valid HTTP response code 200 for get category by ID
    And I received valid data for get categoory by ID

  @PCategories03-API-Positive
  Scenario: GET - As user I have be able to get detail categories
    Given I set get all categories api endpoint
    When I send get all categories HTTP request
    Then I received valid HTTP response code 200 for get all categories
    And I received valid data for detail categories

  @PCategories05-API-Positive
  Scenario: DELETE - As user I have be able to delete a category
    Given I set delete a category api endpoint
    When I send delete a category HTTP request
    Then I received valid HTTP response code 204 for delete a category
    And I received valid data for delete a category