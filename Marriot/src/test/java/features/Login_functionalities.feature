Feature:
  user should be able to login from Meeting and event page

  Background:
    Given I am on the marriott home page
    And I click on Meeting and Events link

  @HomePage
  Scenario: Navigate to Meeting and Events Home Page
    Then I should be landed on the Meeting and Events home page
  @HomePage
  Scenario: Sign in or join to Marriott Meeting and Event
    When I click on sign in or join
    And I click on Join  now
    And I enter my data in the required filed
      | firstname       | Riyad                    |
      | lastname        | Mahrez                   |
      | PostalCode      | 03060                    |
      | Email           | RiyadMahrez123@gmail.com |
      | Password        | RiyAadMahrezM124         |
      | ConfirmPassword | RiyAadMahrezM124         |
    And I click on Join button
    Then I verify login to My profile

  @HomePage
  Scenario: Look up a reservation with invalid Confirmation NUmber
    When I click on My trip
    And I complete the form with my info
      | ConfirmationNumber | 03060 |
      | FirsName           | Riyad |
      | LastName           | Riyad |
    And I click on Find button
    Then I verify error message reservation not found

  @HomePage
  Scenario Outline: :Be able to change language
    When I click on The current language(English)
    And I select different option for "<language>"
    Then I verify the "<language Selected>"
    Examples:
      | language  | language Selected                            |
      | Deutsch   | https://www.marriott./default.mi             |
      | Español   | https://www.espanol.marriott.com/default.mii |
      | Français  | https://www.marriott.com.fr/default.mi       |
      | Italiano  | https://www.marriott.it/default.mi           |
      | Русский   | https://www.marriott.com.ru/default.mi       |
      | Português | https://www.marriott.pt/default.mi           |

  @HomePage
  Scenario: Book a meeting for business purposes
    When I set the information for the event
      | destination | NYC, NY, USA |
      | guestroom   | 3            |
      | eventspace  | 12           |
#    And I enter the date
    And I enter the Event type
    And I click on Find reservation button
    Then I verify the result of booking events

