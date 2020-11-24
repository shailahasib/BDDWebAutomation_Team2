package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;


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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


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

    @Given("I am on the marriott home page")
    public void iAmOnTheMarriottHomePage() throws IOException {
        openBrowser("https://www.marriott.com/meeting-event-hotels/meeting-planning.mi");
    }

//    @When("I click on Meeting and Events link")
//    public void iClickOnMeetingAndEventsLink() throws InterruptedException {
//        homePage.clickOnMeetingAndEventsLink();
//    }
//
//    @Then("I should be landed on the Meeting and Events home page")
//    public void iShouldBeLandedOnTheMeetingAndEventsHomePage() throws InterruptedException {
//        homePage.validateMeetingAndEventsHomePage();
//    }

    @And("I click on Marriott BONVoY Logo")
    public void iClickOnMarriottBONVoYLogo() throws InterruptedException {
        homePage.clickOnMarriottBONVoYLogo();
    }

    @Then("I verify the table shows up and be able to use it")
    public void iVerifyTheTableShowsUpAndBeAbleToUseIt() throws InterruptedException {
        homePage.VerifyTheTableShowsUpAndBeAbleToUseIt();
    }

    @And("I click on Find And Reserve")
    public void iClickOnFindAndReserve() {
    }

    @Then("I verify  Find And Reserve the table shows up and be able to use it")
    public void iVerifyFindAndReserveTheTableShowsUpAndBeAbleToUseIt() {
    }

    @And("I click on Special offers")
    public void iClickOnSpecialOffers() {
    }

    @Then("I verify the Special offers table shows up and be able to use it")
    public void iVerifyTheSpecialOffersTableShowsUpAndBeAbleToUseIt() {
    }

    @And("I click on Vacations")
    public void iClickOnVacations() {
    }

    @Then("I verify the Vacations table shows up and be able to use it")
    public void iVerifyTheVacationsTableShowsUpAndBeAbleToUseIt() {
    }

    @And("I click on Our Brands")
    public void iClickOnOurBrands() {
    }

    @Then("I verify the Our Brands table shows up and be able to use it")
    public void iVerifyTheOurBrandsTableShowsUpAndBeAbleToUseIt() {
    }

    @And("I click on Our Credit cards")
    public void iClickOnOurCreditCards() {
    }

    @Then("I verify that I can go the to Our Credit cards page")
    public void iVerifyThatICanGoTheToOurCreditCardsPage() {
    }

    @And("I click on About Marriott Bonvoy")
    public void iClickOnAboutMarriottBonvoy() {
    }

    @Then("I verify the About Marriott Bonvoy table shows up and be able to use it")
    public void iVerifyTheAboutMarriottBonvoyTableShowsUpAndBeAbleToUseIt() {
    }
}
