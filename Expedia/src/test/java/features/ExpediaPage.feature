Feature: Expedia HomePage Functionality check
  Expedia Account functionality


  @Test
  Scenario: Expedia SearchBox functionality check with correct credentials
    Given I am at Expedia Home Page
    And I enter booking in searchBox
    When I click search Button
    Then I verify Booking is appear properly
    And I verify page title as Customer Service Portal

  @ScenarioOutlineTest
  Scenario Outline: Expedia SearchBox functionality check with correct credentials
    Given I am at Expedia Home Page
    And I enter "<serviceName>" in searchBox
    When I click search Button
    And I verify "<URL>"

    Examples:
      | serviceName | URL                                               |
      | Booking     | https://www.expedia.com/service/#/search/Booking  |
      | Hotels      | https://www.expedia.com/service/#/search/Hotels   |
      | Tickets     | https://www.expedia.com/service/#/search/Hotels   |
      | Packages    | https://www.expedia.com/service/#/search/Packages |

  @DataTest
  Scenario: expedia search box functionality with excel wri
    Given I am at Expedia Home Page
    And I connect excel file with search Box
    When I click search Button
    Then I verify my data appear properly


  @DataTest
  Scenario: expedia search box functionality with excel wri
    Given I am at Expedia Home Page
    When I enter my data from excel file to my search box
    When I click search Button
    Then I verify my data appear properly

  @DataTest
  Scenario: Expedia search box functionality with data reader
    Given I am at Expedia Home Page
    And The data will enter from excel to search box automatically



