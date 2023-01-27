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
@location
Feature: location
  I want to use this template for my feature file

  @set
  Scenario: set the location
    Given I am on swiggy homepage website
    #And some other precondition
    When I click on Enter your delivery location
    #And give my location
    #And yet another action
    Then I press enter to select location
    #And check more outcomes


  @update 
  Scenario: update the location
    Given I am not on homepage 
    #And some other precondition
    When I click on other location
    #And click on search for area ,street name
    #And yet another action
    Then I click on that location
    #And check more outcomes
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
