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


    @Given("I am at Marriott Home Page")
    public void i_am_at_marriott_home_page() throws IOException {
        openBrowser("https://www.marriott.com/default.mi");
    }

    @Given("I click The Calender box")
    public void i_click_the_calender_box() throws InterruptedException {
        homePage.  DatesClick();
    }

    @Given("I notice window display")
    public void i_notice_window_display() {

    }

    @Given("I Click errow")
    public void i_click_errow() {

    }

    @Given("I pick My preferable date from date picker")
    public void i_pick_my_preferable_date_from_date_picker() throws InterruptedException {
        homePage.  datePicker();
    }

    @Then("I verify the Calender functionality is propely working as aspection")
    public void i_verify_the_calender_functionality_is_propely_working_as_aspection() {

    }

    @Given("I click sign in")
    public void i_click_sign_in() throws InterruptedException {
        homePage. signIn();
    }

    @Given("I enter email {string} in searchBox")
    public void i_enter_email_in_search_box(String Email ) throws InterruptedException {
        homePage.  MarriotSendemail(Email);
    }

    @Given("I enter password  <{string}> in searchBox")
    public void i_enter_password_in_search_box(String Password) throws InterruptedException {
        homePage.  Marriotpassword(Password);
    }

    @When("I click Sign In i verify the log in functionlit is okay")
    public void i_click_sign_in_i_verify_the_log_in_functionlit_is_okay() throws InterruptedException {
        homePage. signInClick();
    }


    @Given("I click The FindHotels")
    public void i_click_the_find_hotels() throws InterruptedException {
        homePage.  MarriotfindHotel();
    }

    @Given("I enter location in destination")
    public void i_enter_location_in_destination() throws InterruptedException {
        homePage.  Marriotdestination();
    }

    @Given("I Click rates")
    public void i_click_rates() throws InterruptedException {
        homePage.  Marriotrates();
    }

    @Given("I pick none")
    public void i_pick_none() throws InterruptedException {
        homePage.   MarriotratesNone();
    }

    @Given("I click find hotels")
    public void i_click_find_hotels() throws InterruptedException {
        homePage.  MarriotfindHotels();
    }

    @Then("I verify is working propely")
    public void i_verify_is_working_propely() {

    }


    @Given("I click The Signin")
    public void i_click_the_signin() {
        homePage.   clickOnElement("MarriotsiginIn");
    }

    @Given("I click find reserve")
    public void i_click_find_reserve() {
        homePage.   clickOnElement("Marriotfindandreserv");
    }

    @Given("I Click Special offer")
    public void i_click_special_offer() {
        homePage.  clickOnElement("Marriotspecialoffer");
    }

    @Given("I click Find And reserve")
    public void i_click_find_and_reserve() {
        homePage.  Marriotspecialrests();
    }

    @Given("I enter my location in destrination box")
    public void i_enter_my_location_in_destrination_box() {
        homePage. Marriotdestinationbox();
    }

    @Given("I enter my rates in reatesbox")
    public void i_enter_my_rates_in_reatesbox() {
        homePage.  MarriotspecialBox();
    }

    @Given("I click on vacation")
    public void i_click_on_vacation() {
        homePage.  Marriotvactions();
    }

    @Given("I click Homes a villas")
    public void i_click_homes_a_villas() {
        homePage.  MarriothomesAndVillas();
    }

    @Then("I verify the page to the title")
    public void i_verify_the_page_to_the_title() {
        homePage.  MarriothomesAndVillasValided("Vacation Rental Home | Homes & Villas | Marriott International");
    }


    @When("I click Find and Reserve on header")
    public void i_click_find_and_reserve_on_header() {

    }

    @When("I click and on Where do you want to go")
    public void i_click_and_on_where_do_you_want_to_go() {

    }

    @Then("I enter location name")
    public void i_enter_location_name() {

    }

    @Then("I click on the start from calendar")
    public void i_click_on_the_start_from_calendar() {

    }


    @Given("scroll down and find the destination box")
    public void scroll_down_and_find_the_destination_box() {

    }

    @Given("I enter in NYC destanation box")
    public void i_enter_in_nyc_destanation_box() {

    }

    @Given("I select start date")
    public void i_select_start_date() {

    }



























}
