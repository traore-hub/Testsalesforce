@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Create new contact 
    Given User conected 
    When I click on Contact 
    And I click on new contact
    And I fill the field
    And I save  
    Then New contact should be created 
    @tag2
 Scenario: Remove Contact 
 Given User conected 
 When I click on contact
 And chose contact click on remove
 Then contact should be removed
 
 @tag3
 Scenario: Modification Contact 
 Given User conected 
 Given I click on contact
 When I click on edit 
 And I change name and last name 
 Then modification should be done
 @tag4
   Scenario: Create two contact 
    Given User conected 
    Given I click on Contact 
    Given I click on new contact
    Given I fill the field
    When I click on save and new contact 
    And I fill the second field contact
    Then second contact should be added
 
 

 
 
 
    



