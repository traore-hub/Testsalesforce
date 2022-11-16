@tag
Feature: tache
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
    Then Modifier objet avec le nom "une_nouvelle_modification"
    And Modifier le statut
    And Modifier le priorité 
    And Cliquer sur enrigistrer  
    @tag3
  Scenario: supprimer une  tache
   Given Se connecter sur saleforce
    And cliquer sur tache 
    When Chercher la tache par le nom 
    And Selectionner la tache 
    And Cliquer sur supprimer 