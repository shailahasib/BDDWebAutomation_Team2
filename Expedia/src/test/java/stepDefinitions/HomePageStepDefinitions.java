package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinitions extends WebAPI {

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


    @Given("I at T-moble home page")
    public void i_at_t_moble_home_page() throws IOException {
        openBrowser("https://www.expedia.com/");

    }











    @Given("I am at Expedia home page")
    public void i_am_at_expedia_home_page() {

    }

    @Given("I click expedia searchbox")
    public void i_click_expedia_searchbox() {
        homePage.  expediaSearchBoxCheck();
    }

    @Given("I enter location")
    public void i_enter_location() {

    }

    @When("I hit on search button")
    public void i_hit_on_search_button() {

    }

    @Then("I verify to the page title i am at right page")
    public void i_verify_to_the_page_title_i_am_at_right_page() {

    }















}
