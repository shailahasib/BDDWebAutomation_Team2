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
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Given("I am at t-mobile home page")
    public void i_am_at_t_mobile_home_page() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        openBrowser("https://www.t-mobile.com/");

    }

    @Given("I click on account button")
    public void i_click_on_account_button() {homePage.clickOnMyAccount();

    }
    @Given("I click on log in")
    public void i_click_on_log_in() {homePage.clickOnLogIn();

    }

    @Given("I click on bill pay")
    public void i_click_on_bill_pay() {homePage.clickBillPay();

    }

    @When("I enter email address")
    public void i_enter_email_address() {homePage.enterEmailOrPhoneNumberOrUsername();

    }

    @When("I click on next button")
    public void i_click_on_next_button() {homePage.clickOnNext();

    }

    @When("I enter password")
    public void i_enter_password() {homePage.enterPassword();

    }

    @Then("I click on log in button")
    public void i_click_on_log_in_button() {homePage.clickLogInButton();

    }
    @Then("I validate log in")
    public void i_validate_log_in() {homePage.validateLogIn("My T-Mobile Login - Pay Bills Online & Manage Your T-Mobile Account");

    }
    @Then("I validate log in bill pay")
    public void i_validate_log_in_bill_pay() {
        homePage.validateBillPay("My T-Mobile Login - Pay Bills Online & Manage Your T-Mobile Account");

    }
//    ######################################################

    @Given("I click on plans")
    public void i_click_on_plans() {homePage.clickOnPlans();

    }

    @Given("I click on magenta start shopping")
    public void i_click_on_magenta_start_shopping() {homePage.clickOnStartShopping();

    }

    @When("I click on change plan")
    public void i_click_on_change_plan() {homePage.clickOnChangePlans();

    }

    @Then("I select plan on essential")
    public void i_select_plan_on_essential() {homePage.clickOnSelectPlans();

    }
    @Then("I validate a plan")
    public void i_validate_a_plan() {homePage.validatePlans("cart");

    }

//    ############################################
@Given("I click on deals")
public void i_click_on_deals() {homePage.clickOnDeals();

}

    @Given("I click on iphone12 shop now")
    public void i_click_on_iphone12_shop_now() {homePage.clickOnShopNowOnIphone12();

    }

    @When("I select the memory")
    public void i_select_the_memory() {homePage.select120GB();

    }

    @When("I select color")
    public void i_select_color() {homePage.selectRedColor();

    }

    @Then("I click on upgrade")
    public void i_click_on_upgrade() {homePage.clickOnUpgrade();

    }

    @Then("I validate deals title")
    public void i_validate_deals_title() {homePage.validateDealsTitle("Apple iPhone 12 | 5 colors in 64GB, 256GB & 128GB | T-Mobile");

    }

//    ######################################
@Given("I click on order status")
public void i_click_on_order_status() { homePage.clickOnChekOrderStatus();

}

    @Given("I enter order number")
    public void i_enter_order_number() {homePage.clickOnOrderNumber();

    }

    @Given("I enter billing zip cod")
    public void i_enter_billing_zip_cod() {homePage.clickOnBillingZipCod();

    }

    @When("I enter last name")
    public void i_enter_last_name() {homePage.clickOnLastName();

    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {homePage.clickOnContinueButton();

    }

    @Then("I validate title")
    public void i_validate_title() {homePage.validateTitle("Order Status");

    }
//    #########################################
@Given("I click on t-mobile careers")
public void i_click_on_t_mobile_careers() {homePage.clickOnTMobileCareers();

}

    @Given("I click browser open position")
    public void i_click_browser_open_position() {homePage.clickBrowserOpenPosition();

    }

    @Given("I enter keyword")
    public void i_enter_keyword() {homePage.enterKeyword();

    }

    @When("I enter zip cod or city or state")
    public void i_enter_zip_cod_or_city_or_state() {homePage.enterZipCodOrCityOrState();

    }

    @Then("I click on search button")
    public void i_click_on_search_button() {homePage.clickOnSearchButton();

    }

    @Then("I validate title1")
    public void i_validate_title1() {homePage.validateTitle1("Job Search");
    }
   // ############################################
   @Given("I click on prepaid")
   public void i_click_on_prepaid() {homePage.clickOnPrepaid();

   }

    @Given("I click on shop plans")
    public void i_click_on_shop_plans() {homePage.clickOnShopPlans();
    }

    @Given("I click on chick it out")
    public void i_click_on_chick_it_out() {homePage.clickOnShopPrepaidPlans();
    }

//    @Given("I enter zip cod")
//    public void i_enter_zip_cod() {homePage.enterZipCod();
//    }
//
//    @Given("I click on continue button1")
//    public void i_click_on_continue_button1() {homePage.clickOnContinueButton1();
//    }
//
//    @When("I select a plans")
//    public void i_select_a_plans() {homePage.selectPlan();
//    }
//
//    @When("I click select button")
//    public void i_click_select_button() {homePage.clickOnSelectButton();
//    }
//
//    @Then("I click new customer")
//    public void i_click_new_customer() {homePage.clickOnNewCustomer();
//    }

    @Then("I validate title text")
    public void i_validate_title_text() {homePage.validateTitleText("Prepaid Phones | Browse Prepaid Smartphones | T-Mobile");
    }

//##############################
    @When("I click on international")
    public void i_click_on_international() {homePage.clickOnInternational();
    }

    @Then("I click on international  calling with out USA")
    public void i_click_on_international_calling_with_out_usa() {homePage.clickOnInternationalCallingWithOutUSA();
    }

    @Then("I validate international title")
    public void i_validate_international_title() {homePage.validateInternationalTitle("Make an international call | T-Mobile Support");
    }
    //#############################

    @Given("I click on travel")
    public void i_click_on_travel() {homePage.clickOnTravel();

    }

    @Given("I click on find out more")
    public void i_click_on_find_out_more() {homePage.clickOnFindOutMore();
    }

    @When("I enter destination")
    public void i_enter_destination() {homePage.enterDestination();
    }

    @Then("I click on coverage button")
    public void i_click_on_coverage_button() {homePage.clickOnChekCoverageButton();
    }

    @Then("I validate destination title")
    public void i_validate_destination_title() {homePage.validateDestinationTitle("International Plans | Traveling Abroad without Roaming Fees | T-Mobile");
    }
    //###########################################
    @Given("I click on device protection")
    public void i_click_on_device_protection() {homePage.clickOnDeviceProtection();
    }
    @Given("I click on get started")
    public void i_click_on_get_started() {homePage.clickOnGetStarted();
    }

    @Given("I click on mobile number")
    public void i_click_on_mobile_number() {homePage.clickOnMobileNumber();
    }

    @Given("I enter digit number")
    public void i_enter_digit_number() {homePage.enter10DigitNumber();
    }

//    @When("I click on I'm not robot")
//    public void i_click_on_i_m_not_robot() {homePage.clickOnIamNotRobot();
//    }

    @Then("I click on submit button")
    public void i_click_on_submit_button() {homePage.clickOnSubmitButton();
    }

    @Then("I validate device protection title")
    public void i_validate_device_protection_title() {homePage.validateDeviseProtectionTitle("File or Track My Claim | T-Mobile | Assurant");
    }
    //##################################################
    @Given("I click on my account")
    public void i_click_on_my_account() {homePage.clickOnMyAccount1();
    }
    @Given("I click on log in1")
    public void i_click_on_log_in1() {homePage.clickOnLogIn1();
    }

    @Given("I click on forgot password")
    public void i_click_on_forgot_password() {homePage.clickForgotLogInfo();
    }

    @Given("I enter email or phone number")
    public void i_enter_email_or_phone_number() {homePage.enterEmailOrPhoneNumber();
    }

    @Given("I click on email send cod")
    public void i_click_on_email_send_cod() {homePage.enterCod();
    }
    @Given("I click on continue button1")
    public void i_click_on_continue_button1() {homePage.clickContinueButton1();
    }




    @When("I enter digit cod")
    public void i_enter_digit_cod() {homePage.enter6DigitCod();
    }

    @When("I click on submit cod")
    public void i_click_on_submit_cod() {homePage.clickSubmitCod();
    }

    @When("I enter new password")
    public void i_enter_new_password() {homePage.enterNewPassword();
    }

    @When("I re enter new password")
    public void i_re_enter_new_password() {homePage.reEnterNewPassword();
    }

    @Then("I click on rest password button")
    public void i_click_on_rest_password_button() {homePage.clickResetPasswordButton();
    }

    @Then("I validate new password Title")
    public void i_validate_new_password_title() {homePage.validateNewPasswordTitle("Accounts Overview");

    }





}
