package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import ourBrands.OurBrandsPage;

import java.io.IOException;

public class OurBrandsPageStepDefinitions extends  WebAPI {
    static OurBrandsPage vacationPage;

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @BeforeStep
    public static void getInit() {
        vacationPage = PageFactory.initElements(driver, OurBrandsPage.class);
    }



    @Given("I am at the home page")
    public void i_am_at_the_home_page() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        openBrowser("https://www.marriott.com/");
    }




    @When("I click on our brands")
    public void i_click_on_our_brands() {
            vacationPage.clickOnOurBrands();

    }

    @Then("I click on edition")
    public void i_click_on_edition() {vacationPage.clickOnEdition();

    }

    @Then("I click on learn more")
    public void i_click_on_learn_more() {vacationPage.clickOnLearnMore();

    }

    @Then("I validate  click on our Brands")
    public void i_validate_click_on_our_brands() {vacationPage.validateOurBrands("EDITION Hotels | The Idea: Unique Hotels Designed by Ian Schrager");

    }

}



