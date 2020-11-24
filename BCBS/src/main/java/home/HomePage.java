package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {


    @FindBy(xpath = mouseOverLocator)
    public WebElement mouseOverElement;
    @FindBy(xpath = emptySearchBoxLocator)
    public WebElement valueSearchBox;
    @FindBy(xpath = sportSearchBoxLocator)
    public WebElement sportSearchBox;
    @FindBy(xpath = clickSearchButtonLocator)
    public WebElement clickSearchButton;
    @FindBy(xpath = validateErrorMessage)
    public WebElement actualErrorMessage;
    @FindBy(className = validateMessageLocator)
    public WebElement validateMessageMessage;
    @FindBy(xpath = clickOnAllDealsLocator)
    public WebElement allDealsLocator;
    @FindBy(xpath = clickFitnessLocator)
    public WebElement clickFitness;
    @FindBy(xpath = actualCategoryInFilter)
    public WebElement validateCategoryInFilter;
    @FindBy(xpath = clickOnScrollUpLocator)
    public WebElement clickOnScrollUp;
    @FindBy(xpath = validateScrollUpLocator)
    public WebElement validateScrollUp;
    @FindBy(xpath = clickOnCheckEligibility)
    public WebElement CheckEligibility;
    @FindBy(xpath = sendIdNUmLocator)
    public WebElement sendIdNUm;
    @FindBy(xpath = clickOnSubmitLocator)
    public WebElement clickOnSubmit;

    @FindBy(xpath = validateCheckEligibalActual)
    public WebElement CheckEligibalActual;
    @FindBy(xpath = clickOnJoinButtonLocator)
    public WebElement clickOnJoinButton;
    @FindBy(xpath = enter3DigitElementsLocator)
    public WebElement e3DigitElements;
    @FindBy(xpath = clickOnSubmitElementsLocator)
    public WebElement checkEligibility;
    //table
    @FindBy(css = sendFirstNameLocator)
    public WebElement sendFirstName;
    @FindBy(css = sendLastNameLocator)
    public WebElement sendLastName;
    @FindBy(css = emailLocator)
    public WebElement email;
    @FindBy(css = zipCodeLocator)
    public WebElement zipCode;
    @FindBy(name = selectPlanLocator)
    public WebElement selectPlan;
    @FindBy(xpath = submitLocator)
    public WebElement submit;
    @FindBy(xpath = validateRegisterActual)
    public WebElement RegisterActual;
    @FindBy(xpath = clickOnAboutBlueLocator)
    public WebElement clickOnAboutBlue;
    @FindBy(xpath = clickOnHowBlueWorksLocator)
    public WebElement clickOnHowBlueWorks;
    @FindBy(xpath = clickRegisterForDemoLocator)
    public WebElement clickRegisterForDemo;
    @FindBy(xpath = clickForEmployersLocator)
    public WebElement clickForEmployers;
    @FindBy(css = sendFirstnameLocator)
    public WebElement sendFirstname;
    @FindBy(css = sendLastnameLocator)
    public WebElement sendLastname;
    @FindBy(css = sendemailaddressLocator)
    public WebElement sendemailaddress;
    @FindBy(css = sendcompanynameLocator)
    public WebElement sendcompanyname;
    @FindBy(css = sendjobtitileLocator)
    public WebElement sendjobtitile;
    @FindBy(css = selectEmployeeNumLocator)
    public WebElement selectEmployeeNum;
    @FindBy(css = selectBCBSPlanLocator)
    public WebElement selectBCBSPlanElements;
    @FindBy(xpath = WebinarDateLocator)
    public WebElement WebinarDate;
    @FindBy(css = clickOnAgreeLocator)
    public WebElement clickOnAgree;
    @FindBy(css = clickOnParticipateInLocator)
    public WebElement clickOnParticipateIn;
    @FindBy(xpath = clickOnRegisterLocator)
    public WebElement clickOnRegister;
    @FindBy(xpath = verifyMyRegistrationLocator)
    public WebElement verifyMyRegistrationActual;
    @FindBy(className = validateTheVideoLocator)
    public WebElement validateTheVideoActual;
    @FindBy(xpath = clickOnTheVideoLocator)
    public WebElement clickOnTheVideoLocatorElement;

    public void sendKey(WebElement element, String Value) {
        element.sendKeys(Value);
    }

    public void navigateToBlue365HomePage() {
        Actions action = new Actions(driver);
        action.moveToElement(mouseOverElement).perform();
    }

    public void clickOnVisit() {
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnVisitBlue365Locator))).click();
    }

    public void VisitBlue365() {
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnVisitBlue365Locator))).click();
    }

    public void validateVisitBlueBenefitPage() {
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResultLocator, actualResult);
    }

    public void emptySearchBoxElement(String enterValue) throws NoSuchWindowException {
        windowAndTabs();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        valueSearchBox.sendKeys(enterValue);
    }

    public void SearchBoxElementSports(String enterValue) throws NoSuchWindowException {
        windowAndTabs();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        sportSearchBox.sendKeys(enterValue);
    }

    public void clickOnSearchButtons() throws InterruptedException {
        windowAndTabs();
        clickSearchButton.click();
    }

    public void validateEmptySearchBoxElement() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Your search yielded no results.";
        String actualResult = actualErrorMessage.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void validateSearchBoxWithValidValue() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Showing 1-18 of 18 Results";
        String actualResult = validateMessageMessage.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void allDealsElements() throws InterruptedException {
        windowAndTabs();
        allDealsLocator.click();
    }

    public void clickFitnessElement() throws InterruptedException {
        windowAndTabs();
        clickFitness.click();
    }

    public void validateSearchBoxWithCharacters() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Your search yielded no results.";
        String actualResult = actualErrorMessage.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }
//    public void validateCategoryChosenInTheFilter() throws InterruptedException {
//        windowAndTabs();
//        sleepFor(5);
//        String expectedResult = "Fitness";
//        String actualResult = validateCategoryInFilter.getText();
//        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
//    }

    public void scrollDownElement() throws InterruptedException {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");

    }

    public void scrollUpElement() throws InterruptedException {
        windowAndTabs();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnScrollUpLocator))).click();
    }

    public void validateScrollDownElement() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Explore Deals Just For You";
        String actualResult = validateScrollUp.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void checkEligibilityElements() {
        windowAndTabs();
        CheckEligibility.click();
    }

    public void sendIdNUmElement(String IdNumber) {
        windowAndTabs();
        sendIdNUm.sendKeys(IdNumber);
    }

    public void clickOnSubmitCheckElements() {
        windowAndTabs();
        clickOnSubmit.click();
    }

    public void validateCheckEligibility() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Unfortunately, it looks like Anthem Blue Cross and Blue Shield Indiana isn't participating in Blue365 just yet, but we don't want you to miss out on savings. If you'd like us to notify you when your Blue Company joins Blue365 please enter your info below";
        String actualResult = CheckEligibalActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnJoinElements() {
        windowAndTabs();
        clickOnJoinButton.click();
    }

    public void enter3DigitElements(String enterDigit) {
        windowAndTabs();
        e3DigitElements.sendKeys(enterDigit);
    }

    public void clickOnCheckEligibilityElements() throws InterruptedException {
        windowAndTabs();
        checkEligibility.click();
    }

    public void submitButtonsElements() throws InterruptedException {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        submit.click();
    }

    public void selectPlanElements() throws InterruptedException {
        windowAndTabs();
        sleepFor(2);
        Select select = new Select(selectPlan);
        select.selectByValue(selectByValue);
    }

    public void validateRegistration() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Thank You!";
        String actualResult = RegisterActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnAboutBlueElements() throws InterruptedException {
        windowAndTabs();
        clickOnAboutBlue.click();
    }

    public void clickOnHowBlueWorksElements() throws InterruptedException {
        windowAndTabs();
        clickOnHowBlueWorks.click();
    }

    public void validaHowBlueWorks() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "How it Works | Blue365 Deals";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickForEmployersButton() throws InterruptedException {
        windowAndTabs();
        clickForEmployers.click();
    }

    public void clickOnRegisterForADemo() throws InterruptedException {
//        windowAndTabs();
        sleepFor(5);
        clickRegisterForDemo.click();
    }

    public void enterNumberOfEmployees() throws InterruptedException {
        windowAndTabs();
        Select select = new Select(selectEmployeeNum);
        select.selectByValue(selectByValueLocator);

    }

    public void selectBCBSPlan() throws InterruptedException {
        windowAndTabs();
        Select select = new Select(selectBCBSPlanElements);
        select.selectByValue(selectByValueValue);

    }

    public void selectWebinarDates() throws InterruptedException {
        windowAndTabs();
        Select select = new Select(WebinarDate);
        select.selectByValue(WebinarDateValue);

    }

    public void clickOnIAgreeToThePolicy() throws InterruptedException {
        windowAndTabs();
        clickOnAgree.click();
    }

    public void participateInAmazonGiftCart() throws InterruptedException {
        windowAndTabs();
        clickOnParticipateIn.click();
    }

    public void clickOnRegisterButton() throws InterruptedException {
        windowAndTabs();
        clickOnRegister.click();
    }

    public void verifyMyRegistration() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "You are now registered for the event: Blue365 Demo";
        String actualResult = verifyMyRegistrationActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnTheVideo() throws InterruptedException {
        windowAndTabs();

        Actions action = new Actions(driver);
        action.moveToElement(clickOnTheVideoLocatorElement).doubleClick();
        clickOnTheVideoLocatorElement.submit();

    }

    public void validateTheVideoPlaying() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "0:34";
        String actualResult = validateTheVideoActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }
}