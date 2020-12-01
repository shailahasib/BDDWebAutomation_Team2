package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.io.IOException;
import java.text.ParseException;
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

    @Given("I am on the marriott home page")
    public void iAmOnTheMarriottHomePage() throws IOException {
//        openBrowser("https://www.marriott.com/meeting-event-hotels/meeting-planning.mi");
        openBrowser("https://www.marriott.com/default.mi");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @When("I click on Meeting and Events link")
    public void iClickOnMeetingAndEventsLink() throws InterruptedException {
        homePage.clickOnMeetingAndEventsLinkElements();
    }

    @Then("I should be landed on the Meeting and Events home page")
    public void iShouldBeLandedOnTheMeetingAndEventsHomePage() throws InterruptedException {
        homePage.validateMeetingAndEventsHomePage();
    }

    @When("I click on sign in or join")
    public void iClickOnSignInOrJoin() throws InterruptedException {
        homePage.clickOnSignInOrJoinElements();
    }

    @And("I click on Join  now")
    public void iClickOnJoinNow() throws InterruptedException {
        homePage.clickOnJoinNowElements();
    }

    //
    @And("I enter my data in the required filed")
    public void iEnterMyDataInTheRequiredFiled(List<List<String>> table) throws InterruptedException {
        sleepFor(3);
        Map<String, String> mapTable = Users.TableDictionaryConverter(table);
        homePage.sendKey(homePage.sendFirstName, mapTable.get("firstname"));
        sleepFor(3);
        homePage.sendKey(homePage.sendLastName, mapTable.get("lastname"));
        sleepFor(3);
        homePage.sendKey(homePage.PostalCode, mapTable.get("PostalCode"));
        sleepFor(3);
        homePage.sendKey(homePage.Email, mapTable.get("Email"));
        sleepFor(3);
        homePage.sendKey(homePage.Password, mapTable.get("Password"));
        sleepFor(3);
        homePage.sendKey(homePage.ConfirmPassword, mapTable.get("ConfirmPassword"));
    }

    @Then("I verify login to My profile")
    public void iVerifyLoginToMyProfile() throws InterruptedException {
        homePage.verifyLoginToMyProfileElements();

    }

    @When("I click on My trip")
    public void iClickOnMyTrip() throws InterruptedException {
        homePage.clickOnMyTripElements();
    }

    @And("I complete the form with my info")
    public void iCompleteTheFormWithMyInfo(List<List<String>> table) throws InterruptedException {
        sleepFor(3);
        Map<String, String> mapTable = Users.TableDictionaryConverter(table);
        homePage.sendKey(homePage.ConfirmationNumber, mapTable.get("ConfirmationNumber"));
        sleepFor(3);
        homePage.calendarElements();
        sleepFor(3);
        homePage.sendKey(homePage.FirsName, mapTable.get("FirsName"));
        sleepFor(3);
        homePage.sendKey(homePage.LastName, mapTable.get("LastName"));
    }

    @And("I click on Find button")
    public void iClickOnFindButton() throws InterruptedException {
        homePage.clickOnFindButtonElements();
    }

    @Then("I verify error message reservation not found")
    public void iVerifyErrorMessageReservationNotFound() throws InterruptedException {
        homePage.verifyErrorMessageReservationElements();
    }


    @When("I set the information for the event")
    public void iSetTheInformationForTheEvent(List<List<String>> table) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        sleepFor(3);
        Map<String, String> mapTable = Users.TableDictionaryConverter(table);
        homePage.sendKey(homePage.setDistinction, mapTable.get("destination"));
//        homePage.setDistinction.sendKeys(Keys.ENTER);
        sleepFor(3);
        homePage.sendKey(homePage.setGuest, mapTable.get("guestroom"));
        sleepFor(3);
        homePage.sendKey(homePage.setSpace, mapTable.get("eventspace"));
    }
    @And("I enter the date")
    public void iEnterTheDate() throws InterruptedException, ParseException {
        homePage.enterTheDateElements();
    }

    @And("I enter the Event type")
    public void iEnterTheEventType() throws InterruptedException {
        homePage.enterTheEventTypeElements();
    }

    @And("I click on Find reservation button")
    public void iClickOnFindReservationButton() throws InterruptedException {
        homePage.clickOnFindReservationButton();
    }

    @Then("I verify the result of booking events")
    public void iVerifyTheResultOfBookingEvents() throws InterruptedException {
        homePage.verifyTheResultOfBookingEvents();
    }
    @When("I click on The current language\\(English)")
    public void iClickOnTheCurrentLanguageEnglish() throws InterruptedException {
    }
    @And("I select different option for {string}")
    public void iSelectDifferentOptionFor(String language) throws InterruptedException {
        homePage.clickOnTheCurrentLanguageElements(language);
    }

    @Then("I verify the {string}")
    public void iVerifyThe(String title ) throws InterruptedException {
        homePage.VerifyTheElements(title);

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

    @And("I click on Join button")
    public void iClickOnJoinButton() throws InterruptedException {
        homePage.clickOnJoinButtonElements();
    }
}
