


package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import home.HomePageWebElements;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.ScrollBarUI;
import java.io.IOException;

public class HomePageStepDefinitions extends WebAPI {

    static HomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        ChromeOptions option = new ChromeOptions();
        option.addArguments("disable-notifications");
    }

    @Given("I am on the Marriot homepage")
    public void i_am_on_the_marriot_homepage() throws IOException {
        openBrowser("https://www.marriott.com/default.mi");
    }

    @When("I click Find and Reserve on header")
    public void i_click_find_and_reserve_on_header() {
        homePage.findAndReserveAction();
    }

    @Then("I verify that the booking dropdown opens")
    public void i_verify_that_the_booking_dropdown_opens() {
        homePage.findAndReserveVerify();
    }

    @When("I click Special Offers on header")
    public void i_click_special_offers_on_header() {
        homePage.specialOffersAction();
    }

    @Then("I verify that the Special Offers dropdown opens")
    public void i_verify_that_the_special_offers_dropdown_opens() {
        homePage.specialOffersVerify();
    }

    @When("I click Vacations on header")
    public void i_click_vacations_on_header() {
        homePage.vacationsAction();
    }

    @Then("I verify that the Vacations dropdown opens")
    public void i_verify_that_the_vacations_dropdown_opens() {
        homePage.vacationsVerify();
    }


    @When("I click Our Brands on header")
    public void i_click_our_brands_on_header() {
        homePage.ourBrandsAction();
    }

    @Then("I verify that the Brands dropdown opens")
    public void i_verify_that_the_brands_dropdown_opens() {
        homePage.ourBrandsVerify();
    }

    @When("I click Our Credit Cards on header")
    public void i_click_our_credit_cards_on_header() {
        homePage.ourCreditCardsAction();
    }

    @Then("I verify that the Credit Cards dropdown opens")
    public void i_verify_that_the_credit_cards_dropdown_opens() {
        homePage.ourCreditCardsVerify();
    }

    @When("I click About Marriot Bonvoy on header")
    public void i_click_about_marriot_bonvoy_on_header() {
        homePage.aboutMarriotAction();
    }

    @Then("I verify that the About dropdown opens")
    public void i_verify_that_the_About_dropdown_opens() {
        homePage.aboutMarriotVerify();
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


    @Then("I type location name")
    public void iTypeLocationName() {

    }

    @And("I click and on Where do you want to go")
    public void iClickAndOnWhereDoYouWantToGo() {
    }

    @And("I click on the start from calendar")
    public void iClickOnTheStartFromCalendar() {
        homePage.clickOnCalendarFrom();
        sleepFor(5);
    }


    @And("I type in NYC")
    public void iTypeInNYC() {
        homePage.goToNyc();
    }

    @And("scroll down and find the destination box")
    public void scrollDownAndFindTheDestinationBox() {
        homePage.findDestinationBox();
    }

    @And("I select start date")
    public void iSelectStartDate() {
        homePage.pickStartDate("DECEMBER 2020", "15");
        sleepFor(4);
    }

    @When("I click find hotels")
    public void iClickFindHotels() {
        homePage.searchHotels();
    }

    @Then("I verify the search returns appropriate results for NYC")
    public void iVerifyTheSearchReturnsAppropriateResultsForNYC() {
        homePage.verifyNycHotels();
    }

    @Then("I verify that the list view option is hidden and inactive")
    public void iVerifyThatTheListViewOptionIsHiddenAndInactive() {
        homePage.classContains(homePage.listView, HomePageWebElements.listViewClass);
    }

    @Then("I verify that the appropriate message is displayed")
    public void iVerifyThatTheAppropriateMessageIsDisplayed() {
        homePage.trueAssertion(homePage.errorMessageForLocation);
    }


    @And("I type in {string}")
    public void iTypeIn(String location) {
        homePage.sendKeysGeneric(homePage.destinationTyping, location);
    }

    @Then("I verify the search returns appropriate {string} for given location")
    public void iVerifyTheSearchReturnsAppropriateForGivenLocation(String results) {
        homePage.equalAssertion(results, homePage.getTextGeneric(homePage.destinationTextOnPage));

    }

    @And("I select start {string} and {string}")
    public void iSelectStartAnd(String month, String date) {
        homePage.pickStartDate(month, date);
    }

    @Then("I verify the correct {string} on result page")
    public void iVerifyTheCorrectOnResultPage(String dateResult) {
        homePage.equalAssertion(dateResult, homePage.getTextGeneric(homePage.stayDatesText));
    }


    @And("I click on the global language button")
    public void iClickOnTheGlobalLanguageButton() {
        homePage.changeLanguage();
    }

    @When("I select Espanol from under Americas")
    public void iSelectEspanolFromUnderAmericas() {
        homePage.selectAmericasEspanol();
        sleepFor(4);
    }

    @Then("I verify that the page title matches the chosen language")
    public void iVerifyThatThePageTitleMatchesTheChosenLanguage() {
        homePage.equalAssertion(HomePageWebElements.espanolExpectedText, homePage.getTextGeneric(homePage.espanolAmericasText));
    }

    @And("I click on Sign in or Join")
    public void iClickOnSignInOrJoin() {
    }

    @And("I enter and invalid email")
    public void iEnterAndInvalidEmail() {
    }

    @And("I enter an invalid password")
    public void iEnterAnInvalidPassword() {
    }

    @When("I click Sign in")
    public void iClickSignIn() {
    }

    @Then("I am not able to sign in and error message is displayed")
    public void iAmNotAbleToSignInAndErrorMessageIsDisplayed() {
    }

    @When("I scroll down to the bottom of the page")
    public void iScrollDownToTheBottomOfThePage() {
        homePage.scrollDownToBottom();
    }

    @Then("I verify that the social media links are displayed")
    public void iVerifyThatTheSocialMediaLinksAreDisplayed() {
    }
}
