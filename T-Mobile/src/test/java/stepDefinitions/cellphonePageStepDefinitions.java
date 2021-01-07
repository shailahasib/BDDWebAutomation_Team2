package stepDefinitions;

import cellPhones.CellphonePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static cellPhones.CellphonePageWebElements.*;

public class cellphonePageStepDefinitions extends WebAPI {
    CellphonePage cellphonePage = PageFactory.initElements(driver,
            CellphonePage.class);
    ;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,
                    "image/jpg",
                    "Tmobile Cellphone Page");
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am at the cellphone page")
    public void iAmAtTheCellphonePage() {
        try {
            openBrowser(cellPhonePageURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
        cellphonePage.refreshPage();
    }

    @When("I refresh the page")
    public void iRefreshThePage() {

        cellphonePage.refreshPage();
    }

    @Then("I try to find broken links")
    public void iTryToFindBrokenLinks() {
        try {
            cellphonePage.findBrokenLinks(cellPhonePageURL);
        } catch (Exception e) {
            System.out.println("");
        }
    }

    @And("I verify the URL is {string}")
    public void iVerifyTheURLIs(String expectedURL) {
        cellphonePage.assertURL(expectedURL);
    }

    @When("I login with invalid credential")
    public void iLoginWithInvalidCredential() {
        clickById(myAccountDropDownID);
        sleepFor(1);
        clickByXpath(myAccountLoginXpath);
        sleepFor(1);
        clearField(loginKeysID);
        typeById(loginKeysID, loginInvalidEmailText);
        sleepFor(1);
    }

    @Then("I verify the webApp does not let me in")
    public void iVerifyTheWebAppDoesNotLetMeIn() {
        String actual = getTextByCss(loginAlertCss);
        Assert.assertEquals("Test Failed", loginAlertMessage, actual);

    }

    @But("gives me another chance to login with valid credentials")
    public void givesMeAnotherChanceToLoginWithValidCredentials() {
        Assert.assertTrue(cellphonePage.loginNextButton.isEnabled());
    }

    @When("I sort the cellphones based on {string}")
    public void iSortTheCellphonesBasedOn(String feature) {
        clickByCss(sortByDropDownCss);
        while (true) {
            if (feature.equalsIgnoreCase("Price Low To High")) {
                clickByXpath(sortLowHighXpath);
                break;
            } else if (feature.equalsIgnoreCase("Price High To Low")) {
                clickByXpath(sortHighLowXpath);
                break;
            } else if (feature.equalsIgnoreCase("Highest Rating")) {
                clickByXpath(softHighestRating);
                break;
            }
        }
    }

    @Then("I verify the webpage is showing results {string}")
    public void iVerifyTheWebpageIsShowingResults(String expectedURL) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("Test Failed", expectedURL, actual);
    }

    @When("I say {string} to the virtual agent")
    public void iSayToTheVirtualAgent(String typeText) {
        clickByCss(openChatBubbleCss);
        waitUntilVisible(By.cssSelector(chatBoxCss));
        clearField(chatBoxCss);
        sleepFor(2);
        typeByCss(chatBoxCss, typeText);
        waitUntilVisible(By.cssSelector(chatQuesryVACss));
    }

    @Then("I verify it replies to me")
    public void iVerifyItRepliesToMe() {
        String expected = chatBoxAutoMessage;
        String actual = getTextByCss(chatQuesryVACss);
        Assert.assertEquals("Test Failed", expected, actual);
    }

    @When("I select {string}")
    public void iSelect(String filterQuery) {
        clickByCss(FilterDealsCss);
        sleepFor(1);
        while (true) {
            if (filterQuery.equalsIgnoreCase("NEW")) {
                clickByCss(filterDealsNewCss);
                break;
            } else if (filterQuery.equalsIgnoreCase("ON SALE")) {
                clickByCss(filterDealsOnSaleCss);
            } else if (filterQuery.equalsIgnoreCase("SPECIAL OFFER")) {
                clickByCss(filterDealsSpecialCss);
            }
        }
    }

    @Then("I verify the results are as expected as {string} filter")
    public void iVerifyTheResultsAreAsExpectedAsFilter(String expectedText) {
        String actualText = getTextByCss(filterSearchHeaderCss);
        System.out.println(actualText);
        Assert.assertEquals("Test Failed", expectedText + " Phones", actualText);
    }

    @And("the {string} corresponds to the query")
    public void theCorrespondsToTheQuery(String expectedURL) {
        cellphonePage.assertURL(expectedURL);
    }


    @When("I select {string} from Filters")
    public void iSelectFromFilters(String networkSpeed) {
        clickById(filterNetworkSpeedID);
        sleepFor(1);
        while (true) {
            if (networkSpeed.equalsIgnoreCase("5G")) {
                clickByCss(filterByFiveGCss);
                break;
            } else if (networkSpeed.equalsIgnoreCase("4G LTE")) {
                clickByCss(filterByFourGLTECss);
                break;
            } else if (networkSpeed.equalsIgnoreCase("4G")) {
                clickByCss(filterByFourGCss);
                break;
            }
            sleepFor(2);
        }


    }

    @Then("I verify the search result is showing {string}")
    public void iVerifyTheSearchResultIsShowing(String expectedHeader) {
        String actualHeader = getTextByCss(filterSearchHeaderCss);
        System.out.println(actualHeader);
        Assert.assertEquals("Test Failed", expectedHeader, actualHeader);
    }


    @When("I scroll down and click on {string} Icon")
    public void iScrollDownAndClickOnIcon(String arg0) {
        clickByCss(socialInstagramIconCss);
        cellphonePage.switchTab(3);

    }

    @Then("I land on Tmobiles Instagram profile on {string}")
    public void iLandOnTmobilesInstagramProfileOn(String arg0) {
        cellphonePage.assertURL(arg0);
    }

    @When("I goto the careers tab from the footer area")
    public void iGotoTheCareersTabFromTheFooterArea() {
        clickById(footerCareersID);
        sleepFor(2);
    }

    @Then("I verify the title of the landing page is {string}")
    public void iVerifyTheTitleOfTheLandingPageIs(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Test Failed", expectedTitle, actualTitle);
    }

    @When("I am browsing for {string} in the {string}")
    public void iAmBrowsingForInThe(String openPositions, String areaZipcode) {
        iGotoTheCareersTabFromTheFooterArea();
        clickByXpath(browseForCareers);
        typeByCss(openPositionsCss, openPositions);
        sleepFor(2);
        typeByCss(areaZipcodeCss, areaZipcode);
        clickByCss(jobSearchButtonCss);
        sleepFor(1);
    }

    @Then("I very corresponding results as {string} and {string} are filled in")
    public void iVeryCorrespondingResultsAsAndAreFilledIn(String openPositions, String areaZipcode) {
        String actualOpenPosition = driver
                .findElement(By.
                        cssSelector(openPositionsCss))
                .getAttribute("value");
        String actualAreaZipcode = driver
                .findElement(By
                        .cssSelector(areaZipcodeCss))
                .getAttribute("value");
        Assert.assertEquals("Test Failed. Matched Position not found",
                openPositions,
                actualOpenPosition);
        Assert.assertEquals("Test Failed. Matched Zipcode not found",
                areaZipcode,
                actualAreaZipcode);
    }

    @When("I browse the financing options page")
    public void iBrowseTheFinancingOptionsPage() {
        clickByCss(financeOptionsCss);
    }

    @And("I enter my {string} {string} {string} {string} {string} {string} {string}")
    public void iEnterMy(String firstName,
                         String lastName,
                         String emailAddress,
                         String streetAddress,
                         String zipcode,
                         String DOB,
                         String SSN) {

        sleepFor(2);
        typeByXpath(foFirstNameCss,
                firstName);
        typeByXpath(foLastNameCss,
                lastName);
        typeByXpath(foEmailCss,
                emailAddress);
        typeByXpath(foAddressLineCss,
                streetAddress);
        typeByXpath(foZipcodeCss,
                zipcode);
        typeByXpath(foDOBCss,
                DOB);
        typeByXpath(foSSNCss,
                SSN);
        sleepFor(2);
        clickByCss(foSeePaymentsButtonCss);

    }

    @Then("I verify the error message {string}")
    public void iVerifyTheErrorMessage(String expected) {
        String actual = getTextByCss(foNoOfferCss);
        Assert.assertEquals("Test Failed",expected,actual);
    }
}
