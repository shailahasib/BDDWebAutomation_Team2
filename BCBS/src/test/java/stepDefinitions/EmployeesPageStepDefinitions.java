package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeesPageStepDefinitions extends WebAPI {

    static HomePage homePage;

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

    @Given("I am at BCBS home page.")
    public void iAmAtBCBSHomePage() throws IOException {
        openBrowser("https://www.bcbs.com/");
    }

    @And("I use the mouse over Member Services.")
    public void iUseTheMouseOverMemberServices() {
        homePage.navigateToBlue365HomePage();
    }

    @And("I click on Visit Blue Benefits.")
    public void iClickOnVisitBlueBenefits() {
        homePage.clickOnVisit();
    }

    @When("I click on about Blue365")
    public void iClickOnAboutBlue() throws IOException, InterruptedException {
        homePage.clickOnAboutBlueElements();
    }

    @And("I click on how Blue365 works")
    public void iClickOnHowBlueWorks() throws InterruptedException {
        homePage.clickOnHowBlueWorksElements();
    }

    @Then("I verify How it Works")
    public void iVerifyHowItWorks() throws InterruptedException {
        homePage.validaHowBlueWorks();
    }

    @And("I click on register for a demo")
    public void iClickOnRegisterForADemo() throws InterruptedException {
        homePage.clickOnRegisterForADemo();
    }

    @When("I enter my information in the field")
    public void iEnterMyInformationInTheField(List<List<String>> table) throws InterruptedException {
        sleepFor(8);
        windowAndTabs();
        Map<String, String> mapTable = EmployeesPageStepDefinitions.Users.TableDictionaryConverter(table);
        homePage.sendKey(homePage.sendFirstname, mapTable.get("Firstname"));
        homePage.sendKey(homePage.sendLastname, mapTable.get("Lastname"));
        homePage.sendKey(homePage.sendemailaddress, mapTable.get("emailaddress"));
        homePage.sendKey(homePage.sendcompanyname, mapTable.get("companyname"));
        homePage.sendKey(homePage.sendjobtitile, mapTable.get("jobtitile"));
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

    @And("I click for employers button")
    public void iClickForEmployersButton() throws InterruptedException {
        homePage.clickForEmployersButton();
    }

    @And("I enter number of employees")
    public void iEnterNumberOfEmployees() throws InterruptedException {
        homePage.enterNumberOfEmployees();
    }

    @And("I Select BCBS Plan")
    public void iSelectBCBSPlan() throws InterruptedException {
        homePage.selectBCBSPlan();
    }

    @And("I select Webinar Dates")
    public void iSelectWebinarDates() throws InterruptedException {
        homePage.selectWebinarDates();
    }

    @And("I click on I agree to the policy")
    public void iClickOnIAgreeToThePolicy() throws InterruptedException {
        homePage.clickOnIAgreeToThePolicy();

    }

    @And("I participate in Amazon gift cart")
    public void iParticipateInAmazonGiftCart() throws InterruptedException {
        homePage.participateInAmazonGiftCart();
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() throws InterruptedException {
        homePage.clickOnRegisterButton();
    }

    @Then("I verify my registration")
    public void iVerifyMyRegistration() throws InterruptedException {
        homePage.verifyMyRegistration();
    }

    @When("I Scroll down to how Blue365 works")
    public void iScrollDownToHowBlueWorks() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");

    }

    @And("i click on the video")
    public void iClickOnTheVideo() throws InterruptedException {
        homePage.clickOnTheVideo();
    }

    @Then("I should be able to see the video playing")
    public void iShouldBeAbleToSeeTheVideoPlaying() throws InterruptedException {
        homePage.validateTheVideoPlaying();
    }
}
