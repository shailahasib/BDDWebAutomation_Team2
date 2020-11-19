Feature: Expedia Website Functionality check
 Background:
   Given I am at Expedia home page

   Scenario: Varify expedia search box functionality
     And I click expedia searchbox
     And I enter location
    When I hit on search button
   Then I verify to the page title i am at right page