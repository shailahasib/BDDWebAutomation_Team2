package stepDefinitions;

import common.WebAPI;
import expediahome.ExpediaHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadExcel;
import utilities.WriteExcelFile;

import java.io.IOException;
import java.util.List;



public class ExpediaStepDefinitions extends WebAPI {


    static ExpediaHomePage expediaHomePage;

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

    @BeforeStep
    public static void getInit() {
        expediaHomePage = PageFactory.initElements(driver, ExpediaHomePage.class);
    }


    //
    @Given("I am at Expedia Home Page")
    public void i_am_at_expedia_home_page() throws IOException {
        openBrowser("https://www.expedia.com/service/");
    }

    @Given("I enter booking in searchBox")
    public void i_enter_booking_in_search_box() {
        expediaHomePage.enterSearchKeyWord("Booking");
    }

    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String serviceName) {
        expediaHomePage.enterSearchKeyWord(serviceName);
    }

    @When("I click search Button")
    public void i_click_search_button() {
        expediaHomePage.clickOnSearchButton();
    }

    @Then("I verify Booking is appear properly")
    public void i_verify_booking_is_appear_properly() {
        expediaHomePage.validateSearchText("Book a flight using an airline credit");
    }

    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String validServiceName) {
        expediaHomePage.validateSearchText(validServiceName);
    }

    @And("I verify {string}")
    public void iVerify(String arg0) {
        expediaHomePage.getURL();
    }


    @Then("I verify page title as Customer Service Portal")
    public void i_verify_page_title_as_customer_service_portal() {
        String expectedTitle = "Customer Service Portal";
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    @Then("I verify {string} as based on Customer Service Portal")
    public void i_verify_as_based_on_customer_service_portal(String expectedTitle) {
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }


    @Given("I enter user information")
    public void i_enter_user_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> data = dataTable.asLists(String.class);
        System.out.println(data.get(0));

        expediaHomePage.enterKeywords(expediaHomePage.customerName, data.get(0).get(0));
        expediaHomePage.enterKeywords(expediaHomePage.customerLast, data.get(1).get(0));
        expediaHomePage.enterKeywords(expediaHomePage.customerEmailAddress, data.get(2).get(0));
        expediaHomePage.enterKeywords(expediaHomePage.customerPassword, data.get(3).get(0));
    }

    @Given("I enter user information from row")
    public void i_enter_user_information_from_row(io.cucumber.datatable.DataTable dataTable) {
//         Write code here that turns the phrase above into concrete actions
//         For automatic transformation, change DataTable to one of
//         E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//         Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//         Double, Byte, Short, Long, BigInteger or BigDecimal.
//
//         For other transformations you can register a DataTableType.
    }

    @And("I click on sign in")
    public void iClickOnSignIn() {
        expediaHomePage.clickOnSignInButton();
    }

    @And("I click on Create a free Account")
    public void iClickOnCreateAFreeAccount() throws InterruptedException {
        expediaHomePage.clickOnCreateFreeAccount();
    }

    @Given("I click on Radio Button")
    public void i_click_on_radio_button() throws InterruptedException {
        expediaHomePage.clickOnRadioButton();
    }

    @When("I click on sign up Button")
    public void iClickOnSignUpButton() {
        expediaHomePage.clickOnSignUp();
    }

    @Then("I verify expedia account created successfully")
    public void iVerifyExpediaAccountCreatedSuccessfully() {
        expediaHomePage.validateAccount("celina");
    }



    //**********************************************

    @Given("I enter user information to log in")
    public void i_enter_user_information_to_log_in(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> data = dataTable.asLists(String.class);
        System.out.println(data.get(0));

        expediaHomePage.enterKeywords1(expediaHomePage.enterUserName, data.get(0).get(0));
        expediaHomePage.enterKeywords1(expediaHomePage.enterPassword, data.get(1).get(0));

    }

    @Given("I click Sign In")
    public void i_click_sign_in() {
        expediaHomePage.clickSignIn();
    }
    @Given("I click on Radio Button keep me sign in")
    public void i_click_on_radio_button_keep_me_sign_in() {
        expediaHomePage.clickKeepSignMeRadioButton();
    }

    @When("I click on sign in Button")
    public void i_click_on_sign_in_button()  {
        expediaHomePage.clickOnSignIn();
    }


    @And("I connect excel file with search Box")
    public void iConnectExcelFileWithSearchBox() {
        expediaHomePage.checkExcelWrite();
        }

    @Then("I verify my data appear properly")
    public void iVerifyMyDataAppearProperly() {

    }

    @When("I enter my data from excel file to my search box")
    public void iEnterMyDataFromExcelFileToMySearchBox() {
        expediaHomePage.readDataSearchBox();
    }

    @And("The data will enter from excel to search box automatically")
    public void theDataWillEnterFromExcelToSearchBoxAutomatically() throws IOException {
        expediaHomePage.checkWithDataReader();
    }

    @And("I verify {string} as based on product name")
    public void iVerifyAsBasedOnProductName(String arg0) {
        
    }

    @And("I click on Things To do")
    public void iClickOnThingsToDo() {

    }
}







