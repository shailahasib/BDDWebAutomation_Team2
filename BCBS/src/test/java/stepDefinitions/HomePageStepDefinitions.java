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
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
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

    @Given("I am at BcBs home page")
    public void i_am_at_bc_bs_home_page() throws IOException {
        openBrowser("https://www.bcbs.com/");
    }
    @Given("I move my mouse on Member services")
    public void i_move_my_mouse_on_member_services() {
        homePage.memberAndServicemouseHouver();
    }

    @Given("I click submenu Access my benifits")
    public void i_click_submenu_access_my_benifits() {
        homePage.memberAndServiceClick();
    }

    @Then("I Verify I am at the right page by page Title")
    public void i_verify_i_am_at_the_right_page_by_page_title() {
    }
    @Given("I click the BcBs search button")
    public void i_click_the_bc_bs_search_button() {
    }
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String InsuranceName) throws InterruptedException {
        homePage.BcBSenterSearchKey(InsuranceName);
    }
    @When("I click search")
    public void i_click_search() {
    }
    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String validInsuranceName) {
        homePage.searchtex(validInsuranceName);
    }
    @Then("I verify {string} as based on InsuranceNam")
    public void i_verify_as_based_on_Insurance_Name(String pageTitle) {
        homePage.getTitle(pageTitle);
    }

    @Given("I click bcbs medicare")
    public void i_click_bcbs_medicare() {
        homePage.BcBSMedicare();
    }
    @Given("I move my mouse on Find a doctor")
    public void i_move_my_mouse_on_find_a_doctor() throws InterruptedException {
        homePage.FindDr();
    }
    @Given("I click submenu Find a doctor")
    public void i_click_submenu_find_a_doctor() throws InterruptedException {
        homePage.outsidedr();
    }
    @Then("I Verify I am at the page by registion page")
    public void i_verify_i_am_at_the_page_by_registion_page() throws InterruptedException {
        homePage.outsidedrvalided("Blue Cross Blue Shield Global Core -- Home");
    }
    @Given("I click Access My benifits")
    public void i_click_access_my_benifits() {
        homePage.BcBSaccessMybenifits();
    }
    @Given("I I enter invalid number")
    public void i_i_enter_invalid_number() {
        homePage.BcBSaccessMybenifitsBox();
    }
    @When("I click go")
    public void i_click_go() {
        homePage.BcBSaccessMybenifitsGo();
    }
    @Then("I verify A pop up massage shows try again")
    public void i_verify_a_pop_up_massage_shows_try_again() {
        homePage.getText();
    }
    @Given("I click the health of america")
    public void i_click_the_health_of_america() {
        homePage.BcBStheHeathOfAmerica();
    }
    @Given("I I enter women's health in searchbox")
    public void i_i_enter_women_s_health_in_searchbox() {
        homePage.BcBStheHeathOfAmericaSearch();
    }
    @When("I click searchbutton")
    public void i_click_searchbutton() {
        homePage.BcBSclick();
    }
    @Then("I verify this search button workng properly i am at right page")
    public void i_verify_this_search_button_workng_properly_i_am_at_right_page() {
    }
    @Given("I click the menu left of the corner")
    public void i_click_the_menu_left_of_the_corner() throws InterruptedException {
        homePage.menu();
    }
    @Given("I select Employeyers from menu")
    public void i_select_employeyers_from_menu() {
        homePage.employes();
    }
    @Given("I select contact us from menu")
    public void i_select_contact_us_from_menu() throws InterruptedException {
        homePage.BcBsContactUs();
    }
    @Then("I verify the function of the menu is properly okay")
    public void i_verify_the_function_of_the_menu_is_properly_okay() {
    }
    @Given("I click The searchIteam")
    public void i_click_the_search_iteam() {
    }
    @Given("I enter women's health in searchbox")
    public void i_enter_women_s_health_in_searchbox() throws InterruptedException {
        homePage.clear1();
    }
    @Given("I enter Behavioral Health")
    public void i_enter_behavioral_Health() throws InterruptedException {
        homePage.typeOnInputBox();
    }
    @Given("I clearn the search iteam")
    public void i_clearn_the_search_iteam() {
    }
    @Given("I Returen Keys")
    public void i_returen_keys() {
    }
    @Then("I verify its working properly")
    public void i_verify_its_working_properly() {
    }
    @Given("I enter women's Health in searchbox")
    public void i_enter_women_s_Health_in_searchbox() {
        homePage.typeOnInputBox();
    }
    @Given("I enter Behavioral health")
    public void i_enter_behavioral_health() {
    }
    @Given("I click individual $ Families")
    public void i_click_individual_$_families() throws InterruptedException {
        homePage.indivudal();
    }
    @Given("I enter Valid zipcode th the box")
    public void i_enter_valid_zipcode_th_the_box() throws InterruptedException {
        homePage.BcBseditzip();
    }
    @Then("I verify a  pop up massage shows Empire Blue Cross")
    public void i_verify_a_pop_up_massage_shows_empire_blue_cross() {
    }
    @When("I click goButton")
    public void i_click_go_button() throws InterruptedException {
        homePage.editzipGo();
    }
    @Given("I verify alert is dismiss propely")
    public void i_verify_alert_is_dismiss_propely() {
        homePage.alertDismis();
    }
    @Given("I verify alert is Accept propely")
    public void i_verify_alert_is_accept_propely() {
        homePage.alertAccept();
    }
    @Given("I click learn")
    public void i_click_learn() {
        homePage.learncheck();
    }
    @When("I navigate this page")
    public void i_navigate_this_page() {
    }
    @Then("I verify a Learn top right corner of the page")
    public void i_verify_a_learn_top_right_corner_of_the_page() {
        homePage.BcBslearnvlided("Learn");
    }
    @Given("I click HEALTHOFAMERICA.COM")
    public void i_click_healthofamerica_com() throws InterruptedException {
        homePage.healthofamerica();
    }
    @Given("I click data$Reports")
    public void i_click_data$reports() {
        homePage.data$reports();
    }
    @Then("I findout the page")
    public void i_findout_the_page() {
    }
    @Then("I verify the page by pageTitle")
    public void i_verify_the_page_by_page_title() {
        homePage.data$reports("Data & Reports | Blue Cross Blue Shield");
    }

    @Given("I click Contact us")
    public void i_click_contact_us() throws InterruptedException {
        homePage.BcBsContactUs();
    }
    @When("I navigate to the page")
    public void i_navigate_to_the_page() {
    }
    @When("I scroll down")
    public void i_scroll_down() throws InterruptedException {
        homePage.scrollDown();
    }
    @When("I notice visit Member  service")
    public void i_notice_visit_member_service() {
    }
    @When("I click Visit member services")
    public void i_click_visit_member_services() {
        homePage.visitMember();
    }
    @When("I verify iam succesfully navigate to the page")
    public void i_verify_iam_succesfully_navigate_to_the_page() {
        homePage.visitMemberValied("Member Services | Blue Cross Blue Shield");
    }
    @Given("I want to wait until is click")
    public void i_want_to_wait_until_is_click() {
    }
    @Given("I click  Thehealth of America")
    public void i_click_thehealth_of_america() {
        homePage.healthOfAmerica();
    }
    @Given("I enter mentalhealth health in Searchbox")
    public void i_enter_mentalhealth_health_in_searchbox() {
        homePage.BcBStheHeathOfAmericasearchKey();
    }
    @Given("I click The Searchbutton")
    public void i_click_the_searchbutton() {
        homePage.BcBSclickwait();
    }
    @Given("I want to wait until is vasible")
    public void i_want_to_wait_until_is_vasible() {
        homePage.waitUntilVisible();
    }
    @Given("I Scroll down the home page")
    public void i_scroll_down_the_home_page() throws InterruptedException {
        homePage.scrollDown();
    }
    @When("I come to the down of the page")
    public void i_come_to_the_down_of_the_page() {
    }
    @Then("I verify  privacy policy option exit in the page")
    public void i_verify_privacy_policy_option_exit_in_the_page() throws InterruptedException {
        homePage.privacyPolicyValided("Privacy Policy");
    }
    @Given("I click the   on individualas $ familes")
    public void i_click_the_on_individualas_$_familes() {
        homePage.BcBsIndividualsFamilies();
    }

    @Given("I enter {string} in enter your Zip code box")
    public void i_enter_in_enter_your_zip_code_box(String ZipCode) throws InterruptedException {
        homePage.BcBseditzip1(ZipCode);
    }
    @And("I enter {string} in the choose state box")
    public void iEnterInTheChooseStateBox(String stateName) throws InterruptedException {
       // homePage.BcBschooseState;
    }
    @And("I click {string} in the choose state box")
    public void iClickInTheChooseStateBox(String stateName) throws InterruptedException {
        homePage.BcBschosestateClick();
    }
}
