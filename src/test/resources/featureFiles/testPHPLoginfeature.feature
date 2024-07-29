#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Validate the Login page Feature
  I want to use this template for Login page Feature file
#
  #@tag1
  #Scenario: Validating Login page with Correct Credential
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  @tag2
  Scenario Outline: Validating Login page with Correct Credential
    Given provide the login creditial as UserName:<'username'> and Password<'password'>
    When Click the login button
    Then Verify Ppt entered into home page

    Examples: 
      | username  | password | status  |
      | test 			|     test | success |
 #     | name2 |     7 | Fail    |
