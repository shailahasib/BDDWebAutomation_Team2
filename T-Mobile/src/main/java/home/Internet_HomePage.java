package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static home.Internet_HomePageWebElements.*;

public class Internet_HomePage extends WebAPI {

    @FindBy(xpath = clickOnInternetLocator)
    public WebElement clickOnInternetElement;
    @FindBy(xpath = clickOnWhyWeDoItLocator)
    public WebElement clickOnWhyWeDoIt;
    @FindBy(xpath = validateWhyWeDoItLocator)
    public WebElement validateWhyWeDoIt;
    @FindBy(xpath = clickOnCustomerStoriesLocator)
    public WebElement clickOnCustomerStories;
    @FindBy(xpath = validateCustomerStoriesLocator)
    public WebElement validateCustomerStories;
    @FindBy(xpath = clickOnSupportLinkLocator)
    public WebElement clickOnSupportLink;
    @FindBy(xpath = clickOnExploreOurNetworkLocator)
    public WebElement clickOnExploreOurNetwork;
    @FindBy(xpath = mainSliderLocator)
    public WebElement mainSlider;
    @FindBy(xpath = sliderLocator)
    public WebElement slider;
    @FindBy(xpath = validate5GNetworkingLocator)
    public WebElement validate5GNetworking;
    @FindBy(xpath = clickOnTheVideoLocator)
    public WebElement clickOnTheVideo;
    @FindBy(xpath = clickOnStartVideoLocator)
    public WebElement clickOnStartVideo;
    @FindBy(xpath = clickOnStopVideoLocator)
    public WebElement clickOnStopVideo;
    @FindBy(css = sendFirstNameLocator)
    public WebElement sendFirstName;
    @FindBy(css = sendLastNameLocator)
    public WebElement sendLastName;
    @FindBy(css = sendEmailLocator)
    public WebElement sendEmail;
    @FindBy(css = sendZipLocator)
    public WebElement sendZip;
    @FindBy(css = wirelessPhoneLocator)
    public WebElement wirelessPhone;
    @FindBy(css = enterMyPhoneNumberLocator)
    public WebElement enterMyPhoneNumber;
    @FindBy(xpath = clickOnSubmitBLocator)
    public WebElement clickOnSubmitB;
    @FindBy(xpath = validateSingingUpLocator)
    public WebElement validateSingingUp;
    @FindBy(xpath = clickOnCheckAvailabilityLocator)
    public WebElement clickOnCheckAvailability;
    @FindBy(css = sendPhoneNumLocator)
    public WebElement sendPhoneNum;
    @FindBy(css = sendHomeAddressLocator)
    public WebElement sendHomeAddress;
    @FindBy(xpath = clickOnNextCheckAvailabilityLocator)
    public WebElement clickOnNextCheckAvailability;
    @FindBy(css = sendFirstName2Locator)
    public WebElement sendFirstName2;
    @FindBy(css = sendLastName2Locator)
    public WebElement sendLastName2;
    @FindBy(css = sendEmailAddress2Locator)
    public WebElement sendEmailAddress2;
    @FindBy(xpath = selectOnForNewCostumerLocator)
    public WebElement selectOnForNewCostumer;
    @FindBy(xpath = clickOnSubmitElementsLocator)
    public WebElement clickOnSubmitElements;


    public void sendKey(WebElement element, String Value) {
        element.sendKeys(Value);
    }

    public void sendKey1(WebElement element1, String Value1) {
        element1.sendKeys(Value1);
    }

    public void clickOnInternet() throws InterruptedException {
        Thread.sleep(3000);
        clickOnInternetElement.click();
    }

    public void validateClickOnInternet() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnWhyWeDoIt() {
        windowAndTabs();
        clickOnWhyWeDoIt.click();
    }

    public void validateWhyWeDoItElement() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Our customers are the focus of everything we do.";
        String actualResult = validateWhyWeDoIt.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnCustomerStoriesLink() {
        windowAndTabs();
        clickOnCustomerStories.click();
    }

    public void validateCustomerStoriesLink() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Check out what our customers have to say about T-Mobile Home Internet.";
        String actualResult = validateCustomerStories.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnSupportLink() {
        windowAndTabs();
        clickOnSupportLink.click();
    }

    public void validateClickOnSupportLink() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Support for Home Internet Service | T-Mobile";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnExploreOurNetwork() {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        clickOnExploreOurNetwork.click();
    }

    public void slideToSeeTheComparisonGCoverage() throws InterruptedException {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        new Actions(driver).dragAndDropBy(slider, 500, 0).perform();
    }

    public void validateClickOnExploreOurNetwork() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "We're leading the way in 5G coverage, and we’re still not slowing down. Our network is constantly expanding—boosting speed, coverage, and capacity. Plus, T-Mobile gives you nationwide 5G access included in our plans at no extra cost.";
        String actualResult = validate5GNetworking.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);

    }

    public void clickOnTheVideoElements() throws InterruptedException {
        windowAndTabs();
        clickOnTheVideo.click();
    }

    public void verifyTheTheVideoWillPlay() throws InterruptedException {
        sleepFor(5);
        driver.switchTo().frame(0);
        clickOnStopVideo.click();
        String expectedResult = "0:07";
        String actualResult = clickOnStartVideo.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);

    }

    public void selectMyWirelessPhoneNumber() throws InterruptedException {
        windowAndTabs();
        Select select = new Select(wirelessPhone);
        select.selectByValue("None of the Above");
    }

    public void enterMyPhoneNumber(String phoneNum) throws InterruptedException {
        windowAndTabs();
        enterMyPhoneNumber.sendKeys(phoneNum);
    }

    public void clickOnSubmitButton() throws InterruptedException {
        windowAndTabs();
        clickOnSubmitB.click();
    }


    public void verifyTheSigningUp() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Thanks for signing up!";
        String actualResult = validateSingingUp.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);

    }

    public void clickOnCheckAvailability() throws InterruptedException {
        windowAndTabs();
        clickOnCheckAvailability.click();
    }

    public void clickOnNextCheckAvailability() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(3000);
        clickOnNextCheckAvailability.click();
    }

    public void selectOnForNewCostumerOnly() throws InterruptedException {
        windowAndTabs();
        selectOnForNewCostumer.click();
    }

    public void clickOnSubmit() throws InterruptedException {
        windowAndTabs();
        clickOnSubmitElements.click();
    }

    public void verifyTheAvailabilityOfMyNewAccount() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Thank you. You're on the waiting list.";
        String actualResult = validateSingingUp.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);

    }


}
