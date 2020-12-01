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

import java.awt.*;
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

    @When("I click on APPAREL & FOOTWEAR link")
    public void iClickOnAPPARELFOOTWEARLink() throws InterruptedException {
        homePage.clickOnAPPARELFOOTWEARLink();
    }

    @Then("I should be landing on APPAREL & FOOTWEAR page")
    public void iShouldBeLandingOnAPPARELFOOTWEARPage() throws InterruptedException {
        homePage.shouldBeLandingOnAPPARELFOOTWEARPage();
    }

    @When("I click on Fitness link")
    public void iClickOnFitnessLink() throws InterruptedException {
        homePage.clickOnFitnessLink();
    }

    @Then("I should be landing on Fitness page")
    public void iShouldBeLandingOnFitnessPage() throws InterruptedException {
        homePage.shouldBeLandingOnFitnessPage();
    }

    @When("I click on HEARING & VISION link")
    public void iClickOnHEARINGVISIONLink() throws InterruptedException {
        homePage.clickOnHEARINGVISIONLink();
    }

    @Then("I should be landing on HEARING & VISION page")
    public void iShouldBeLandingOnHEARINGVISIONPage() throws InterruptedException {
        homePage.shouldBeLandingOnHEARINGVISIONPage();
    }

    @When("I click on HOME & FAMILY link")
    public void iClickOnHOMEFAMILYLink() throws InterruptedException {
        homePage.clickOnHOMEFAMILYLink();
    }

    @Then("I should be landing on HOME & FAMILY page")
    public void iShouldBeLandingOnHOMEFAMILYPage() throws InterruptedException {
        homePage.shouldBeLandingOnHOMEFAMILYPage();
    }

    @When("I click on  NUTRITION link")
    public void iClickOnNUTRITIONLink() throws InterruptedException {
        homePage.clickOnNUTRITIONLink();
    }

    @Then("I should be landing on  NUTRITION page")
    public void iShouldBeLandingOnNUTRITIONPage() throws InterruptedException {
        homePage.shouldBeLandingOnNUTRITIONPage();
    }

    @When("I click on PERSONAL CARE link")
    public void iClickOnPERSONALCARELink() throws InterruptedException {
        homePage.clickOnPERSONALCARELink();
    }

    @Then("I should be landing on PERSONAL CARE page")
    public void iShouldBeLandingOnPERSONALCAREPage() throws InterruptedException {
        homePage.shouldBeLandingOnPERSONALCAREPag();
    }

    @When("I click on TRAVEL link")
    public void iClickOnTRAVELLink() throws InterruptedException {
        homePage.clickOnTRAVELLink();
    }

    @Then("I should be landing on TRAVEL page")
    public void iShouldBeLandingOnTRAVELPage() throws InterruptedException {
        homePage.shouldBeLandingOnTRAVELPage();
    }

    @When("I click on About Blue365 link")
    public void iClickOnAboutBlueLink() throws InterruptedException {
        homePage.clickOnAboutBlueLink();
    }

    @Then("I should be landing on About Blue365 page")
    public void iShouldBeLandingOnAboutBluePage() throws InterruptedException {
        homePage.shouldBeLandingOnAboutBluePage();
    }

    @When("I click on Healthy Tips link")
    public void iClickOnHealthyTipsLink() throws InterruptedException {
        homePage.clickOnHealthyTipsLink();
    }

    @Then("I should be landing on Healthy Tips page")
    public void iShouldBeLandingOnHealthyTipsPage() throws InterruptedException {
        homePage.shouldBeLandingOnHealthyTipsPage();
    }

    @And("I click on The Health of America")
    public void iClickOnTheHealthOfAmerica() throws InterruptedException {
        homePage.clickOnTheHealthOfAmerica();
    }

    @And("I click on subscribe Health of America news")
    public void iClickOnSubscribeHealthOfAmericaNews() throws InterruptedException {
        homePage.clickOnSubscribeHealthOfAmericaNews();
    }

    @And("I enter my personal information")
    public void iEnterMyPersonalInformation(List<List<String>> table) throws InterruptedException {
        sleepFor(3);
        windowAndTabs();
        Map<String, String> mapTable = Users.TableDictionaryConverter(table);
        homePage.sendKey(homePage.sendFirstName1, mapTable.get("FirstName"));
        sleepFor(2);
        homePage.sendKey(homePage.sendLastName1, mapTable.get("LastName"));
        sleepFor(2);
        homePage.sendKey(homePage.Email1, mapTable.get("Email"));
        sleepFor(2);
        homePage.sendKey(homePage.ZipCode1, mapTable.get("Zipcode"));
    }

    @And("I click on I agree to the BCBS.com Terms & Conditions and Privacy Policy.")
    public void iClickOnIAgreeToTheBCBSComTermsConditionsAndPrivacyPolicy() throws InterruptedException {
        homePage.clickOnIAgree();
    }

    @And("I click on subscribe")
    public void iClickOnSubscribe() throws InterruptedException {
        homePage.clickOnSubscribe();
    }

    @And("I click on subscribe second time")
    public void iClickOnSubscribeSecondTime() throws InterruptedException {
        homePage.clickOnSubscribeSecondTime();

    }

    @Then("I verify the subscription")
    public void iVerifyTheSubscription() throws InterruptedException {
        homePage.verifyTheSubscription();

    }

    @And("I verify if I am authorized to access this page.")
    public void iVerifyIfIAmAuthorizedToAccessThisPage() throws InterruptedException {
        homePage.verifyIfIAmAuthorizedToAccessThisPage();

    }

    @When("I click Image")
    public void iClickImage() throws InterruptedException, AWTException {
        homePage.clickImage();
    }

    @And("I save the image in my computer")
    public void iSaveTheImageInMyComputer() throws AWTException, InterruptedException {
       homePage. saveTheImageInMyComputer();

    }

    @Then("I verify that I downloaded the image")
    public void iVerifyThatIDownloadedTheImage() {
    }

    @And("I click on device comparison link")
    public void iClickOnDeviceComparisonLink() throws AWTException, InterruptedException {
        homePage.clickOnDeviceComparisonLink();
    }

    @And("I click on Take a Quiz")
    public void iClickOnTakeAQuiz() throws AWTException, InterruptedException {
        homePage.clickOnTakeAQuiz();
    }

    @And("I select {string} How would you describe your current exercise activities?")
    public void iSelectHowWouldYouDescribeYourCurrentExerciseActivities() throws AWTException, InterruptedException {
        homePage.selectWhatKindOfProductAreYouLookingFor();
        windowAndTabsnum3();
        homePage.selectTheGoal.click();
    }

    @And("I select {string} What kind of product are you looking for?")
    public void iSelectWhatKindOfProductAreYouLookingFor() throws AWTException, InterruptedException {

    }

    @And("I select {string} Pick up to 3 product features you'd like.")
    public void iSelectPickUpToProductFeaturesYouDLike(String features) {
//        homePage.selectPickUpToProductFeaturesYouDLike(features);
    }

    @And("I click on show my results")
    public void iClickOnShowMyResults() {
    }

    @Then("I verify the product you will love")
    public void iVerifyTheProductYouWillLove() {
    }

    @When("I click on fitbit deals")
    public void iClickOnFitbitDeals() throws AWTException, InterruptedException {
        homePage.clickOnFitbitDeals();
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
