Feature: BlueCrossBlueShield LearnIndividualPage Functionality check

  BlueCrossBlueShield search Functionality

  @SmokeTest1
  Scenario: BlueCrossBlueShield Careers Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on Careers
    Then I verify Careers at Blue Cross is appear properly

  @SmokeTest2
  Scenario: BlueCrossBlueShield Careers Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on About Us
    Then I verify About Us at Blue Cross is appear properly

  @SmokeTest3
  Scenario: BlueCrossBlueShield Blog Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on Contact Us
    Then I verify Contact Us at is appear properly

  @SmokeTest4
  Scenario: BlueCrossBlueShield Blog Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on Log In
    Then I verify Log In at Blue Cross is appear properly

  @SmokeTest5
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    And I hover on For Members
    When I click on log In And Register
    Then I verify Member Log In at Blue Cross is appear properly

  @RegressionTest
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on Shop Plans
    Then I verify Shop Plans is appear properly
    @SmokeTest
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click Find a doctor
    Then I verify find a doctor is appear properly

  @SmokeTest1
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on WellBeing
    Then I verify WellBeing is appear properly

  @SmokeTest2
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on Shop 2021 Medicare Plane
    And I click view 2020 medicare plans
    Then I verify 2021 Medicare Plans is appear properly

  @UnitTest
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on Shop individuals and family plans
    And I click shop plans
    And I click see individuals and family plans
    Then I verify 2021 Individual and family health plans

  @UnitTest
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click on Save with a vision plan
    And I click on see small vision plans
    And I click for Small Groups
    Then I verify Blue Cross vision plans for small groups is appear properly

  @UnitTest1
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click Careers
    And I click On Our Story
    Then I verify Our Story is appear properly

  @UnitTest2
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click Careers
    And I click On Locations
    Then I verify Lcations is appear properly
  @UnitTest2
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click Careers
    And I click Careers Areas
    Then I verify career areas is appear properly

  @UnitTest3
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click Careers
    And I hover on Why Work For Us
    And I click Candidate FAQs
    Then I verify Candidate FAQs is appear properly
  @SmokeTest
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    When I click On WellBeing
    And I click See Health Programs
    Then I verify Health programs and discounts is appear properly
  @SmokeTest
  Scenario: BlueCrossBlueShield For Members Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    And I click On WellBeing
    And I click See Health Programs
    When I click On ShareCare Real Age Test Icon
    Then I verify Live your healthiest life is appear properly

  @SmokeTest
  Scenario: BlueCrossBlueShield SearchBox Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    And I enter COVID-19 in searchBox
    When I click on search Button
    Then I verify COVID-19 is appear properly
  @SmokeTest
  Scenario: BlueCrossBlueShield SearchBox Functionality check with valid product
    Given I am at BlueCrossBlueShield home page
    And I enter CareGiver in searchBox
    When I click on search Button
    Then I verify CareGiver is appear properly

  @SmokeTest
  Scenario: BlueCrossBlueShield Log In Functionality check with valid product
    Given I am at Member Log In home page
    And I click log in to your account
    And I enter invalid username
    And I enter valid password
    When I click on log in button
    Then I verify Incorrect username or password.
  @SmokeTest
  Scenario: BlueCrossBlueShield Register Functionality check with valid product
    Given I am at Register home page
    And I enter Member ID
    And I delete the Member ID again
    When I click next
    Then I verify SOME OF YOUR INFO DOESN'T MATCH OUR FILES

  @SmokeTest
  Scenario: BlueCrossBlueShield change language Functionality check with valid product
    Given I am at Register home page
    And I hover Select Language
    When I click All Languages
    Then I verify sheet with different languages appear properly

  @SmokeTest
  Scenario: BlueCrossBlueShield change language Functionality
    Given I am at Welcome home page
    And I hover Select Size
    When I click medium size
    And I click Need Help Button
    Then I verify the page is with medium size
    And the Call for help is appear properly

  @SmokeTest
  Scenario: BlueCrossBlueShield NewsRoom Functionality
    Given I am at BlueCrossBlueShield home page
    And I click on About Us
    When I click on newsroom
    Then I verify page title as newsroom










