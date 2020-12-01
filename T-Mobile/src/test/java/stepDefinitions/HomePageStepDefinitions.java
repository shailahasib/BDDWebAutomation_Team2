package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class HomePageStepDefinitions extends WebAPI {

    static HomePage homePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
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
//
//    @Given("I am at T-Mobile home page")
//    public void i_am_at_t_mobile_home_page() throws IOException, InterruptedException {
//        openBrowser("https://www.t-mobile.com/");
//    }

    @And("I click on Banking link")
    public void i_click_on_banking_link() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        homePage.clickOnBankingLink();
    }

    @Then("I verify IAm landing on Sign up today for T-Mobile MONEY page")
    public void i_verify_i_am_landing_on_sign_up_today_for_t_mobile_money_page() throws InterruptedException {
        homePage.validateClickOnBankingLink();
    }

    @Given("I click on Sign Up button")
    public void iClickOnSignUpButton() {
        homePage.clickOnSignUpButton();
    }

    @And("I click on create A T-Mobile ID to sign Up")
    public void iClickOnCreateATMobileIDToSignUp() {
        homePage.clickOnCreateATMobileIDToSignUp();
    }

    @Then("I verify IAm landing on create A T-Mobile ID to sign Up")
    public void iVerifyIAmLandingOnCreateATMobileIDToSignUp() throws InterruptedException {
        homePage.VerifyLandingOnCreateATMobileID();
    }

    @And("I enter my information  name, email address and password")
    public void iEnterMyInformationNameEmailAddressAndPassword(List<List<String>> table) throws InterruptedException {
        sleepFor(4);
        Map<String, String> mapTable = Users.TableDictionaryConverter(table);
        homePage.sendKey(homePage.sendFirstName, mapTable.get("firstname"));
        homePage.sendKey(homePage.sendLastName, mapTable.get("lastname"));
        homePage.sendKey(homePage.email, mapTable.get("email"));
        homePage.sendKey(homePage.password, mapTable.get("password"));

    }

    @And("I click on Next button T-Mobile ID")
    public void iClickOnNextButtonTMobileID() throws InterruptedException {
        homePage.clickOnNextButtonTMobileID();
    }

    @When("I click on 4.00% APY in Perks")
    public void iClickOnAPYInPerks() throws InterruptedException {
        homePage.clickOnAPYInPerks();
    }

    @Then("I verify 4.00% APY is serious interest Page")
    public void iVerifyAPYIsSeriousInterestPage() {
    }

    @When("I Got your back")
    public void iGotYourBack() throws InterruptedException {
        homePage.gotYourBackLink();
    }

    @Then("I verify Got your back Page")
    public void iVerifyGotYourBackPage() throws InterruptedException {
        homePage.validateGotYourBackLink();
    }

    @When("I click on no fee banking in the Features Link")
    public void iClickOnNoFeeBankingInTheFeaturesLink() throws InterruptedException {
        homePage.clickOnNoFeeBankingInTheFeaturesLink();
    }

    @Then("I verify no fee banking in Page")
    public void iVerifyNoFeeBankingInPage() throws InterruptedException {
        homePage.validateFeeBankingInTheFeaturesLink();
    }

    @When("I click on best in class in digital banking in the Features Link")
    public void iClickOnBestInClassInDigitalBankingInTheFeaturesLink() throws InterruptedException {
        homePage.clickOnBestInClassInDigitalBanking();
    }

    @Then("I verify best in class in digital banking in Page")
    public void iVerifyBestInClassInDigitalBankingInPage() throws InterruptedException {
        homePage.validateClickOnBestInClassInDigitalBanking();
    }

    @When("I click on direct deposit in the Features Link")
    public void iClickOnDirectDepositInTheFeaturesLink() throws InterruptedException {
        homePage.clickOnDirectDepositLink();
    }

    @Then("I verify direct deposit in Page")
    public void iVerifyDirectDepositInPage() throws InterruptedException {
        homePage.validateDirectDepositLink();
    }

    @When("I click on no fee ATM's in the Features Link")
    public void iClickOnNoFeeATMSInTheFeaturesLink() throws InterruptedException {
        homePage.clickOnNoFeeATMSLink();
    }

    @Then("I verify the no fee ATM's page")
    public void iVerifyTheNoFeeATMSPage() throws InterruptedException {
        homePage.validateNoFeeATMSLink();
    }

    @When("I click on deposit cash locations Features Link")
    public void iClickOnDepositCashLocationsFeaturesLink() throws InterruptedException {
        homePage.clickOnDepositCashLocationsLink();
    }

    @Then("I verify the deposit cash locations page")
    public void iVerifyTheDepositCashLocationsPage() throws InterruptedException {
        homePage.validateFAQOption();
    }

    @When("I click on FAQ option")
    public void iClickOnFAQOption() throws InterruptedException {
        homePage.clickOnFAQOption();
    }

    @When("I click on FAQ")
    public void iClickOnFAQ() throws InterruptedException {
        homePage.clickOnFAQOption();
    }

    @And("I enter {string} in the searchbox")
    public void iEnterInTheSearchbox(String questions) throws InterruptedException {
        homePage.enterInTheSearchbox(questions);
    }

    @Then("I should be able to see The {string}in the Search result")
    public void iShouldBeAbleToSeeTheInTheSearchResult(String Keyword) throws InterruptedException {
        homePage.shouldBeAbleToSeeTheInTheSearchResult(Keyword);
    }

    @And("I verify the {string} in the Search result")
    public void iVerifyTheInTheSearchResult(String answer) throws InterruptedException {
        homePage.verifyTheInTheSearchResult(answer);
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

    @And("I enter my mobile phone number {string}")
    public void iEnterMyMobilePhoneNumber(String phoneNumber) throws InterruptedException {
        homePage.enterPhoneNUMElements(phoneNumber);
    }

    @And("I click on Submit button")
    public void iClickOnSubmitButton() throws InterruptedException {
        homePage.clickOnSubmitButton();
    }

    @And("I skip SSN")
    public void iSkipSSN() throws InterruptedException {
        homePage.skipSSN();
    }

    @And("I enter My Address {string}")
    public void iEnterMyAddress(String address) throws InterruptedException {
        homePage.enterMyAddress(address);
    }

    @And("I enter City {string}")
    public void iEnterCity(String city) throws InterruptedException {
        homePage.enterCity(city);
    }

    @And("I enter State {string}")
    public void iEnterState(String state) throws InterruptedException {
        homePage.enterState(state);
    }

    @And("I click on next: your personal information")
    public void iClickOnNextYourPersonalInformation() throws InterruptedException {
        homePage.clickOnNextPersonalInfo();
    }

    @And("I enter my personal information")
    public void iEnterMyPersonalInformation() throws InterruptedException {

    }

    @And("I enter Social Security Number {string}")
    public void iEnterSocialSecurityNumber(String arg0) {
    }

    @And("I enter ID number {string}")
    public void iEnterIDNumber(String arg0) {
    }

    @And("I enter ID Type")
    public void iEnterIDType() {
    }

    @And("I enter ID state")
    public void iEnterIDState() {
    }

    @And("I enter Date of birth")
    public void iEnterDateOfBirth() {
    }

    @And("I click on next")
    public void iClickOnNext() {
    }

    @And("I confirm and continue")
    public void iConfirmAndContinue() {
    }

    @And("I read and agree to these disclosures.")
    public void iReadAndAgreeToTheseDisclosures() {
    }

    @And("I click on Open my T-Mobile MONEY account!")
    public void iClickOnOpenMyTMobileMONEYAccount() {
    }

    @Then("I verify creating the account successfully")
    public void iVerifyCreatingTheAccountSuccessfully() {
    }
}