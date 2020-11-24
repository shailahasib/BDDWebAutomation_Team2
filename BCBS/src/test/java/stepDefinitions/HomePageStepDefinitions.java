package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static home.HomePageWebElements.emptySearchBoxLocator;

public class HomePageStepDefinitions extends WebAPI {
    static HomePage homePage;

    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    String expectedResult;

    @Given("I am at BCBS home page")
    public void iAmAtBCBSHomePage() throws IOException {
        openBrowser("https://www.bcbs.com/");


    }

    @And("I use the mouse over Member Services")
    public void iUseTheMouseOverMemberServices() {
        homePage.navigateToBlue365HomePage();
    }

    @When("I click on Visit Blue Benefits")
    public void iClickOnVisitBlueBenefits() {
        homePage.clickOnVisit();
    }

    @Then("I will verify that i\"m landing on the Blue Benefits Home page")
    public void iWillVerifyThatIMLandingOnTheBlueBenefitsHomePage() throws Throwable {
        homePage.validateVisitBlueBenefitPage();
    }

    @When("I click on the search button")
    public void iClickOnTheSearchButton() throws InterruptedException {
        homePage.clickOnSearchButtons();
    }

    @Then("I will verify the result message with empty searchbox")
    public void iWillVerifyTheResultMessageWithEmptySearchbox() throws InterruptedException {
        homePage.validateEmptySearchBoxElement();
    }

    @Then("I will verify the result message with valid value")
    public void iWillVerifyTheResultMessageWithValidValue() throws InterruptedException {
        homePage.validateSearchBoxWithValidValue();
    }

    @And("I enter the empty {string} searchbox")
    public void iEnterTheEmptySearchbox(String empty) {
        homePage.emptySearchBoxElement("");
    }

    @And("I enter the value {string} int the searchbox")
    public void iEnterTheValueIntTheSearchbox(String value) {
        homePage.SearchBoxElementSports("Sports");
    }

    @And("I enter the  character {string} int the searchbox")
    public void iEnterTheCharacterIntTheSearchbox(String character) {
        homePage.SearchBoxElementSports("??..,.");
    }

    @Then("I will verify the result message with character value")
    public void iWillVerifyTheResultMessageWithCharacterValue() throws InterruptedException {
        homePage.validateSearchBoxWithCharacters();
    }

    @And("I click on All deals")
    public void iClickOnAllDeals() throws InterruptedException {
        homePage.allDealsElements();
    }

    @And("I search for Fitness category")
    public void iSearchForFitnessCategory() throws InterruptedException {
        homePage.clickFitnessElement();
    }

    @When("I click on Visit blue Benefit")
    public void iClickOnVisitBlueBenefit() {
        homePage.VisitBlue365();
    }


    @And("I scroll down the page")
    public void iScrollDownThePage() throws InterruptedException {
        homePage.scrollDownElement();
    }

    @And("I click on go up the page")
    public void iClickOnGoUpThePage() throws InterruptedException {
        homePage.scrollUpElement();
    }


    @Then("I will verify the result of scrolling down and clicking up")
    public void iWillVerifyTheResultOfScrollingDownAndClickingUp() throws InterruptedException {
        homePage.validateScrollDownElement();
    }

    @And("I click on check eligibility")
    public void iClickOnCheckEligibility() {
        homePage.checkEligibilityElements();
    }


    @And("I click on Check your eligibility continue button")
    public void iClickOnCheckYourEligibilityContinueButton() {
        homePage.clickOnSubmitCheckElements();
    }

    @Then("I should be directed to the information page to continue")
    public void iShouldBeDirectedToTheInformationPageToContinue() throws InterruptedException {
        homePage.validateCheckEligibility();
    }

    @And("I enter 3-digit ID card prefix {string}")
    public void iEnterDigitIDCardPrefix(String IDNum) {
        homePage.sendIdNUmElement(IDNum);
    }

    @And("I click on join")
    public void iClickOnJoin() {
        homePage.clickOnJoinElements();
    }

    @And("I enter 3-digit characters in your member ID card{string}")
    public void iEnterDigitCharactersInYourMemberIDCard(String characters) {
        homePage.enter3DigitElements(characters);
    }

    @And("I click on Check your eligibility")
    public void iClickOnCheckYourEligibility() throws InterruptedException {
        homePage.clickOnCheckEligibilityElements();
    }

    @And("I enter my information")
    public void iEnterMyInformation(List<List<String>> table) throws InterruptedException {
        sleepFor(8);
        Map<String, String> mapTable = Users.TableDictionaryConverter(table);
        homePage.sendKey(homePage.sendFirstName, mapTable.get("firstname"));
        homePage.sendKey(homePage.sendLastName, mapTable.get("lastname"));
        homePage.sendKey(homePage.email, mapTable.get("email"));
        homePage.sendKey(homePage.zipCode, mapTable.get("zipcode"));
    }

    @And("I selectPlan")
    public void iSelectPlan() throws InterruptedException {
        homePage.selectPlanElements();
    }

    public static class Users {
        public static synchronized Map<String, String> TableDictionaryConverter(List<List<String>> data) {
            Map<String, String> mapTable = new HashMap<String, String>();
            for (List<String> rows : data) {

                mapTable.put(rows.get(0), rows.get(1));
            }
            return mapTable;
        }
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() throws InterruptedException {
        homePage.submitButtonsElements();
    }


    @Then("I verify Thank you message after for register")
    public void iVerifyThankYouMessageAfterForRegister() throws InterruptedException {
        homePage.validateRegistration();
    }

//    @Then("I will verify the the category chosen in the filter")
//    public void iWillVerifyTheTheCategoryChosenInTheFilter() throws InterruptedException {
//        homePage.validateCategoryChosenInTheFilter();
//    }
}
