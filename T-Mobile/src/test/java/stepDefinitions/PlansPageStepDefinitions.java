package stepDefinitions;


import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import plans.PlansPage;

import java.io.IOException;

public class PlansPageStepDefinitions extends WebAPI {

 static PlansPage plansPage;

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
  plansPage = PageFactory.initElements(driver, PlansPage.class);
 }

 @Given("I am at home page")
 public void i_am_at_home_page() throws IOException {
  // Write code here that turns the phrase above into concrete actions
  openBrowser("https://www.t-mobile.com/");
 }

 @Given("I click on plans")
 public void i_click_on_plans() {
  plansPage.clickOnPlans();

 }

 @Then("I click on see haw to get a 3rd line free")
 public void i_click_on_see_haw_to_get_a_3rd_line_free() {
  plansPage.clickOnSeeHawToGetA3rdLineFree();
 }

 @Then("i click on find a store")
 public void i_click_on_find_a_store() {
  plansPage.clickOnFindAStore();

 }

 @Then("I validate on see haw to get a 3rd line free title")
 public void i_validate_on_see_haw_to_get_a_3rd_line_free_title() {
  plansPage.validateSeeHawToGetA3rdLineFreeTitle("Mobile Phones, Plans & Covers at a T-Mobile Store Near You | T-Mobile");
 }

 ;


 @Given("I click on plans1")
 public void i_click_on_plans1() {
  plansPage.clickOnPlans1();

 }

 @When("I click on start shopping")
 public void i_click_on_start_shopping() {
  plansPage.clickOnStartChopping();

 }

 @Then("i click on  shopPhones")
 public void i_click_on_shop_phones() {
  plansPage.clickOnShopPhones();

 }

 @Then("i validate on start shopping")
 public void i_validate_on_start_shopping() {
  plansPage.validatesStartChopping("Cell Phones & Smartphones | Shop the Newest Mobile Phones | T-Mobile");

 }
 @Given("I click on plans2")
 public void i_click_on_plans2() {plansPage.clickOnPlans2();

 }

 @When("I click on start shopping1")
 public void i_click_on_start_shopping1() {plansPage.clickOnStartChopping1();

 }

 @Then("i click on  shopTablets")
 public void i_click_on_shop_tablets() {plansPage.clickOnShopTablets();

 }

 @Then("i validate on start shopping1")
 public void i_validate_on_start_shopping1() {plansPage.validateStartChopping1("Tablets & Internet Devices for Sale | T-Mobile");

 }


 @Given("I click on plans3")
 public void i_click_on_plans3() {plansPage.clickOnPlans3();

 }

 @When("I click on start shopping3")
 public void i_click_on_start_shopping3() {plansPage.clickOnStartShopping3();

 }
 @Then("i click on  shopAccessories")
 public void i_click_on_shop_accessories() {plansPage.clickOnShopAccessories();

 }

 @Then("i validate on start shopping3")
 public void i_validate_on_start_shopping3() {plansPage.validateStartChopping3("Cell Phone Accessories | Bluetooth, Cases, Covers & More | T-Mobile");

 }


 @Given("I click on plans4")
 public void i_click_on_plans4() { plansPage.clickOnPlans4();

 }

 @When("I click on start shopping4")
 public void i_click_on_start_shopping4() {plansPage.clickOnStartShopping4();

 }

 @Then("i click on  bringYourOwnDevice")
 public void i_click_on_bring_your_own_device() {plansPage.clickOnBringYourOwnDevice();

 }

 @Then("i validate on start shopping4")
 public void i_validate_on_start_shopping4() {plansPage.validateStartChopping4("T-Mobile® SIM Card | Cell Phones at T-Mobile");

 }

 @Given("I click on plans5")
 public void i_click_on_plans5() {plansPage.clickOnPlans5();

 }

 @Then("i click on  smartWatches")
 public void i_click_on_smart_watches() {plansPage.clickOnShopSmartWatches();

 }

 @Then("i validate on start shopping5")
 public void i_validate_on_start_shopping5() {plansPage.validateStartChopping5("The Latest Smart Watches from the Best Brands | T-Mobile");

 }

 @Given("I click on plans6")
 public void i_click_on_plans6() {plansPage.clickOnPlans6();

 }

 @Then("i click on  change plans")
 public void i_click_on_change_plans() {plansPage.clickOnChangePlans();

 }

 @Then("i validate on start shopping6")
 public void i_validate_on_start_shopping6() {plansPage.validateStartChopping6("plans");

 }
 @Given("I click on plans7")
 public void i_click_on_plans7() {plansPage.clickOnPlans7();

 }

 @When("I click on see  Unlimited {int} Plans")
 public void i_click_on_see_unlimited_plans(Integer int1) {plansPage.clickOnSeeUnlimited55Plans();

 }

 @Then("I click On see Price BreakDown")
 public void i_click_on_see_price_break_down() {plansPage.clickOnSeePriceBreakDownWebElement();

 }
 @Then("I validate on see  Unlimited {int} Plans")
 public void i_validate_on_see_unlimited_plans(Integer int1) {plansPage.validateSeeUnlimited55Plans("Unlimited 55+ Discount Cell Phone Plans for Seniors | T-Mobile");

 }

 @Given("I click on plans8")
 public void i_click_on_plans8() {plansPage.clickOnPlans8();

 }

 @When("I click on  see  Unlimited {int} Plans1")
 public void i_click_on_see_unlimited_plans1(Integer int1) {plansPage.clickOnSeeUnlimited55Plans1();

 }

 @Then("I click On Shop Now1")
 public void i_click_on_shop_now1() {plansPage.shopNow1WebElement();

 }

 @Then("I validate on see Unlimited {int} Plans1")
 public void i_validate_on_see_unlimited_plans1(Integer int1) {plansPage.validateSeeUnlimited55Plans1("Cell Phones with Deals & Promotions | T-Mobile");

 }



 @Given("i click on plans9")
 public void i_click_on_plans9() {plansPage.clickOnPlans9();}

 @When("I click on  see  Unlimited {int} Plans2")
 public void i_click_on_see_unlimited_plans2(Integer int1) {plansPage.clickOnSeeUnlimited55Plans2();}


 @Then("I click On See full Terms")
 public void i_click_on_see_full_terms() {plansPage.clickSeeFullTermsWebElement();}

 @Then("I validate on see Unlimited {int} Plans2")
 public void i_validate_on_see_unlimited_plans2(Integer int1) {plansPage.validateSeeUnlimited55Plans2("Unlimited 55+ Discount Cell Phone Plans for Seniors | T-Mobile");

 }

 @Given("i click on plans10")
 public void i_click_on_plans10() {plansPage.clickOnPlans10();

 }

 @When("I click on  why t-mobile")
 public void i_click_on_why_t_mobile() {plansPage.clickOnWhyTMobil();

 }

 @Then("I click On chek out our reward")
 public void i_click_on_chek_out_our_reward() {plansPage.clickOnChekOutOurReward();

 }

 @Then("I validate on why t-mobile")
 public void i_validate_on_why_t_mobile() {plansPage.validateWhyTMobil("T-Mobile Awards & Recognition | National & Local Awards");

 }

 @Given("i click on plans11")
 public void i_click_on_plans11() {plansPage.clickOnPlans11();

 }

 @Then("I click On see What We AreDoing")
 public void i_click_on_see_what_we_are_doing() {plansPage.clickOnSeeWhatWeAreDoing();

 }

 @When("I click on  why t-mobile1")
 public void i_click_on_why_t_mobile1() {plansPage.clickOnWhyTMobil1();

 }

 @Then("I validate on why t-mobile1")
 public void i_validate_on_why_t_mobile1() {plansPage.validateWhyTMobil1("Responsibility | Community, Sustainability & More");

 }


 @Given("i click on plans12")
 public void i_click_on_plans12() {plansPage.clickOnPlans12();

 }

 @When("I click on  why t-mobile2")
 public void i_click_on_why_t_mobile2() {plansPage.clickOnWhyTMobil2();

 }

 @Then("I click On find out what next")
 public void i_click_on_find_out_what_next() {plansPage.clickOnFindOutWhatNext();

 }

 @Then("I validate on why t-mobile2")
 public void i_validate_on_why_t_mobile2() {plansPage.validateWhyTMobil2("Network & Innovation | 4G LTE, 5G & Beyond");

 }


 @Given("i click on plans13")
 public void i_click_on_plans13() {plansPage.clickOnPlans13();

 }

 @When("I click on  why t-mobile3")
 public void i_click_on_why_t_mobile3() {plansPage.clickOnWhyTMobil3();

 }

 @Then("I click On seeOurHistory")
 public void i_click_on_see_our_history() {plansPage.clickOnSeeOurHistoryFindOutWhatNext();

 }

 @Then("I validate on why t-mobile3")
 public void i_validate_on_why_t_mobile3() {plansPage.validateWhyTMobil3("Un-carrier History | Un-carrier Moves");

 }

 @Given("i click on plans14")
 public void i_click_on_plans14() {plansPage.clickOnPlans14();

 }

 @When("I click on  why t-mobile4")
 public void i_click_on_why_t_mobile4() {plansPage.clickOnWhyTMobil4();

 }

 @Then("I click On chekItOut")
 public void i_click_on_chek_it_out() {plansPage.clickOnChekItOut();

 }

 @Then("I validate on why t-mobile4")
 public void i_validate_on_why_t_mobile4() {plansPage.validateWhyTMobil4("Military Veterans | Deals, Events, Employment & More | T-Mobile");

 }


 @Given("i click on plans15")
 public void i_click_on_plans15() {plansPage.clickOnPlans15();

 }

 @When("I click on  why t-mobile5")
 public void i_click_on_why_t_mobile5() {plansPage.clickOnWhyTMobil5();

 }

 @Then("I click On more info")
 public void i_click_on_more_info() {plansPage.clickOnMoreInfo();

 }

 @Then("I validate on why t-mobile5")
 public void i_validate_on_why_t_mobile5() {plansPage.validateWhyTMobil5("Investing in Youth | Empowering Young People");

 }
 @Given("i click on plans16")
 public void i_click_on_plans16() {plansPage.clickOnPlans16();

 }

 @When("I click on  why t-mobile6")
 public void i_click_on_why_t_mobile6() {plansPage.clickOnWhyTMobil6();

 }

 @Then("I click On get The Details")
 public void i_click_on_get_the_details() {plansPage.clickOnGetTheDetails();

 }

 @Then("I validate on why t-mobile6")
 public void i_validate_on_why_t_mobile6() {plansPage.validateWhyTMobil6("Sustainability: Gearing Up to Go Green");

 }


 @Given("i click on plans17")
 public void i_click_on_plans17() {plansPage.clickOnPlans17();

 }

 @When("I click on  why t-mobile7")
 public void i_click_on_why_t_mobile7() {plansPage.clickOnWhyTMobil7();

 }

 @Then("I click On chek  it out1")
 public void i_click_on_chek_it_out1() {plansPage.clickOnChekItOut1();

 }

 @Then("I validate on why t-mobile7")
 public void i_validate_on_why_t_mobile7() {plansPage.validateWhyTMobil7("Emergency Response | Support for Outages & Natural Disasters");

 }


 @Given("i click on plans18")
 public void i_click_on_plans18() {plansPage.clickOnPlans18();

 }

 @When("I click on  why t-mobile8")
 public void i_click_on_why_t_mobile8() {plansPage.clickOnWhyTMobil8();

 }

 @Then("I click On see coverage")
 public void i_click_on_see_coverage() {plansPage.clickOnSeeCoverage();

 }

 @Then("I validate on why t-mobile8")
 public void i_validate_on_why_t_mobile8() {plansPage.validateWhyTMobil8("America's Largest 5G Network with T-Mobile & Sprint");

 }

 @Given("i click on plans19")
 public void i_click_on_plans19() {plansPage.clickOnPlans19();

 }

 @When("I click on holiyday on")
 public void i_click_on_holiyday_on() {plansPage.clickOnHolidayOn();

 }

 @Then("I click On seeAndroidDeals")
 public void i_click_on_see_android_deals() {plansPage.clickOnSeeAndroidDeals();

 }

 @Then("I validate on why t-mobile9")
 public void i_validate_on_why_t_mobile9() {plansPage.validateWhyTMobil9("Our Best Deals & Promotions on Cell Phones, Devices & Plans | T-Mobile");

 }


}
