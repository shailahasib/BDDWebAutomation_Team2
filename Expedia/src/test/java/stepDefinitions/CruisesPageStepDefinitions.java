package stepDefinitions;

import common.WebAPI;
import cruises.CruisesPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static cruises.CruisesWebElements.*;

public class CruisesPageStepDefinitions extends WebAPI {

    static CruisesPage cruisesPage;

    @Before
    public static void getInit() {
        cruisesPage = PageFactory.initElements(driver, CruisesPage.class);
        ChromeOptions option = new ChromeOptions();
        option.addArguments("disable-notifications");
    }


    @Given("I am on Expedia home page")
    public void iAmOnExpediaHomePage() throws IOException, InterruptedException {
        openBrowser(homePageUrl);
        Thread.sleep(8000);
    }

    @And("I click on Packages")
    public void iClickOnPackages() {
        sleepFor(5);
        cruisesPage.clickPackages();
    }

    @Then("I see the option to choose items and build a trip")
    public void iSeeTheOptionToChooseItemsAndBuildATrip() {
        cruisesPage.validateChooseOptionsText(chooseOptionsExpected);
    }


    @And("I enter {string} in the leaving from box")
    public void iEnterInTheLeavingFromBox(String leavingFrom) {
        cruisesPage.enterLeavingFrom(leavingFrom);
    }

    @And("I enter {string} in the going to box")
    public void iEnterInTheGoingToBox(String goingTo) {
        cruisesPage.enterGoingTo(goingTo);
    }

    @And("I choose Departing")
    public void iChooseDeparting() {
        cruisesPage.pickDepart("December 2020", "25");
    }

    @And("I choose Returning")
    public void iChooseReturning() {
        cruisesPage.pickReturn("December 2020", "30");
    }

    @When("I click Search")
    public void iClickSearch() {
        cruisesPage.clickElement(cruisesPage.packageSearch);
    }


    @And("I enter NYC in the going to box")
    public void iEnterNYCInTheGoingToBox() {
    }

    @Then("I verify that {string} matches from location")
    public void iVerifyThatMatchesFromLocation(String flyingFrom) {
        cruisesPage.getElementText(cruisesPage.flyingFrom);
    }

    @And("I click on cruises")
    public void iClickOnCruises() {
        cruisesPage.clickElement(cruisesPage.cruises);
    }

    @And("I click on flights")
    public void iClickOnFlights() {
        cruisesPage.clickElement(cruisesPage.flights);
    }

    @And("I click on going to")
    public void iClickOnGoingTo() {
        sleepFor(5);
        cruisesPage.clickElement(cruisesPage.goingTo);
    }


    @And("I verify that {string}> matches to location")
    public void iVerifyThatMatchesToLocation(String flyingTo) {
    }

    @When("I check gather all the a tags and iterate thr links")
    public void iCheckGatherAllTheATagsAndIterateThrLinks() {
        cruisesPage.findBrokenLinks();
    }

    @And("I select Stays")
    public void iSelectStays() {
        cruisesPage.clickGeneric(cruisesPage.stays);
    }

    @And("then I click on going to")
    public void thenIClickOnGoingTo() {
        cruisesPage.sendKeysGeneric(cruisesPage.goingToStay, locationsDallas);
    }

    @Then("I enter a destination")
    public void iEnterADestination() {
    }

    @Then("I verify that the links are not broken")
    public void iVerifyThatTheLinksAreNotBroken() {
    }

    @When("I scroll down to the footer and click on a {string}")
    public void iScrollDownToTheFooterAndClickOnA(String linkText) {
        cruisesPage.scrollHeight();
        cruisesPage.clickLinkText(linkText);
    }

    @Then("I verify that the links navigate to correct {string}")
    public void iVerifyThatTheLinksNavigateToCorrect(String pageTitle) {
        cruisesPage.equalAssertion(pageTitle, cruisesPage.getTitleGeneric());
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Marriot Homepage");
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


}
