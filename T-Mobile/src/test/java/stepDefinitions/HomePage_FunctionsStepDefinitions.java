package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class HomePage_FunctionsStepDefinitions extends WebAPI {

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

//    @Given("I am at T-Mobile home page")
//    public void i_am_at_t_mobile_home_page() throws IOException, InterruptedException {
//        openBrowser("https://www.t-mobile.com/");
//    }

//    @And("I click on Banking link")
//    public void i_click_on_banking_link() throws InterruptedException {
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
//        homePage.clickOnBankingLink();
//    }
//
//    @Then("I verify IAm landing on Sign up today for T-Mobile MONEY page")
//    public void i_verify_i_am_landing_on_sign_up_today_for_t_mobile_money_page() throws InterruptedException {
//        homePage.validateClickOnBankingLink();
//    }
//
//    @Given("I click on Sign Up button")
//    public void iClickOnSignUpButton() {
//        homePage.clickOnSignUpButton();
//    }
//
//    @And("I click on create A T-Mobile ID to sign Up")
//    public void iClickOnCreateATMobileIDToSignUp() {
//        homePage.clickOnCreateATMobileIDToSignUp();
//    }
//
//    @Then("I verify IAm landing on create A T-Mobile ID to sign Up")
//    public void iVerifyIAmLandingOnCreateATMobileIDToSignUp() throws InterruptedException {
//        homePage.VerifyLandingOnCreateATMobileID();
//    }
//
//    @And("I enter my information  name, email address and password")
//    public void iEnterMyInformationNameEmailAddressAndPassword(List<List<String>> table) throws InterruptedException {
//        sleepFor(4);
//        Map<String, String> mapTable = Users.TableDictionaryConverter(table);
//        homePage.sendKey(homePage.sendFirstName, mapTable.get("firstname"));
//        homePage.sendKey(homePage.sendLastName, mapTable.get("lastname"));
//        homePage.sendKey(homePage.email, mapTable.get("email"));
//        homePage.sendKey(homePage.password, mapTable.get("password"));
//
//    }
//
//    @And("I click on Next button T-Mobile ID")
//    public void iClickOnNextButtonTMobileID() throws InterruptedException {
//        homePage.clickOnNextButtonTMobileID();
//    }
//
//    public static class Users {
//
//        public static synchronized Map<String, String> TableDictionaryConverter(List<List<String>> data) {
//            Map<String, String> mapTable = new HashMap<String, String>();
//            for (List<String> rows : data) {
//
//                mapTable.put(rows.get(0), rows.get(1));
//            }
//            return mapTable;
//        }
//
//    }
//
//    @And("I enter my mobile phone number {string}")
//    public void iEnterMyMobilePhoneNumber(String phoneNumber) throws InterruptedException {
//        homePage.enterPhoneNUMElements(phoneNumber);
//    }
//
//    @And("I click on Submit button")
//    public void iClickOnSubmitButton() throws InterruptedException {
//        homePage.clickOnSubmitButton();
//    }
//
//    @And("I skip SSN")
//    public void iSkipSSN() throws InterruptedException {
//        homePage.skipSSN();
//    }
//
//    @And("I enter My Address {string}")
//    public void iEnterMyAddress(String address) throws InterruptedException {
//        homePage.enterMyAddress(address);
//    }
//
//    @And("I enter City {string}")
//    public void iEnterCity(String city) throws InterruptedException {
//        homePage.enterCity(city);
//    }
//
//    @And("I enter State {string}")
//    public void iEnterState(String state) throws InterruptedException {
//        homePage.enterState(state);
//    }
//
//    @And("I click on next: your personal information")
//    public void iClickOnNextYourPersonalInformation() throws InterruptedException {
//        homePage.clickOnNextPersonalInfo();
//    }
//
//    @And("I enter my personal information")
//    public void iEnterMyPersonalInformation() throws InterruptedException {
//        Thread.sleep(20);
//    }
//
//    @And("I enter Social Security Number {string}")
//    public void iEnterSocialSecurityNumber(String arg0) {
//    }
//
//    @And("I enter ID number {string}")
//    public void iEnterIDNumber(String arg0) {
//    }
//
//    @And("I enter ID Type")
//    public void iEnterIDType() {
//    }
//
//    @And("I enter ID state")
//    public void iEnterIDState() {
//    }
//
//    @And("I enter Date of birth")
//    public void iEnterDateOfBirth() {
//    }
//
//    @And("I click on next")
//    public void iClickOnNext() {
//    }
//
//    @And("I confirm and continue")
//    public void iConfirmAndContinue() {
//    }
//
//    @And("I read and agree to these disclosures.")
//    public void iReadAndAgreeToTheseDisclosures() {
//    }
//
//    @And("I click on Open my T-Mobile MONEY account!")
//    public void iClickOnOpenMyTMobileMONEYAccount() {
//    }
//
//    @Then("I verify creating the account successfully")
//    public void iVerifyCreatingTheAccountSuccessfully() {
//    }
}