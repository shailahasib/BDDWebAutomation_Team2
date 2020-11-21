package stepDefinitions;

import aldrinsHomePage.AldrinsHomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static aldrinsHomePage.AldrinsHomePageWebElements.*;

public class aldrinsHomePageStepDefinitions extends WebAPI {
    static AldrinsHomePage aldrinsHomePage;

    @BeforeStep
    public static void getInit() {
        aldrinsHomePage = PageFactory.initElements(driver, AldrinsHomePage.class);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Expedia Homepage");
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am at Expedia home page")
    public void iAmAtExpediaHomePage() throws IOException {
        openBrowser(homePageURL);
        //driver.get(homePageURL);
    }

    @And("I scroll down to the bottom of the page")
    public void iScrollDownToTheBottomOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", aldrinsHomePage.phoneBoxForApp);
    }

    @When("I sign up using my phone number {string}")
    public void iSignUpUsingMyPhoneNumber(String phoneNumber) {
        inputValueInTextBoxByWebElement(aldrinsHomePage.phoneBoxForApp, phoneNumber);
        clickById(getTheAppBtn);
    }


    @Then("I verify it shows {string}")
    public void iVerifyItShows(String expected) {
        String actual = getTextByCss(confirmationText);
        Assert.assertEquals("Test Failed",
                expected,
                actual);
    }

    @When("I click on {string}")
    public void iClickOn(String givenText) {
        driver.findElement(By.linkText(givenText)).click();
    }

    @Then("I verify the landing {string}")
    public void iVerifyTheLanding(String expected) {
        String actual = driver.getCurrentUrl().toString();
        Assert.assertEquals("Test Failed, Link Does not match",
                expected,
                actual);
    }

    @And("I scroll down to the bottom of the page to view footer")
    public void iScrollDownToTheBottomOfThePageToViewFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", aldrinsHomePage.expediaGroup);

    }
}
