Feature: BlueCrossBlueShield HomePage Header


  Background:
    Given I am at BlueCrossBlueShield home page
    When I click on About Us


  @SmokeTest
  Scenario: BlueCrossBlueShield NewRoom Functionality
    And I click on newsroom
    Then I verify page title as newsroom

  @Test
  Scenario: BlueCrossBlueShield Board of Trustees Functionality
    And I click on Board
    Then I verify Board of Trustees is exist
