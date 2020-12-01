Feature: T-Mobile HomePage Functionality check
  T-Mobile search functionality
  T-Mobile header functionality


  @Test
  Scenario: T-Mobile Plans functionality check with valid credential
    Given I am at T-Mobile Home Page
    When I click on Cell Phones
    Then I verify Phones is exist

  @Test
  Scenario: T-Mobile Plans functionality check with valid credential
    Given I am at T-Mobile Home Page
    When I click on Phones And Devices
    And I click on Tablets and devices
    Then I verify Tablets and devices is appear properly

  @Test
  Scenario: T-Mobile Plans functionality check with valid credential
    Given I am at T-Mobile Home Page
    When I click on Phones And Devices
    And I click on Smart Watches
    Then I verify Smart Watches is appear properly

  @Test
  Scenario: T-Mobile SearchBox functionality check with valid product
    Given I am at T-Mobile And Prepaid Home Page
    And I open search Box
    And I enter headset in search box
    When I click on Search Button
    And I inspect headset
    Then I verify headset is appear properly

  @Test
  Scenario: T-Mobile SearchBox functionality check with valid product
    Given I am at T-Mobile And Prepaid Home Page
    And I open search Box
    And I enter samsung galaxy 11 in search box
    When I click on Search Button
    And I inspect on samsung galaxy 11
    Then I verify samsung galaxy 11 is appear properly

  @ScenarioOutlineTest
  Scenario Outline: T-Mobile SearchBox functionality check with valid product based on table
    Given I am at T-Mobile And Prepaid Home Page
    And I open search Box
    And I enter "<productName>" in search box
    When I click on Search Button
    And I inspect "<PopularSearches>"
    Then I verify "<validProductName>" is appear properly
    Examples:
      | productName       | PopularSearches   | validProductName       |
      | laptop LG         | laptop            | laptop (61)            |
      | samsung galaxy 11 | samsung galaxy 11 | |

  @Test
  Scenario: T-Mobile Cases And Cavers functionality check with valid product
    Given I am at T-Mobile Home Page
    And I click on Phones And Devices
    When I hover SortBy
    And I check Price Low to High
    Then I verify Price Low to High is appear properly
    And I verify page title as Cell Phones & Smartphones Shop the Newest Mobile Phones T-Mobile

  @ScenarioOutlineTest
  Scenario Outline: T-Mobile SortBy functionality check with valid Name
    Given I am at T-Mobile Home Page
    And I click on Phones And Devices
    And I hover SortBy
    When I click "<listName>"
    Then I get "<URL>" is exist properly
    Examples:
      | listName          | URL              |
      | Price Low to High | https://www.t-mobile.com/cell-phones?sort=priceLowToHigh |
      | Price High to Low | https://www.t-mobile.com/cell-phones?sort=priceHighToLow |
      | Highest Rating    | https://www.t-mobile.com/cell-phones?sort=rating    |
      | Featured          | https://www.t-mobile.com/cell-phones?sort=featured         |


  @Test
  Scenario: TMobile home page active check links
    Given I am at T-Mobile Home Page
    Then I verify all active links

  @Test
  Scenario: T-Mobile Deals functionality check with valid credential
    Given I am at T-Mobile Home Page
    And I hover on Deals
    When I click on Samsung
    Then I verify Samsung is appear properly

  @Test
  Scenario: T-Mobile mouseHover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover On business solutions
    When I click on trends and insights
    Then I verify trends and insights is appear properly
    But I should not see success stories


  @Test
  Scenario: T-Mobile hover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover contact us
    When I click on get help
    Then I verify popup window make a call is appear properly

  @Test
  Scenario: T-Mobile hover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover On business
    When I click on HealthCare
    Then I verify HealthCare is appear properly

  @Test
  Scenario: T-Mobile hover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover On business And solutions
    When I click education
    Then I verify education is appear properly

  @Test
  Scenario: T-Mobile hover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover On business And solution
    When I click Fleet Management
    Then I verify FLEET MANAGEMENT SOLUTIONS is appear properly

  @Test
  Scenario: T-Mobile hover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover On Plan
    When I click on Magenta Military plan for service
    Then I verify MAGENTA® MILITARY FOR BUSINESS is appear properly

  @Test
  Scenario: T-Mobile hover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover Plan
    When I click on Magenta for Business
    Then I verify Magenta for Business is appear properly

  @Test
  Scenario: T-Mobile hover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover on coverage
    When I click on International Coverage
    Then I verify Keep your team covered internationally is appear

  @Test
  Scenario: T-Mobile hover functionality check with valid credential
    Given I am at T-Mobile And business Home Page
    And I hover Coverage
    When I click on 5G coverage map
    Then I verify We’re transforming wireless for government is appear









