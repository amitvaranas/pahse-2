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
@cart
Feature: cart
  I want to use this template for my feature file

  @delete
  Scenario: delete an item from cart
  	
    Given I am on any page of swiggy website
    #And some other precondition
    When I click cart option and delete items from the cart
    #And delete items from the cart
    #And yet another action
    Then I able to delete the  items from cart
    #And check more outcomes



  @update
  Scenario: update  an item from cart
    Given I am on any page of swiggy website
    #And some other precondition
    When I click cart option and update items from the cart
    #And update items from the cart
    #And yet another action
    Then I able to update the  items from cart
    #And check more outcomes


  #@tag2
  #Scenario Outline: update an item 
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
