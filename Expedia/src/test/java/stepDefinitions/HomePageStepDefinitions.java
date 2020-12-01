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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

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
    @Given("I am at Expedia home page")
    public void i_am_at_expedia_home_page() throws IOException {
        openBrowser("https://www.expedia.com/");
    }
    @Given("I click expedia searchbox")
    public void i_click_expedia_searchbox() {
        homePage.expediaSearchBoxCheck();
    }
    @Given("I enter location")
    public void i_enter_location() {
        homePage.expediasendSearcBoxCheck();
        homePage.expediaSearchBoxSendLocation();
    }
    @When("I hit on search button")
    public void i_hit_on_search_button() {
        homePage.expediaclicksearchbutton();
    }
    @Then("I verify to the page title i am at right page")
    public void i_verify_to_the_page_title_i_am_at_right_page() throws InterruptedException {
        homePage.expediaclicksearcvalided("Bangladesh Hotel Search Results");
    }
    @Given("I click expedia Flight")
    public void i_click_expedia_flight() {
        homePage.expediaflight();
    }
    @Given("I Select one way")
    public void i_select_one_way() {
    }
    @Given("I enter my location  from where im leaving")
    public void i_enter_my_location_from_where_im_leaving() {
    }
    @Given("I click going box")
    public void i_click_going_box() {
    }
    @Given("I enter where i want to go")
    public void i_enter_where_i_want_to_go() {
    }
    @Given("I Click Departing")
    public void i_click_departing() {
        homePage.expediadeparting();
    }
    @Given("I select date from calander")
    public void i_select_date_from_calander() throws InterruptedException {
        homePage.calender();
    }
    @Given("I Click Done button on calender")
    public void i_click_done_button_on_calender() {
    }
    @Then("I verify lots of flights are avalable in the page")
    public void i_verify_lots_of_flights_are_avalable_in_the_page() {
    }
    @Given("I click Access My benifits")
    public void i_click_access_my_benifits() {
    }
    @Given("I I enter invalid number")
    public void i_i_enter_invalid_number() {
    }
    @When("I click go")
    public void i_click_go() {
    }
    @Then("I verify A pop up massage shows try again")
    public void i_verify_a_pop_up_massage_shows_try_again() {
    }
    @Given("I click cars on expedia")
    public void i_click_cars_on_expedia() throws InterruptedException {
        homePage.carsClick();
    }

//    @Given("I Click pick up box")
//    public void i_click_pick_up_box() throws InterruptedException {
//        homePage. expediapickUp();
//    }

    @Given("I enter my location")
    public void i_enter_my_location() {
    }
    @Given("I sleect my location in box")
    public void i_sleect_my_location_in_box() throws InterruptedException {
        homePage.pickUplocation();
    }
    @When("I click search")
    public void i_click_search() {
    }
    @Then("I verify im on right page")
    public void i_verify_im_on_right_page() {
    }
    @Given("I click cars on expedia build a package")
    public void i_click_cars_on_expedia_build_a_package() throws InterruptedException {
        homePage.expediabuildApagckaecheck();
    }
    @Given("I click Things to do")
    public void i_click_things_to_do() {
    }

    @Given("I click things to do box")
    public void i_click_things_to_do_box() throws InterruptedException {
        homePage.expediathingsToDo();
    }
    @Given("I select the location")
    public void i_select_the_location() {
    }
    @When("I click search button")
    public void i_click_search_button() {
    }
    @Then("I verify its working properly")
    public void i_verify_its_working_properly() {
    }
    @Given("I can click  Signin")
    public void i_can_click_signin() throws InterruptedException {
        sleepFor(5);
        homePage.expediaexpediaSignin();
    }
    @Given("I click inside Signin")
    public void i_click_inside_signin() throws InterruptedException {
        sleepFor(5);
        homePage.expediaexpediainsideSignin();
    }
    @Given("I enter {string} list in the searchbox")
    public void i_enter_list_in_the_searchbox(String email) throws InterruptedException {
        sleepFor(5);
        homePage.sendKeysinbox1(email);
    }

    @Given("I enter {string} list in the box")
    public void i_enter_list_in_the_box(String Password) throws InterruptedException {
        sleepFor(5);
        homePage.sendKeysinbox(Password);
    }

    @When("I click sign in bitton")
    public void i_click_sign_in_bitton() throws InterruptedException {
        sleepFor(5);
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        homePage.expediasigninclick();
    }
    @Then("I verify to the page title")
    public void i_verify_to_the_page_title(String expectedTitle) {
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }
    @And("I can see list your property and i click")
    public void iCanSeeListYourPropertyAndIClick() throws InterruptedException {
        sleepFor(1);
        homePage.expediaListYourProperty();
    }
    @When("i navavige to the page i can see list your property exist on the page top of  the right corner")
    public void iNavavigeToThePageICanSeeListYourPropertyExistOnThePageTopOfTheRightCorner() throws InterruptedException {
        sleepFor(1);
        homePage.VaidededPropertiy("List your property");
    }
    @And("I can see language right  of the header and i click")
    public void iCanSeeLanguageRightOfTheHeaderAndIClick() throws InterruptedException {
        sleepFor(1);
        homePage.language();
    }
    @When("and i see a  popup massage")
    public void andISeeAPopupMassage() throws InterruptedException {
        sleepFor(1);
        homePage.expediaLanguageTextGrab("You can only access your trip information and Expedia Rewards points from the Expedia site you booked on.");
    }
    @And("I can Add a flight")
    public void iCanAddAFlight() throws InterruptedException {
        sleepFor(1);
        homePage.expediaaddFlight();
    }
    @And("I can click leaving from")
    public void iCanClickLeavingFrom() throws InterruptedException {
        sleepFor(1);
        homePage.expediaLeavingFrom();
    }
    @And("I can cllick Search")
    public void iCanCllickSearch() throws InterruptedException {
        sleepFor(1);
        homePage.expediaSearchleavingFrom();
    }
    @Then("I verify all function are working properly")
    public void iVerifyAllFunctionAreWorkingProperly() {
    }
    @And("I can click more trave")
    public void iCanClickMoreTrave() throws InterruptedException {
        sleepFor(1);
        homePage.expediaMoreTravel();
    }
    @And("I can click flight")
    public void iCanClickFlight() {
        homePage.expediaClickFlightl();
    }
    @And("I can click searchBox inside support and i can enter somthing")
    public void iCanClickSearchBoxInsideSupportAndICanEnterSomthing() throws InterruptedException {
        sleepFor(1);
        homePage.expediaSupport();
    }
    @And("I can click searchKey")
    public void iCanClickSearchKey() throws InterruptedException {
        sleepFor(1);
        homePage.expediaSearchKeyClick();
    }
    @And("I can  click chat on")
    public void iCanClickChatOn() throws InterruptedException {
        sleepFor(1);
        homePage.expediaChatButton();
    }
    @And("I can click add a car")
    public void iCanClickAddACar() throws InterruptedException {
        sleepFor(1);
        homePage.expediaAddACar();
    }
    @And("I can click going to")
    public void iCanClickGoingTo() throws InterruptedException {
        sleepFor(1);
        homePage.expediaCarGoingTo();
    }
    @And("I verify function is okay")
    public void iVerifyFunctionIsOkay() {
    }
    @And("I want to scroll down the page and and I can click shop the sale")
    public void iWantToScrollDownThePageAndAndICanClickShopTheSale() {
        homePage.expediaShopTheSale();
    }
    @And("I can navigate to the page")
    public void iCanNavigateToThePage() {
    }
    @And("I can enter user name in search box")
    public void iCanEnterUserNameInSearchBox() throws InterruptedException {
        sleepFor(1);
        homePage.expediaTripEmail();
    }
    @Then("I can click sign in to verify")
    public void iCanClickSignInToVerify() throws InterruptedException {
        sleepFor(1);
        homePage.expediaPropertySignInButton();
    }
    @And("I can enter password in box")
    public void iCanEnterPasswordInBox() throws InterruptedException {
        sleepFor(1);
        homePage.expediaTripPassword();
    }
    @And("I can click sign in inside that top of the right corner")
    public void iCanClickSignInInsideThatTopOfTheRightCorner() throws InterruptedException {
        sleepFor(1);
        homePage.expediaPropertySignIn();
    }
    @And("I click trips")
    public void iClickTrips() {
        homePage.expediaTrips();
//        homePage. expediaTripsinside();
    }
    @Then("I can click submit")
    public void iCanClickSubmit() {
    }
    @And("I enter {string}in the box")
    public void iEnterInTheBox(String variouslocatio) throws InterruptedException {
        sleepFor(1);
        homePage.locationBoxIn(variouslocatio);
    }
    @And("I can click leaving from and i enter {string}")
    public void iCanClickLeavingFromAndIEnter(String differentLocation) throws InterruptedException {
        sleepFor(5);
        homePage.locationBoxOut(differentLocation);
    }
    @And("I enter <{string}> list in the box")
    public void iEnterListInTheBox(String Password) throws InterruptedException {
    }
}





