Feature: Marriott HomePage Functionality check
  Marriott login Functionality


  @Test
  Scenario: Verify Marriott Log In Functionality
    Given I am at the home page
    And  I click on sing in or join
    When I enter email or member number
    And I enter password
    Then I click sing in button
    And validate sing in title

  @Test
  Scenario: Verify Marriott forgot Password Functionality
    Given I am at the home page
    And  I click on sing in or join
    And I click on forgot password
    When I enter email or member number1
    And I enter firs name
    And I enter last name
    And I enter zip cod
    Then I click on submit button
    And I validate Forgot password title
  @Test
  Scenario: Verify Marriott Find And Reserve Functionality
    Given I am at the home page
    And I click on find and reserve
    And I click on find hotel
    When I enter hotel keyword search
    Then I click on search hotel button
    And I validate find and reserve title

  @Test
  Scenario: Verify Marriott Special Offers Functionality
    Given I am at the home page
    When I click special offers
    Then I click on deals
    And I validate special offers title

  @Test
  Scenario: Verify Shop Marriott Functionality
    Given I am at the home page
    And I click special offers
    When I click on shop marriott
    And I enter email address
    Then I click on sign me up
    And I validate shop marriott

  @Test
  Scenario: Verify Shop Westin Functionality
    Given I am at the home page
    And I click special offers
    When I click on shop westin
    And I enter email address1
    Then I click on subscribe now
    And I validate shop westin title
  @Test
  Scenario: Verify Marriott Our Brands Functionality
    Given I am at the home page
    When I click on our brands
    Then I click on marriott sign
    And I validate title
  @Test
  Scenario: Verify Marriott Our Brands Functionality1
    Given I am at the home page
    When I click on our brands
    Then I click on delta hotel marriott
    And I validate title1
  @Test
  Scenario: Verify Marriott Our Brands Functionality2
    Given I am at the home page
    When I click on our brands
    Then I click on marriott vacation club
    And I validate title2
  @Test
  Scenario: Verify Marriott Our Brands Functionality3
    Given I am at the home page
    When I click on our brands
    Then I click on aloft hotels
    And I validate title3
  @Test
  Scenario: Verify Marriott Vacation Functionality
    Given I am at the home page
    And I click on vacation
    When I click on home and villas
    Then I click on start exploring
    And I validate vacation title
  @Test
  Scenario: Verify Marriott Vacation Residences Functionality
    Given I am at the home page
    When I click on vacation
    Then I click on residences
    And I validate residences title
  @Test
  Scenario: Verify Marriott Travel Tips And Idea Functionality
    Given I am at the home page
    When I click on vacation
    Then I click on travel tips idea
    And I validate travel tips and idea title
  @Test
  Scenario: Verify Marriott About Marriott Bonvoy Functionality
    Given I am at the home page
    When I click on about marriott bonvoy
    Then I click on marriott insiders
    And I validate marriott insiders title
  @Test
  Scenario: Verify Marriott Member Benefits Functionality
    Given I am at the home page
    When I click on about marriott bonvoy
    Then I click on member benefits
    And I validate member benefits title
  @Test
  Scenario: Verify Marriott How to Earn Point  Functionality
    Given I am at the home page
    When I click on about marriott bonvoy
    Then I click on how to earn point
    And I validate how to earn point title
  @Test
  Scenario: Verify Marriott How to Use Point  Functionality
    Given I am at the home page
    When I click on about marriott bonvoy
    Then I click on how to use point
    And I validate how to use point title
  @Test
  Scenario: Verify Marriott Our Brands Functionality4
    Given I am at the home page
    When I click on our brands
    Then I click on sheraton
    And I validate sheraton title
  @Test
  Scenario: Verify Marriott Our Brands Functionality5
    Given I am at the home page
    When I click on our brands
    Then I click on edition
    And I validate edition title
  @Test
  Scenario: Verify Marriott Our Brands Functionality6
    Given I am at the home page
    When I click on our brands
    Then I click on JWMarriott
    And I validate JWMarriott title
  @Test
  Scenario: Verify Marriott Our Brands Functionality7
    Given I am at the home page
    When I click on our brands
    Then I click on WHotels
    And I validate WHotels title