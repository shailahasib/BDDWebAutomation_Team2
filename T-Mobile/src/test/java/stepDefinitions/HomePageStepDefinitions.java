package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
        openBrowser("https://www.t-mobile.com/");

    }


    @Given("I click Phones $ devices")
    public void i_click_phones_$_devices() {
        homePage.Clickpnoes$devices();

    }

    @Then("I verify phones $ devices page exist")
    public void i_verify_phones_$_devices_page_exist() {
        homePage.validedClickpnoes$devices();
    }


    @Given("I click the t-moble search button")
    public void i_click_the_t_moble_search_button() {
        homePage.validedTmobleClickSearch();
    }

    @Given("I enter Galaxy Note20 Ultra 5G")
    public void i_enter_galaxy_note20_ultra_5g() {
        homePage.SendTmobleSearch();
    }

    @When("I click search box")
    public void i_click_search_box() {
        homePage.TmobleSearchButton();
    }

    @Then("I Verify Galaxy Note20 Ultra 5G desplay properly")
    public void i_verify_galaxy_note20_ultra_5g_desplay_properly() throws InterruptedException {
        homePage.TmoblegalaxyNoteUltra("Galaxy Note20 Ultra 5G");
    }


    @Given("I click My account on t-moble homepage right corner of the top")
    public void i_click_my_account_on_t_moble_homepage_right_corner_of_the_top() {
        homePage.validedTmoblemyAcconut();

    }

    @When("I click login")
    public void i_click_login() throws InterruptedException {
        homePage.login();
    }

    @Then("I navigate to the login page")
    public void i_navigate_to_the_login_page() {

    }

    @Then("I enter valid email")
    public void i_enter_valid_email() throws InterruptedException {
        homePage.Email();
    }

    @Then("I click next")
    public void i_click_next() throws InterruptedException {
        homePage.clickNextl();
    }

    @Then("I verify my name is there")
    public void i_verify_my_name_is_there() {

    }

    @When("I click bill pay")
    public void i_click_bill_pay() throws InterruptedException {
        homePage.Tmoblebill();

    }

    @Then("I verify  is successfully loging")
    public void i_verify_is_successfully_loging() {


    }

    @Given("I click Find a store")
    public void i_click_find_a_store() throws InterruptedException {
        homePage.TmoblefindaStore();


    }

    @Given("I enter My zipcode in searchbox")
    public void i_enter_my_zipcode_in_searchbox() throws InterruptedException {
        homePage.TmoblefindaStoresearch();
    }

    @Given("I click search")
    public void i_click_search() throws InterruptedException {
        homePage.TmoblefindaStoreClick();
    }

    @Then("I verify location of store near me")
    public void i_verify_location_of_store_near_me() throws InterruptedException {
        homePage.TmoblefindaStorevalided("219-07 Jamaica Ave, Queens, NY, 11428");
    }


    @Given("I click Contact $ support")
    public void i_click_contact_$_support() throws InterruptedException {
        homePage.Tmoblecontact$supportClick();
    }

    @When("I navigate to the Contact us page")
    public void i_navigate_to_the_contact_us_page() {

    }

    @Then("I verify Contact $ support Contact Us title")
    public void i_verify_contact_$_support_contact_us_title() throws InterruptedException {
        homePage.contact$support("Contact Us");
    }


    @Given("I click Plans")
    public void i_click_plans() throws InterruptedException {
        homePage.Tmobleplans();
    }

    @When("I navigate to there's a cell phone plan for everyone")
    public void i_navigate_to_there_s_a_cell_phone_plan_for_everyone() {

    }

    @Then("I verify Compare Our Best Cell Phone Plans & Deals for the Family | T-Mobile to the title")
    public void i_verify_compare_our_best_cell_phone_plans_deals_for_the_family_t_mobile_to_the_title() throws InterruptedException {
        homePage.palnsValided();
    }


    @Then("I verify Essentials mlddle of the page")
    public void i_verify_essentials_mlddle_of_the_page() throws InterruptedException {
        homePage.TmobleEssentialvalided("Essentials");
    }

    @Given("I click t-moblie deals")
    public void i_click_t_moblie_deals() throws InterruptedException {
        homePage.TmobleDealsclick();
    }

    @When("I navigate to to the page")
    public void i_navigate_to_to_the_page() {

    }

    @Then("I verify the deals page to the title")
    public void i_verify_the_deals_page_to_the_title() throws InterruptedException {
        homePage.TmobleDealsvalided();
    }


    @Given("I move the mouse on Deals")
    public void i_move_the_mouse_on_deals() {
        homePage.mouseHoverByXpath("Tmobleapple");
    }

    @When("I An apple is appear")
    public void i_an_apple_is_appear() {

    }

    @When("I click an apple")
    public void i_click_an_apple() {
        homePage.ClickApplle();
    }

    @Then("I verify iam in An apple page to the title")
    public void i_verify_iam_in_an_apple_page_to_the_title() throws InterruptedException {
        homePage.appleTitle();
    }

    @Given("I click t-moble prepaid top left of the corner")
    public void i_click_t_moble_prepaid_top_left_of_the_corner() {
        homePage.TmoblePrepaid();
    }

    @When("I navigat to the page")
    public void i_navigat_to_the_page() {

    }


    @Then("I verify prepaid name right of top of the corner")
    public void i_verify_prepaid_name_right_of_top_of_the_corner() {
        homePage.TmoblePrepaidvalidated("Prepaid");
    }


    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
        homePage.enterSearchKeyword(productName);
    }

    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String validproductName) {
        homePage.validateSearchText(validproductName);
    }


    @Then("I verify {string} as based on productName")
    public void i_verify_as_based_on_productName(String expectedTitle) {
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }


    @Given("And I enter \"Galaxy Tab A {double}\"in searchbutton")
    public void and_i_enter_galaxy_tab_a_in_searchbutton(Double double1) {

    }

    @Given("And I enter \"Galaxy Z Fold2 5G\"in searchbutton")
    public void and_i_enter_galaxy_z_fold2_5g_in_searchbutton() {

    }


    @Given("I click t-moble TV top left of the corner")
    public void i_click_t_moble_tv_top_left_of_the_corner() {
        homePage.TmobleTVCheck();
    }

    @Given("I want to see the TVision desplaying properly")
    public void i_want_to_see_the_t_vision_desplaying_properly() {
        homePage.TmobleTVCheckValided("TVision");
    }

    @Given("I dont want to expected is not working")
    public void i_dont_want_to_expected_is_not_working() {

    }

    @When("I click  Galaxy Note20 Ultra 5G under link")
    public void i_click_galaxy_note20_ultra_5g_under_link() {
        homePage.Tmoblegalaxynote();
    }

    @When("I added it add to cart")
    public void i_added_it_add_to_cart() {
        homePage.TmobleAddtoCart();
    }

    @Then("I verify it succesfully added to cart")
    public void i_verify_it_succesfully_added_to_cart() {

    }

    @Given("I click T-Moblie wireless")
    public void i_click_t_moblie_wireless() {
        homePage.Tmoblewireless();
    }

    @Then("I verify the I am in the wirless page to the Title")
    public void i_verify_the_i_am_in_the_wirless_page_to_the_title() {
        homePage.TmoblewirelessValided();
    }

    @Given("I click T-Moblie BanKing")
    public void i_click_t_moblie_ban_king() {
        homePage.TmobleBANKING();
    }

    @When("I verify features is exist left header of the page")
    public void i_verify_features_is_exist_left_header_of_the_page() throws InterruptedException {
        homePage.TmobleBANKINGvalided("T-Mobile MONEY | Online Checking Account | T-Mobile");
    }


    @Given("I move mouse on Coverage")
    public void i_move_mouse_on_coverage() {
        homePage.coverage();
    }


    @Given("I verify all option pop up")
    public void i_verify_all_option_pop_up() {

    }

    @Given("I click our network")
    public void i_click_our_network() {

    }

    @Then("i verify iam at our network page by  America’s largest 5G network.")
    public void i_verify_iam_at_our_network_page_by_america_s_largest_5g_network() throws InterruptedException {
        homePage.TmobleourNetvalided("America’s largest 5G network.");
    }

    @Given("I click what is 5g")
    public void i_click_what_is_5g() {
        homePage.TmoblewhatIs5G();
    }

    @Then("i verify iam at What is 5G? page Top of the left corner")
    public void i_verify_iam_at_what_is_5g_page_top_of_the_left_corner() throws InterruptedException {
        homePage.TmoblewhatIs5Gtvalided("What is 5G?");
    }

    @Given("I move mouse on Why T-mobile")
    public void i_move_mouse_on_why_t_mobile() {
        homePage.TmoblewhyTmoblesubmenuvalided();
    }

    @Given("I click Travel sunmenu")
    public void i_click_travel_sunmenu() {

    }

    @Then("i verify iam at our Travel page to the  Travel with T-Mobile. middle of the page")
    public void i_verify_iam_at_our_travel_page_to_the_travel_with_t_mobile_middle_of_the_page() {
        homePage.TmobletravelValided("Travel with T-Mobile.");
    }


    @Given("I move mouse on Why plan")
    public void i_move_mouse_on_why_plan() {
        homePage.Tmobleplansmousehouvr();
    }

    @Given("I click military & Veterans sunmenu")
    public void i_click_military_veterans_sunmenu() {
        homePage.clickmilitary$vetarians();
    }

    @Given("I click see price breakdown")
    public void i_click_see_price_breakdown() throws InterruptedException {

        homePage.Tmobleseepricebearrkdown();
    }

    @Then("i verify a diplay pop up shows all price breakdown menu")
    public void i_verify_a_diplay_pop_up_shows_all_price_breakdown_menu() {

    }


    @Given("I click My account")
    public void i_click_my_account() {
        homePage.myaccount();
    }

    @When("I am at login page")
    public void i_am_at_login_page() {

    }

    @When("I click forgot loging info under login")
    public void i_click_forgot_loging_info_under_login() throws InterruptedException {
        homePage.TmobleforgotAccount();
    }

    @When("I Enter valide password")
    public void i_enter_valide_password() throws InterruptedException {
        homePage.TmobleforgotAccountbox();
    }

    @Then("i verify its succesfully")
    public void i_verify_its_succesfully() {

    }

    @Given("I click Holiday on top header of t- mobile page")
    public void i_click_holiday_on_top_header_of_t_mobile_page() {
        homePage.holidayOn();
    }

    @When("I navigate to the page")
    public void i_navigate_to_the_page() {

    }

    @Then("I verify i am at the page to the Holiday on  middle of the page exist")
    public void i_verify_i_am_at_the_page_to_the_holiday_on_middle_of_the_page_exist() {
        homePage.TmobleHoliodyOnValided("Make the season bright with great deals on devices and plans.\n" +
                "\n" +
                "Holiday On");
    }


    @Given("I move my mouse on deals")
    public void i_move_my_mouse_on_deals() {
        homePage.Tmobledealsmousehover();
    }

    @When("all  option pop up")
    public void all_option_pop_up() {

    }

    @When("I click deals submenu see all deals")
    public void i_click_deals_submenu_see_all_deals() {
        homePage.seeallDeals();
    }

    @Then("I verify im the right page to the page title")
    public void i_verify_im_the_right_page_to_the_page_title() {
        homePage.seeallDealsValided("Our Best Deals & Promotions on Cell Phones, Devices & Plans | T-Mobile");
    }


    @Given("I enter iphone {int} pro max on searchbutton")
    public void i_enter_iphone_pro_max_on_searchbutton(Integer int1) {
        homePage.TmobleSearch();
        homePage.TmobleSearchClick();
    }

    @Given("I click iphone {int} pro max")
    public void i_click_iphone_pro_max(Integer int1) {
        homePage.iphone11();

    }

    @Then("I valided iphone {int} pro max to the page title")
    public void i_valided_iphone_pro_max_to_the_page_title(Integer int1) {
        homePage.iphone11valided("Apple iPhone 11 Pro Max | 3 colors in 64GB | T-Mobile");
    }

    @Given("I click tmoble search box")
    public void i_click_tmoble_search_box() {
        homePage.TmobleSearchbuttonClick();
    }


}






