Feature: Marriott HomePage Header Functionality

  //Background: Given I am on the Marriott homepage

  Scenario: I am not able to sign in using invalid email and password
    Given I am on the Marriot homepage
    And I click on Sign in or Join
    And I enter and invalid email
    And I enter an invalid password
    When I click Sign in
    Then I am not able to sign in and error message is displayed


  Scenario Outline:I can type common destination terms and get related or appropriate results
    Given I am on the Marriot homepage
    And scroll down and find the destination box
    And I type in "<location>"
    When I click find hotels
    Then I verify the search returns appropriate "<results>" for given location
    Examples:
      | location      | results                      |
      | Dallas        | Dallas, TX, USA              |
      | New Orleans   | New Orleans, LA, USA         |
      | Michigan      | Michigan                     |
      | Pennsylvania  | Pennsylvania                 |
      | Manhattan     | Manhattan, New York, NY, USA |
      | San Francisco | San Francisco, CA, USA       |


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

  Scenario Outline:
    Given I am on the Marriot homepage
    And scroll down and find the destination box
    And I type in NYC
    And I click on the start from calendar
    And I select start "<month>" and "<date>"
    When I click find hotels
    Then I verify the correct "<dateResult>" on result page
    Examples:
      | month         | date | dateResult                            |
      | DECEMBER 2020 | 25   | Fri, Dec 25, 2020 - Sat, Dec 26, 2020 |
      | DECEMBER 2020 | 26   | Sat, Dec 26, 2020 - Sun, Dec 27, 2020 |
      | DECEMBER 2020 | 27   | Sun, Dec 27, 2020 - Mon, Dec 28, 2020 |
      | DECEMBER 2020 | 28   | Mon, Dec 28, 2020 - Tue, Dec 29, 2020 |
      | DECEMBER 2020 | 29   | Tue, Dec 29, 2020 - Wed, Dec 30, 2020  |


  Scenario:I can type destination and search using homepage option
    Given I am on the Marriot homepage
    And scroll down and find the destination box
    And I type in NYC
    And I click on the start from calendar
    And I select start date
    When I click find hotels
    Then I verify the search returns appropriate results for NYC


  Scenario:The list view option is inactive under list viewing
    Given I am on the Marriot homepage
    And scroll down and find the destination box
    And I type in NYC
    And I click on the start from calendar
    And I select start date
    When I click find hotels
    Then I verify that the list view option is hidden and inactive

  @SmokeTest
  Scenario:Searching hotels without a destination/locations yields message:
  \"Please enter a city, state, country, property name, point of interest, or airport code.\"
    Given I am on the Marriot homepage
    When I click find hotels
    Then I verify that the appropriate message is displayed


  Scenario:When I click the global language option I am able to switch to another language for
  various continents
    Given I am on the Marriot homepage
    And I click on the global language button
    When I select Espanol from under Americas
    Then I verify that the page title matches the chosen language

  Scenario:sdnfgb
    Given I am on the Marriot homepage
    When I scroll down to the bottom of the page
    Then I verify that the social media links are displayed