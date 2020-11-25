package stepDefinitions;

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
import io.cucumber.messages.Messages;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

import static home.HomePageWebElements.*;
import static org.seleniumhq.jetty9.security.UserDataConstraint.get;

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

//    @Given("I enter my location in destrination box")
//    public void i_enter_my_location_in_destrination_box() {
//        homePage. Marriotdestinationbox();
//    }

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
    public void i_click_find_and_reserve_on_header() throws InterruptedException {
        homePage.  findAReserv();
    }

    @When("I click and on Where do you want to go")
    public void i_click_and_on_where_do_you_want_to_go() throws InterruptedException {
        homePage.  MarriotdestinationBox() ;
    }

    @Then("I enter location name")
    public void i_enter_location_name() {

    }

    @Then("I click on the start from calendar")
    public void i_click_on_the_start_from_calendar() {

    }


    @Given("scroll down and find the destination box")
    public void scroll_down_and_find_the_destination_box() {
        homePage. MarriotFirstdestinationBox();
    }

    @Given("I enter in NYC destanation box")
    public void i_enter_in_nyc_destanation_box() {

    }

    @Given("I select start date")
    public void i_select_start_date() {
        homePage. pickStartDate("NOVEMBER 2020","25");
    }


    @When("I click on the Sign In or Join button from header")
    public void i_click_on_the_sign_in_or_join_button_from_header() throws InterruptedException {
        homePage.  marriotsignin( );
    }


    @When("I enter a list of {string} address")
    public void i_enter_a_list_of_address(String email) throws InterruptedException {
        homePage. enterEmail(email);
    }

    @When("I enter {string} and click Sign in")
    public void i_enter_and_click_sign_in(String password) throws InterruptedException {
        homePage. passwordlist(password );
    }
    @Then("i want to click sign in to verify")
    public void i_want_to_click_sign_in_to_verify() throws InterruptedException {
        sleepFor(1);
driver.findElement(By.xpath(clickveifySignIn)).click();
    }



    @Given("I click on my tips third optiop from header")
    public void i_click_on_my_tips_third_optiop_from_header() {
        homePage.  myTrips();
    }

    @Given("I enter  {string} in searchBox")
    public void i_enter_in_search_box(String confirmationNumber) throws InterruptedException {
        sleepFor(5);
        homePage. MarriotconfirmationNumber(confirmationNumber);
    }

    @Given("I enter checkInDate  <{string}> in searchBox")
    public void i_enter_check_in_date_in_search_box(String checkInDate) throws InterruptedException {
        sleepFor(5);
        homePage. Marriotchekindater(checkInDate);
    }

    @Given("I enter <{string}> in searchbox")
    public void i_enter_in_searchbox(String FirstName) throws InterruptedException {
        sleepFor(5);
        homePage.  MarriotfisrstName(FirstName);
    }

    @Given("I click <{string}> in searchbox")
    public void i_click_in_searchbox(String LastName) throws InterruptedException {
        sleepFor(5);
        homePage. MarriotlastName(LastName);
    }

    @When("I click find  to verify  functionlit is okay")
    public void i_click_find_to_verify_functionlit_is_okay() throws InterruptedException {
        sleepFor(5);
        homePage.  Marriotfind();
    }


    @Given("I scroll down the page and i see Signin")
    public void i_scroll_down_the_page_and_i_see_signin() {

    }

    @Given("I click on Signin")
    public void i_click_on_signin() throws InterruptedException {
        homePage. Marriotsignin();
    }

    @Given("I enter email number")
    public void i_enter_email_number() {

    }

    @And("I enter user information")
    public void i_Enter_User_Information(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> data = dataTable.asLists(String.class);
        homePage.enterKeywords(homePage.Marriotemail,data.get(0).get(0));
        homePage.enterKeywords(homePage.Marriotpassworddown,data.get(1).get(0));









    }

    @Then("I click signin")
    public void i_click_signin() {
        homePage. Marriotsigninclick();
    }


    @And("I enter my location in destrination box")
    public void iEnterMyLocationInDestrinationBox() {
    }


    @And("I enter password")
    public void iEnterPassword() {
    }

    @Given("I click forgot account")
    public void i_click_forgot_account() {
        homePage. MarriotforgotAccount();
         }

    @Given("I enter user information based on box from row and colum")
    public void i_enter_user_information_based_on_box_from_row_and_colum(DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> data = dataTable.asLists(String.class);
        //firstrow
        sleepFor(3);
        homePage.enterKeywords(homePage.MarriotforgotaccountEmali,data.get(0).get(0));
        homePage.enterKeywords(homePage.MarriotforgotaccountFirtName,data.get(0).get(1));
       homePage.enterKeywords(homePage.MarriotforgotaccountLastName,data.get(0).get(2));

//second row
        sleepFor(3);
        homePage.enterKeywords(homePage. MarriotforgotaccountEmali,data.get(1).get(0));
        homePage.enterKeywords(homePage. MarriotforgotaccountFirtName,data.get(1).get(1));
        homePage.enterKeywords(homePage. MarriotforgotaccountLastName,data.get(1).get(2));
       //third Row
        sleepFor(3);
        homePage.enterKeywords(homePage.MarriotforgotaccountEmali,data.get(2).get(0));
        homePage.enterKeywords(homePage.MarriotforgotaccountFirtName,data.get(2).get(1));
        homePage.enterKeywords(homePage.MarriotforgotaccountLastName,data.get(2).get(2));
 //forthrow
        sleepFor(3);
        homePage.enterKeywords(homePage.MarriotforgotaccountEmali,data.get(3).get(0));
        homePage.enterKeywords(homePage. MarriotforgotaccountFirtName,data.get(3).get(1));
        homePage.enterKeywords(homePage. MarriotforgotaccountLastName,data.get(3).get(2));
        //fifthrow
        sleepFor(3);
        homePage.enterKeywords(homePage. MarriotforgotaccountEmali,data.get(4).get(0));
        homePage.enterKeywords(homePage. MarriotforgotaccountFirtName,data.get(4).get(1));
        homePage.enterKeywords(homePage. MarriotforgotaccountLastName,data.get(4).get(2));

    }

    @Then("I click submit to verify")
    public void i_click_submit_to_verify() {

    }



}
