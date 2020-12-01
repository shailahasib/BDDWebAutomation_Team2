Feature:
  users should be able yo login and logout ,
  users are able to use the chatBox to communicate with robot functions

  Background:
    Given I am at T-Mobile home page
    And I click on TV link

  @TestTV
  Scenario: Navigate to Tv home page .
    Then I verify IAm landing on Tv Home Page

  @TestTV
  Scenario Outline: Login using invalid email and invalid password with T-Mobile account
    When I click on My account link
    And I click on login button
    And I enter invalid "<Email>"
    And I click on next button
    And I enter invalid "<Password>"
    And I click on login Button
    Then I should see login failed "<tryagain>"
    Examples:
      | Email                      | Password    | tryagain                                                           |
      | RiyadMahrez1@gmail.com     | Mahrez12345 | The login information you provided is incorrect. Please try again. |
      | RiyadMahrez12345@gmail.com | Mahrez0000  | The login information you provided is incorrect. Please try again. |
      | RiyadMahrez4565@gmail.com  | Mahrez1000  | The login information you provided is incorrect. Please try again. |

  @TestTV
  Scenario: check the functionality of chatbox
    When I click Ask an expert
    Then I verify the chatbox popup will open

  @TestTV
  Scenario: send a test in the chat box and close it
    When I click Ask an expert
    And I enter a question in the chat box "Hello"
    And I click enter on the Keyboard
    Then I verify the automated message back from an expert
