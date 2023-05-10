Feature: login


  @Login01-Web-Negative
  Scenario: user tidak bisa login karena akunnya belum terdaftar
    Given user berada di Homepage AltaShop
    When user klik button login
    And user input email
    And user input password
    Then user klik button login yang kedua
    And user menerima error message "record not found"

  @Login02-Web-Positive
  Scenario: user bisa login dengan data valid
    Given user berada di Homepage AltaShop
    When user klik button login
    And user input email valid
    And user input password valid
    Then user klik button login yang kedua
    And user kembali di homepage AltaShop

  @Login03-Web-Negative
  Scenario: user tidak bisa login karena menggunakan password yang salah
    Given user berada di Homepage AltaShop
    When user klik button login
    And user input email valid
    And user input password invalid
    Then user klik button login yang kedua
    And user menerima error message "email or password is invalid"

  @Login04-Web-Negative
  Scenario: user tidak bisa login karena menggunakan email yang salah
    Given user berada di Homepage AltaShop
    When user klik button login
    And user input email invalid
    And user input password valid
    Then user klik button login yang kedua
    And user menerima error message "email or password is invalid"

  @Login05-Web-Negative
  Scenario: user tidak bisa login karena tidak mengisi email
    Given user berada di Homepage AltaShop
    When user klik button login
    And user not input email
    And user input password valid
    Then user klik button login yang kedua
    And user menerima error message "email is required"

  @Login06-Web-Negative
  Scenario: user tidak bisa login karena tidak mengisi password
    Given user berada di Homepage AltaShop
    When user klik button login
    And user input email valid
    And user not input password
    Then user klik button login yang kedua
    And user menerima error message "password is required"