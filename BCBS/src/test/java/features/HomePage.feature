Feature: Bcsc website Functionality check
Background:
  Given I am at BcBs home page
  @SmokeTest
  Scenario:Verify Bcbs member services submenu access my benifits Page Exist
    And I move my mouse on Member services
    And I click submenu Access my benifits
Then I Verify I am at the right page by page Title


  @SmokeTest
  Scenario Outline:BcBs search box Functionality check with Valid credintial base on table
    And I click the health of america
    And I enter "<InsuranceName>" in searchBox
    When I click searchbutton
    Then I verify <"validInsuranceName"> is appear properly
    And I verify "<pageTitle>" as based on InsuranceNam
    Examples:
      | InsuranceName     | "validInsuranceName"     | pageTitle                                                            |
      | Women's Health    | "Women's Health"         |  Women's Health - The Health of America Blue Cross Blue Shield       |
      |Behavioral Health  | "Behavioral Health"      | Behavioral Health - The Health of America  Blue Cross Blue Shield    |
      | Maternal Health   | "Maternal Health"        | Maternal Health - The Health of America Blue Cross Blue Shield       |
      | Behavioral Health | "Behavioral Health"      | Behavioral Health  Blue Cross Blue Shield                            |

  @SmokeTest
  Scenario:Verify Bcbs Find a doctor  submenu outside the united doctor option working propely
    And I move my mouse on Find a doctor
    And I click submenu Find a doctor
    Then I Verify I am at the page by registion page

  @SmokeTest
  Scenario: Bcbs Access My Beneifits with invalid number
    And I click Access My benifits
    And I I enter invalid number
   When I click go
  Then I verify A pop up massage shows try again

  @SmokeTest
  Scenario: verify Bcbs the health of america searchBox with valid creditianal
    And I click the health of america
    And I I enter women's health in searchbox
   When I click searchbutton
  Then I verify this search button workng properly i am at right page

  @SmokeTest
  Scenario: Bcbs menu functionality check
    And I click the menu left of the corner
    And I select Employeyers from menu
   And I select contact us from menu
  Then I verify the function of the menu is properly okay


  @SmokeTest
 Scenario: verify Bcbs the health of america searchbox can serch and clean at a time
    And I click the health of america
    And I enter women's health in searchbox
    And I click The searchIteam
    And I enter Behavioral Health
    And I clearn the search iteam
    Then I verify its working properly

  @SmokeTest
 Scenario: verify Bcbs input box Functionality
    And I click the health of america
    And I enter women's Health in searchbox
    And I Returen Keys
    And I enter Behavioral health
    And I Returen Keys
    Then I verify its working properly


  @SmokeTest
 Scenario: Bcbs inside ndividual $ Families shop for insurance check
    And I click individual $ Families
    And I enter Valid zipcode th the box
    When I click goButton
   Then I verify a  pop up massage shows Empire Blue Cross

  @SmokeTest
  Scenario:DisMiss Alert on bcbs
    And I verify alert is dismiss propely

  @SmokeTest
  Scenario:Accept Alert on bcbs
    And I verify alert is Accept propely

  @SmokeTest
  Scenario: Bcbs Learn Page Valided
    And I click learn
   When I navigate this page
    Then I verify a Learn top right corner of the page

  @SmokeTest
  Scenario: inside HEALTHOFAMERICA.COM findout data$ reports
    And I click HEALTHOFAMERICA.COM
    And I click data$Reports
    Then I findout the page
    And I verify the page by pageTitle

  @SmokeTest
  Scenario: Bcbs Find Contact us
    And I click Contact us
    When I navigate to the page
   And I scroll down
    And I notice visit Member  service
    And I click Visit member services
    And I verify iam succesfully navigate to the page

  @SmokeTest
  Scenario: vlided searchbox using wait
    And I click  Thehealth of America
    And I enter mentalhealth health in Searchbox
    And  I want to wait until is click
    And I click The Searchbutton
  @SmokeTest
  Scenario: vlided searchbox using wait
    And I click  Thehealth of America
    And I enter mentalhealth health in Searchbox
    And  I want to wait until is vasible
@Test
    Scenario: Bcbs privacy policy page should be all th way down
    And I Scroll down the home page
  When I come to the down of the page
Then I verify  privacy policy option exit in the page
