Feature: Expedia Website Functionality check
 Background:
   Given I am at Expedia home page

@SmokeTest
   Scenario: Varify expedia search box functionality
     And I click expedia searchbox
     And I enter location
    When I hit on search button
   Then I verify to the page title i am at right page


  @Test
   Scenario: Varify expedia Flight search  functionality
     And I click expedia Flight
     And I Select one way
   And I enter my location  from where im leaving
    And I click going box
    And I enter where i want to go
    And I Click Departing
    And I select date from calander
    And I Click Done button on calender
    When I hit on search button
    Then I verify lots of flights are avalable in the page
  @Test
    Scenario: Varify expedia Flight calaender functionality working as  expected
      And I click expedia Flight
      And I Click Departing
      And I select date from calander
      And I Click Done button on calender
      When I hit on search button