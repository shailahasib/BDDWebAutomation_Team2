Feature: User Explores Expedia Homepage

  Scenario Outline:
    Given user is at expedia homepage
    And Whatever this needs to be
    When user verifies the homepage URL is "https://www.expedia.com/"
    Then the cucumber finds it path
    Examples:

