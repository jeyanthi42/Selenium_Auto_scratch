
Feature: Validate the Php Login page Feature
  I want to use this template for php login page page Feature file

#Sample Feature Definition Template
@Singleton
  @tag2
  Scenario Outline: Validating Login page with Correct Credential singleton
    Given provide the login creditial as UserName:<'username'> and Password<'password'> singleton
    When Click the login button singleton
    Then Verify Ppt entered into home page singleton

    Examples: 
      | username  | password | status  |
      | test 			|     test | success |
 #     | name2 |     7 | Fail    |
