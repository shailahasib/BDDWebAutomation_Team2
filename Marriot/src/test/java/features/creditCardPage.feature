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