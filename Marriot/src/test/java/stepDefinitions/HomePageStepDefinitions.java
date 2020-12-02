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


    @Given("I am at the home page")
    public void i_am_at_the_home_page() throws IOException {
        openBrowser("https://www.marriott.com/");
    }

    @Given("I click on sing in or join")
    public void i_click_on_sing_in_or_join() {homePage.clickOnSingInOrJoin();
    }

    @When("I enter email or member number")
    public void i_enter_email_or_member_number() {homePage.enterEmailOrMemberNumber();
    }

    @When("I enter password")
    public void i_enter_password() {homePage.enterPassword();
    }

    @Then("I click sing in button")
    public void i_click_sing_in_button() {homePage.clickOnSingInButton();
    }

    @Then("validate sing in title")
    public void validate_sing_in_title() {homePage.validateSingInTitle("Sign In");
    }
    //##########################

    @Given("I click on forgot password")
    public void i_click_on_forgot_password() {homePage.clickOnForgotPassword();
    }

    @When("I enter email or member number1")
    public void i_enter_email_or_member_number1() {homePage.enterEmailOrMemberNumber1();
    }

    @When("I enter firs name")
    public void i_enter_firs_name() {homePage.enterFirstName();
    }

    @When("I enter last name")
    public void i_enter_last_name() {homePage.enterLastName();
    }

    @When("I enter zip cod")
    public void i_enter_zip_cod() {homePage.enterZipCod();
    }

    @Then("I click on submit button")
    public void i_click_on_submit_button() {homePage.clickOnSubmitButton();
    }

    @Then("I validate Forgot password title")
    public void i_validate_forgot_password_title() {homePage.validateForgotTitle("Forgot Password");
    }
//#############################
    @Given("I click on find and reserve")
    public void i_click_on_find_and_reserve() {homePage.clickFindAndReserve();
    }
    @Given("I click on find hotel")
    public void i_click_on_find_hotel() {homePage.findHotel();
    }
    @When("I enter hotel keyword search")
    public void i_enter_hotel_keyword_search() {homePage.enterHotelKeywordSearch();
    }

    @Then("I click on search hotel button")
    public void i_click_on_search_hotel_button() {homePage.clickOnSearchHotelButton();
    }

    @Then("I validate find and reserve title")
    public void i_validate_find_and_reserve_title() {homePage.validateFindAndReserveTitle("Search Results");
    }
    //###################################

    @When("I click special offers")
    public void i_click_special_offers() {homePage.clickOnSpecialOffers();
    }

    @Then("I click on deals")
    public void i_click_on_deals() {homePage.clickOnDeals();
    }

    @Then("I validate special offers title")
    public void i_validate_special_offers_title() {homePage.validateDealsTitle("Special Offers & Travel Deals | Marriott Bonvoy");
    }
    //###################
    @Then("I click on shop marriott")
    public void i_click_on_shop_marriott() {homePage.clickOnShopMarriott();
    }
    @When("I enter email address")
    public void i_enter_email_address() {homePage.enterEmailAddress();
    }

    @Then("I click on sign me up")
    public void i_click_on_sign_me_up() {homePage.clickOnSignMeUpButton();
    }

    @Then("I validate shop marriott")
    public void i_validate_shop_marriott() {homePage.validateShopMarriott("Buy Luxury Hotel Bedding from Marriott Hotels");
    }
    //#########

    @When("I click on shop westin")
    public void i_click_on_shop_westin() {homePage.clickOnShopWestin();
    }

    @When("I enter email address1")
    public void i_enter_email_address1() {homePage.enterEmailAddress1();
    }

    @Then("I click on subscribe now")
    public void i_click_on_subscribe_now() {homePage.clickOnSubscribeNow();
    }

    @Then("I validate shop westin title")
    public void i_validate_shop_westin_title() {homePage.validateShopWestinTitle("Westin Hotel Store");
    }
    //##########

    @When("I click on our brands")
    public void i_click_on_our_brands() {homePage.clickOnOurBrands();
    }

    @Then("I click on marriott sign")
    public void i_click_on_marriott_sign() {homePage.clickOnMarriottSign();
    }

    @Then("I validate title")
    public void i_validate_title() {homePage.validateTitle("Inspiring Hotels | Book Online | Marriott Hotels");
    }
    //###########
    @Then("I click on delta hotel marriott")
    public void i_click_on_delta_hotel_marriott() {homePage.clickOnDeltaHotelMarriott();
    }

    @Then("I validate title1")
    public void i_validate_title1() {homePage.validateTitle1("Find & Book Hotels | Delta Hotels by Marriott");
    }
    //##########
    @Then("I click on marriott vacation club")
    public void i_click_on_marriott_vacation_club() {homePage.clickOnMarriottVacationClub();
    }

    @Then("I validate title2")
    public void i_validate_title2() {homePage.validateTitle2("Marriott Vacation Club® Official Site");
    }

    @Then("I click on aloft hotels")
    public void i_click_on_aloft_hotels() {homePage.clickOnAloftHotels();
    }

    @Then("I validate title3")
    public void i_validate_title3() {homePage.validateTitle3("Stylish, Boutique Hotels | Aloft Hotels");
    }


    @Given("I click on vacation")
    public void i_click_on_vacation() {homePage.clickOnVacation();
    }

    @When("I click on home and villas")
    public void i_click_on_home_and_villas() {homePage.clickOnHomeAndVillas();
    }

    @Then("I click on start exploring")
    public void i_click_on_start_exploring() {homePage.clickStartExploring();
    }

    @Then("I validate vacation title")
    public void i_validate_vacation_title() {homePage.validateVacationTitle("Vacation Rental Home | Homes & Villas | Marriott International");
    }

    @Then("I click on residences")
    public void i_click_on_residences() {homePage.clickOnResidences();
    }

    @Then("I validate residences title")
    public void i_validate_residences_title() {homePage.validateResidencesTitle("Explore Luxury Hotel Suites, Apartments and Condos | Marriott Bonvoy");
    }


    @Then("I click on travel tips idea")
    public void i_click_on_travel_tips_idea() {homePage.clickOnTravelTipsAndIdea();
    }

    @Then("I validate travel tips and idea title")
    public void i_validate_travel_tips_and_idea_title() {homePage.validateTravelTipsAndIdeaTitle("Hotels & Resorts | Book your Hotel directly with Marriott");
    }


    @When("I click on about marriott bonvoy")
    public void i_click_on_about_marriott_bonvoy() {homePage.clickAboutMarriottBonvoy();
    }

    @Then("I click on marriott insiders")
    public void i_click_on_marriott_insiders() {homePage.clickOnMarriottInsiders();
    }

    @Then("I validate marriott insiders title")
    public void i_validate_marriott_insiders_title() {homePage.validateMarriottInsidersTitle("(5) Marriott Bonvoy Insiders | Facebook");
    }

    @Then("I click on member benefits")
    public void i_click_on_member_benefits() {homePage.clickMemberBenefits();
    }

    @Then("I validate member benefits title")
    public void i_validate_member_benefits_title() {homePage.validateMarriottInsidersTitle("How to Enjoy More Benefits");
    }

    @Then("I click on how to earn point")
    public void i_click_on_how_to_earn_point() {homePage.clickHowToEarnPoint();
    }

    @Then("I validate how to earn point title")
    public void i_validate_how_to_earn_point_title() {homePage.validateHowtoEarnPointTitle("How to Earn Points");
    }


    @Then("I click on how to use point")
    public void i_click_on_how_to_use_point() {homePage.clickHowToUsePoint();
    }

    @Then("I validate how to use point title")
    public void i_validate_how_to_use_point_title() {homePage.validateHowToUsePointTitle("How to Redeem Points");
    }

    @Then("I click on sheraton")
    public void i_click_on_sheraton() {homePage.clickSheraton();
    }

    @Then("I validate sheraton title")
    public void i_validate_sheraton_title() {homePage.validateSheratonTitle("International Hotels & Resorts | Sheraton Hotels & Resorts");
    }

    @Then("I click on edition")
    public void i_click_on_edition() {homePage.clickEdition();
    }

    @Then("I validate edition title")
    public void i_validate_edition_title() {homePage.validateEditionTitle("EDITION Hotels | A Unique Collection of Luxury Boutique Hotels");
    }

    @Then("I click on JWMarriott")
    public void i_click_on_JWMarriott() {homePage.clickJWMarriott();
    }

    @Then("I validate JWMarriott title")
    public void i_validate_JWMarriott_title() {homePage.validateJWMarriottTitle("Luxury Hotels & Resorts: Mindful Experiences | JW Marriott");
    }

    @Then("I click on WHotels")
    public void i_click_on_WHotels() {homePage.clickWHotels();
    }

    @Then("I validate WHotels title")
    public void i_validate_WHotels_title() {homePage.validateWHotelsTitle("W Hotels Worldwide | Luxury Lifestyle Hotels");
    }






}

