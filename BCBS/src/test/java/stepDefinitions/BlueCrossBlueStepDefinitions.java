package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import blueCrossblue.BlueCrossBlueHomePage;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class BlueCrossBlueStepDefinitions extends WebAPI {


    static BlueCrossBlueHomePage blueCrossBlueHomePage;

    // Cucumber Hook
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
        blueCrossBlueHomePage = PageFactory.initElements(driver, BlueCrossBlueHomePage.class);
    }


    @Given("I am at BlueCrossBlueShield home page")
    public void i_am_at_blue_cross_blue_shield_home_page() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        openBrowser("https://www.bluecrossmn.com/");
    }

    @When("I click on Careers")
    public void i_click_on_careers() {
        // Write code here that turns the phrase above into concrete actions
        blueCrossBlueHomePage.clickOnCareers();
    }

    @Then("I verify Careers at Blue Cross is appear properly")
    public void i_verify_careers_at_blue_cross_is_appear_properly() {
        blueCrossBlueHomePage.validateCareersAtBlueCross();
    }


    @When("I click on About Us")
    public void i_click_on_about_us() {
        // Write code here that turns the phrase above into concrete actions
        blueCrossBlueHomePage.clickAboutOnAbout();
    }

    @Then("I verify About Us at Blue Cross is appear properly")
    public void i_verify_about_us_at_blue_cross_is_appear_properly() {
        blueCrossBlueHomePage.validateAboutUs();
    }


    @When("I click on Contact Us")
    public void i_click_on_contact_us() {
        blueCrossBlueHomePage.clickContactUs();
    }

    @Then("I verify Contact Us at is appear properly")
    public void i_verify_contact_us_at_is_appear_properly() {
        blueCrossBlueHomePage.validateContact();
    }

    @When("I click on Log In")
    public void i_click_on_log_in() {
        blueCrossBlueHomePage.clickLogIn();
    }

    @Then("I verify Log In at Blue Cross is appear properly")
    public void i_verify_log_in_at_blue_cross_is_appear_properly() {
        blueCrossBlueHomePage.validateLogIn();
    }

    @Given("I hover on For Members")
    public void i_hover_on_for_members() {
        blueCrossBlueHomePage.hoverForMembers();
    }

    @When("I click on log In And Register")
    public void i_click_on_log_in_and_register() {
        blueCrossBlueHomePage.clickLogInAndRegister();
    }

    @Then("I verify Member Log In at Blue Cross is appear properly")
    public void i_verify_member_log_in_at_blue_cross_is_appear_properly() {
        blueCrossBlueHomePage.validateMemberLogIn();
    }


    @When("I click on Shop Plans")
    public void i_click_on_shop_plans() {
        blueCrossBlueHomePage.clickShopPlans();
    }

    @Then("I verify Shop Plans is appear properly")
    public void i_verify_shop_plans_is_appear_properly() {
        blueCrossBlueHomePage.validateShopPlans();
    }


    @When("I click Find a doctor")
    public void i_click_find_a_doctor() {
        blueCrossBlueHomePage.clickFindADoctor();
    }

    @Then("I verify find a doctor is appear properly")
    public void i_verify_find_a_doctor_is_appear_properly() {
        blueCrossBlueHomePage.validateFindADoctor();
    }


    @When("I click on WellBeing")
    public void i_click_on_well_being() {
        blueCrossBlueHomePage.clickWellBeing();
    }

    @Then("I verify WellBeing is appear properly")
    public void i_verify_well_being_is_appear_properly() {
        blueCrossBlueHomePage.validateWellBeing();
    }


    @When("I click on Shop {int} Medicare Plane")
    public void i_click_on_shop_medicare_plane(Integer int1) {
        blueCrossBlueHomePage.clickShopMedicarePlans();
    }

    @When("I click view {int} medicare plans")
    public void i_click_view_medicare_plans(Integer int1) {
        blueCrossBlueHomePage.clickViewMedicarePlans1();
    }

    @Then("I verify {int} Medicare Plans is appear properly")
    public void i_verify_medicare_plans_is_appear_properly(Integer int1) {
        blueCrossBlueHomePage.validateMedicarePlans();
    }

    @When("I click on Shop individuals and family plans")
    public void i_click_on_shop_individuals_and_family_plans() {
        blueCrossBlueHomePage.clickShopIndividualAndFamilyPlans();
    }

    @When("I click shop plans")
    public void i_click_shop_plans() {
        blueCrossBlueHomePage.clickOnShopPlans();
    }

    @When("I click see individuals and family plans")
    public void i_click_see_individuals_and_family_plans() {
        blueCrossBlueHomePage.clickSeeIndividualAndFamilyPlans();
    }

    @Then("I verify {int} Individual and family health plans")
    public void i_verify_individual_and_family_health_plans(Integer int1) {
        blueCrossBlueHomePage.validateIndividualsAndFamilies();
    }

    @When("I click on Save with a vision plan")
    public void i_click_on_save_with_a_vision_plan() {
        blueCrossBlueHomePage.clickSaveWithVisionPlan();
    }

    @When("I click on see small vision plans")
    public void i_click_on_see_small_vision_plans() {
        blueCrossBlueHomePage.clickSeeSmallGroupVisionPlan();
    }

    @When("I click for Small Groups")
    public void i_click_for_small_groups() {
        blueCrossBlueHomePage.clickForSmallGroups();
    }

    @Then("I verify Blue Cross vision plans for small groups is appear properly")
    public void i_verify_blue_cross_vision_plans_for_small_groups_is_appear_properly() {
        blueCrossBlueHomePage.validateBlueCrossVisionPlansForSmallGroups();
    }


    @When("I click Careers")
    public void i_click_careers() {
        blueCrossBlueHomePage.clickCareers();
    }

    @When("I click On Our Story")
    public void i_click_on_our_story() {
        blueCrossBlueHomePage.sendKeyWords();
    }

    @Then("I verify Our Story is appear properly")
    public void i_verify_our_story_is_appear_properly() {
        blueCrossBlueHomePage.validateOurStory();
    }


    @When("I click On Locations")
    public void i_click_on_locations() {
        blueCrossBlueHomePage.clickLocations();
    }

    @Then("I verify Lcations is appear properly")
    public void i_verify_lcations_is_appear_properly() {
        blueCrossBlueHomePage.validateLocations();
    }

    @When("I click Careers Areas")
    public void i_click_careers_areas() {
        blueCrossBlueHomePage.clickCareersAreas();
    }

    @Then("I verify career areas is appear properly")
    public void i_verify_career_areas_is_appear_properly() {
        blueCrossBlueHomePage.validateCareerAreas();
    }

    @When("I hover on Why Work For Us")
    public void i_hover_on_why_work_for_us() {
        blueCrossBlueHomePage.hoverWhyWorkForUs();
    }

    @When("I click Candidate FAQs")
    public void i_click_candidate_fa_qs() {
        blueCrossBlueHomePage.clickCandidateFAQs();
    }

    @Then("I verify Candidate FAQs is appear properly")
    public void i_verify_candidate_fa_qs_is_appear_properly() {
        blueCrossBlueHomePage.ValidateCandidateFAQs();
    }


    @When("I click On WellBeing")
    public void i_click_well_being() {
        blueCrossBlueHomePage.clickOnWellBeing();
    }

    @When("I click See Health Programs")
    public void i_click_see_health_programs() {
        blueCrossBlueHomePage.clickSeeHealthPrograms();
    }

    @Then("I verify Health programs and discounts is appear properly")
    public void i_verify_health_programs_and_discounts_is_appear_properly() {
        blueCrossBlueHomePage.ValidateSeeHealthPrograms();
    }

    @When("I click On ShareCare Real Age Test Icon")
    public void i_click_on_share_care_real_age_test_icon() {
        blueCrossBlueHomePage.clickShareCareRealAgeTestIcon();
    }


    @Then("I verify Live your healthiest life is appear properly")
    public void i_verify_live_your_healthiest_life_is_appear_properly() {
        blueCrossBlueHomePage.validateLiveYourHealthiestLife();
    }


    @Given("I enter COVID-{int} in searchBox")
    public void i_enter_covid_in_search_box(Integer int1) {
        blueCrossBlueHomePage.enterKeyWords();
    }

    @When("I click on search Button")
    public void i_click_on_search_button() {
        blueCrossBlueHomePage.clickSearchButton();
    }

    @Then("I verify COVID-{int} is appear properly")
    public void i_verify_covid_is_appear_properly(Integer int1) {
        blueCrossBlueHomePage.validateCovid();
    }

    @Given("I enter CareGiver in searchBox")
    public void i_enter_care_giver_in_search_box() {
        blueCrossBlueHomePage.enterSearchKey();
    }

    @Then("I verify CareGiver is appear properly")
    public void i_verify_care_giver_is_appear_properly() {
        blueCrossBlueHomePage.validateSearchText();
    }


    @Given("I am at Member Log In home page")
    public void i_am_at_member_log_in_home_page() throws IOException {
        openBrowser("https://www.bluecrossmn.com/for-members");
    }

    @Given("I click log in to your account")
    public void i_click_log_in_to_your_account() {
        blueCrossBlueHomePage.clickLogInToYourAccount();
    }

    @Given("I enter invalid username")
    public void i_enter_invalid_username() {
        blueCrossBlueHomePage.enterInvalidUserName();
    }

    @Given("I enter valid password")
    public void i_enter_valid_password() {
        blueCrossBlueHomePage.enterValidPassword();
    }

    @When("I click on log in button")
    public void i_click_on_log_in_button() {
        blueCrossBlueHomePage.clickLogInButton();
    }

    @Then("I verify Incorrect username or password.")
    public void i_verify_incorrect_username_or_password() {
        blueCrossBlueHomePage.validateIncorrectUserNameOrPassWord();
    }


    @Given("I am at Register home page")
    public void i_am_at_register_home_page() throws IOException {
        openBrowser("https://www.bluecrossmnonline.com/login/#/register");
    }

    @Given("I enter Member ID")
    public void i_enter_member_id() throws InterruptedException {
        blueCrossBlueHomePage.enterKeyWords1();
        sleepFor(4);
    }

    @Given("I delete the Member ID again")
    public void i_delete_the_member_id_again() throws InterruptedException {
        blueCrossBlueHomePage.deleteMemberID();
        sleepFor(4);
    }

    @When("I click next")
    public void i_click_next() throws InterruptedException {
        blueCrossBlueHomePage.clickNextButton();
        sleepFor(4);
    }

    @Then("I verify SOME OF YOUR INFO DOESN'T MATCH OUR FILES")
    public void i_verify_some_of_your_info_doesn_t_match_our_files() {
        blueCrossBlueHomePage.validateMemberID();
    }

    @Given("I hover Select Language")
    public void i_hover_select_language() {
        blueCrossBlueHomePage.hoverSelectLanguage();
    }

    @When("I click All Languages")
    public void i_click_all_languages() throws InterruptedException {
        blueCrossBlueHomePage.clickAllLanguages();
        sleepFor(4);
    }
    @Then("I verify sheet with different languages appear properly")
    public void i_verify_sheet_with_different_languages_appear_properly() {
        blueCrossBlueHomePage.validateSelectLanguages();
    }

    @Given("I am at Welcome home page")
    public void i_am_at_welcome_home_page() throws IOException {
        openBrowser("https://www.bluecrossmnonline.com/login/#/custom-landing");
    }

    @Given("I hover Select Size")
    public void i_hover_select_size() throws InterruptedException {
        blueCrossBlueHomePage.hoverSelectSize();
        sleepFor(4);
    }

    @When("I click medium size")
    public void i_click_medium_size() throws InterruptedException {
        blueCrossBlueHomePage.clickInMediumFontSize();
        sleepFor(4);
    }

    @When("I click Need Help Button")
    public void i_click_need_help_button() throws InterruptedException {
        blueCrossBlueHomePage.clickNeedHelpButton();
        sleepFor(4);
    }

    @Then("I verify the page is with medium size")
    public void i_verify_the_page_is_with_medium_size() {
        blueCrossBlueHomePage.validateMediumSize();
    }

    @Then("the Call for help is appear properly")
    public void the_call_for_help_is_appear_properly() {
        blueCrossBlueHomePage.validateCallForHelp();
    }

    @When("I click on newsroom")
    public void i_click_on_newsroom() {
        blueCrossBlueHomePage.clickNewsRoom();
    }
    @Then("I verify page title as newsroom")
    public void i_verify_page_title_as_newsroom() {
       blueCrossBlueHomePage.validateTheNewsRoom();
        String expectedTitle = "Latest news";
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
        Assert.assertEquals("", "", "");
    }


    @When("I click on Board")
    public void i_click_on_board() {
        blueCrossBlueHomePage.clickOnBoard();
    }

    @Then("I verify Board of Trustees is exist")
    public void i_verify_board_of_trustees_is_exist() {
        blueCrossBlueHomePage.validateBoardOfTrustees();

    }

}




























































