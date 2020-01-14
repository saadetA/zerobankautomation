Feature: Login
  As user,i want to able to be login into zerobank
  under different roles with username and password

  @pozitif_test
  Scenario: Login with valid credentials
    Given user is on the login page
    Then user logs in as a user
    And user verifies that"Account Summary"page subtitle is displayed

  @negative_test
  Scenario: Verify that warning message that displayed when password is not correct
    Given user is on the login page
    Then user enters "wrongusername" username and "wrong" password
    And user verifies that "Login and/or password are wrong." message is displayed

  @negative_test
  Scenario: Verify that warning message that displayed when password is not correct
    Given user is on the login page
    Then user enters " " username and " " password
    And user verifies that "Login and/or password are wrong." message is displayed


  @negative_test
  Scenario: Verify that warning message is displayed when username or password are blank
    Given user is on the login page
    Then user enters "" username and "password" password
    And user verifies that "Login and/or password are wrong." message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when username or password are blank
    Given user is on the login page
    Then user enters "username" username and "" password
    And user verifies that "Login and/or password are wrong." message is displayed