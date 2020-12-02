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


    @Given("I am at home page")
    public void i_am_at_home_page() throws IOException {
        openBrowser("https://www.expedia.com/");
    }

    @Given("I click on sing in")
    public void i_click_on_sing_in() {homePage.clickSingIn();
    }

    @Given("I click on sing in1")
    public void i_click_on_sing_in1() {homePage.clickOnSingIN1();
    }

    @When("I enter email address")
    public void i_enter_email_address() {homePage.enterEmailAddress();
    }

    @When("I enter password")
    public void i_enter_password() {homePage.enterPassword();
    }

    @Then("I click on sing in button")
    public void i_click_on_sing_in_button() {homePage.clickOnSingInButton();
    }

    @Then("I validate sing in title")
    public void i_validate_sing_in_title() {homePage.validateSingInTitle("Sign In");
    }

}
