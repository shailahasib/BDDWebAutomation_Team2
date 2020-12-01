Feature: Browsing Expedia Homepage

  Background:
    Given I am at Expedia home page

  Scenario Outline: From Homepage I scroll down and sign up to get a mobile App download link
    And I scroll down to the bottom of the page
    When I sign up using my phone number "<phoneNumberBox>"
    Then I verify it shows "We’ve sent you a text message with a link to download the app."
    Examples:
      | phoneNumberBox |
      | 6589584587     |
      | 5698744589     |
      | 2455698965     |
      | 2695558895     |
      | 2364523695     |

  Scenario Outline: I check the footer links
    And I scroll down to the bottom of the page to view footer
    When I click on "<linkText>"
    Then I verify the landing "<pageURL>"
    Examples:
      | linkText                            | pageURL                                                       |
      | About Expedia                       | https://www.expediagroup.com/                                 |
      | Jobs                                | https://lifeatexpediagroup.com/                               |
      | Investor Relations                  | http://ir.expediagroup.com/                                   |
      | Advertising                         | https://advertising.expedia.com/                              |
      | Newsroom                            | https://newsroom.expedia.com/                                 |
      | About Our Ads                       | https://www.expedia.com/g/pt/about-ads                        |
      | Privacy Policy                      | https://www.expedia.com/p/info-other/privacy-policy.htm       |
      | Terms of Use                        | https://www.expedia.com/p/info-other/legal.htm                |
      | Site Map                            | https://www.expedia.com/lp/b/sitemap                          |
      | Accessibility                       | https://www.expedia.com/p/info-other/web-accessibility-policy |
      | Support                             | https://www.expedia.com/service/                              |
      | Do Not Sell My Personal Information | https://www.expedia.com/dnsmpi                                |

  Scenario: I am switching the default region
    When I verify "English" is the default language
    And I change the language to "Espanol".
    Then I verify the title is "Expedia: hoteles, vuelos, renta de autos, cruceros y rentas vacacionales | Expedia"

  Scenario: I am switching the default region
    When I verify "English" is the default language
    And I change the language to "简体中文".
    Then I verify the title is "旅行预订网站：特价酒店预订，机票查询，自游行网上优惠 | Expedia.com"

  Scenario: I search for hotel stays with option to add flight
    When I Select a city to stay and select add a flight
    Then I verify I can start selecting hotels

