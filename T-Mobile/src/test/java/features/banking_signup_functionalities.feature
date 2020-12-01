Feature:
  We should be able to navigate to T-mobile Money home page .
  - and the users will be able to Sign up today for T-Mobile MONEY

  Background:
    Given I am at T-Mobile home page
    And I click on Banking link

  @TestBanking
  Scenario: Navigate to T-mobile Money home page .
    Then I verify IAm landing on Sign up today for T-Mobile MONEY page

  @TestBanking
  Scenario: Sign up for T-Mobile MONEY home page
    Given I click on Sign Up button
    And I click on create A T-Mobile ID to sign Up
    Then I verify IAm landing on create A T-Mobile ID to sign Up

  @TestBanking
  Scenario: Sign up for T-Mobile MONEY home page
    Given I click on Sign Up button
    And I click on create A T-Mobile ID to sign Up
    And I enter my information  name, email address and password
      | firstname        | Riyad                    |
      | lastname         | Mahrez                   |
      | email            | Riyadmahreztop6@gmail.com |
      | Re_enteremail    | Riyadmahreztop6@gmail.com |
      | password         | RiyadMB12347              |
      | Re_enterpassword | RiyadM1B2347              |
    And I click on Next button T-Mobile ID

    And I enter my mobile phone number "918-552-3621"
    And I click on Submit button
    And I skip SSN
    And I enter My Address "42 Oxford St"
    And I enter City "Somerville"
    And I enter State "MA"
    And I click on next: your personal information
    And I enter my personal information
    And I enter Social Security Number ""
    And I enter ID number ""
    And I enter ID Type
    And I enter ID state
    And I enter Date of birth
    And I click on next
    And I confirm and continue
    And I read and agree to these disclosures.
    And I click on Open my T-Mobile MONEY account!
    Then I verify creating the account successfully
#  //span[contains(text(),"We're sorry")]
#  We're sorry
