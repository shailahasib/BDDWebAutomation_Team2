Feature: BCBS healthPage functionality test

  Background:
    Given I am at BCBS home page
    When I click on health of america

  @hakim
  Scenario: check health of america title
    Then I verify I am at health of america page title

  @hakim
  Scenario Outline: BCBS search box check
    And I enter "<search for>" in search box
    And I click on search button
    Then i verify "<URL>"
    Examples:
      | search for        | URL                                                                   |
      | BCBS plans        | https://www.bcbs.com/the-health-of-america/search/bcbs%20plans        |
      | emergency         | https://www.bcbs.com/the-health-of-america/search/emergency           |
      | vision care       | https://www.bcbs.com/the-health-of-america/search/vision%20care       |
      | preventative care | https://www.bcbs.com/the-health-of-america/search/preventative%20care |

  @hakim
  Scenario: check about button
    When i click on about
    Then I verify about page title

  @hakim
  Scenario: check BCBS health index
    When click on BCBS health index
    Then I verify health index page title

  @test5
  Scenario: check data and reports page
    When I click on Data and Reports
    Then i verify Reports text displayed properly

  @test6
  Scenario: check research Alliance page
    When i click on research Alliance page
    Then I verify text displayed

  @test7
  Scenario: check something

    When I click on subscribe to health of america news and switch to new tab
    And I enter user information
      | hakim                     |
      | lehamel                   |
      | lehamelhakim833@gmail.com |
      | 19148                     |
    When i click on subscribe button
    Then I verify error  message displayed


  @test8
  Scenario: check contact us page
    When I click on contact us
    Then I verify I am at contact us page


  @test9
  Scenario: check shop for Insurance
    When I navigate back
    And I click on shop for insurance
    And click Go button
    Then I verify Error message

    @test10
    Scenario: verify active links
      Then I verify active links









