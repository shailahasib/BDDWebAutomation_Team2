Feature: Expedia Website Functionality check

  Background:
    Given I am at Expedia home page

  @SmokeTest
  Scenario: Varify expedia search box functionality
    And I click expedia searchbox
    And I enter location
#  @SmokeTest
#   Scenario: Varify expedia Flight search  functionality
#     And I click expedia Flight
#     And I Select one way
#   And I enter my location  from where im leaving
#    And I click going box
#    And I enter where i want to go
#    And I Click Departing
#    And I select date from calander
#    And I Click Done button on calender
#    When I hit on search button
#    Then I verify lots of flights are avalable in the page
  @SmokeTest
  Scenario: Varify expedia Flight calaender functionality working as  expected
    And I click expedia Flight
    And I Click Departing
    And I select date from calander
  @SmokeTest
  Scenario: Varify expedia build a package
    And I click cars on expedia build a package
  @SmokeTest
  Scenario: Varify expedia Things to do function working proerly
    And I click Things to do
  Scenario Outline: Expeadi homePage  functionality check with valid and invalid creditial based on table
#    And I can click  Signin
    And I click inside Signin
    And I enter "<email>" list in the searchbox
    And I enter "<Password>" list in the box
    When I click sign in bitton
    Examples:
      | email                 | Password |
      | rahul11427@gmail.com  | rahul    |
      | robin3564@gmail.com   | robin    |
      | rakib@gmail.com       | rakib    |
      | kalo234567@gmail.com  | raseds   |
      | abul3245467@gmail.com | abul     |
      | kalo234567@gmail.com  | #####    |
  @SmokeTest
  Scenario: Varify expedia search list your property exist middle of the header right sight
    And I can see list your property and i click
    When i navavige to the page i can see list your property exist on the page top of  the right corner
  @SmokeTest
  Scenario: I can click expedia language
    And I can see language right  of the header and i click
    When and i see a  popup massage
  @SmokeTest
  Scenario: verify expedia add a flight functionality
    And I can Add a flight
    And I can click leaving from
    And  I can cllick Search
    Then I verify all function are working properly
  @SmokeTest
  Scenario:I can cliak expedia more trave more
    And I can click more trave
    And I can click flight
    Then I verify all function are working properly
  @SmokeTest
  Scenario:I can click expedia Support
    And I can click searchBox inside support and i can enter somthing
  @SmokeTest
  Scenario:I can click expedia Add a Car
    And I can click add a car
    And I can click going to
    And I verify function is okay
  @SmokeTest
  Scenario:I can click expedia shop the sale
    And I want to scroll down the page and and I can click shop the sale
    And I can navigate to the page
  @SmokeTest
  Scenario: Varify expedia inside list your property i can verify sign in functionality
    And I can see list your property and i click
  @SmokeTest
  Scenario:I can click Trips top of the header
    And  I click trips
  Scenario Outline: Expeadi homePage SearchBox functionality check with valid and invalid creditial based on table
    And I click expedia searchbox
    And I enter "<variouslocation>"in the box
    Examples:
      | variouslocation |
      | Bangladesh      |
      | Austrolia       |
      | Singapur        |

  Scenario Outline: Expeadi Add a car functionality check with valid and invalid creditial based on table
    And I can click add a car
    And I can click leaving from and i enter "<differentLocation>"
    Then I verify all function are working properly
    Examples:
      | differentLocation |
      | Newyork           |
      | California        |
      | Texas             |





