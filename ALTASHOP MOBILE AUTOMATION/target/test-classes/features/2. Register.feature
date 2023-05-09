Feature: Register

  @register-mobile-01
  Scenario: user tidak dapat register karena menggunakan email yang sudah terdaftar
    Given user on homepage AltaShop for register feature
    When user click login button for register feature
    Then user click link register for register feature
    And  user input fullname for register feature
    And user input registered email for register feature
    And user input password for register feature
    Then user click register button for register feature
    And user see error message duplicate email "Gagal:("

  @register-mobile-02
  Scenario: user tidak dapat register karena tidak mengisi field nama lengkap
    Given user on homepage AltaShop for register feature
    When user click login button for register feature
    Then user click link register for register feature
    And  user does not input fullname for register feature
    And user input email for register feature
    And user input password for register feature
    Then user click register button for register feature
    And user see error message fullname is required or can not empty

  @register-mobile-03
  Scenario: user tidak dapat register karena tidak mengisi field nama email
    Given user on homepage AltaShop for register feature
    When user click login button for register feature
    Then user click link register for register feature
    And  user input fullname for register feature
    And user does not input email for register feature
    And user input password for register feature
    Then user click register button for register feature
    And user see error message email is required or can not empty

  @register-mobile-04
  Scenario: user tidak dapat register karena tidak mengisi field password
    Given user on homepage AltaShop for register feature
    When user click login button for register feature
    Then user click link register for register feature
    And  user input fullname for register feature
    And user input email for register feature
    And user does not input password for register feature
    Then user click register button for register feature
    And user see error message password is required or can not empty

  @register-mobile-05
  Scenario: user dapat register karena semua field terisi dan data yang valid
    Given user on homepage AltaShop for register feature
    When user click login button for register feature
    Then user click link register for register feature
    And  user input fullname for register feature
    And user input email for register feature
    And user input password for register feature
    Then user click register button for register feature
    And user on homepage AltaShop again