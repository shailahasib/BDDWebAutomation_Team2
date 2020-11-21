Feature: Packages from Header

  Scenario: I can search for packages using the Packages tab on header
    Given I am on Expedia home page
    And I click on Packages
    Then I see the option to choose items and build a trip

  Scenario: I can search for packages using the Packages tab on header
    Given I am on Expedia home page
    And I click on Packages
    Then I see the option to choose items and build a trip


  Scenario Outline:I can search for "leaving from" and "going to" from Packages
    Given I am on Expedia home page
    And I click on going to
    And I enter "<leavingFrom>" in the going to box
    And I enter "<goingTo>" in the going to box
    And I choose Departing
    And I choose Returning
    When I click Search
    Then I verify that "<flyingFrom>" matches from location
    And I verify that "flyingTo"> matches to location
    Examples:
      | leavingFrom | goingTo | flyingFrom                               | flyingTo                                 |
      | Dallas      | JFK     | Dallas, TX (DFW-Dallas-Fort Worth Intl.) | New York, NY (JFK-John F. Kennedy Intl.) |


