Feature: Member Service Page

  Scenario: I can hover over the Member Service on header and see dropdown display
    Given I am at BCBS homepage
    When I hover the mouse over Member Service
    Then I verify the dropdown displays

  Scenario: I can hover over the Member Service on header and see dropdown display
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select my benefits
    When I click on Access my benefits
    Then I verify that Access benefits page is open

  Scenario Outline: I am able to search on the searchBox on the Blue deals page
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select BlueDeals
    And I switch to new tab
    And I type in the "<search>" term
    When I click enter on the keyboard
    Then I land on the results page for the search term
    Examples:
      | search        |
      | Travel        |
      | Food          |
      | Fitness       |
      | Loans         |
      | Personal Care |

  Scenario: When I select VisitBlue365 I am navigated to a new tab
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select BlueDeals
    When I switch to new tab
    Then I verify that I am directed to new tab for VisitBlue

  Scenario Outline:I cannot sign in using an invalid email
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select BlueDeals
    And I switch to new tab
    And I click sign in
    And I enter an invalid "<email>" address
    And I enter an invalid "<password>"
    When I click sign in with email
    Then I validate that error message is displayed
    Examples:
      | email                   | password    |
      | shailahasib@gmail.com   | cheese10    |
      | tomcruise@gmail.com     | heavensake  |
      | rosieodonnell@yahoo.com | crymeariver |
      | caressfiness@yahoo.com  | reallynow   |
      | cookiesncream@yahoo.com | yeahokay    |

  Scenario:I can scroll back to the top where the Blue Cross logo is displayed using the red arrow
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select BlueDeals
    And I scroll down the page
    When I click on the back to Top red arrow
    Then I verify that the page scrolls back to top

  Scenario:I can navigate to find travel deals on blue deals
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select BlueDeals
    When I select travel on the right column options
    Then I verify that travel deals are displayed

  Scenario:
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select BlueDeals
    And I select travel on the right column options
    And I open the location dropdown
    When I select a state
    Then it is displayed on Your Selection

  Scenario Outline:When I serach for keywords under Deals I am directed to the correct url
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select BlueDeals
    And I select all deals
    And I enter "<keyword>" in the keyword search box
    When I click GO
    Then I verify that the "<url>" is correct for current search
    Examples:
      | keyword        |url|
      | tune up        |https://www.blue365deals.com/offers?search=tune%20up&location=All|
      | pearle vision  |https://www.blue365deals.com/offers?search=pearl%20vision&location=All|
      | emindful       |https://www.blue365deals.com/offers?search=emindful&location=All|
      | inside tracker |https://www.blue365deals.com/offers?search=inside%20tracker&location=All|


  Scenario:I can see the blue mission and values when I click on about blue
    Given I am at BCBS homepage
    And I hover the mouse over Member Service and select BlueDeals
    When I click on about blue
    Then I verify that the Mission and Values are displayed
