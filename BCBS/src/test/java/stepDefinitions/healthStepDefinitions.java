package stepDefinitions;

import common.WebAPI;
import health.healthPage;
import home.HomePage;
import io.cucumber.datatable.DataTable;
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

import static health.healthPageWebElement.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class healthStepDefinitions extends WebAPI {

    static healthPage healthpage;


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
        healthpage = PageFactory.initElements(driver, healthPage.class);
    }


    @Given("I am at BCBS home page")
    public void i_am_at_bcbs_home_page() throws IOException {
        openBrowser("https://www.bcbs.com/");
    }

    @When("I click on health of america")
    public void i_click_on_health_of_america() throws InterruptedException {
        clickByXpath(healthOfAmericaWeb);
        sleepFor(2);
    }

    @Then("I verify I am at health of america page title")
    public void i_verify_i_am_at_health_of_america_page_title() throws InterruptedException {
        healthpage.validateHealthOfAmericaTitle();
    }

    @And("I enter {string} in search box")
    public void iEnterInSearchBox(String search) {
        healthpage.searchBox(search);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        clickByXpath(submitSearch);
    }

    @Then("i verify {string}")
    public void iVerify(String expectedPageURL) throws InterruptedException {
        healthpage.verifyURL(expectedPageURL);
    }


    @When("i click on about")
    public void iClickOnAbout() {
        clickByXpath(aboutWeb);
    }

    @Then("I verify about page title")
    public void iVerifyAboutPageTitle() throws InterruptedException {
        sleepFor(3);
        healthpage.validateAboutPageTitle();
    }


    @When("click on BCBS health index")
    public void clickOnBCBSHealthIndex() throws InterruptedException {
        clickByXpath(healthIndexWeb);
        sleepFor(3);
    }


    @Then("I verify health index page title")
    public void iVerifyHealthIndexPageTitle() {
        healthpage.verifyIndexPageTitle();
    }

    @When("I click on Data and Reports")
    public void iClickOnDataAndReports() throws InterruptedException {
        clickByXpath(dataAndReportsWeb);
        sleepFor(3);
    }

    @Then("i verify Reports text displayed properly")
    public void iVerifyReportsTextDisplayedProperly() {
        healthpage.verifyDataAndReportsTitle();
    }

    @When("i click on research Alliance page")
    public void iClickOnResearchAlliancePage() throws InterruptedException {
        clickByXpath(researchWeb);
        sleepFor(3);
    }

    @Then("I verify text displayed")
    public void iVerifyTextDisplayed() {
        healthpage.verifyTextDisplay();
    }

    @When("I click on subscribe to health of america news and switch to new tab")
    public void i_click_on_subscribe_to_health_of_america_news_and_switch_to_new_tab() throws InterruptedException {

        sleepFor(4);
        healthpage.clickSubscribe();
        healthpage.switchWindow();
    }


    @When("I enter user information")
    public void i_enter_user_information(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);
        healthpage.enterKeywords(healthpage.firstName, data.get(0).get(0));
        healthpage.enterKeywords(healthpage.lastName, data.get(1).get(0));
        healthpage.enterKeywords(healthpage.email, data.get(2).get(0));
        healthpage.enterKeywords(healthpage.zipCode, data.get(3).get(0));

    }

    @When("i click on subscribe button")
    public void iClickOnSubscribeButton() throws InterruptedException {
        healthpage.clickSubscribeF();
        sleepFor(10);
    }

    @Then("I verify error  message displayed")
    public void iVerifyErrorMessageDisplayed() {
        healthpage.validateErrorSubscribe();

    }


    @When("I click on contact us")
    public void iClickOnContactUs() throws InterruptedException {
       // ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",contactUsWeb);
        scrollToElementJScript(driver.findElement(By.xpath(contactUsWeb)));
        sleepFor(4);
        clickByXpath(contactUsWeb);
    }

    @Then("I verify I am at contact us page")
    public void iVerifyIAmAtContactUsPage() throws InterruptedException {
        sleepFor(3);
        healthpage.VerifyIAmAtContactUsPage();

    }

    @When("I navigate back")
    public void iNavigateBack() throws InterruptedException {
        navigateBack();
        sleepFor(3);
    }

    @And("I click on shop for insurance")
    public void iClickOnShopForInsurance() {
        clickByXpath(shopForInsurance);
    }

    @And("click Go button")
    public void clickGoButton() throws InterruptedException {
        clickByXpath(GoButton);
        sleepFor(2);

    }

    @Then("I verify Error message")
    public void iVerifyErrorMessage() throws InterruptedException {
        sleepFor(2);
        healthpage.VerifyErrorMessage();
    }

    @Then("I verify active links")
    public void iVerifyActiveLinks() {
        healthpage.BrokenLinks();
    }
}
