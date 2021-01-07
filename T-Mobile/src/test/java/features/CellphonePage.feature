Feature: I am opened the cellphones page and browsing phones for purchase

  Background:
    Given I am at the cellphone page

  Scenario: I try to find broken links
    When I refresh the page
    Then I try to find broken links
    And I verify the URL is "https://www.t-mobile.com/cell-phones"

  Scenario: I try to login to TMobile's members area
    When I login with invalid credential
    Then I verify the webApp does not let me in
    But gives me another chance to login with valid credentials

  Scenario Outline: I sort the cellphones based on prices
    When I sort the cellphones based on "<sortFeature>"
    Then I verify the webpage is showing results "<featuredURL>"
    Examples:
      | sortFeature       | featuredURL                                              |
      | Price Low To High | https://www.t-mobile.com/cell-phones?sort=priceLowToHigh |
      | Price High To Low | https://www.t-mobile.com/cell-phones?sort=priceHighToLow |
      | Highest Rating    | https://www.t-mobile.com/cell-phones?sort=rating         |

  Scenario Outline: I try to chat with the virtual agent
    When I say "<chatMessage>" to the virtual agent
    Then I verify it replies to me
    Examples:
      | chatMessage                |
      | I need a new phone         |
      | Hello Roboto               |
      | How is the weather?        |
      | Where is the nearest store |

  Scenario Outline: I filter the cellphones based on Deals type
    When I select "<deal>"
    Then I verify the results are as expected as "<deal>" filter
    And the "<URL>" corresponds to the query
    Examples:
      | deal          | URL                                                      |
      | NEW           | https://www.t-mobile.com/cell-phones/deals/new           |
      | ON SALE       | https://www.t-mobile.com/cell-phones/deals/on-sale       |
      | SPECIAL OFFER | https://www.t-mobile.com/cell-phones/deals/special-offer |

  Scenario Outline: I only want to see 5G Phones
    When I select "<networkSpeed>" from Filters
    Then I verify the URL is "<expectedURL>"
    Examples:
      | networkSpeed | expectedURL                                         |
      | 5G           | https://www.t-mobile.com/cell-phones/network/5g     |
      | 4G LTE       | https://www.t-mobile.com/cell-phones/network/4g-lte |
      | 4G           | https://www.t-mobile.com/cell-phones/network/4g     |

  Scenario: I goto the social links from footer area
    When I scroll down and click on "Instagram" Icon
    Then I land on Tmobiles Instagram profile on "https://www.instagram.com/tmobile/"

  Scenario: I visit Careers section from the footer area
    When I goto the careers tab from the footer area
    Then I verify the title of the landing page is "Careers | Join the Un-carrier Today | T-Mobile"
    And I verify the URL is "https://www.t-mobile.com/careers"

  Scenario Outline: I look for different open positions in the company
    When I am browsing for "<openPositions>" in the "<areaZipcode>"
    Then I very corresponding results as "<openPositions>" and "<areaZipcode>" are filled in
    Examples:
      | openPositions        | areaZipcode |
      | Mobile Associate     | 11219       |
      | Mobile Associate     | 60657       |
      | Retail Store Manager | 11218       |
      | Retail Store Manager | 60607       |

  Scenario Outline: I check out financing options for cellphones
    When I browse the financing options page
    And I enter my "<firstName>" "<lastName>" "<emailAddress>" "<streetAddress>" "<zipcode>" "<DOB>" "<SSN>"
    Then I verify the error message "Unfortunately, we weren't able to personalize your device payment amounts."
    And I verify the URL is "https://www.t-mobile.com/pre-screen/no-offer-hcc"
    Examples:
      | firstName | lastName | emailAddress                 | streetAddress   | zipcode | DOB        | SSN  |
      | Jambu     | Bhai     | jBhai@testemail.com          | Bari khali Road | 11218   | 02/03/1987 | 4586 |
      | Leo       | Nantu    | kemneParo@testemail.com      | Bari khali Road | 49223   | 02/03/1987 | 4586 |
      | Stephen   | Kabil    | daberpani@testemail.com      | Bari khali Road | 46123   | 02/03/1987 | 4586 |
      | Emelta    | Babu     | keboleamipagol@testemail.com | Bari khali Road | 69699   | 02/03/1987 | 1256 |
      | Shaiba    | Ali      | kochupatarpani@testemail.com | Bari khali Road | 46123   | 02/03/1987 | 4586 |

