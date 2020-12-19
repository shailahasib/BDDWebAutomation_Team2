Feature: T-mobile homePage functionality check

  Background:
    Given I am at T-mobile home page

@test
  Scenario: T-mobile homePage check title
    Then I verify home page title

  @test
  Scenario: T-mobile cart page validation
    When I lick on cart sign button
    Then  I verify My cart logo is displayed

  @test
  Scenario: T- mobile searchBox functionality
    And I click on search button
    When I enter "iphone" in searchBox
    And again I click on search button
    Then I verify  current URL

  @test
  Scenario: T-mobile plans page
    When I mouse hover plans and I select Essentials
    Then I verify the current url
  @test
    Scenario: T-mobile Phones & devices page
      When I mouse over Phones & devices
      And i select FiveG phones
      Then I verify FiveG logo displays
  @test
      Scenario: T-mobile home page active check links
        Then I verify all active links
  @test
        Scenario: T-mobile check deals button functionality
          When I mouse over deals
          And I click on Apple
          Then I verify page title as Apple
  @test
  Scenario Outline: login functionality check with invalid credentials
    And I click on my account
    And I click on Log in
    When I enter "<email>"
    And i click on next
    And I again enter "<password>"
    And again I click login
    Then I verify error message display
    Examples:
      | email                     | password   |
      | lehamelhakim833@gmail.com | abcd12345h |
      | lehamelhakim833@gmail.com | abcdefghi  |
  @test
    Scenario: T-mobile coverage Mouse over
      When I mouse over coverage
      And I select our network
      Then I verify page title as our network

  @test
      Scenario: T-mobile check feedback tab open
        When I mouse hover chat sign
        And click feedback
        Then I verify feedback tab opens























