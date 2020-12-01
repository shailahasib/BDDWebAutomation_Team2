Feature:
  We should be able to navigate to T-mobile Money home page .
  Users should be able to check Perks link
  Users should be able to check Features Links
  Users should be able to click on FQA and ask all questions they have
  users should be able to visit Support link and have the support

  Background:
    Given I am at T-Mobile home page
    And I click on Banking link

  @TestBanking
  Scenario: Navigate to T-mobile Money home page .
    Then I verify IAm landing on Sign up today for T-Mobile MONEY page

  @TestBanking
  Scenario: check 4.00% APY in Perks link
    When I click on 4.00% APY in Perks
    Then I verify 4.00% APY is serious interest Page

  @TestBanking
  Scenario: check Got your back in Perks link
    When I Got your back
    Then I verify Got your back Page

  @TestBanking
  Scenario: check no fee banking in the Features Link
    When I click on no fee banking in the Features Link
    Then I verify no fee banking in Page

  @TestBanking
  Scenario: check best in class in digital banking in the Features Link
    When I click on best in class in digital banking in the Features Link
    Then I verify best in class in digital banking in Page

  @TestBanking
  Scenario: check direct deposit in the Features Link
    When I click on direct deposit in the Features Link
    Then I verify direct deposit in Page

  @TestBanking
  Scenario: check no fee ATM's in the Features Link
    When I click on no fee ATM's in the Features Link
    Then I verify the no fee ATM's page

  @TestBanking
  Scenario: check deposit cash locations in the Features Link
    When I click on deposit cash locations Features Link
    Then I verify the deposit cash locations page

  @TestBanking
  Scenario: check FAQ page
    When I click on FAQ option
    Then I verify the deposit cash locations page

  @TestBanking
  Scenario Outline: check FAQ page
    When I click on FAQ
    And I enter "<questions>" in the searchbox
    Then I should be able to see The "<Keyword>"in the Search result
    And I verify the "<answer>" in the Search result
    Examples:
      | questions | Keyword                     | answer                                    |
      | Phone     | Search result for - 'Phone' | What do I do if I forgot my username?     |
      | Money     | Search result for - 'Money' | Are T-Mobile MONEY accounts FDIC-insured? |

  @TestBanking
  Scenario: check no fee ATM's in the Features Link
    When I click on no fee ATM's in the Features Link
#    And I search for locations over the map
#    And I submit Enter in keyboard
#    Then I verify the location appears in the map

