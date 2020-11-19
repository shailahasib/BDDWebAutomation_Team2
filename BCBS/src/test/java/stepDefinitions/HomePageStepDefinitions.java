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
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

import static home.HomePageWebElements.*;

public class HomePageStepDefinitions extends WebAPI {
    static HomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "BCBS Homepage");
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is at the home page")
    public void user_is_at_the_home_page() {
        try {
            openBrowser(homePageURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sleepFor(2);
    }

    @When("User clicks on Contact us")
    public void user_clicks_on_contact_us() {
        clickByCss(headerContactUS);
    }

    @Then("User is redirected to Contact Us page")
    public void user_is_redirected_to_contact_us_page() {
        String expectedURL = "https://www.bcbs.com/contact-us";
        String actualURL = driver.getCurrentUrl().toString();
        Assert.assertEquals("URL does not match", expectedURL, actualURL);
    }

    @Then("User verfiyies the customer call center phone number")
    public void user_verfiyies_the_customer_call_center_phone_number() {
        String expected = expectedPhoneNumber;
        String actual = getTextByCss(contactUsPhone);
        Assert.assertEquals("Phone Number does not match", expected, actual);
    }

    @When("user clicks on search")
    public void user_clicks_on_search() {
        clickByXpath(searchKey);
    }

    @When("user enters {string} in the search box and presses Enter")
    public void user_enters_in_the_search_box_and_presses_enter(String keyInput) {
        HomePage.enterSearchKeyword.sendKeys(keyInput, Keys.ENTER);
        sleepFor(2);
        //inputValueInTextBoxByWebElement(homePage.enterSearchKeyword, keyInput);
    }

    @Then("user is on a page with appropriate {string} link")
    public void user_is_on_a_page_with_appropriate_link(String expectedURL) {
        String actualURL = driver.getCurrentUrl().toString();
        Assert.assertEquals("Test Failed", expectedURL, actualURL);
    }

    @Then("user can clear the search box and search for another topic")
    public void user_can_clear_the_search_box_and_search_for_another_topic() {
        clearInputBox(homePage.cleanSearchBox);
        String textInSearchBox = homePage.cleanSearchBox.getAttribute("value");
        Assert.assertTrue(textInSearchBox.isEmpty());

    }

    @When("user clicks on Health of America Button")
    public void userClicksOnHealthOfAmericaButton() {
        clickByCss(hoaButton);
    }

    @And("user verifies the page {string}")
    public void userVerifiesThePage(String expectedTitle) {
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Test Failed", expectedTitle, actualTitle);
    }

    @When("user clicks on Member services Button")
    public void userClicksOnMemberServicesButton() {
        clickByCss(memberServices);
    }

    @Then("user is on a page with appropriate {string} page")
    public void userIsOnAPageWithAppropriatePage(String arg0) {
    }

    @And("user clicks on members discount link")
    public void userClicksOnMembersDiscountLink() {
        clickByXpath(memberDiscounts);

    }

    @And("user clicks on - I don't have my member ID Card")
    public void userClicksOnIDonTHaveMyMemberIDCard() {
        clickByCss(noMembersCard);
    }

    @And("user inputs zipcode {string}")
    public void userInputsZipcode(String zipcode) {
        typeById(enterZipCode, zipcode);
    }

    @And("user clicks go")
    public void userClicksGo() {
        clickById(idCardGoButton);
    }

    @Then("User verifies the message header says {string}")
    public void userVerifiesTheMessageHeaderSays(String assertMessage) {
        assertEqualByXpath(assertMessageZip, assertMessage);
    }

    @And("user scroll down to the bottom of the page")
    public void userScrollDownToTheBottomOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }

    @And("user clicks on BCBS Health Index Map")
    public void userClicksOnBCBSHealthIndexMap() {
        clickByXpath(healthIndexMap);
    }

    @And("user clicks on the BCBS logo at the top left")
    public void userClicksOnTheBCBSLogoAtTheTopLeft() {
        clickByXpath(bcbsLogo);
    }

    @Then("user is redirected back to page with link : {string}")
    public void userIsRedirectedBackToPageWithLink(String expectedURL) {
        String actualURL = getCurrentUrl();
        Assert.assertEquals("Test Failed", expectedURL, actualURL);
    }

    @And("user also verifies the page title is {string}")
    public void userAlsoVerifiesThePageTitleIs(String expectedTitle) {
        String actualTitle = getTitle();
        Assert.assertEquals("Test Failed", expectedTitle, actualTitle);
    }

    @And("user clicks on contact-us")
    public void userClicksOnContactUs() {
        clickByXpath(footerContactUS);
    }

    @When("user clicks on Find A doctor")
    public void userClicksOnFindADoctor() {
        clickByCss(findADoctor);
    }

    @And("user clicks to find a doctors in the US")
    public void userClicksToFindADoctorsInTheUS() {
        clickByCss(findDoctorInUSA);
        sleepFor(3);
    }

    @And("user click on choose a location and plan")
    public void userClickOnChooseALocationAndPlan() {
        clickById(buttonWelcome);
    }

    @And("user puts a {string} and clicks on - Yes, this is correct button")
    public void userPutsAAndClicksOnYesThisIsCorrectButton(String USZipcode) {
        typeById(sendZipcode, USZipcode);
        sleepFor(3);
        clickById(confirmZipcode);
    }

    @And("user choses plans with prefix")
    public void userChosesPlansWithPrefix() {
        typeById(boxOne, "p");
        typeById(boxTwo, "h");
        typeById(boxThree, "p");

    }

    @And("user clicks continue")
    public void userClicksContinue() {
        clickById(continueButton);
    }

    @Then("user verifies page title is {string}")
    public void userVerifiesPageTitleIs(String expected) {
        String actual = getTitle();
        Assert.assertEquals("Test failed", expected, actual);
    }


}
