Feature: register

  @AS07-negative
  Scenario: user tidak bisa register karena nama email sudah terdaftar
    Given user berada di Homepage AltaShop
    When user klik button login
    Then user klik register
    And user input nama lengkap
    And user input email untuk register
    And user input password untuk register
    Then user klik register yang kedua
    And user menerima ERROR message "duplicate key value ..."

  @AS08-negative
  Scenario: user tidak bisa register karena tidak input nama lengkap
    Given user berada di Homepage AltaShop
    When user klik button login
    Then user klik register
    And user tidak input nama lengkap
    And user input email untuk register
    And user input password untuk register
    Then user klik register yang kedua
    And user menerima ERROR message "fullname is required"

  @AS09-negative
  Scenario: user tidak bisa register karena tidak input email
    Given user berada di Homepage AltaShop
    When user klik button login
    Then user klik register
    And user input nama lengkap
    And user tidak input email untuk register
    And user input password untuk register
    Then user klik register yang kedua
    And user menerima ERROR message "email is required"

  @AS10-negative
  Scenario: user tidak bisa register karena tidak input password
    Given user berada di Homepage AltaShop
    When user klik button login
    Then user klik register
    And user input nama lengkap
    And user input email untuk register
    And user tidak input password untuk register
    Then user klik register yang kedua
    And user menerima ERROR message "password is required"

  @AS11-positive
  Scenario: user bisa register
    Given user berada di Homepage AltaShop
    When user klik button login
    Then user klik register
    And user input nama lengkap
    And user input email untuk register yang belum pernah terdaftar
    And user input password untuk register
    Then user klik register yang kedua
    And user berada di halaman login