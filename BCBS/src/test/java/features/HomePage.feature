Feature: User is able to use all functions of the BCBS Homepage

  Background:
    Given User is at the home page

  Scenario: User is able to access the contact us from header
    When User clicks on Contact us
    Then User is redirected to Contact Us page
    And User verfiyies the customer call center phone number

  Scenario Outline: User is able use the search functionality
    When user enters "<searchCriteria>" in the search box and presses Enter
    Then user is on a page with appropriate "<pageLink>" page
    And user can clear the search box and search for another topic
    Examples:
      | searchCriteria     | pageLink                                           |
      | Breast Cancer      | https://www.bcbs.com/search/Breast%20Cancer        |
      | Mental Health      | https://www.bcbs.com/search/Mental%20Health        |
      | New insurance Card | https://www.bcbs.com/search/New%20insurance%20Card |

  Scenario Outline: User browses The Health of America page
    When user clicks on Health of America Button
    Then user is on a page with appropriate "<pageLink>" page
    And user verifies the page "<pageTitle>"
    Examples:
      | pageLink                                   | pageTitle                                       |
      | https://www.bcbs.com/the-health-of-america | The Health of America \| Blue Cross Blue Shield |

  Scenario Outline: User browses Member services page
    When user clicks on Member services Button
    Then user is on a page with appropriate "<pageLink>" link
    And user verifies the page "<pageTitle>"
    Examples:
      | pageLink                             | pageTitle                                 |
      | https://www.bcbs.com/member-services | Member Services \| Blue Cross Blue Shield |

  Scenario Outline: User searches for local BCBS branch to issue card
    When user clicks on Member services Button
    And user clicks on - I don't have my member ID Card
    And user inputs zipcode "<zipcode>"
    And user clicks go
    Then User verifies the message header says "<assertMessages>"
    Examples:
      | zipcode | assertMessages                                                                          |
      | 49120   | The following Blue Cross and Blue Shield companies serve members in the 49120 zip code. |
      | 90013   | The following Blue Cross and Blue Shield companies serve members in the 90013 zip code. |
      | 11201   | The following Blue Cross and Blue Shield companies serve members in the 11201 zip code. |
      | 75001   | The following Blue Cross and Blue Shield companies serve members in the 75001 zip code. |

  @Logo
  Scenario: User clicks the BCBS Logo on the top left to return to "health of america" page
    When user clicks on Health of America Button
    And  user scroll down to the bottom of the page
    And user clicks on BCBS Health Index Map
    And user clicks on the BCBS logo at the top left
    Then user is redirected back to page with link : "https://www.bcbs.com/the-health-of-america"
    And user also verifies the page title is "The Health of America | Blue Cross Blue Shield"

  @Logo
  Scenario: Clicking the logo on contact-us page will redirect to homepage
    When user scroll down to the bottom of the page
    And user clicks on contact-us
    And user clicks on the BCBS logo at the top left
    Then user is redirected back to page with link : "https://www.bcbs.com/"
    And user also verifies the page title is "Blue Cross Blue Shield"

  Scenario Outline: Use Find a doctor to search for doctors in the USA
    When user clicks on Find A doctor
    And user clicks to find a doctors in the US
    And user click on choose a location and plan
    And user puts a "<zipcode>" and clicks on - Yes, this is correct button
    And user choses plans with prefix
    And user clicks continue
    Then user verifies page title is "Search homepage"
    Examples:
      | zipcode |
      | 49120   |
      | 90001   |
      | 11208   |

  Scenario Outline: I click "Access My benefits" and check out the benefits offered per Prefix provided
    When I enter my provided "<prefix>"
    Then I verify that I am at the "<expectedURL>"
    Examples:
      | prefix | expectedURL                                                             |
      | PHP    | https://www.anthem.com/individual-and-family/health-insurance/georgia/  |
      | QAE    | https://www.anthem.com/individual-and-family/health-insurance/georgia/  |
      | BLM    | https://www.floridablue.com/                                            |
      | BLK    | https://www.anthem.com/individual-and-family/health-insurance/ohio/     |
      | MNN    | https://www.highmarkbcbs.com/home/                                      |
      | QAF    | https://www.anthem.com/individual-and-family/health-insurance/colorado/ |

