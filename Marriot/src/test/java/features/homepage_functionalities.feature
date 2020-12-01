Feature:
  - The user should be able to navigate to Meetings and Events Overview,
  - when the user is on the meeting and events home page they should be able to navigate back to
  Marriott home page default .
  -The user can be able to check special offers
  -The user can be able to Browser in vacation options
  -The user can be able to See our Brands

  Background:
    Given I am on the marriott home page
    When I click on Meeting and Events link

  @HomePage
  Scenario: Navigate to Meeting and Events Home Page
    Then I should be landed on the Meeting and Events home page
#
#  @HomePage
#  Scenario: Navigate Back to Marriott home page default .
#    And I click on Marriott BONVoY Logo
#    Then I verify the table shows up and be able to use it
#
#  @HomePage
#  Scenario: Chek the functionality of Find And Reserve
#    And  I click on Find And Reserve
#    Then I verify  Find And Reserve the table shows up and be able to use it
#
#  @HomePage
#  Scenario: Chek the functionality of Special offers
#    And  I click on Special offers
#    Then I verify the Special offers table shows up and be able to use it
#
#  @HomePage
#  Scenario: Chek the functionality of Vacations
#    And  I click on Vacations
#    Then I verify the Vacations table shows up and be able to use it
#
#  @HomePage
#  Scenario: Chek the functionality of Our Brands
#    And  I click on Our Brands
#    Then I verify the Our Brands table shows up and be able to use it
#
#  @HomePage
#  Scenario: Chek the functionality of Our Credit cards
#    And  I click on Our Credit cards
#    Then I verify that I can go the to Our Credit cards page
#
#  @HomePage
#  Scenario: Chek the functionality of About Marriott Bonvoy
#    And  I click on About Marriott Bonvoy
#    Then I verify the About Marriott Bonvoy table shows up and be able to use it
