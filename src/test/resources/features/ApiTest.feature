#Author:Kizilboga

@apiTest
Feature: API testing

	Background: 
    Given I login to the account
    
  @listEmails
  Scenario: Title of your scenario
    
    When I list the emails
  
 @searchWord
  Scenario: Search a word
    When I search a word and assert the result

 
