Feature: User login to system successfully

  Background: 
    Given user is at landing page for the login process

  @login
  Scenario: User fills in the correct user information after logging into the system
    When user clicks test login area and choose to test login item
    And user fills user username and password
    Then user receives notification of successful login

  @WrongPassword
  Scenario: User fills in wrong user information after logging into the system
    When user clicks test login area and choose to test login item
    And user fills correct username and wrong password
    Then user receives notification of failed login

  @WrongShortPassword
  Scenario: User fills in wrong user information after logging into the system
    When user clicks test login area and choose to test login item
    And user fills correct username and short password
    Then user receives notification of "Password too short.  The password must be at least 4 characters in length."

  @WrongLongPassword
  Scenario: User fills in wrong user information after logging into the system
    When user clicks test login area and choose to test login item
    And user fills correct username and long password
    Then user receives notification of "Password is too long. Password must be up to 8 characters in length"

  @WrongUsername
  Scenario: User fills in wrong user information after logging into the system
    When user clicks test login area and choose to test login item
    And user fills wrong username and correct password
    Then user receives notification of failed login

  @WrongShortUsername
  Scenario: TUser fills in wrong user information after logging into the system
    When user clicks test login area and choose to test login item
    And user fills short username and correct password
    Then user receives notification of "Username too short.  The username must be at least 4 characters in length.."
  @WrongLongUsername
  Scenario: User fills in wrong user information after logging into the system
    When user clicks test login area and choose to test login item
    And user fills long username and correct password
    Then user receives notification of "Password is too long. Password must be up to 8 characters in length"
    
  @EmptyUsernameAndPassword //Since this scenario is not registered in the system, the appropriate error was not received.
  Scenario: After logging into the system, the user clicks the test login button without entering any information.
    When user clicks test login area and choose to test login item
    Andleave username and password field blank
    Then user receives notification of "Username too short.  The username must be at least 4 characters in length".
    
