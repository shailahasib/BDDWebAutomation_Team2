package stepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HomePageStepDefinitions extends WebAPI {

    static HomePage homePage;

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
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    String expectedResult;

    @Given("I am at expedia home page")
    public void iAmAtExpediaHomePage() throws IOException {
        openBrowser("https://www.expedia.com/");
    }

    @When("I click on jobs")
    public void iClickOnJobs() throws InterruptedException {
        homePage.clickOnJobs();
    }

    @Then("I verify that I am landing on jos Page")
    public void iVerifyThatIAmLandingOnJosPage() throws InterruptedException {
        homePage.validateClickOnJobs();
    }

    @When("I click on Why Expedia Group?")
    public void iClickOnWhyExpediaGroup() throws InterruptedException {
        homePage.clickOnWhyExpediaGroup();
    }

    @Then("I verify the elements for Expedia Group? option dropped down")
    public void iVerifyTheElementsForExpediaGroupOptionDroppedDown() throws InterruptedException {
        homePage.validateClickOnWhyExpediaGroup();
    }

    @When("I click on career path")
    public void iClickOnCareerPath() {
        homePage.clickOnCareerPath();
    }

    @Then("I verify the elements for The career path option dropped down")
    public void iVerifyTheElementsForTheCareerPathOptionDroppedDown() throws InterruptedException {
        homePage.validateClickOnCareerPath();
    }

    @When("I click on Our culture")
    public void iClickOnOurCulture() {
        homePage.clickOnOurCulture();
    }

    @Then("I verify the elements for The Our culture option dropped down")
    public void iVerifyTheElementsForTheOurCultureOptionDroppedDown() throws InterruptedException {
        homePage.validateClickOnOurCulture();
    }

    @And("I click on Many Brands, One Team")
    public void iClickOnManyBrandsOneTeam() {
        homePage.clickOnManyBrandsOneTeam();
    }

    @Then("I should be directed to Many Brands, One Team page")
    public void iShouldBeDirectedToManyBrandsOneTeamPage() throws InterruptedException {
        homePage.validateClickOnManyBrandsOneTeam();
    }

    @And("I click on We Work Everywhere")
    public void iClickOnWeWorkEverywhere() {
        homePage.clickOnWeWorkEverywhere();
    }

    @Then("I should be directed to We Work Everywhere page @smoke")
    public void iShouldBeDirectedToWeWorkEverywherePageSmoke() throws InterruptedException {
        homePage.validateClickOnWeWorkEverywhere();
    }

    @And("I click on Benefits + Perks")
    public void iClickOnBenefitsPerks() {
        homePage.clickOnBenefitsPerks();
    }

    @Then("I should be directed to Benefits + Perks")
    public void iShouldBeDirectedToBenefitsPerks() throws InterruptedException {
        homePage.validateClickOnBenefitsPerks();
    }

    @When("I click on Join our talent community")
    public void iClickOnJoinOurTalentCommunity() throws InterruptedException {
        homePage.clickOnJoinOurTalentCommunity();
    }

    @And("I click on Sign up using your e-mail address")
    public void iClickOnSignUpUsingYourEMailAddress() throws InterruptedException {
        homePage.clickOnSignUpUsingYourEMailAddress();
    }

    @And("I enter my e-mail address and password")
    public void iEnterMyEMailAddressAndPassword(List<List<String>> table) throws InterruptedException {
        windowAndTabs();
        sleepFor(8);
        Map<String, String> mapTable = HomePageStepDefinitions.Users.TableDictionaryConverter(table);
        homePage.sendKey(homePage.sendEmail, mapTable.get("emailaddress"));
        homePage.sendKey(homePage.sendPassword, mapTable.get("password"));
        homePage.sendKey(homePage.sendConfirmPassword, mapTable.get("confirmpassword"));

    }

    @Then("I verify that I joined to the team")
    public void IverifythatIjoinedtotheteam() throws InterruptedException {
        homePage.verifyJoinedToTheTeam();

    }

    @When("I enter {string} in search openings")
    public void iEnterInSearchOpenings(String search) throws InterruptedException {
        homePage.enterInSearchOpenings(search);
    }

    @And("I click on The Arrow logo search signe")
    public void iClickOnTheArrowLogoSearchSigne() throws InterruptedException {
        homePage.clickOnTheArrowLogoSearchSigne();
    }

    @Then("I verify the search page open")
    public void iVerifyTheSearchPageOpen() throws InterruptedException {
        homePage.validateEnterInSearchOpenings();
    }

    @And("I enter all the information about you")
    public void iEnterAllTheInformationAboutYou(List<List<String>> aboutYou) throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5000);
        Map<String, String> mapTable = HomePageStepDefinitions.Users.TableDictionaryConverter(aboutYou);
        homePage.sendKey(homePage.sendFirstname, mapTable.get("Firstname"));
        homePage.sendKey(homePage.sendLastname, mapTable.get("Lastname"));
        homePage.sendKey(homePage.sendMobilePhone, mapTable.get("Primarymobilephone"));
        homePage.sendKey(homePage.sendWebsite, mapTable.get("Website"));
        homePage.sendKey(homePage.sendDiploma, mapTable.get("Degreediploma"));
        homePage.sendKey(homePage.sendUniversity, mapTable.get("Universityinstitution"));
        homePage.sendKey(homePage.sendProfessionalExperience, mapTable.get("Professionalexperience"));
        homePage.sendKey(homePage.sendOrganisationName, mapTable.get("Organisationname"));
    }

    @And("I click What career paths are you interested in")
    public void iClickWhatCareerPathsAreYouInterestedIn() throws InterruptedException {
        homePage.clickWhatCareerPathsAreYouInterestedIn();
    }

    @And("I click I am happy for Expedia Group to contact me")
    public void iClickIAmHappyForExpediaGroupToContactMe() throws InterruptedException {
        homePage.clickIAmHappy();
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() throws InterruptedException {
        homePage.clickOnSubmitButton();
    }

    @And("I sign Out")
    public void iSignOut() throws InterruptedException {
        homePage.iSignOutElements();
    }

    @When("I enter the {string} in search openings")
    public void iEnterTheInSearchOpenings(String jobName) throws InterruptedException {
        homePage.sendJobNameElements(jobName);
    }

    @And("I enter the {string} in location searchbox")
    public void iEnterTheInLocationSearchbox(String locations) throws InterruptedException {
        homePage.enterTheInLocation(locations);

    }

    @And("I click on search logo")
    public void iClickOnSearchLogo() throws InterruptedException {
        homePage.clickOnSearchLogo();
    }

    @And("I verify {string} as total in the search")
    public void iVerifyAsTotalInTheSearch(String expectedResult) throws InterruptedException {
        Thread.sleep(5000);
        String actualResult = homePage.validateResultActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
//        homePage.validateSearchResultElements(expectedResult);
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

    @And("I click on Sign Up button")
    public void iClickOnSignUpButton() throws InterruptedException {
        homePage.clickOnSignUpButton();

    }
}