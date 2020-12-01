package stepDefinitions;

import com.google.inject.Key;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import phonesAndDevices.PhonesAndDevicesPage;
import phonesAndDevices.PhonesAndDevicesWebElements;
import static phonesAndDevices.PhonesAndDevicesWebElements.*;

import java.io.IOException;

public class PhonesAndDevicesStepDefinitions extends WebAPI {

    static PhonesAndDevicesPage phonesAndDevicesPage;

    @BeforeStep
    public void getInit() {
        phonesAndDevicesPage = PageFactory.initElements(driver, PhonesAndDevicesPage.class);
        ChromeOptions option = new ChromeOptions();
        option.addArguments("disable-notifications");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Marriot Homepage");
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on T-Mobile home page")
    public void i_am_on_t_mobile_home_page() throws IOException {
        phonesAndDevicesPage.navigateToTMobile();
    }

    @When("I hover over the Phones and devices")
    public void i_hover_over_the_phones_and_devices() {
        sleepFor(6);
        //phonesAndDevicesPage.hoverOverElementThenClick(phonesAndDevicesPage.phonesAndDevices, phonesAndDevicesPage.accessories);
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.phonesAndDevices);
    }

    @Then("I validate that accessories are displayed on page")
    public void i_validate_that_accessories_are_displayed_on_page() {
        phonesAndDevicesPage.elementDisplayed(phonesAndDevicesPage.accessoriesTextEle);
    }

    @When("I select Accessories")
    public void iSelectAccessories() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.accessories);
    }

    @And("I dismiss the popup offer")
    public void iDismissThePopupOffer() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.dismissPopUp);

    }

    @And("I wait for the popup offer to appear")
    public void iWaitForThePopupOfferToAppear() {
        sleepFor(5);
        phonesAndDevicesPage.waitUntil(dismissPopUpForFinancing);
    }

    @And("I collect all the iframes")
    public void iCollectAllTheIframes() {
    }

    @And("I select sync up pet bands")
    public void iSelectSyncUpPetBands() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.syncUpPets);
    }

    @And("I add the item to cart")
    public void iAddTheItemToCart() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.syncUpPetsInCart);
    }

    @When("I click on check out as a guest")
    public void iClickOnCheckOutAsAGuest() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.checkOutAsAGuest);
    }

    @Then("I verify that I have landed on the review cart page")
    public void iVerifyThatIHaveLandedOnTheReviewCartPage() {
        phonesAndDevicesPage.equalAssertion(myCartSignText,phonesAndDevicesPage.getTextGeneric(phonesAndDevicesPage.myCartSign));
    }


    @And("I start checkout")
    public void iStartCheckout() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.startCheckout);
    }

    @And("I select complete in store")
    public void iSelectCompleteInStore() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.finalizeInStore);
    }

    @And("I enter my first name")
    public void iEnterMyFirstName() {
        phonesAndDevicesPage.sendKeysGeneric(phonesAndDevicesPage.enterFNameBox,fName);
    }

    @And("I enter my last name")
    public void iEnterMyLastName() {
        phonesAndDevicesPage.sendKeysGeneric(phonesAndDevicesPage.enterLNameBox,lName);
    }

    @And("I enter my email")
    public void iEnterMyEmail() {
        phonesAndDevicesPage.sendKeysGeneric(phonesAndDevicesPage.enterEmailBox,email);
    }

    @And("I enter my phone number")
    public void iEnterMyPhoneNumber() {
        phonesAndDevicesPage.sendKeysGeneric(phonesAndDevicesPage.enterFNameBox,phone);
    }

    @And("I enter my zipcode")
    public void iEnterMyZipcode() {
        phonesAndDevicesPage.sendKeysGeneric(phonesAndDevicesPage.enterFNameBox,zip);
    }

    @When("I select smart watches")
    public void iSelectSmartWatches() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.smartWatches);
    }

    @When("I run a test to find all broken links")
    public void iRunATestToFindAllBrokenLinks() {
        phonesAndDevicesPage.findBrokenLinks();
        sleepFor(5);
    }

    @And("I search for a {string}")
    public void iSearchForA(String product) {
        sleepFor(2);
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.searchMagnifier);
        phonesAndDevicesPage.sendKeysGeneric(phonesAndDevicesPage.searchBox,product);
        sleepFor(2);
    }

    @Then("I verify that I can see the cart total")
    public void iVerifyThatICanSeeTheCartTotal() {
        phonesAndDevicesPage.elementDisplayed(phonesAndDevicesPage.checkTotal);
    }

    @Then("I verify that the monthly payment option is available")
    public void iVerifyThatTheMonthlyPaymentOptionIsAvailable() {
        phonesAndDevicesPage.elementDisplayed(phonesAndDevicesPage.monthlyOption);
    }

    @When("I click on remove on the item container")
    public void iClickOnRemoveOnTheItemContainer() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.remove);
    }

    @Then("I verify that item has been removed and the cart is empty with message to add")
    public void iVerifyThatItemHasBeenRemovedAndTheCartIsEmptyWithMessageToAdd() {
        phonesAndDevicesPage.elementDisplayed(phonesAndDevicesPage.cartTextNext);
    }

    @And("I hit enter on the keyboard")
    public void iHitEnterOnTheKeyboard() {
       phonesAndDevicesPage.searchBox.sendKeys(Keys.ENTER);
    }

    @And("I click user icon")
    public void iClickUserIcon() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.accountLoginIcon);
    }

    @And("I select pay a bill")
    public void iSelectPayABill() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.payABill);
    }

    @And("I enter an invalid {string}")
    public void iEnterAnInvalid(String username) {
        phonesAndDevicesPage.sendKeysGeneric(phonesAndDevicesPage.userNameId, username);
    }

    @When("I click next")
    public void iClickNext() {
        phonesAndDevicesPage.clickGeneric(phonesAndDevicesPage.next);
    }

    @Then("I verify that the error message is displayed")
    public void iVerifyThatTheErrorMessageIsDisplayed() {
        phonesAndDevicesPage.elementDisplayed(phonesAndDevicesPage.errorMessageId);
    }
}
