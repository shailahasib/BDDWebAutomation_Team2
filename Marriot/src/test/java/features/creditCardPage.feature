Feature: I am at the credit cards page and browsing different types of cards
  I am changing the language from header options
  I am trying to access "My trips" part
  I am trying to sign-in
  I am trying to Join

  Background:
    Given I am at the credit cards page

  Scenario Outline: I change the language of the Site to Portugues
    When I change the language to "<languageTitle>"
    Then I verify the page Header Title is "<verifyHeaderText>"
    And the homepage is "<verifyCorrespondingURL>"
    Examples:
      | languageTitle | verifyHeaderText         | verifyCorrespondingURL                      |
      | Espanol       | DESCUBRA NUESTRAS MARCAS | https://www.espanol.marriott.com/default.mi |
      | Francais      | DÉCOUVREZ NOS ENSEIGNES  | https://www.marriott.fr/default.mi          |
      | Portugues     | CONHEÇA NOSSAS MARCAS    | https://www.marriott.com.br/default.mi      |

  Scenario Outline: Check Convid-19 Special offers
    When banner is visible I click "<specialTab>"
    Then I verify the special page Title is "<verifyTitle>"
    And the special homepage is "<verifyCorrespondingURL>"
    Examples:
      | specialTab            | verifyTitle                                     | verifyCorrespondingURL                           |
      | Best Rate Guarantee   | Marriott Cleanliness Council \| Marriott Bonvoy | https://clean.marriott.com/#bestrate             |
      | Flexible Cancellation | Marriott Cleanliness Council \| Marriott Bonvoy | https://clean.marriott.com/#flexiblecancellation |
      | Commitment to Clean   | Marriott Cleanliness Council \| Marriott Bonvoy | https://clean.marriott.com/                      |
      | Contactless Services  | Marriott Cleanliness Council \| Marriott Bonvoy | https://clean.marriott.com/#service              |


  Scenario Outline: Sign in to user account
    When I click on the "Sign In or Join" button from header
    And I enter a set of est "<email>" address and "<password>" and click Sign in
    Then the url is "https://www.marriott.com/sign-in-error.mi?transaction=login"
    Examples:
      | email                          | password      |
      | anotheremailset@gmail.com      | testPassword1 |
      | anotheremailtwoset@gmail.com   | testPassword1 |
      | anotheremailthreeset@gmail.com | testPassword1 |
      | anotheremailfourset@gmail.com  | testPassword1 |
      | anotheremailfiveset@gmail.com  | testPassword1 |

  Scenario Outline: I click "Find & Reserve" and browse the options
    When I click on "Find & Reserve" drop down
    And I Type in my "<destination>" for "<month>" on "<date>"
    And I click on "Find Hotels"
    Then I reach "https://www.marriott.com/search/findHotels.mi" with results
    Examples:
      | destination                         | month         | date |
      | Brooklyn, NY, USA                   | FEBRUARY 2021 | 25   |
      | Hamburg, Germany                    | MARCH 2021    | 12   |
      | Delhi Gate, Daryaganj, Delhi, India | APRIL 2021    | 18   |
      | San Francisco, CA, USA              | JUNE 2021     | 23   |

  Scenario: I look into "Marriott Bonvoy Boundless™ Credit Card from Chase"
    When I click "Marriott Bonvoy Boundless™ Credit Card from Chase" Learn more
    Then I verify it opens up into a new tab titled "Marriott Bonvoy Boundless™ Credit Card from Chase"
    And I veritfy the card is offering "75,000 BONUS POINTS" points for initial signup

  Scenario: I checkout the mobile app page
    When I click on "Learn More" on the footer banner for App
    And I click on "Mobile Key" on the header link
    Then I verify page scrolled down to "Mobile Key" view

  Scenario Outline: I lookup a trip itenerary from "My trip"
    When I navigate to "My Trip" and the pop-up opens
    And I enter user information "<confirmationNo>","<checkInMonthYear>", "<checkInDate>","<FirstName>","<LastName>"
    Then I am redirected to a page with appropriate error message "Reservation not found"
    And I validate the title of the page is "Upcoming Reservations Confirmation #"
    Examples:
      | confirmationNo | checkInMonthYear | checkInDate | FirstName | LastName     |
      | LMN3SFF312341  | December 2020    | 23          | Joseph    | Robinet      |
      | J23A2I9233021  | December 2020    | 13          | Emile     | Hoosier      |
      | 12341FGDEWQF1  | January 2021     | 11          | Chris     | Dickens      |
      | I12341H1231S2  | February 2021    | 24          | Holly     | Smith        |
      | R45W41H1231S2  | February 2021    | 16          | Rebecca   | Winemouth    |
      | I1234567G31S2  | March 2021       | 19          | Menuson   | Davenport    |
      | I1234SFXXV1S2  | February 2021    | 24          | Lilly     | Cunninlingus |