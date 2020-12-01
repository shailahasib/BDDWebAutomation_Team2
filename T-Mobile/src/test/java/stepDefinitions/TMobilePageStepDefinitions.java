package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tmobile.TMobileHomePage;

import java.io.IOException;

public class TMobilePageStepDefinitions extends WebAPI {


    static TMobileHomePage tMobileHomePage;
    private String Samsung;

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
        tMobileHomePage = PageFactory.initElements(driver, TMobileHomePage.class);
    }

    @Given("I am at T-Mobile Home Page")
    public void i_am_at_t_mobile_home_page() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        openBrowser("https://www.t-mobile.com/");
        sleepFor(4);
    }

    @When("I click on Cell Phones")
    public void i_click_on_cell_phones() throws InterruptedException {
        tMobileHomePage.clickCells();
        sleepFor(4);
    }

    @Then("I verify Phones is exist")
    public void i_verify_phones_is_exist() throws InterruptedException {
        tMobileHomePage.validatePhone();
        sleepFor(3);
    }


    @When("I click on Phones And Devices")
    public void i_click_on_phones_and_devices() {
        tMobileHomePage.clickPhonesAndDevices();
    }

    @When("I click on Tablets and devices")
    public void i_click_on_tablets_and_devices() throws InterruptedException {
        tMobileHomePage.clickTabletsAndDevices();
        sleepFor(4);
    }

    @Then("I verify Tablets and devices is appear properly")
    public void i_verify_tablets_and_devices_is_appear_properly() {
        tMobileHomePage.validateTabletsAndPhones();
    }

    //3
    @When("I click on Smart Watches")
    public void i_click_on_smart_watches() throws InterruptedException {
        tMobileHomePage.clickSmartAndWatches();
        sleepFor(3);
    }

    @Then("I verify Smart Watches is appear properly")
    public void i_verify_smart_watches_is_appear_properly() {
        tMobileHomePage.validateSmartAndWatches();
    }

    //4
    @When("I click on Accessories")
    public void i_click_on_accessories() throws InterruptedException {
        tMobileHomePage.clickAccessories();
        sleepFor(4);
    }

    @Then("I verify Accessories is appear properly")
    public void i_verify_accessories_is_appear_properly() {
        tMobileHomePage.validateAccessories();
    }

    //5
    @Given("I hover Accessories")
    public void i_hover_accessories() throws InterruptedException {
        tMobileHomePage.HoverCasesAndCavers();
        sleepFor(4);
    }

    @When("I click on Cases and Cavers")
    public void i_click_on_cases_and_cavers() throws InterruptedException {
        tMobileHomePage.clickOnCasesAndCovers();
        sleepFor(5);
    }

    @Then("I verify Cases and Cavers is appear properly")
    public void i_verify_cases_and_cavers_is_appear_properly() throws InterruptedException {
        tMobileHomePage.validateOnCasesAndCovers();

    }

    //8
    @Given("I hover Deals")
    public void i_hover_deals() {
        tMobileHomePage.clickDeals();
    }

    @When("I click on New check Box")
    public void i_click_on_new_check_box() {
        tMobileHomePage.checkNewBox();
    }

    @Then("I verify New Phones is appear properly")
    public void i_verify_new_phones_is_appear_properly() {
        tMobileHomePage.validateCheckBox();
    }

    //9
    @When("I hover SortBy")
    public void i_hover_sort_by() throws InterruptedException {
        tMobileHomePage.hoverSortBy();
    }
    @When("I check Price Low to High")
    public void i_check_price_low_to_high() throws InterruptedException {
        tMobileHomePage.checkListName("");
    }
    @When("I click {string}")
    public void i_click(String listName) throws InterruptedException {
        tMobileHomePage.checkListName(listName);
    }

    @Then("I get {string} is exist properly")
    public void iGetIsExistProperly(String arg0) {
        tMobileHomePage.getURL();
    }

    @Then("I verify Price Low to High is appear properly")
    public void i_verify_price_low_to_high_is_appear_properly() throws InterruptedException {
        tMobileHomePage.validateCheckListName("Sort by: Price Low to High");
        sleepFor(5);
    }
    @Then("I verify {string} is exist properly")
    public void i_verify_is_exist_properly(String validListName) throws InterruptedException {
        tMobileHomePage.validateCheckListName(validListName);
    }

    @Then("I verify page title as Cell Phones & Smartphones Shop the Newest Mobile Phones T-Mobile")
    public void i_verify_page_title_as_cell_phones_smartphones_shop_the_newest_mobile_phones_t_mobile() {
        String expectedTitle = "Cell Phones & Smartphones | Shop the Newest Mobile Phones | T-Mobile";
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    @Given("I am at T-Mobile And Prepaid Home Page")
    public void i_am_at_t_mobile_and_prepaid_home_page() throws IOException {
        openBrowser("https://prepaid.t-mobile.com/home");
    }

    @Given("I open search Box")
    public void i_open_search_box() throws InterruptedException {
        tMobileHomePage.openSearchBoxS();

    }

    @Given("I enter headset in search box")
    public void i_enter_headset_in_search_box() {
        tMobileHomePage.enterSearchKeyWords("laptop LG");
    }
    @Given("I enter {string} in search box")
    public void i_enter_in_search_box(String productName) {
        tMobileHomePage.enterSearchKeyWords(productName);
    }

    @When("I click on Search Button")
    public void i_click_on_search_button() throws InterruptedException {
        tMobileHomePage.clickSearchButton();
       sleepFor(4);
    }
    @And("I inspect headset")
    public void iInspectHeadset() throws InterruptedException {
        tMobileHomePage.inspectOnHeadset("laptop LG");
    }
    @And("I inspect {string}")
    public void iInspect(String PopularSearches) throws InterruptedException {
        tMobileHomePage.inspectOnHeadset(PopularSearches);
    }

    @Then("I verify headset is appear properly")
    public void i_verify_headset_is_appear_properly() throws InterruptedException {
        tMobileHomePage.validateSearchText("laptop LG");
        sleepFor(4);
    }
    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String validProductName) throws InterruptedException {
        tMobileHomePage.validateSearchText(validProductName);
        sleepFor(4);
    }
    @Then("I verify page title as search headset")
    public void i_verify_page_title_as_search_headset() {
        String expectedTitle = "T-Mobile";
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
        Assert.assertEquals("", "", "");
    }


    @Given("I hover On plans")
    public void i_hover_on_plans() {
        tMobileHomePage.plansHover1();
    }

    @When("I click on T_mobile connect")
    public void i_click_on_t_mobile_connect() {
        tMobileHomePage.ByXPath();
    }

    @Then("I verify T_mobile connect is appear properly")
    public void i_verify_t_mobile_connect_is_appear_properly() {
        tMobileHomePage.validateYourPhone1("T-MOBILE CONNECT");
    }

    @Given("I enter samsung galaxy {int} in search box")
    public void i_enter_samsung_galaxy_in_search_box(Integer int1) {
        tMobileHomePage.enterKeyWords1();
    }

    @And("I inspect on samsung galaxy 11")
    public void iInspect_on_samsung_galaxy () throws InterruptedException {
        tMobileHomePage.inspectOnSamsung("samsung galaxy note 20 ultra");
    }

    @Then("I verify samsung galaxy {int} is appear properly")
    public void i_verify_samsung_galaxy_is_appear_properly(Integer int1) throws InterruptedException {
        tMobileHomePage.validateSearchText1("samsung galaxy 11 (181)");
        sleepFor(4);
    }

    @Given("I hover on Deals")
    public void i_hover_on_deals() throws InterruptedException {
        tMobileHomePage.dealsHover();
    }

    @When("I click on Samsung")
    public void i_click_on_samsung() {
       tMobileHomePage.ByXPATH();
    }

    @Then("I verify Samsung is appear properly")
    public void i_verify_samsung_is_appear_properly() {
        tMobileHomePage.validateOnSamsung("Make the season bright with Samsung phone and device deals.");
    }
//
    @When("I hover Plans")
    public void i_hover_plans() {
        tMobileHomePage.plansHover();
    }

    @When("I click on Essentials")
    public void i_click_on_essentials() {
        tMobileHomePage.ByCssSelector();
    }

    @Then("I verify Essentials is appear properly")
    public void i_verify_essentials_is_appear_properly() {
        tMobileHomePage.validateEssentials("Plan discounts.");
    }

    @When("I hover Phones and Devices")
    public void i_hover_phones_and_devices() {
        tMobileHomePage.phonesAndDevicesHover();
    }

    @When("I click on Bring your own phone")
    public void i_click_on_bring_your_own_phone() {
        tMobileHomePage.ByXPATH();
    }

    @Then("I verify Bring your own phone is appear properly")
    public void i_verify_bring_your_own_phone_is_appear_properly() {
        tMobileHomePage.validateYourPhone("Love your phone? Bring it to T-Mobile.");
    }


    @Given("I am at T-Mobile And business Home Page")
    public void i_am_at_t_mobile_and_business_home_page() throws IOException {
       openBrowser("https://www.t-mobile.com/business");
    }

    @Given("I hover On business solutions")
    public void i_hover_on_business_solutions() {
        tMobileHomePage.HoverOnBusiness();
    }

    @When("I click on trends and insights")
    public void i_click_on_trends_and_insights() {
        tMobileHomePage.ByXPath();
    }

    @Then("I verify trends and insights is appear properly")
    public void i_verify_trends_and_insights_is_appear_properly() {
        tMobileHomePage.validateTrendsAndStoriesW("Trends. Insights. Success stories.");
    }

    @Then("I should not see success stories")
    public void i_should_not_see_success_stories() {

    }


    @Given("I hover contact us")
    public void i_hover_contact_us() {
        tMobileHomePage.HoverOnContactUs();
    }

    @Given("I click on get help")
    public void i_click_on_get_help() {
        tMobileHomePage.ByCssSelector();
    }

    @Then("I verify popup window make a call is appear properly")
    public void i_verify_popup_window_make_a_call_is_appear_properly() {

    }

    @Given("I hover On business")
    public void i_hover_on_business() throws InterruptedException {
        tMobileHomePage.HoverOnHoverBusinessWeb();
    }

    @When("I click on HealthCare")
    public void i_click_on_health_care() {
        tMobileHomePage.ByXPATH1();
    }

    @Then("I verify HealthCare is appear properly")
    public void i_verify_health_care_is_appear_properly() {
        tMobileHomePage.validateHealthCare("HEALTHCARE");
    }


    @Given("I hover On business And solutions")
    public void i_hover_on_business_and_solutions() throws InterruptedException {
        tMobileHomePage.hoverOnBusinessWeb();
    }

    @When("I click education")
    public void i_click_education() {
        tMobileHomePage.ByXPATH2();
    }

    @Then("I verify education is appear properly")
    public void i_verify_education_is_appear_properly() {
        tMobileHomePage.validateEducations("EDUCATION");
    }

    @Given("I hover On business And solution")
    public void i_hover_on_business_and_solution() throws InterruptedException {
        tMobileHomePage.hoverOnBusinessWeb1();
    }

    @When("I click Fleet Management")
    public void i_click_fleet_management() {
        tMobileHomePage.ByXPATH3();
    }

    @Then("I verify FLEET MANAGEMENT SOLUTIONS is appear properly")
    public void i_verify_fleet_management_solutions_is_appear_properly() {
        tMobileHomePage.validateOnFleetAndManagement("FLEET MANAGEMENT SOLUTIONS");
    }


    @Given("I hover On Plan")
    public void i_hover_on_plan() throws InterruptedException {
        tMobileHomePage.hoverOnPlan();
    }

    @When("I click on Magenta Military plan for service")
    public void i_click_on_magenta_military_plan_for_service() {
        tMobileHomePage.validateEssentials();
    }

    @Then("I verify MAGENTA® MILITARY FOR BUSINESS is appear properly")
    public void i_verify_magenta_military_for_business_is_appear_properly() {
        tMobileHomePage.validateOnMagenta("MAGENTA® MILITARY FOR BUSINESS");
    }

    @Given("I hover Plan")
    public void i_hover_plan() throws InterruptedException {
        tMobileHomePage.hoverOnPlan1();
    }

    @When("I click on Magenta for Business")
    public void i_click_on_magenta_for_business() {
        tMobileHomePage.ById();
    }

    @Then("I verify Magenta for Business is appear properly")
    public void i_verify_magenta_for_business_is_appear_properly() {
        tMobileHomePage.validateMagentaForBusiness("MAGENTA® FOR BUSINESS");
    }

    @Given("I hover on coverage")
    public void i_hover_on_coverage() throws InterruptedException {
        tMobileHomePage.hoverOnCoverage();
    }

    @When("I click on International Coverage")
    public void i_click_on_international_coverage() {
        tMobileHomePage.ByCssSelector1();
    }

    @Then("I verify Keep your team covered internationally is appear")
    public void i_verify_keep_your_team_covered_internationally_is_appear() {
        tMobileHomePage.validateInternationalCoverage("Keep your team covered internationally.");
    }

    @Given("I hover Coverage")
    public void i_hover_coverage() throws InterruptedException {
        tMobileHomePage.hoverOnBusiness1();
    }

    @When("I click on 5G coverage map")
    public void i_click_on_5g_coverage_map() {
        tMobileHomePage.ByCssSelector3();
    }

    @Then("I verify We’re transforming wireless for government is appear")
    public void iVerifyWeReTransformingWirelessForGovernmentIsAppear() {
        tMobileHomePage.validateTransformingWireless();
    }

    @Then("I verify all active links")
    public void iVerifyAllActiveLinks() {
        tMobileHomePage.TMobileBrokenActiveLink();
    }
}






