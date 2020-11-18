Feature: Marriot HomePage Header Functionality

  //Background: Given I am on the Marriot homepage

  @SmokeTest
  Scenario: Find and reserve on header opens dropdown
    Given I am on the Marriot homepage
    When I click Find and Reserve on header
    Then I verify that the booking dropdown opens

  Scenario: Special Offers on header opens appropriate dropdown
    When I click Special Offers on header
    Then I verify that the Special Offers dropdown opens

  Scenario: Vacations on header opens dropdown
    When I click Vacations on header
    Then I verify that the Vacations dropdown opens

  Scenario: OurBrands on header opens appropriate dropdown
    When I click Our Brands on header
    Then I verify that the Brands dropdown opens

  Scenario: Our Credit Cards on header opens appropriate dropdown
    When I click Our Credit Cards on header
    Then I verify that the Credit Cards dropdown opens

  Scenario: About Marriot Bonvoy on header opens appropriate dropdown
    When I click About Marriot Bonvoy on header
    Then I verify that the About dropdown opens


