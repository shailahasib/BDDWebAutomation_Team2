Feature: Blue 365 Benefits home page navigation
  We want be able to navigate from BCBS Home page to Blue365 benefits
  home page , and the user can crete an account using the join function ,
  after creating the account the user will be able to login and logout
  as the user can delete the account at anytime.


  feature 2: blue 365 web page deals
  the user will be able to search any product and deals are available on the site
  and using the filter functions to make it easier for the user while searching
  the deals .

  feature 3 :
  the user can be able to contact service costumer through contact us.

  feature 4:
  for employee functionalities

  -Check how to create an account and test the login functionality
  -test the logout and delete the account functionality
  -test the deals on the web page
  -test the filters functions
  -test contact us functionalities
  -test the search functionality

  feature:5
  check eligibility

  feature 6:
  employee page registration

  Background:
    Given I am at BCBS home page
    And I use the mouse over Member Services
    And I click on Visit Blue Benefits

  @Test
  Scenario:navigate from BCBS Home page to Blue365 benefits
    Then I will verify that i"m landing on the Blue Benefits Home page

  @Test
  Scenario:Test the search functionality with empty value
    When I enter the empty "" searchbox
    And I click on the search button
    Then I will verify the result message with empty searchbox

  @Test
  Scenario:Test the search functionality with valid value
    When I enter the value "value" int the searchbox
    And I click on the search button
    Then I will verify the result message with valid value

  @Test
  Scenario:Test the search functionality character value
    When I enter the  character "??..,." int the searchbox
    And I click on the search button
    Then I will verify the result message with character value

  @Test
  Scenario:All Deals filter's Functionalities
    And I click on All deals
    And I search for Fitness category
#    Then I will verify the the category chosen in the filter

  @Test
  Scenario:click to go up in the page function
    And I scroll down the page
    And I click on go up the page
    Then I will verify the result of scrolling down and clicking up

  @Test
  Scenario:Check eligibility of the members
    And I click on check eligibility
    And I enter 3-digit ID card prefix "k5f"
    And I click on Check your eligibility continue button
    Then I should be directed to the information page to continue

  @Test
  Scenario:Register with Blue365
    And I click on join
    And  I enter 3-digit characters in your member ID card"k5f"
    And I click on Check your eligibility
    And I enter my information
      | firstname | Riyad                    |
      | lastname  | Mahrez                   |
      | email     | Riyadmahreztop@gmail.com |
      | zipcode   | 03060                    |
    And I selectPlan
    And I click on submit button
    Then I verify Thank you message after for register

  @Test
  Scenario Outline:device comparison and take a quiz
    When I click on fitbit deals
    And I click on device comparison link
    And I click on Take a Quiz
    And I select "<GOAL>" How would you describe your current exercise activities?
    And I select "<PRODUCT STYLE>" What kind of product are you looking for?
    And I select "<FEATURES>" Pick up to 3 product features you'd like.
    And I click on show my results
    Then I verify the product you will love
    Examples:
      | GOAL                                               | PRODUCT STYLE | FEATURES                                        |
      | I walk as much as possible during my everyday life | Tracker       | Active Zone Minutes,Advanced heart health tools |

  @Test
  Scenario:download image from the hom page
    When I click Image
    And I save the image in my computer
    Then I verify that I downloaded the image

