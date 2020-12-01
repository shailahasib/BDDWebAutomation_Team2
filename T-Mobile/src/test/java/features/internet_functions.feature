Feature:
  Navigate to home internet functionalities with T-Mobile
  user can see why we do it function , and see our coverage
  user can share customer stories and see the feedback
  check availability

  Background:
    Given I in T-mobile home page
    And I click on Internet link

  @TestInternet
  Scenario: Navigate to Internet home page .
    Then I verify T-Mobile Home Internet Page is opened

  @TestInternet
  Scenario: purchase T-Mobile Home Internet
    When I entre my personal information
      | FirstName | Riyad                    |
      | LastName  | Mahrez                   |
      | Email     | RiyadMahrez123@gmail.com |
      | Zip       | 02176                    |
    And I select My wireless phone number
    And I enter My phone Number "1582276659"
    And I click on submit button
    Then I verify the signing Up for 5G Home Internet

  @TestInternet
  Scenario: visit the page of Why we do it In internet page .
    When I click on WHY WE DO IT link
    Then I should be directed to the page of WHY WE DO IT

  @TestInternet
  Scenario: 5G coverage Network in Why we do it.
    When I click on WHY WE DO IT link
    And I click on Explore Our network
    And I slide to see the comparison 5G coverage
    Then I verify the slider functionalities  for the coverage

  @TestInternet
  Scenario: watch the videos in 5G coverage Network page
    When I click on WHY WE DO IT link
    And I click on Explore Our network
    And I click on the video Making 5G a reality for all.
    Then I verify the the video will play

  @TestInternet
  Scenario: visit the page of customer stories in internet page .
    When I click on customer stories link
    Then I should be directed to the page of customer stories

  @TestInternet
  Scenario: visit the page of support in internet page .
    When I click on support link
    Then I should be directed to the page of support

  @TestInternet
  Scenario: check availability function
    When I click on check availability link
    And I enter Mobile Phone Number And Home address
      | phonenumber | 5016569852                      |
      | homeaddress | 45 DAY ST, SOMERVILLE, MA 02144 |
    And I click on next Check availability
    And I enter more information
      | firstname    | Lionel  |
      | lastname     |  Messi|
      | emailAddress |  LioMessi125@gmail.com|
    And I select on For new costumer only
    And I click on Submit
    Then I verify the availability of my new account
