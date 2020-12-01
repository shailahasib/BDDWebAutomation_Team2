Feature: Blue 365 Benefits home page navigation
  We want be able to navigate from BCBS Home page to Blue365 benefits

  Background:
    Given I am at BCBS home page
    And I use the mouse over Member Services
    And I click on Visit Blue Benefits

  @TestHomePage
  Scenario:navigate from BCBS Home page to Blue365 benefits
    Then I will verify that i"m landing on the Blue Benefits Home page

  @TestHomePage
  Scenario:navigate to APPAREL & FOOTWEAR link
    When I click on APPAREL & FOOTWEAR link
    Then I should be landing on APPAREL & FOOTWEAR page
  @TestHomePage
  Scenario:navigate to Fitness link
    When I click on Fitness link
    Then I should be landing on Fitness page
  @TestHomePage
  Scenario:navigate to HEARING & VISION link
    When I click on HEARING & VISION link
    Then I should be landing on HEARING & VISION page
  @TestHomePage
  Scenario:navigate to Fitness link
    When I click on HOME & FAMILY link
    Then I should be landing on HOME & FAMILY page
  @TestHomePage
  Scenario:navigate to  NUTRITION link
    When I click on  NUTRITION link
    Then I should be landing on  NUTRITION page
  @TestHomePage
  Scenario:navigate to PERSONAL CARE link
    When I click on PERSONAL CARE link
    Then I should be landing on PERSONAL CARE page
  @TestHomePage
  Scenario:navigate to TRAVEL link
    When I click on TRAVEL link
    Then I should be landing on TRAVEL page
  @TestHomePage
  Scenario:navigate to About Blue365  link
    When I click on About Blue365 link
    Then I should be landing on About Blue365 page
  @TestHomePage
  Scenario:navigate toHealthy Tips link
    When I click on Healthy Tips link
    Then I should be landing on Healthy Tips page
  @TestHomePage
  Scenario:Register with Blue365
    And I click on The Health of America
    And I click on subscribe Health of America news
    And I enter my personal information
      | FirstName | Ismail                     |
      | LastName  | Bennacer                   |
      | Email     | IsmailBennacer12@gmail.com |
      | Zipcode   | 02176                      |
    And I click on I agree to the BCBS.com Terms & Conditions and Privacy Policy.
    And I click on subscribe
    And I click on subscribe second time
    Then I verify the subscription
    And I verify if I am authorized to access this page.