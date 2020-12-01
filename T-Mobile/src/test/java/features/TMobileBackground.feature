Feature: T-Mobile HomePage Functionality check
  T-Mobile search functionality
  T-Mobile header functionality

  Background:
    Given I am at T-Mobile Home Page
    When I click on Phones And Devices



  @Test
  Scenario: T-Mobile Cell Phones button functionality check with valid name
    When I click on Cell Phones
    Then I verify Phones is exist

  @Test
  Scenario: T-Mobile Tablets and devices functionality check with valid name
    And I click on Tablets and devices
    Then I verify Tablets and devices is appear properly

  @Test
  Scenario: T-Mobile Smart Watches button functionality check with valid name
    And I click on Smart Watches
    Then I verify Smart Watches is appear properly

  @Test
  Scenario: T-Mobile Accessories button functionality check with valid name
    And I click on Accessories
    Then I verify Accessories is appear properly

  @Test
  Scenario: T-Mobile Cases And Cavers functionality check with valid product
    And I hover Accessories
    When I click on Cases and Cavers
    Then I verify Cases and Cavers is appear properly

  @Test
  Scenario: T-Mobile Cases And Cavers functionality check with valid product
    And I hover Deals
    When I click on New check Box
    Then I verify New Phones is appear properly


  @Test
  Scenario: T-Mobile Cases And Cavers functionality check with valid product
    And I hover Plans
    When I click on Essentials
    Then I verify Essentials is appear properly

  @Test
  Scenario: T-Mobile Cases And Cavers functionality check with valid product
    And I hover Phones and Devices
    When I click on Bring your own phone
    Then I verify Bring your own phone is appear properly

  @Test
  Scenario: T-Mobile Cases And Cavers functionality check with valid product
    And I hover Phones and Devices
    When I click on Bring your own phone
    Then I verify Bring your own phone is appear properly


