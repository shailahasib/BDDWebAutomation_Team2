Feature: Expedia HomePage Functionality check


  Background:
    Given I am at Expedia Home Page

  @TestSendingValue
  Scenario: Expedia SearchBox functionality check with correct credentials
    And I enter "booking" in searchBox
    When I click search Button
    Then I verify "Book a flight using an airline credit" is appear properly
    And I verify page title as Customer Service Portal

  @Test
  Scenario: Expedia Things To Do functionality
    Given I am at Expedia Home Page
    And I click on Things To do
    When I click search Button
    Then I verify Booking is appear properly
    And I verify page title as Customer Service Portal
