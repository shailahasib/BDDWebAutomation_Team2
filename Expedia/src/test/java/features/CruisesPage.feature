Feature: Packages from Header

  Scenario:Enter a destination
    Given I am on Expedia home page
    And I select Stays
    And then I click on going to
    Then I enter a destination

  Scenario: I can search for packages using the Packages tab on header
    Given I am on Expedia home page
    And I click on Packages
    Then I see the option to choose items and build a trip

  Scenario: I can search for packages using
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

  Scenario: Check all the links of the page to find broken links //NOT WORKING
    Given I am on Expedia home page
    When I check gather all the a tags and iterate thr links
    Then I verify that the links are not broken

  Scenario Outline: I verify that the links at the footer all navigate to the correct page
    Given I am on Expedia home page
    When I scroll down to the footer and click on a "<linkText>"
    Then I verify that the links navigate to correct "<pageTitle>"
    Examples:
      | linkText                            | pageTitle                                                                |
      | About Expedia                       | Expedia Group \| The World's Travel Platform                             |
      | Jobs                                | Expedia Group \| Careers                                                 |
      | Investor Relations                  | Expedia Group Investor Relations                                         |
      | Advertising                         | Expedia Group Media Solutions \| The World's Travel Advertising Platform |
      | Newsroom                            | Newsroom Home \| Expedia Brand Newsroom                                  |
      | About Our Ads                       | Travel Deals: Find Cheap Deals on Travel, Trips & Tours \| Expedia.com   |
      | Privacy Policy                      | Privacy Policy \| Expedia.com                                            |
      | Terms of Use                        | Website Terms \| Expedia.com                                             |
      | Site Map                            | Expedia Sitemap                                                          |
      | Accessibility                       | [Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More]    |
      | Support                             | Customer Service Portal                                                  |
      | Do Not Sell My Personal Information | Do Not Sell My Personal Information                                      |