#Sample Feature Definition Template
@tag
Feature: Validate the Login page Feature
  I want to use this template for Orange HRM login page page Feature file

 @Singleton
  Scenario Outline: Validating the Orange HRM Login page with Correct Credential singleton
    Given provide the login creditial for OrangeHRM as UserName:<'username'> and Password<'password'> singleton
    When Click the login button in orangeHRM singleton
    Then Verify Ppt entered into home page of OrangeHRM singleton

    Examples: 
      | username  | password | status  |
      | Admin 			|     admin123 | success |