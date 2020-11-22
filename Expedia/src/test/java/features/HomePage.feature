Feature: Expedia Website Functionality check
 Background:
   Given I am at Expedia home page

@SmokeTest
   Scenario: Varify expedia search box functionality
     And I click expedia searchbox
     And I enter location
    When I hit on search button
   Then I verify to the page title i am at right page


  @SmokeTest
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
  @SmokeTest
    Scenario: Varify expedia Flight calaender functionality working as  expected
      And I click expedia Flight
      And I Click Departing
      And I select date from calander
      And I Click Done button on calender
      When I hit on search button

  @SmokeTest
    Scenario: Varify expedia cars service is working propely
      And I click cars on expedia
#      And I Click pick up box
      And I enter my location
    And I sleect my location in box
    When I click search
  Then I verify im on right page


  @Test
    Scenario: Varify expedia build a package
      And I click cars on expedia build a package
#    Then I verify Its clicking properly

     @Test
    Scenario: Varify expedia Things to do function working proerly
      And I click Things to do
    And  I click things to do box
       And I select the location
       When I click search button
       Then I verify its working properly

