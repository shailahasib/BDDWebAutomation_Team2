Feature: Expedia HomePage Functionality check with DataTable example


#  DataTable
@TestDataTable
  Scenario: Expedia CreateAccount
    Given I am at Expedia Home Page
    And I click on sign in
    And I click on Create a free Account
    And I enter user information
      | celina               |
      | IG               |
      | nassmak22@outlook.fr |
      | Algeria20            |
    And I click on Radio Button
    When I click on sign up Button
    Then I verify expedia account created successfully


#  Sign In
  @TestDataTable
  Scenario: Expedia SignIn
    Given I am at Expedia Home Page
    And I click on sign in
    And I click Sign In
    And I enter user information to log in
      | nassmak22@outlook.fr |
      | Algeria20            |
    And I click on Radio Button keep me sign in
    When I click on sign in Button



#    I have captcha after When


