@tag
Feature: Groupe
  @tag4
  Scenario: creation groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe
    When Cliquer sur un nouveau groupe
    And Entrer le nom " groupe de test " 
    And Selectionner le type daccee
    Then Cliquer sur enregistrer et suivant
    When Cliquer sur charger limage
    And Cliquer sur enregistrer le groupe 
    @tag5
   Scenario: modification groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    And Cliquer sur modifier groupe
    Then Modifier  le nom du groupe "une_nouvelle_modification_groupe"
    And Modifier le Type daccès
    And Cliquer sur enrigistrer modification
    @tag6
   Scenario: supprimer un groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    And Cliquer sur supprimer groupe
    @tag7
   Scenario: creation opportunité dans un groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    Then Cliquer sur nouvelle opportunité 
    And Entrer le nom de lopportunité "opportunité groupe de test "
    And Selectionner etape
    And Cliquer sur enregistrer opportunité
    And  verification  creation  opportunité dans un groupe
    @tag8
   Scenario: Ajouter une publication dans un groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    Then Cliquer sur publication
    And Ajouter une publication "publication dans un groupe de test groupe de test "
    And Cliquer sur partager publication