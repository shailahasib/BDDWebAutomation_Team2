Feature: help page check

  @test
  Scenario:  validate help title
    Given I am at Marriot home page
    When I click on help
    Then I verify help page title

  @Test
  Scenario: verify active help page links
    Given I am at Marriot home page
    When I click on help
    Then I verify active links in help page

  @test
  Scenario: book room and flight
    Given I am at Marriot home page
    And I click on help
    And I click on find and reserve
    When I click on room and flight link
    And enter origin and destination
#      And select departing and returning

  @test
  Scenario:check new page
    Given I am at Marriot home page
    When I mouse over learn
    And I click on news
    Then I verify News is displayed

    @test
    Scenario:
      Given I am at Marriot home page
      When I mouse over Employers
      And I select Improving care
      Then I verify URL









