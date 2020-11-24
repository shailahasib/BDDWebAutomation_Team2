Feature:
  We want be able to navigate to employee page, and the employees can register fro benefits,
  and the employee will be able to try Blue365 for Employers Demo.
  The employee be able watch the video How Blue365 Works

  Background:
    Given I am at BCBS home page.
    And I use the mouse over Member Services.
    And I click on Visit Blue Benefits.

  @Employee
  Scenario:How Blue 365 work functionality
    When I click on about Blue365
    And I click on how Blue365 works
    Then I verify How it Works
#
  @Employee
  Scenario:Employees register for an upcoming demo
    And I click for employers button
    And I click on register for a demo
    When I enter my information in the field
      | Firstname    | Riyad                    |
      | Lastname     | Mahrez                   |
      | emailaddress | Riyadmahreztop@gmail.com |
      | companyname  | Man City                 |
      | jobtitile    | Footbbaleur              |
    And I enter number of employees
    And I Select BCBS Plan
    And I select Webinar Dates
    And I click on I agree to the policy
    And I participate in Amazon gift cart
    And I click on register button
    Then I verify my registration

  @Employee
  Scenario:employee will be able to try Blue365 for Employers Demo.
    And I click for employers button
    When I Scroll down to how Blue365 works
    And i click on the video
    Then I should be able to see the video playing