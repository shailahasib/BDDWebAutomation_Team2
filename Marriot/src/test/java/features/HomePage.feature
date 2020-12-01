Feature: Marriot HomePage Header Functionality

  //Background: Given I am on the Marriot homepage

  @SmokeTest
  Scenario: Find and reserve on header opens dropdown
    Given I am on the Marriot homepage
    When I click Find and Reserve on header
    Then I verify that the booking dropdown opens

  Scenario: Special Offers on header opens appropriate dropdown
    Given I am on the Marriot homepage
    When I click Special Offers on header
    Then I verify that the Special Offers dropdown opens

  Scenario: Vacations on header opens dropdown
    Given I am on the Marriot homepage
    When I click Vacations on header
    Then I verify that the Vacations dropdown opens

  Scenario: OurBrands on header opens appropriate dropdown
    Given I am on the Marriot homepage
    When I click Our Brands on header
    Then I verify that the Brands dropdown opens

  Scenario: Our Credit Cards on header opens appropriate dropdown
    Given I am on the Marriot homepage
    When I click Our Credit Cards on header
    Then I verify that the Credit Cards dropdown opens

  Scenario: About Marriot Bonvoy on header opens appropriate dropdown
    Given I am on the Marriot homepage
    When I click About Marriot Bonvoy on header
    Then I verify that the About dropdown opens

  Scenario:
    Given I am on the Marriot homepage
    When I click Find and Reserve on header
    And I click and on Where do you want to go
    Then I type location name
    And I click on the start from calendar

  Scenario:I can type destination and search using homepage option
    Given I am on the Marriot homepage
    And scroll down and find the destination box
    And I type in NYC
    And I click on the start from calendar
    And I select start date



