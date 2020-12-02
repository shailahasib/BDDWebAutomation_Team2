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
import support.SupportPage;

import java.io.IOException;

public class SupportPageStepDefinition extends WebAPI {
    static SupportPage supportPage;

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
    public static void getInit() {supportPage = PageFactory.initElements(driver, SupportPage.class);

    }

    @Given("i am at home page")
    public void i_am_at_home_page() throws IOException {

        openBrowser("https://www.expedia.com/service");
    }

    @Given("i click on support")
    public void i_click_on_support() {supportPage.clickOnSupport();

    }

    @When("i click on add Your Property To Expedia")
    public void i_click_on_add_your_property_to_expedia() {supportPage.clickAOnAddYourPropertyToExpedia();

    }

    @Then("i click on getting Started")
    public void i_click_on_getting_started() {supportPage.clickOnLearnMore();

    }

    @Then("i validate on add Your Property To Expedia")
    public void i_validate_on_add_your_property_to_expedia() {supportPage.validateAddYourPropertyToExpedia("How to list your property on Expedia.com");

    }







    @Given("I click on support1")
    public void i_click_on_support1() {supportPage.clickOnSupport1();

    }

    @When("i click on chat now")
    public void i_click_on_chat_now() {supportPage.clickOnChatNow();

    }

    @Then("i click on cancel booking")
    public void i_click_on_cancel_booking() {supportPage.clickOnCancelBooking();

    }

    @Then("i validate on  chat now")
    public void i_validate_on_chat_now() {supportPage.validateChtNow("Customer Service Portal");

    }



    @Given("I click on support2")
    public void i_click_on_support2() {supportPage.clickOnSupport2();

    }

    @When("i click on hotels")
    public void i_click_on_hotels() {supportPage.clickOnHotels();

    }

    @Then("i click on  booking")
    public void i_click_on_booking() {supportPage.clickOnBooking();

    }

    @Then("i validate on  hotels")
    public void i_validate_on_hotels() {supportPage.validateHotels("Customer Service Portal");

    }

    @Given("I click on support3")
    public void i_click_on_support3() {supportPage.clickOnSupport3();

    }

    @When("i click on things to do")
    public void i_click_on_things_to_do() {supportPage.clickOnThingsToDo();

    }

    @Then("i click on  shopTheSale")
    public void i_click_on_shop_the_sale() {supportPage.clickOnShopTheSale();

    }

    @Then("i validate on  things to do")
    public void i_validate_on_things_to_do() {supportPage.validateThingsToDo("Black Friday/Cyber Monday Travel Sale: Save on things to do | Expedia.com");
    }


    @Given("I click on support4")
    public void i_click_on_support4() {supportPage.clickOnSupport4();

    }

    @When("i click on cars")
    public void i_click_on_cars() {supportPage.clickOnCars();

    }

    @Then("i click on  rental cars")
    public void i_click_on_rental_cars() {supportPage.clickOnRentalCars();

    }

    @Then("i validate on cars")
    public void i_validate_on_cars() {supportPage.validateCars("Car Rental: Cheap Airport Car Rentals & Rental Car Deals | Expedia");

    }



    @Given("I click on support5")
    public void i_click_on_support5() {supportPage.clickOnSupport5();

    }

    @When("i click on hotHotelDeals")
    public void i_click_on_hot_hotel_deals() {supportPage.clickOnHotHotelDeals();

    }

    @Then("i click on  showMore")
    public void i_click_on_show_more() {supportPage.clickOnShowMore();

    }



    @Then("i validate on hot hotel lDeals")
    public void i_validate_on_hot_hotel_l_deals() {supportPage.validateHotHotelDeals("Travel Deals: Find Cheap Deals on Travel, Trips & Tours | Expedia.com");

    }

}