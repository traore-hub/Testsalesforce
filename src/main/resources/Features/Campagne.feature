@TestCampagn
Feature: Campagn salesforce

  @CreateCampagn
  Scenario: Create campagn
    Given launch salesforce portals
    When navigate salesforce modules campagn
    And click button campagn
    And give the informations the campagn
    And click save campagn
    Then verify if campagn is create

@ModifyCampagn
    Scenario:Modify Campagn
      Given launch salesforce portals
      When chech campagn list
      And click campagn
      And change the name
      And change date
      And click save campagn
      Then verify if campagn name and date is modify

  @DeleteCampagn
  Scenario: Delete campagn
    Given launch salesforce portal
    When navigate to url salesforces
    And search campagn name
    And delete this campagn
    And close Browser