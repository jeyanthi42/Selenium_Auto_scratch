#Sample Feature Definition Template
@tag
Feature: Validate the Login page Feature
  I want to use this template for Orange HRM login page page Feature file

  @tag2
  Scenario Outline: Validating the Orange HRM Login page with Correct Credential
    Given provide the login creditial for OrangeHRM as UserName:<'username'> and Password<'password'>
    When Click the login button in orangeHRM
    Then Verify Ppt entered into home page of OrangeHRM

    Examples: 
      | username  | password | status  |
      | Admin 			|     admin123 | success |