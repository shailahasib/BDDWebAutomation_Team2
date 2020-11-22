package stepDefinitions;

import common.WebAPI;
import creditCardPage.CreditCardPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static creditCardPage.creditCardPageWebElements.*;


public class CreditCardsStepDefinitions extends WebAPI {
    static CreditCardPage creditCardPage = PageFactory.initElements(driver,
            CreditCardPage.class);

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,
                    "image/jpg",
                    "Mariott Credit Card Page");
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am at the credit cards page")
    public void iAmAtTheCreditCardsPage() throws IOException {
        openBrowser(creditCardURLElement);
        sleepFor(2);

    }


    @When("I change the language to {string}")
    public void iChangeTheLanguageTo(String languageName) {
        clickByXpath(languageLocatorElement);
        sleepFor(2);
        while (true) {
            if (languageName.equals("Espanol")) {
                clickByCss(chooseEspanolElemenet);
                break;
            } else if (languageName.equals("Francais")) {
                clickByCss(chooseFrancaisElement);
                break;
            } else if (languageName.equals("Portugues")) {
                clickByCss(choosePortuguesElement);
                break;
            }
        }
        sleepFor(3);
    }


    @Then("I verify the page Header Title is {string}")
    public void iVerifyThePageHeaderTitleIs(String expectedHeader) {
        WebElement actual = driver.findElement(By.xpath(getHeaderTextElement));
        String actualHeaderText = actual.getText();
        Assert.assertEquals("Test Failed", expectedHeader, actualHeaderText);
    }

    @And("the homepage is {string}")
    public void theHomepageIs(String expectedURL) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("Test Failed", expectedURL, actualURL);
    }

    @When("banner is visible I click {string}")
    public void bannerIsVisibleIClick(String specialTab) {
        sleepFor(2);

        while (true) {
            if (specialTab.equals("Best Rate Guarantee")) {
                clickByXpath(covidBestRateElement);
                break;
            } else if (specialTab.equals("Flexible Cancellation")) {
                clickByXpath(covidFlexibleCancellationElement);
                break;
            } else if (specialTab.equals("Commitment to Clean")) {
                clickByXpath(covidCommitmentToCleanElement);
                break;
            } else if (specialTab.equals("Contactless Services")) {
                clickByXpath(covidContactlessElement);
                break;
            }
        }
        sleepFor(3);
    }

    @Then("I verify the special page Title is {string}")
    public void iVerifyTheSpecialPageTitleIs(String expected) {
        String actual = driver.getTitle();
        Assert.assertEquals("Test Failed", expected, actual);
    }

    @And("the special homepage is {string}")
    public void theSpecialHomepageIs(String expected) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("Test Failed", expected, actual);
    }

    @When("I click on the {string} button from header")
    public void iClickOnTheButtonFromHeader(String arg0) {
        clickByXpath(signInOrJoinElement);
        sleepFor(2);
    }

    @And("I enter a set of est {string} address and {string} and click Sign in")
    public void iEnterASetOfEstAddressAndAndClickSignIn(String email, String password) {
        driver.findElement(By.id(emailElement)).sendKeys(email);
        driver.findElement(By.id(passwordElement)).sendKeys(password);
        sleepFor(1);
        driver.findElement(By.xpath(signInButtonElement)).click();
    }

    @And("the url is {string}")
    public void theUrlIs(String expected) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("Test Failed", expected, actual);
    }

    @When("I click on {string} drop down")
    public void iClickOnDropDown(String arg0) {
        creditCardPage.clickFindReserve();
        sleepFor(2);
    }

    @And("I Type in my {string}, select dates")
    public void iTypeInMySelectDates(String arg0) {
        creditCardPage.enterDesination("Brooklyn, NY, USA");

    }

    @And("I click on {string}")
    public void iClickOn(String arg0) {
    }

    @Then("I reach {string} with results")
    public void iReachWithResults(String arg0) {
    }
}
