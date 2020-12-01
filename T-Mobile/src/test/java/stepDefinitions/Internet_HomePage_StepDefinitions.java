package stepDefinitions;

import common.WebAPI;
import home.Internet_HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
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

public class Internet_HomePage_StepDefinitions extends WebAPI {

    static Internet_HomePage internet_homePage;

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
        internet_homePage = PageFactory.initElements(driver, Internet_HomePage.class);
    }
//
//    @Given("I in T-mobile home page")
//    public void iInTMobileHomePage() throws IOException {
//        openBrowser("https://www.t-mobile.com/");
//
//    }

    @And("I click on Internet link")
    public void iClickOnInternetLink() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        internet_homePage.clickOnInternet();
    }

    @Then("I verify T-Mobile Home Internet Page is opened")
    public void iVerifyTMobileHomeInternetPageIsOpened() throws InterruptedException {
        internet_homePage.validateClickOnInternet();
    }

    @When("I click on WHY WE DO IT link")
    public void iClickOnWHYWEDOITLink() {
        internet_homePage.clickOnWhyWeDoIt();
    }

    @Then("I should be directed to the page of WHY WE DO IT")
    public void iShouldBeDirectedToThePageOfWHYWEDOIT() throws InterruptedException {
        internet_homePage.validateWhyWeDoItElement();

    }

    @When("I click on customer stories link")
    public void iClickOnCustomerStoriesLink() {
        internet_homePage.clickOnCustomerStoriesLink();
    }

    @Then("I should be directed to the page of customer stories")
    public void iShouldBeDirectedToThePageOfCustomerStories() throws InterruptedException {
        internet_homePage.validateCustomerStoriesLink();
    }

    @When("I click on support link")
    public void iClickOnSupportLink() {
        internet_homePage.clickOnSupportLink();
    }

    @Then("I should be directed to the page of support")
    public void iShouldBeDirectedToThePageOfSupport() throws InterruptedException {
        internet_homePage.validateClickOnSupportLink();
    }

    @And("I click on Explore Our network")
    public void iClickOnExploreOurNetwork() {
        internet_homePage.clickOnExploreOurNetwork();
    }

    @And("I slide to see the comparison 5G coverage")
    public void iSlideToSeeTheComparisonGCoverage() throws InterruptedException {
        internet_homePage.slideToSeeTheComparisonGCoverage();

    }

    @Then("I verify the slider functionalities  for the coverage")
    public void iVerifyTheSliderFunctionalitiesForTheCoverage() throws InterruptedException {
        internet_homePage.validateClickOnExploreOurNetwork();
    }

    @And("I click on the video Making 5G a reality for all.")
    public void iClickOnTheVideoMakingGARealityForAll() throws InterruptedException {
        internet_homePage.clickOnTheVideoElements();
    }

    @Then("I verify the the video will play")
    public void iVerifyTheTheVideoWillPlay() throws InterruptedException {
        internet_homePage.verifyTheTheVideoWillPlay();
    }

    @When("I entre my personal information")
    public void iEntreMyPersonalInformation(List<List<String>> table) throws InterruptedException {
        windowAndTabs();
        sleepFor(8);
        Map<String, String> mapTable = Internet_HomePage_StepDefinitions.Users.TableDictionaryConverter(table);
        internet_homePage.sendKey(internet_homePage.sendFirstName, mapTable.get("FirstName"));
        internet_homePage.sendKey(internet_homePage.sendLastName, mapTable.get("LastName"));
        internet_homePage.sendKey(internet_homePage.sendEmail, mapTable.get("Email"));
        internet_homePage.sendKey(internet_homePage.sendZip, mapTable.get("Zip"));

    }

    @When("I click on check availability link")
    public void iClickOnCheckAvailabilityLink() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        internet_homePage.clickOnCheckAvailability();
    }

    public static final String clickHomeAddressLocator = "//span[contains(text(),'45 DAY ST, SOMERVILLE, MA 02144')]";
    @FindBy(xpath = clickHomeAddressLocator)
    public WebElement clickHomeAddress;

    @And("I enter Mobile Phone Number And Home address")
    public void iEnterMobilePhoneNumberAndHomeAddress(List<List<String>> table) throws InterruptedException {
        windowAndTabs();
//        Thread.sleep(5000);
        Map<String, String> mapTable = Internet_HomePage_StepDefinitions.Users.TableDictionaryConverter(table);
        internet_homePage.sendKey1(internet_homePage.sendPhoneNum, mapTable.get("phonenumber"));
        sleepFor(5);
        internet_homePage.sendKey1(internet_homePage.sendHomeAddress, mapTable.get("homeaddress"));
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'45 DAY ST, SOMERVILLE, MA 02144')]"))).click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        List<WebElement> autoSuggest = driver.findElements(By.xpath("//span[contains(text(),'45 DAY ST, SOMERVILLE, MA 02144')]"));
//        System.out.println("Size of the AutoSuggets is = " + autoSuggest.size());
//        for (WebElement a : autoSuggest) {
//            System.out.println("Values are = " + a.getText());
//            autoSuggest.get(0).click();
//        }
    }
    @And("I click on next Check availability")
    public void iClickOnNextCheckAvailability() throws InterruptedException {
        internet_homePage.clickOnNextCheckAvailability();
    }

    @And("I enter more information")
    public void iEnterMoreInformation(List<List<String>> table) throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        Map<String, String> mapTable = Internet_HomePage_StepDefinitions.Users.TableDictionaryConverter(table);
        internet_homePage.sendKey(internet_homePage.sendFirstName2, mapTable.get("firstname"));
        internet_homePage.sendKey(internet_homePage.sendLastName2, mapTable.get("lastname"));
        internet_homePage.sendKey(internet_homePage.sendEmailAddress2, mapTable.get("emailAddress"));
    }

    @And("I select on For new costumer only")
    public void iSelectOnForNewCostumerOnly() throws InterruptedException {
        internet_homePage.selectOnForNewCostumerOnly();
    }

    @And("I click on Submit")
    public void iClickOnSubmit() throws InterruptedException {
        internet_homePage.clickOnSubmit();
    }

    @Then("I verify the availability of my new account")
    public void iVerifyTheAvailabilityOfMyNewAccount() throws InterruptedException {
        internet_homePage.verifyTheAvailabilityOfMyNewAccount();
    }

public static class Users {

    public static synchronized Map<String, String> TableDictionaryConverter(List<List<String>> data) {
        Map<String, String> mapTable = new HashMap<String, String>();
        for (List<String> rows : data) {
            mapTable.put(rows.get(0), rows.get(1));
        }
        return mapTable;
    }

}

    @And("I select My wireless phone number")
    public void iSelectMyWirelessPhoneNumber() throws InterruptedException {
        internet_homePage.selectMyWirelessPhoneNumber();

    }

    @And("I enter My phone Number {string}")
    public void iEnterMyPhoneNumber(String phone) throws InterruptedException {
        internet_homePage.enterMyPhoneNumber(phone);
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() throws InterruptedException {
        internet_homePage.clickOnSubmitButton();
    }

    @Then("I verify the signing Up for 5G Home Internet")
    public void iVerifyTheSigningUpForGHomeInternet() throws InterruptedException {
        internet_homePage.verifyTheSigningUp();
    }
}