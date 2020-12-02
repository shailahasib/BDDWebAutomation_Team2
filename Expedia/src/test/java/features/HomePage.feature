Feature: Expedia HomePage Functionality check
  Expedia login Functionality

  @Test
  Scenario: Verify Expedia Sing In Functionality
    Given I am at home page
    And I click on sing in
    And I click on sing in1
    When I enter email address
    And I enter password
    Then I click on sing in button
    And I validate sing in title