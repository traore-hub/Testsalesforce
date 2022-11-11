@tag
Feature: Connexion salesforce
  I want to use this template for my feature file

  Scenario: Connexion to salesforce platforme
    Given Browser is open
    When I navigate to salesforce page login
    And I enter lOGIN
    And I enter PASSWORD
    And I Click on LOGIN
    Then Home page should be open
