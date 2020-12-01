Feature: Bcsc website Functionality check

  Background:
    Given I am at BcBs home page
  @Test
  Scenario:Verify Bcbs member services submenu access my benifits Page Exist
    And I move my mouse on Member services
    And I click submenu Access my benifits
    Then I Verify I am at the right page by page Title
  @Test
  Scenario Outline:BcBs search box Functionality check with Valid credintial base on table
    And I click the health of america
    And I enter "<InsuranceName>" in searchBox
    When I click searchbutton
    Examples:
      | InsuranceName     |
      | Women's Health    |
      | Behavioral Health |
      | Maternal Health   |
      | Behavioral Health |
  @Test
  Scenario:Verify Bcbs Find a doctor  submenu outside the united doctor option working propely
    And I move my mouse on Find a doctor
    And I click submenu Find a doctor
    Then I Verify I am at the page by registion page
  @Test
  Scenario: Bcbs Access My Beneifits with invalid number
    And I click Access My benifits
    And I I enter invalid number
    When I click go
    Then I verify A pop up massage shows try again
  @Test
  Scenario: verify Bcbs the health of america searchBox with valid creditianal
    And I click the health of america
    And I I enter women's health in searchbox
    When I click searchbutton
    Then I verify this search button workng properly i am at right page
  @Test
  Scenario: Bcbs menu functionality check
    And I click the menu left of the corner
    And I select Employeyers from menu
    And I select contact us from menu
    Then I verify the function of the menu is properly okay
  @Test
  Scenario: verify Bcbs the health of america searchbox can serch and clean at a time
    And I click the health of america
    And I enter women's health in searchbox
    And I click The searchIteam
    And I enter Behavioral Health
    And I clearn the search iteam
    Then I verify its working properly
  @Test
  Scenario: verify Bcbs input box Functionality
    And I click the health of america
    And I enter women's Health in searchbox
    And I Returen Keys
    And I enter Behavioral health
    And I Returen Keys
    Then I verify its working properly
  @Test
  Scenario: Bcbs inside ndividual $ Families shop for insurance check
    And I click individual $ Families
    And I enter Valid zipcode th the box
    When I click goButton
    Then I verify a  pop up massage shows Empire Blue Cross
  @Test
  Scenario:DisMiss Alert on bcbs
    And I verify alert is dismiss propely
  @Test
  Scenario:Accept Alert on bcbs
    And I verify alert is Accept propely
  @Test
  Scenario: Bcbs Learn Page Valided
    And I click learn
    When I navigate this page
    Then I verify a Learn top right corner of the page
  @Test
  Scenario: inside HEALTHOFAMERICA.COM findout data$ reports
    And I click HEALTHOFAMERICA.COM
    And I click data$Reports
    Then I findout the page
    And I verify the page by pageTitle
  @Test
  Scenario: Bcbs Find Contact us
    And I click Contact us
    When I navigate to the page
    And I scroll down
    And I notice visit Member  service
    And I click Visit member services
    And I verify iam succesfully navigate to the page
  @Test
  Scenario: vlided searchbox using wait
    And I click  Thehealth of America
    And I enter mentalhealth health in Searchbox
    And  I want to wait until is click
    And I click The Searchbutton
  @Test
  Scenario: vlided searchbox using wait
    And I click  Thehealth of America
    And I enter mentalhealth health in Searchbox
    And  I want to wait until is vasible
  @Test
  Scenario: Bcbs privacy policy page should be all th way down
    And I Scroll down the home page
    When I come to the down of the page
    Then I verify  privacy policy option exit in the page
  @Test
  Scenario Outline:BcBs Find the health insurance optiop check with Valid and invalided credintial base on table
    And I click the   on individualas $ familes
    And I enter "<ZipCode>" in enter your Zip code box
    And I click "<stateName>" in the choose state box
    Examples:
      | ZipCode | stateName  |
      | 11427   | chosestate |
      | 11527   | chosestate |
      | 11528   | chosestate |
      | 115279  | chosestate |
      | 115273  | chosestate |
