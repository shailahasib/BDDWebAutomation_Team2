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






    @Given("I am at Expedia home page")
    public void i_am_at_expedia_home_page() throws IOException {
        openBrowser("https://www.expedia.com/");
    }

    @Given("I click expedia searchbox")
    public void i_click_expedia_searchbox() {
        homePage.  expediaSearchBoxCheck();
    }

    @Given("I enter location")
    public void i_enter_location() {
        homePage. expediasendSearcBoxCheck();
        homePage. expediaSearchBoxSendLocation();
    }

    @When("I hit on search button")
    public void i_hit_on_search_button() {
        homePage.expediaclicksearchbutton();
    }

    @Then("I verify to the page title i am at right page")
    public void i_verify_to_the_page_title_i_am_at_right_page() throws InterruptedException {
        homePage. expediaclicksearcvalided("Bangladesh Hotel Search Results");
    }


    @Given("I click expedia Flight")
    public void i_click_expedia_flight() {
        homePage.  expediaflight();
    }

    @Given("I Select one way")
    public void i_select_one_way() {

    }

    @Given("I enter my location  from where im leaving")
    public void i_enter_my_location_from_where_im_leaving() {

    }

    @Given("I click going box")
    public void i_click_going_box() {

    }

    @Given("I enter where i want to go")
    public void i_enter_where_i_want_to_go() {

    }

    @Given("I Click Departing")
    public void i_click_departing() {
        homePage. expediadeparting();
    }

    @Given("I select date from calander")
    public void i_select_date_from_calander() throws InterruptedException {
        homePage.calender();
    }

    @Given("I Click Done button on calender")
    public void i_click_done_button_on_calender() {

    }

    @Then("I verify lots of flights are avalable in the page")
    public void i_verify_lots_of_flights_are_avalable_in_the_page() {

    }

    @Given("I click Access My benifits")
    public void i_click_access_my_benifits() {

    }

    @Given("I I enter invalid number")
    public void i_i_enter_invalid_number() {

    }

    @When("I click go")
    public void i_click_go() {

    }

    @Then("I verify A pop up massage shows try again")
    public void i_verify_a_pop_up_massage_shows_try_again() {

    }

    @Given("I click cars on expedia")
    public void i_click_cars_on_expedia() throws InterruptedException {
        homePage. carsClick();
    }

//    @Given("I Click pick up box")
//    public void i_click_pick_up_box() throws InterruptedException {
//        homePage. expediapickUp();
//    }

    @Given("I enter my location")
    public void i_enter_my_location() {

    }

    @Given("I sleect my location in box")
    public void i_sleect_my_location_in_box() throws InterruptedException {
        homePage. pickUplocation();
    }

    @When("I click search")
    public void i_click_search() {

    }

    @Then("I verify im on right page")
    public void i_verify_im_on_right_page() {

    }


    @Given("I click cars on expedia build a package")
    public void i_click_cars_on_expedia_build_a_package() throws InterruptedException {
        homePage. expediabuildApagckaecheck();

    }

    @Given("I click Things to do")
    public void i_click_things_to_do() {

    }

    @Given("I click things to do box")
    public void i_click_things_to_do_box() throws InterruptedException {
        homePage. expediathingsToDo();
    }

    @Given("I select the location")
    public void i_select_the_location() {

    }

    @When("I click search button")
    public void i_click_search_button() {

    }

    @Then("I verify its working properly")
    public void i_verify_its_working_properly() {

    }




}
