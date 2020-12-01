package stepDefinitions;

import Help.helpPage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static Help.helpPageWebElement.*;

public class helpPageStepDefinition extends WebAPI {

    static helpPage helppage;


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
        helppage = PageFactory.initElements(driver, helpPage.class);
    }


    @Given("I am at Marriot home page")
    public void i_am_at_marriot_home_page() throws IOException {
        openBrowser("https://www.marriot.com/default.mi");
       // openBrowser("https://www.bcbs.com/");

    }

    @When("I click on help")
    public void i_click_on_help() throws InterruptedException {
        sleepFor(2);
        clickByXpath(clickHelp);
    }

    @Then("I verify help page title")
    public void i_verify_help_page_title() throws InterruptedException {
        sleepFor(2);
        helppage.helpPageTitle();
    }


    @Then("I verify active links in help page")
    public void iVerifyActiveLinksInHelpPage() throws InterruptedException {

        helppage.BrokenLinks();

    }

    @And("I click on find and reserve")
    public void iClickOnFindAndReserve() throws InterruptedException {
        clickByLinkText("Find & Reserve");
        sleepFor(2);
    }

    @When("I click on room and flight link")
    public void iClickOnRoomAndFlightLink() throws InterruptedException {
        clickByXpath("//*[@id=\"advanced-search-form-container\"]/div[1]/ul/li[1]/a");
        sleepFor(4);
    }


    @And("enter origin and destination")
    public void enterOriginAndDestination() throws InterruptedException {
        helppage.enterOriginAndDestination();
    }

    @And("select departing and returning")
    public void selectDepartingAndReturning() {


    }

    @When("I mouse over learn")
    public void iMouseOverLearn() throws InterruptedException {
       mouseOverXPATH("//header/div[1]/nav[2]/ul[1]/li[7]/a[1]");
       sleepFor(2);


    }

    @And("I click on news")
    public void iClickOnNews() {
        clickByXpath("//*[@id=\"block-bcbs-main-menu\"]/ul/li[7]/div/ul/li[3]/a");
    }

    @Then("I verify News is displayed")
    public void iVerifyNewsIsDisplayed() {
    }

    @When("I mouse over Employers")
    public void iMouseOverEmployers() throws InterruptedException {
        mouseOverXPATH("//header/div[1]/nav[2]/ul[1]/li[4]/a[1]");
        sleepFor(2);
    }

    @And("I select Improving care")
    public void iSelectImprovingCare() {
        clickByXpath("//*[@id=\"block-bcbs-main-menu\"]/ul/li[4]/div/ul/li[1]/a");
    }

    @Then("I verify URL")
    public void iVerifyURL() {
    }
}
