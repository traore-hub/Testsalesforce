@tag
Feature: SalesForce - Account in Sales Portal

  @scenario1
  Scenario Outline: Account Creation
    Given User navigate to Salesforce group page
    And User navigate to Sales Portal
    When User Creates An Account with : account name "<account_name>", type "<type>", web site "<web_site>", phone number "<phone_number>" and click submit
    Then The account should be created with correct information

    Examples: 
      | account_name | type            | web_site     | phone_number |
      | test1        | Costumer-Direct | www.test.com |     25000111 |

  @scenario2
  Scenario Outline: Contact creation - in account portal
    Given User navigate to account
    When User create a new contact with : civility "<civility>" , contact first name "<contact_first_name>", contact last name "<contact_last_name>", contact phone "<contact_phone>" and click submit
    Then the contact should be created with the correct infomations

    Examples: 
      | civility | contact_first_name | contact_last_name | contact_phone |
      | Ms.      | jihene             | saidene           |      28000111 |

  @scenario3
  Scenario Outline: Opportunity creation - in account portal
    Given user is in his account
    When user create a new opportunity with : opportunity name "<opportunity_name>", closure date "<closure_date>", step "<step>" and click submit
    Then the opportunity should be created with the correct informations

    Examples: 
      | opportunity_name | closure_date | step        |
      | opportunity test | 16/11/2022   | Prospecting |

  @scenario4
  Scenario Outline: Request Creation - in account portal
    Given user enter his account
    When user create new request with : statut "<statut>" , request origin "<request_origin>" and click submit
    Then the request sould be created with the correct informations
    
      | statut | request_origin |
      | New    | Email          |
