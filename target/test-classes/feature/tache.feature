@tag
Feature: tache
  I want to use this template for my feature file

  @tag1
  Scenario: creation tache
    Given Se connecter sur saleforce
    And cliquer sur tache 
    When Cliquer sur une nouvelle tache
    And Entrer lobjet 
    And Selectionner le priorité
    Then Selectionner le statut 
    And Cliquer sur enregistrer 
    
   @tag2
  Scenario: modification tache
   Given Se connecter sur saleforce
    And cliquer sur tache 
    When Chercher la tache par le nom 
    And Selectionner la tache 
    And Cliquer sur modifier 
    Then Modifier objet 
    And Modifier le statut
    And Modifier le priorité 
    And Cliquer sur enrigistrer  
 