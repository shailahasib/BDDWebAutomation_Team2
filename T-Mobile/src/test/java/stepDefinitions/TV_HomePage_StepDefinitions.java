package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import home.Internet_HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TV_HomePage_StepDefinitions extends WebAPI {

    static HomePage homePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
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


    @Given("I am at T-Mobile home page")
    public void iAmAtTMobileHomePage() throws IOException {
        openBrowser("https://www.t-mobile.com/");
    }

    @And("I click on TV link")
    public void iClickOnTVLink() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOnTVLink();
    }

    @Then("I verify IAm landing on Tv Home Page")
    public void iVerifyIAmLandingOnTvHomePage() throws InterruptedException {
        homePage.validateTVPage();
    }

    @When("I click on My account link")
    public void iClickOnMyAccountLink() throws InterruptedException {
        homePage.clickOnMyAccountLink();
    }

    @And("I click on login button")
    public void iClickOnLoginButton1() throws InterruptedException {
        homePage.clickOnLoginButton1();
    }

    @And("I enter invalid {string}")
    public void iEnterInvalid(String Email) throws InterruptedException {
        homePage.enterInvalidEmail(Email);
    }

    @And("I click on next button")
    public void iClickOnNextButton() throws InterruptedException {
        homePage.clickOnNextButton1();
    }

    @And("I enter invalid Password")
    public void iEnterInvalidPassword(String password) throws InterruptedException {
        homePage.enterInvalidPassword(password);
    }

    @And("I click on login Button")
    public void iClickOnLoginButton() throws InterruptedException {
        homePage.clickOnLoginButton2();
    }

    @Then("I should see login failed {string}")
    public void iShouldSeeLoginFailed(String invalid ) throws InterruptedException {
        homePage.validateLoginWithInvalidInformation(invalid);
    }

    @When("I click Ask an expert")
    public void iClickAskAnExpert() throws InterruptedException {
        homePage.clickAskAnExpert();
    }

    @Then("I verify the chatbox popup will open")
    public void iVerifyTheChatboxPopupWillOpen() throws InterruptedException {
        homePage.verifyTheChatboxPopupWillOpen();
    }

    @And("I enter a question in the chat box {string}")
    public void iEnterAQuestionInTheChatBox(String message) throws InterruptedException {
        homePage.enterAQuestionInTheChatBox(message);
    }

    @And("I click enter on the Keyboard")
    public void iClickEnterOnTheKeyboard(String EnterM) throws InterruptedException {
        homePage.clickEnterOnTheKeyboard();
    }

    @Then("I verify the automated message back from an expert")
    public void iVerifyTheAutomatedMessageBackFromAnExpert() throws InterruptedException {
        homePage.verifyTheAutomatedMessageBackFromAnExpert();
    }
}