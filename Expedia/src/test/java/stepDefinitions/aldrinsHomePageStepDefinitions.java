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
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
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

    @When("I check gather all the a tags and iterate thr links")
    public void iCheckGatherAllTheATagsAndIterateThrLinks() {
        aldrinsHomePage.findBrokenLinks();
    }

    @Then("I visually verify that the links are not broken")
    public void iVisuallyVerifyThatTheLinksAreNotBroken() {
        System.out.println("User checks for validity");
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


    @When("I verify {string} is the default language")
    public void iVerifyIsTheDefaultLanguage(String language) {
        String languageText = aldrinsHomePage.languageSelector.getText();
        Assert.assertEquals("Not at the right page", language, languageText);
    }

    @And("I change the language to {string}.")
    public void iChangeTheLanguageToEspanol(String language) {
        aldrinsHomePage.languageSelector.click();
        sleepFor(2);
        Select select = new Select(aldrinsHomePage.selectLanguage);
        select.selectByVisibleText(language);
        clickByCss(languageSelectorSaveCss);

    }

    @Then("I verify the title is {string}")
    public void iVerifyTheTitleIs(String expected) {
        aldrinsHomePage.assertTitle(expected);
    }

    @When("I Select a city to stay and select add a flight")
    public void iSelectACityToStayAndSelectAddAFlight() {
        clickByXpath(staysTabXpath);
        clickByCss(staysSearchFieldCss);
        typeByCssNEnter(staysLocationSearchFieldCss, "Chicago");
        // clickByXpath(staysEmptyClickBoxXpath);
        sleepFor(1);
        clickByCss(staysAddAFlightRadioCss);
        clickByXpath(staysLeavingFromXpath);
        aldrinsHomePage.typeByXpathNEnter(staysLeavingFromFieldXpath, "New York");

        sleepFor(2);
        clickByCss(staysSearchButtonCss);

    }

    @Then("I verify I can start selecting hotels")
    public void iVerifyICanStartSelectingHotels() {
        sleepFor(5);
        String expected = "Chicago (and vicinity), Illinois, United States of America Hotel Search Results";
        String actual = driver.getTitle();
        Assert.assertEquals("Test failed", expected, actual);
    }

    @When("I navigate to {string} page and I select back using right click")
    public void iNavigateToPageAndISelectBackUsingRightClick(String arg0) throws AWTException {

        clickByXpath(navToTermPage);
        sleepFor(2);
        Actions builder = new Actions(driver);
        builder.contextClick(aldrinsHomePage.termsHeader).perform();
        sleepFor(1);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        sleepFor(2);
        robot.keyPress(KeyEvent.VK_ENTER);

        sleepFor(5);

    }

    @Then("I verify I am at homepage")
    public void iVerifyIAmAtHomepage() {
        aldrinsHomePage.assertURL(homePageURL);

    }

    @And("I click on Packages")
    public void iClickOnPackages() {
        sleepFor(5);
        aldrinsHomePage.clickPackages();
    }

    @Then("I see the option to choose items and build a trip")
    public void iSeeTheOptionToChooseItemsAndBuildATrip() {
        aldrinsHomePage.valildateOptionByText(validateOptionText);
    }


}
