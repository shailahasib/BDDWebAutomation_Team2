Feature: Phones and Devices can be filtered, sorted and then added to cart

  Scenario: I can open the page that displays accessories using the phones&devices on header
    Given I am on T-Mobile home page
    And I hover over the Phones and devices
    And I wait for the popup offer to appear
    And I dismiss the popup offer
    When I select Accessories
    Then I validate that accessories are displayed on page

  Scenario: I can add an item to cart and then view cart
    Given I am on T-Mobile home page
    And I hover over the Phones and devices
    And I wait for the popup offer to appear
    And I dismiss the popup offer
    And I select Accessories
    And I select sync up pet bands
    And I add the item to cart
    When I click on check out as a guest
    Then I verify that I have landed on the review cart page

  Scenario: I can save items to purchase in store
    Given I am on T-Mobile home page
    And I hover over the Phones and devices
    And I wait for the popup offer to appear
    And I dismiss the popup offer
    And I select Accessories
    And I select sync up pet bands
    And I add the item to cart
    And I click on check out as a guest
    And I start checkout
    And I select complete in store
    And I enter my first name
    And I enter my last name
    And I enter my email
    And I enter my phone number
    And I enter my zipcode

  Scenario Outline: I can search products on the search bar
    Given I am on T-Mobile home page
    And I search for a "<product>"
    When I hit enter on the keyboard
    Then I validate that the correct product is displayed

    Examples:
      | product     |
      | iphone      |
      | samsung     |
      | charger     |
      | iphone case |
      | airpods     |


  Scenario: I can select smart watches from the phones and devices menu
    Given I am on T-Mobile home page
    And I hover over the Phones and devices
    And I wait for the popup offer to appear
    And I dismiss the popup offer
    When I select smart watches
    Then I validate that accessories are displayed on page


  Scenario:Find all the broken links on the home page using iteration of a tags
    Given I am on T-Mobile home page
    When I run a test to find all broken links

  Scenario: I can see my cart total after adding a product to cart
    Given I am on T-Mobile home page
    And I hover over the Phones and devices
    And I wait for the popup offer to appear
    And I dismiss the popup offer
    And I select Accessories
    And I select sync up pet bands
    And I add the item to cart
    When I click on check out as a guest
    Then I verify that I can see the cart total

  Scenario: I can view monthly payment options in the cart
    Given I am on T-Mobile home page
    And I hover over the Phones and devices
    And I wait for the popup offer to appear
    And I dismiss the popup offer
    And I select Accessories
    And I select sync up pet bands
    And I add the item to cart
    When I click on check out as a guest
    Then I verify that the monthly payment option is available

  Scenario: I can view monthly payment options in the cart
    Given I am on T-Mobile home page
    And I hover over the Phones and devices
    And I wait for the popup offer to appear
    And I dismiss the popup offer
    And I select Accessories
    And I select sync up pet bands
    And I add the item to cart
    And I click on check out as a guest
    When I click on remove on the item container
    Then I verify that item has been removed and the cart is empty with message to add

  Scenario Outline: When I enter various different invalid usernames I receive error message
    Given I am on T-Mobile home page
    And I hover over the Phones and devices
    And I wait for the popup offer to appear
    And I dismiss the popup offer
    And I click user icon
    And I select pay a bill
    And I enter an invalid "<username>"
    When I click next
    Then I verify that the error message is displayed
    Examples:
      | username  |
      | shaila290 |
      | shahasib3 |
      | hakim567  |
      | alaDdin90 |
      | yamina123 |


