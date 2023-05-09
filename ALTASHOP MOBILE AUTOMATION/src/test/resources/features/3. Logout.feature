Feature: Logout

  @Logout-Mobile
  Scenario: user dapat melakukan proses logout
    Given user on homepage AltaShop for logout feature
    When user click login button for logout feature
    And user logs in first
    And user clicks logout after entering on the altashop homepage