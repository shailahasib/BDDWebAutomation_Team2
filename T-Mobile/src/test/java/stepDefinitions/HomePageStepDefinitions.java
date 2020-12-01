package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import static home.HomePageWebElements.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.logging.Logger;

import static home.HomePageWebElements.nextWeb;


public class HomePageStepDefinitions extends WebAPI {
    // public static Logger LOGGER = Logger.getLogger(String.valueOf(HomePageStepDefinitions.class));


    static HomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

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


    @Given("I am at T-mobile home page")
    public void i_am_at_t_mobile_home_page() throws IOException {
        openBrowser("https://www.t-mobile.com/");
    }

    @Then("I verify home page title")
    public void i_verify_home_page_title() {
        homePage.ValidateHomePageTitle();
    }


    @When("I lick on cart sign button")
    public void iLickOnCartSignButton() {
        homePage.CartButton();
    }

    @Then("I verify My cart logo is displayed")
    public void iVerifyMyCartLogoIsDisplayed() {
        homePage.CartValidation();
    }


    @And("I click on search button")
    public void iClickOnSearchButton() {
        homePage.OpenSearchBox();
    }


    @When("I enter {string} in searchBox")
    public void iEnterInSearchBox(String product) {
        homePage.searchBox(product);
    }


    @And("again I click on search button")
    public void againIClickOnSearchButton() throws InterruptedException {
        homePage.searchBoxOk();
    }

    @Then("I verify  current URL")
    public void iVerifyCurrentURL() {
        homePage.validateCurrentURL();
    }


    @When("I mouse hover plans and I select Essentials")
    public void iMouseHoverPlansAndISelectEssentials() throws InterruptedException {
        homePage.mouseOverPlans();
        Thread.sleep(4000);
    }

    @Then("I verify the current url")
    public void iVerifyTheCurrentUrl() {
        homePage.validatePlansURL();
    }


    @When("I mouse over Phones & devices")
    public void iMouseOverPhonesDevices() throws InterruptedException {
        homePage.mouseOverPhonesAndDevices();
    }


    @And("i select FiveG phones")
    public void iSelectFiveGPhones() throws InterruptedException {
        homePage.FiveGPhones();
    }

    @Then("I verify FiveG logo displays")
    public void iVerifyFiveGLogoDisplays() {
        homePage.FiveGPhonesValidate();
    }

    @Then("I verify all active links")
    public void iVerifyAllActiveLinks() {
        homePage.BrokenLinks();
    }

    @When("I mouse over deals")
    public void iMouseOverDeals() throws InterruptedException {
        homePage.mouseOverDeals();
    }

    @And("I click on Apple")
    public void iClickOnApple() throws InterruptedException {
        homePage.SelectApple();
    }

    @Then("I verify page title as Apple")
    public void iVerifyPageTitleAsApple() {
        homePage.validateDealsTitle();
    }


    @And("I click on my account")
    public void iClickOnMyAccount() throws InterruptedException {
        homePage.myAccount();
    }

    @And("I click on Log in")
    public void iClickOnLogIn() throws InterruptedException {
        homePage.Login();
    }

    @When("I enter {string}")
    public void iEnter(String email) throws InterruptedException {
        homePage.setEmail(email);
    }

    @And("i click on next")
    public void iClickOnNext() throws InterruptedException {
       // ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",nextWeb);
        homePage.clickNext();
        Thread.sleep(3000);
    }
    @And("I again enter {string}")
    public void iAgainEnter(String passwordData) {
        homePage.setPassword(passwordData);
    }

    @And("again I click login")
    public void againIClickLogin() throws InterruptedException {
        homePage.nextButton();
        Thread.sleep(3000);
    }

    @Then("I verify error message display")
    public void iVerifyErrorMessageDisplay() {
        homePage.loginErrorMessage();
    }


    @When("I mouse over coverage")
    public void iMouseOverCoverage() throws InterruptedException {
      //  mouseOverID(coverageWebElement);
        sleepFor(3);
    }

    @And("I select our network")
    public void iSelectOurNetwork() throws InterruptedException {
        homePage.clickOurNetwork();
       // clickByXpath(ourNetworkWeb);
        sleepFor(3);
    }

    @Then("I verify page title as our network")
    public void iVerifyPageTitleAsOurNetwork() {
        homePage.validateOurNetWorkTitle();
    }

    @When("I mouse hover chat sign")
    public void iMouseHoverChatSign() throws InterruptedException {
//        mouseOverXPATH(chatWebElement);
        sleepFor(3);
        homePage.mouseOverChat();
       // hoverOverDropdown(chat);
    }

    @And("click feedback")
    public void clickFeedback() throws InterruptedException {
      //  clickByXpath(feedbackWebElement);
        sleepFor(3);
        homePage.clickFeedback();
    }

    @Then("I verify feedback tab opens")
    public void iVerifyFeedbackTabOpens() {
        switchToTabAndGetURL();
    }


}
