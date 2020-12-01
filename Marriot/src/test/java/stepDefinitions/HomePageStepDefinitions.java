


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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.ScrollBarUI;
import java.io.IOException;

public class HomePageStepDefinitions extends WebAPI {

    static HomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
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

//    @After
//    public void closeBrowser() {
//        cleanUp();
//    }


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
        homePage.pickStartDate("NOVEMBER 2020","25");
        sleepFor(4);
    }
}
