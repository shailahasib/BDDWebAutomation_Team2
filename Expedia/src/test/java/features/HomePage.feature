Feature:
  navigate to expedia home page

  Background:
    Given I am at expedia home page
    And I click on jobs


  @smoke
  Scenario: navigate home page
    Then I verify that I am landing on jos Page

  @smoke
  Scenario:check Why Expedia Group? functionality
    When I click on Why Expedia Group?
    Then I verify the elements for Expedia Group? option dropped down

  @smoke
  Scenario:check all the functionalities of Why Expedia Group? Many Brands, One Team options
    When I click on Why Expedia Group?
    And I click on Many Brands, One Team
    Then I should be directed to Many Brands, One Team page

  @smoke
  Scenario:check all the functionalities of Why Expedia Group? We Work Everywhere options
    When I click on Why Expedia Group?
    And I click on We Work Everywhere
    Then I should be directed to We Work Everywhere page @smoke

  @smoke
  Scenario:check this page                                        We Work Everywhere
    When I click on Why Expedia Group?
    And I click on We Work Everywhere
    Then I should be directed to We Work Everywhere page @smoke

  @smoke
  Scenario:check all the functionalities of Why Expedia Group? Benefits + Perks options
    When I click on Why Expedia Group?
    And I click on Benefits + Perks
    Then I should be directed to Benefits + Perks

  @smoke
  Scenario:check career path functionality
    When I click on career path
    Then I verify the elements for The career path option dropped down

  @smoke
  Scenario:check Our culture functionality
    When I click on Our culture
    Then I verify the elements for The Our culture option dropped down

  @Smoke
  Scenario:user will be able to join our team
    When I click on Join our talent community
    And I click on Sign up using your e-mail address
    And I enter my e-mail address and password
      | emailaddress    | RiyadMahrez162@gmail.com |
      | password        | RriyadMahrez55667        |
      | confirmpassword | RriyadMahrez55667        |
    And I click on Sign Up button
    And I enter all the information about you
      | Firstname              | riyad                         |
      | Lastname               | Mahrez                        |
      | Primarymobilephone     | 9175852236                    |
      | Website                | https://riyadmMahrez12345.com |
      | Degreediploma          | Magistrate                    |
      | Universityinstitution  | Benak                         |
      | Professionalexperience | QA                            |
      | Organisationname       | Usa                           |
    And I click What career paths are you interested in
    And I click I am happy for Expedia Group to contact me
    And I click on submit button
    And I sign Out
    Then I verify that I joined to the team


  @Smoke
  Scenario:User can ba able to search the available options
    When I enter "QA" in search openings
    And I click on The Arrow logo search signe
    Then I verify the search page open

  @Smoke
  Scenario Outline:Search Jobs Functionality
    When I enter the "<searchJobName>" in search openings
    And I enter the "<searchLocation>" in location searchbox
    And I click on search logo
    And I verify "<searchResult>" as total in the search

    Examples:
      | searchJobName             | searchLocation                             | searchResult                                                                   |
      | developer                 | United States - Washington - Seattle       | 36 Results for: developer, United States - Washington - Seattle                |
      | Marketing                 | United States - New York                   | 4 Results for: marketing, United States - New York                             |
      | software engineer         | united kingdom - london                    | 14 Results for: software engineer, United Kingdom - London                     |
      | it                        | United States - Texas - Austin             | 70 Results for: it, United States - Texas - Austin                             |
      | technical product manager | United States - Washington - Seattle       | 4 Results for: technical product manager, United States - Washington - Seattle |
      | Audit                     | United States - Washington - Bellevue      | 1 Results for: audit, United States - Washington - Bellevue                    |
      | Software Tester           | United States - California - San Francisco | 0 Results for: software tester, United States - California - San Francisco     |
