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
@dish
Feature: dish
  I want to use this template for my feature file


    
    
  @search
  Scenario: search a dish
    Given I am on homepage of swiggy 
    #And some other precondition
    When I click search button
    #And click on search for retaurants and food and enter product name 
    #And yet another action
    Then I see the list of product name with prices also
    #And check more outcomes
    
  @displayname
  Scenario: display all product name
    Given I am on list of product name and price page
    #And some other precondition
    When I run algorithm to find list of product name
    #And click on search for retaurants and food and enter product name 
    #And yet another action
    Then i can see list of product name on the console
    #And check more outcomes


  @displayprice
  Scenario: display all product price
    Given I am on list of product name and price page
    #And some other precondition
    When I run algorithm to find list of product price
    #And click on search for retaurants and food and enter product name 
    #And yet another action
    Then i can see list of product price on the console
    #And check more outcomes


  @add
  Scenario: add to cart
    Given I am on list of product name and price page
    #And some other precondition
    When i click in add button on any of the the given product    			
    #And i click on any one of the radio button to customize
    #And i click on add items
    #And yet another action
    Then item will be added to cart
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
