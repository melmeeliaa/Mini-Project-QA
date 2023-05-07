Feature: Products

  @CreateANewProduct
  Scenario: POST - As user I have be able to create a new product
    Given I set create a new product api endpoint
    When I send create a new product HTTP request
    Then I received valid HTTP response code 201 for create a new product
    And I received valid data for create a new product

  @GetAllProducts
  Scenario: GET - As user I have be able to get detail products
    Given I set get all products api endpoint
    When I send get all products HTTP request
    Then I received valid HTTP response code 200 for get all products
    And I received valid data for detail products

  @GetProductByID
  Scenario: GET - As user I have be able to get a product by ID
    Given I set get product by ID api endpoint
    When I send get product by ID HTTP request
    Then I received valid HTTP response code 200 for get product by ID
    And I received valid data for get product by ID

  @DeleteAProduct
  Scenario: DELETE - As user I have be able to delete a product
    Given I set delete a product api endpoint
    When I send delete a product HTTP request
    Then I received valid HTTP response code 204 for delete a product
    And I received valid data for delete a product

  @AssignAProductRating
  Scenario: POST - As user I have be able to assign a product rating
    Given I have endpoint auth for assign a product rating
    When I send endpoint auth for assign a product rating and get token
    Then I set assign a product rating api endpoint
    And I send HTTP request for assign a product rating
    Then I received valid HTTP response code 201 for assign a product rating
    And I received valid data for assign a product rating

  @GetProductRatings
  Scenario: GET - As user I have be able to get product ratings
    Given I set get product ratings api endpoint
    When I send get product ratings HTTP request
    Then I received valid HTTP response code 200 for get product ratings
    And I received valid data for get product ratings

  @CreateACommentForProduct
  Scenario: POST - As user I have be able to create a comment for product
    Given I have endpoint auth for create a comment for product
    When I send endpoint auth create a comment for product
    Then I set create a comment for product api endpoint
    And I send create a comment for product HTTP request
    And I received valid HTTP response code 201 for create a comment for product
    Then I received valid data for create a comment for product

  @GetProductComments
  Scenario: GET - As user I have be able to get product comments
    Given I set get product comments api endpoint
    When I send get product comments HTTP request
    Then I received valid HTTP response code 200 for get product comments
    And I received valid data for get product comments