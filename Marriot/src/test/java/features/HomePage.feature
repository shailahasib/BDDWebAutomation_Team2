Feature: Marriott Website Functionality Check

  Background:
    Given I am at Marriott Home Page

  @SmokeTest
  Scenario: Marriott HomePage Calender functionalty check
    And I click The Calender box
    And I notice window display
    And I Click errow
    And I pick My preferable date from date picker
    Then I verify the Calender functionality is propely working as aspection


  @SmokeTest
  Scenario Outline:T-Moble Login  Functionality check with Valid  and invalid credintial
    And I click sign in
    And I enter email "<Emmail>" in searchBox
    And I enter password  <"Password"> in searchBox
    When  I click Sign In i verify the log in functionlit is okay
    Examples:
      | Email                  | Password   |
      | runa11427@gnail.com    | runa11427  |
      | rp.runa11427@gnail.com | runa11427@ |
      | pr.runa11427@gnail.com | runa11427@ |
      | erdytugjhknjmmgmmm     | 3456766890 |

  @SmokeTest
  Scenario: Marriott FindHotels functionalty check
    And I click The FindHotels
    And I enter location in destination
    And I Click rates
    And I pick none
    And  I click find hotels
    Then  I verify is working propely

  @SmokeTest
  Scenario: Marriott Signin  $Find reserve and Special offer  check
    And I click The Signin
    And I click find reserve
    And I Click Special offer
    Then  I verify is working propely

  @SmokeTest
  Scenario: Marriott Find reserve and  check
    And I click Find And reserve
    And I enter my location in destrination box
    And I enter my rates in reatesbox
    Then  I verify is working propely
  @SmokeTest
  Scenario: varify marriot  vacation page exist
    And I click on vacation
    And I click Homes a villas
    Then  I verify the page to the title

  @Test
  Scenario:verify marriot find and reserve functionality
    When I click Find and Reserve on header
    And I click and on Where do you want to go
    Then I enter location name
    And I click on the start from calendar

  @Test
  Scenario:I can type destination and search using homepage option
    And scroll down and find the destination box
    And I enter in NYC destanation box
    And I click on the start from calendar
    And I select start date

