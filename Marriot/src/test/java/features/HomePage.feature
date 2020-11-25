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

  @Test
  Scenario Outline:marriot Login  Functionality check with Valid  and invalid credintial
    And I click on my tips third optiop from header
    And I enter  "<confirmationNumber>" in searchBox
    And I enter checkInDate  <"checkInDate"> in searchBox
    And I enter <"FirstName"> in searchbox
    And I click <"LastName"> in searchbox
    When  I click find  to verify  functionlit is okay
    Examples:
      | confirmationNumber | checkInDate    | FirstName | LastName |
      | 134567456789       | sun,nov22 2020 | Runa      | Parvin   |
      | 456e7856588079     | sun,nov22 2020 | sila      | akber    |
      | 332453678909347    | sun,nov22 2020 | sila      | rahihan  |
      | 4567890-5435678    | sun,nov22 2020 | sila      | parol    |


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

  @SmokeTest
  Scenario:verify marriot find and reserve functionality
    When I click Find and Reserve on header
    And I click and on Where do you want to go
    Then I enter location name
    And I click on the start from calendar

  @SmokeTest
  Scenario:I can type destination and search using homepage option
    And scroll down and find the destination box
    And I enter in NYC destanation box
    And I click on the start from calendar
    And I select start date

  @SmokeTest
  Scenario Outline:I want to check marriot My tips vaid and invalid crediantial based on table
    And I click on my tips third optiop from header
    And I enter a list of "<email>" address
    And I enter "<password>" and click Sign in
    Then i want to click sign in to verify

    Examples:
      | email                   | password  |
      | runa 11434@t@gmail.com  | Ma7402997 |
      | runa 114567@t@gmail.com | Ma7402997 |
      | runa 11467@t@gmail.com  | Ma3456789 |
      | runa 11457@t@gmail.com  | Ma74345   |
      | runa 11446@t@gmail.com  | Ha7402997 |

  @SmokeTestDataTable

  Scenario: marriort signUp
    And I scroll down the page and i see Signin
    And I click on Signin
    And I enter email number
    And I enter password
    And I enter user information
      | runa11427@gmail.com |
      | ma74023455          |
    Then I click signin

