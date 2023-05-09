Feature: login

  @login-mobile-01
  Scenario: user tidak dapat login menggunakan akun yang belum terdaftar
    Given user on homepage AltaShop for login feature
    When user click login button for login feature
    And user input email for login feature
    And user input password for login feature
    Then user click login button again for login feature
    And user see error message "Record not found"

  @login-mobile-02
    Scenario: user bisa login menggunakan data valid
    Given user on homepage AltaShop for login feature
    When user click login button for login feature
    And user input email valid for login feature
    And user input password valid for login feature
    Then user click login button again for login feature

  @login-mobile-03
  Scenario: user tidak bisa login karena menggunakan password yang salah
    Given user on homepage AltaShop for login feature
    When user click login button for login feature
    And user input email valid for login feature
    And user input password invalid for login feature
    Then user click login button again for login feature
    And user see error message password invalid "Email or Password Invalid"

  @login-mobile-04
  Scenario: user tidak bisa login karena menggunakan email yang salah
    Given user on homepage AltaShop for login feature
    When user click login button for login feature
    And user input email invalid for login feature
    And user input password valid for login feature
    Then user click login button again for login feature
    And user see error message email invalid "Email or Password Invalid"

  @login-mobile-05
  Scenario: user tidak bisa login karena tidak menginput email di field email
    Given user on homepage AltaShop for login feature
    When user click login button for login feature
    And user does not input email for login feature
    And user input password valid for login feature
    Then user click login button again for login feature
    And user see error message email required "Email can not empty"

  @login-mobile-06
  Scenario: user tidak bisa login karena tidak menginput password di field password
    Given user on homepage AltaShop for login feature
    When user click login button for login feature
    And user input email valid for login feature
    And user does not input password for login feature
    Then user click login button again for login feature
    And user see error message password required "Password can not empty"