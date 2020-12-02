Feature: T-Mobile HomePage Functionality check
  T-Mobile login Functionality

@SmokeTest
  Scenario: T-Mobile Login Functionality
    Given I am at t-mobile home page
    And I click on account button
    And I click on log in
    When I enter email address
    And I click on next button
    And I enter password
    Then I click on log in button
    And I validate log in
@SmokeTest @RegressionTest
  Scenario: T-Mobile Bill Pay Functionality
    Given I am at t-mobile home page
    And I click on account button
    And I click on bill pay
    When I enter email address
    And I click on next button
    And I enter password
    Then I click on log in
    And I validate log in bill pay

  @SmokeTest
  Scenario: T-Mobile Change Plan Functionality
   Given I am at t-mobile home page
   And I click on plans
   And I click on magenta start shopping
   When I click on change plan
   Then I select plan on essential
   And I validate a plan
  @SmokeTest
  Scenario: Verify T-Mobile Deals Functionality
    Given I am at t-mobile home page
    And I click on deals
    And I click on iphone12 shop now
    When I select the memory
    And I select color
    Then I click on upgrade
    And I validate deals title

    @SmokeTest
    Scenario: Verify T-Mobile Order Status Functionality
      Given I am at t-mobile home page
      And I click on order status
      And I enter order number
      And I enter billing zip cod
      When I enter last name
      Then I click on continue button
      And I validate title
  @test
  Scenario: Verify T-Mobile Careers Functionality
    Given I am at t-mobile home page
    And I click on t-mobile careers
    And I click browser open position
    And I enter keyword
    When I enter zip cod or city or state
    Then I click on search button
    And I validate title1
  @Test
  Scenario: Verify T-Mobile Prepaid Functionality
    Given I am at t-mobile home page
    And I click on prepaid
    And I click on shop plans
    And I click on chick it out
#    And I enter zip cod
#    And I click on continue button1
#    When I select a plans
#    And I click select button
#    Then I click new customer
    And I validate title text
@Test
Scenario: Verify T-Mobile international Calling Functionality
  Given I am at t-mobile home page
  When I click on international
  Then I click on international  calling with out USA
  And I validate international title

@Test
Scenario: Verify T-Mobile Travel Functionality
  Given I am at t-mobile home page
  And I click on travel
  And I click on find out more
  When I enter destination
  Then I click on coverage button
  And I validate destination title
@Test
Scenario: Verify T-Mobile Device Protection Functionality
  Given I am at t-mobile home page
  And I click on device protection
  And I click on get started
  And I click on mobile number
  And I enter digit number
#  When I click on I'm not robot
  Then I click on submit button
  And I validate device protection title
@Test
Scenario: Verify T-Mobile Forgot Password Functionality
  Given I am at t-mobile home page
  And I click on my account
  And I click on log in1
  And I click on forgot password
  And I enter email or phone number
  And I click on email send cod
  And I click on continue button1
  When I enter digit cod
  And I click on submit cod
  And I enter new password
  And I re enter new password
  Then I click on rest password button
  And I validate new password Title