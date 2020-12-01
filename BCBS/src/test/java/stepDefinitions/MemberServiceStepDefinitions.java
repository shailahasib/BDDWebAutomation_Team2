package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import memberService.MemberServicePage;
import static memberService.MemberServiceWebElements.*;

import memberService.MemberServiceWebElements;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class MemberServiceStepDefinitions extends WebAPI {
    MemberServicePage memberServicePage;

    @BeforeStep
    public void getInit(){
        memberServicePage = PageFactory.initElements(driver,MemberServicePage.class);
    }


    @Given("I am at BCBS homepage")
    public void i_am_at_bcbs_homepage() throws IOException {
        memberServicePage.navigateToBlueCross();
    }



    @Then("I verify the dropdown displays")
    public void i_verify_the_dropdown_displays() {
    }


    @When("I click on Access my benefits")
    public void iClickOnAccessMyBenefits() {
    }

    @Then("I verify that Access benefits page is open")
    public void iVerifyThatAccessBenefitsPageIsOpen() {
    }


    @Then("I verify that I am directed to new tab for VisitBlue")
    public void iVerifyThatIAmDirectedToNewTabForVisitBlue() {
        memberServicePage.equalAssertion(MemberServiceWebElements.blue365DealsExpected,memberServicePage.getTitleGeneric());
    }

    @And("I scroll down the page")
    public void iScrollDownThePage() {
        memberServicePage.clickGeneric(memberServicePage.closeCookies);
        //memberServicePage.scrollIntoView(memberServicePage.accessibility);
    }

    @When("I click on the back to Top red arrow")
    public void iClickOnTheBackToTopRedArrow() {
        memberServicePage.waitForVisibility(memberServicePage.arrowUpIcon, 8);
        memberServicePage.clickGeneric(memberServicePage.arrowUpIcon);
    }

    @Then("I verify that the page scrolls back to top")
    public void iVerifyThatThePageScrollsBackToTop() {
        memberServicePage.scrollDownToBottom();
    }

    @When("I select travel on the right column options")
    public void iSelectTravelOnTheRightColumnOptions() {
        memberServicePage.actionClick(memberServicePage.travel);
    }

    @Then("I verify that travel deals are displayed")
    public void iVerifyThatTravelDealsAreDisplayed() {
        memberServicePage.equalAssertion(travelExpected,getTextByXpath(travelDealsText));
    }

    @And("I open the location dropdown")
    public void iOpenTheLocationDropdown() {
    }

    @When("I select a state")
    public void iSelectAState() {
    }

    @Then("it is displayed on Your Selection")
    public void itIsDisplayedOnYourSelection() {
    }

    @And("I select all deals")
    public void iSelectAllDeals() {
        memberServicePage.clickGeneric(memberServicePage.allDeals);
    }

    @And("I enter {string} in the keyword search box")
    public void iEnterInTheKeywordSearchBox(String keyword) {
        memberServicePage.sendKeysGeneric(memberServicePage.enterKeyword,keyword);
    }

    @When("I click GO")
    public void iClickGO() {
        memberServicePage.clickGeneric(memberServicePage.clickGo);
    }

    @Then("I verify that the search item is displayed on Your Selection")
    public void iVerifyThatTheSearchItemIsDisplayedOnYourSelection() {
    }


    @And("I hover the mouse over Member Service and select BlueDeals")
    public void iHoverTheMouseOverMemberServiceAndSelectBlueDeals() {
        memberServicePage.hoverOverElementThenClick(memberServicePage.memberService,memberServicePage.blue365);
    }




    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Marriot Homepage");
        }
    }

    @When("I switch to new tab")
    public void iSwitchToNewTab() {
        memberServicePage.nextTabHandle();
    }

    @When("I hover the mouse over Member Service")
    public void iHoverTheMouseOverMemberService() {
    }

    @And("I hover the mouse over Member Service and select my benefits")
    public void iHoverTheMouseOverMemberServiceAndSelectMyBenefits() {
    }

    @And("I type in the {string} term")
    public void iTypeInTheTerm(String search) {
        sleepFor(2);
        //memberServicePage.actionClick(memberServicePage.searchKeyWords);
        memberServicePage.sendKeysGeneric(memberServicePage.searchKeyWords, search);
    }

    @When("I click enter on the keyboard")
    public void iClickEnterOnTheKeyboard() {
        memberServicePage.sendKeysEnter(memberServicePage.searchKeyWords);
        sleepFor(2);
    }

    @Then("I land on the results page for the search term")
    public void iLandOnTheResultsPageForTheSearchTerm() {
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @When("I click on about blue")
    public void iClickOnAboutBlue() {
        memberServicePage.clickGeneric(memberServicePage.aboutBlue);
    }

    @Then("I verify that the Mission and Values are displayed")
    public void iVerifyThatTheMissionAndValuesAreDisplayed() {
        memberServicePage.equalAssertion(missionExpected,memberServicePage.getTextGeneric(memberServicePage.missionAndValues));
    }

    @And("I click sign in")
    public void iClickSignIn() {
        memberServicePage.clickGeneric(memberServicePage.signIn);
    }

    @And("I enter an invalid {string}")
    public void iEnterAnInvalid(String password) {
        memberServicePage.sendKeysGeneric(memberServicePage.sigInPassword,password);
        sleepFor(2);
    }

    @And("I enter an invalid {string} address")
    public void iEnterAnInvalidAddress(String email) {

        memberServicePage.sendKeysGeneric(memberServicePage.sigInEmail,email);
        sleepFor(2);
    }

    @When("I click sign in with email")
    public void iClickSignInWithEmail() {
        memberServicePage.clickGeneric(memberServicePage.signInOrange);
        sleepFor(4);
    }

    @Then("I validate that error message is displayed")
    public void iValidateThatErrorMessageIsDisplayed() {
        memberServicePage.elementDisplayed(memberServicePage.errorMessageSign);
    }

    @Then("I verify that the url is correct for current search")
    public void iVerifyThatTheUrlIsCorrectForCurrentSearch() {
    }

    @Then("I verify that the {string} is correct for current search")
    public void iVerifyThatTheIsCorrectForCurrentSearch(String url) {
        memberServicePage.equalAssertion(url,memberServicePage.getTitleGeneric());
    }
}
