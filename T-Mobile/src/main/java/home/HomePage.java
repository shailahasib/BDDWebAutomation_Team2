package home;

import common.WebAPI;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(xpath = clickOnBankingLinkLocator)
    public WebElement clickOnBankingLink;
    @FindBy(xpath = clickOnSignUpButtonLocator)
    public WebElement clickOnSignUpButton;
    @FindBy(xpath = clickCreateIDLocator)
    public WebElement clickCreateID;
    @FindBy(xpath = validateCreateIDLocator)
    public WebElement validateCreateID;
    @FindBy(css = FirstNameLocator)
    public WebElement sendFirstName;
    @FindBy(css = LastNameLocator)
    public WebElement sendLastName;
    @FindBy(css = emailLocator)
    public WebElement email;
    @FindBy(css = Re_enteremailLocator)
    public WebElement Re_enterEmail;
    @FindBy(css = passwordLocator)
    public WebElement password;
    @FindBy(css = Re_enterpasswordLocator)
    public WebElement Re_enterPassword;
    @FindBy(xpath = clickOnNextButtonTMobileIDLocator)
    public WebElement clickOnNextButtonTMobileID;
    @FindBy(id = enterPhoneNUMLocator)
    public WebElement enterPhoneNUM;
    @FindBy(xpath = submitMobileNumLocator)
    public WebElement submitMobileNum;
    @FindBy(xpath = skipSSNLocator)
    public WebElement skipSSNElements;
    @FindBy(xpath = enterAddressLocator)
    public WebElement enterAddress;
    @FindBy(xpath = enterCityLocator)
    public WebElement enterCityElement;
    @FindBy(css = enterStateLocator)
    public WebElement enterStateElement;
    @FindBy(css = clickOnNextLocator)
    public WebElement clickOnNext;
    @FindBy(xpath = clickOnAPYInPerksLocator)
    public WebElement clickOnAPYInPerks;
    @FindBy(xpath = clickOnAPYInPerkLocator)
    public WebElement clickOnAPYInPerk;
    @FindBy(xpath = validateAPYInPerksLocator)
    public WebElement validateAPYInPerksActual;
    @FindBy(xpath = clickOnNoFeeBankingLocator)
    public WebElement clickOnNoFeeBanking;
    @FindBy(xpath = clickOnFQALocator)
    public WebElement clickOnFQA;
    @FindBy(xpath = sendOptionsKeywordLocator)
    public WebElement sendOptionsKeyword;
    @FindBy(id = validateResultLocator)
    public WebElement validateResult;
    @FindBy(className = validateFinalResultLocator)
    public WebElement validateFinalResult;
    @FindBy(id = clickOnTVLinkLocator)
    public WebElement clickOnTVLink;
    @FindBy(xpath = clickOnMyAccountLinkLocator)
    public WebElement clickOnMyAccountLinkElement;
    @FindBy(xpath = clickOnLoginButtLocator)
    public WebElement clickOnLoginButt;
    @FindBy(css = enterInvalidEmailLocator)
    public WebElement enterInvalidEmailElements;
    @FindBy(id = clickOnNextButton1Locator)
    public WebElement clickOnNextButton1Elements;
    @FindBy(id = enterInvalidPasswordLocator)
    public WebElement enterInvalidPasswordElements;
    @FindBy(id = clickOnLoginButton2Locator)
    public WebElement clickOnLoginButton2Elements;
    @FindBy(xpath = clickAskAnExpertLocator)
    public WebElement clickAskAnExpertElements;
    @FindBy(xpath = verifyPopupAskAnExpertLocator)
    public WebElement verifyPopupAskAnExpert;
    @FindBy(xpath = sendMessageInChatBoxtLocator)
    public WebElement sendMessage;
    @FindBy(xpath = EnterOnTheKeyboardElementsLocator)
    public WebElement enterOnTheKeyboardElements;
    @FindBy(xpath = validateMessageBackLocator)
    public WebElement validateMessageBack;

    public void sendKey(WebElement element, String Value) {
        element.sendKeys(Value);
    }

    public void clickOnBankingLink() throws InterruptedException {
        Thread.sleep(3);
        clickOnBankingLink.click();
    }

    public void validateClickOnBankingLink() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnSignUpButton() {
        windowAndTabs();
        clickOnSignUpButton.click();
    }

    public void clickOnCreateATMobileIDToSignUp() {
        windowAndTabs();
        clickCreateID.click();
    }

    public void VerifyLandingOnCreateATMobileID() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Create a T-Mobile ID to sign up forT-Mobile MONEY";
        String actualResult = validateCreateID.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnNextButtonTMobileID() throws InterruptedException {
        windowAndTabs();
        clickOnNextButtonTMobileID.click();
    }

    public void enterPhoneNUMElements(String phoneNum) throws InterruptedException {
        windowAndTabs();
        enterPhoneNUM.sendKeys(phoneNum);
    }

    public void clickOnSubmitButton() throws InterruptedException {
        windowAndTabs();
        submitMobileNum.click();
    }

    public void skipSSN() throws InterruptedException {
        windowAndTabs();

        skipSSNElements.click();
    }

    public void enterMyAddress(String Address) throws InterruptedException {
        windowAndTabs();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(enterAddress).sendKeys(Address);
//        enterAddress.submit();
        Thread.sleep(10);
        enterAddress.sendKeys(Address);

    }


    public void enterCity(String City) throws InterruptedException {
        windowAndTabs();
        Thread.sleep(10);
        Actions action = new Actions(driver);
        action.moveToElement(enterCityElement).sendKeys(City);
//        enterCityElement.submit();
//        enterCityElement.sendKeys(City);
    }

    public void enterState(String State) throws InterruptedException {
        windowAndTabs();
        Actions action = new Actions(driver);
        action.moveToElement(enterStateElement).sendKeys(State);
//        enterStateElement.submit();
//        enterStateElement.sendKeys(State);
    }

    public void clickOnNextPersonalInfo() throws InterruptedException {
        windowAndTabs();
        sleepFor(20);
        Actions action = new Actions(driver);
        action.moveToElement(clickOnNext).perform();
        clickOnNext.click();
    }

    public void clickOnAPYInPerks() throws InterruptedException {
        windowAndTabs();
        Actions action = new Actions(driver);
        action.moveToElement(clickOnAPYInPerks).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'4.00% APY')]"))).click();
    }

    public void validateAPYInPerks() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "4.00% APY* is serious interest.";
        String actualResult = validateAPYInPerksActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void gotYourBackLink() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5);
        Actions action1 = new Actions(driver);
        action1.moveToElement(clickOnAPYInPerk).perform();
        WebDriverWait wait1 = new WebDriverWait(driver, 8);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[4]/div[2]/div[2]/nav[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]"))).click();
    }

    public void validateGotYourBackLink() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "No Overdraft Fees - T-Mobile MONEY Account | T-Mobile";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnNoFeeBankingInTheFeaturesLink() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5);
        Actions action1 = new Actions(driver);
        action1.moveToElement(clickOnNoFeeBanking).perform();
        WebDriverWait wait1 = new WebDriverWait(driver, 8);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("No-fee banking"))).click();
    }

    public void validateFeeBankingInTheFeaturesLink() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Banking with No Fees - T-Mobile MONEY | T-Mobile";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnBestInClassInDigitalBanking() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5);
        Actions action1 = new Actions(driver);
        action1.moveToElement(clickOnNoFeeBanking).perform();
        WebDriverWait wait1 = new WebDriverWait(driver, 8);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Best-in-class digital banking"))).click();
    }

    public void validateClickOnBestInClassInDigitalBanking() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Digital Banking - T-Mobile MONEY | T-Mobile";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnDirectDepositLink() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5);
        Actions action1 = new Actions(driver);
        action1.moveToElement(clickOnNoFeeBanking).perform();
        WebDriverWait wait1 = new WebDriverWait(driver, 8);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Direct deposit')]"))).click();
    }

    public void validateDirectDepositLink() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Direct Deposit Setup on T-Mobile MONEY | T-Mobile";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnNoFeeATMSLink() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5);
        Actions action = new Actions(driver);
        action.moveToElement(clickOnNoFeeBanking).perform();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='header']/div[4]/div[2]/div[2]/nav/div[2]/ul/li[2]/ul/li[4]/a"))).click();
    }

    public void validateNoFeeATMSLink() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "T-Mobile MONEY ATM and Cash Locator - Allpoint® ATMs | T-Mobile";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnDepositCashLocationsLink() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5);
        Actions action = new Actions(driver);
        action.moveToElement(clickOnNoFeeBanking).perform();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Deposit cash locations"))).click();
    }

    public void validateDepositCashLocationsLink() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Find closest locations to deposit cash | T-Mobile MONEY";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnFAQOption() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5);
        clickOnFQA.click();
    }

    public void validateFAQOption() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "FAQs for T-Mobile MONEY | T-Mobile";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void enterInTheSearchbox(String Questions) throws InterruptedException {
        windowAndTabs();
        sendOptionsKeyword.sendKeys(Questions);
    }

    public void shouldBeAbleToSeeTheInTheSearchResult(String expectedResult) throws InterruptedException {
        sleepFor(5);
        String actualResult = validateResult.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    public void verifyTheInTheSearchResult(String expectedResult) throws InterruptedException {
        sleepFor(5);
        String actualResult = validateFinalResult.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnTVLink() throws InterruptedException {
        Thread.sleep(5);
        clickOnTVLink.click();
    }

    public void validateTVPage() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnMyAccountLink() throws InterruptedException {
        windowAndTabs();
        clickOnMyAccountLinkElement.click();
    }

    public void clickOnLoginButton1() throws InterruptedException {
        windowAndTabs();
        clickOnLoginButt.click();
    }

    public void enterInvalidEmail(String email) throws InterruptedException {
        windowAndTabs();
        enterInvalidEmailElements.sendKeys(email);
    }

    public void clickOnNextButton1() throws InterruptedException {
        windowAndTabs();
        clickOnNextButton1Elements.click();
    }

    public void enterInvalidPassword(String Password) throws InterruptedException {
        windowAndTabs();
        enterInvalidPasswordElements.sendKeys(Password);
    }

    public void clickOnLoginButton2() throws InterruptedException {
        windowAndTabs();
        clickOnLoginButton2Elements.click();
    }

    public void validateLoginWithInvalidInformation(String expectedResult) throws InterruptedException {
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickAskAnExpert() throws InterruptedException {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        clickAskAnExpertElements.click();
    }

    public void verifyTheChatboxPopupWillOpen() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Hello, let's talk!";
        String actualResult = verifyPopupAskAnExpert.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void enterAQuestionInTheChatBox(String Message) throws InterruptedException {
//        Thread.sleep(8);
        sendMessage.sendKeys(Message);
    }

    public void clickEnterOnTheKeyboard() throws InterruptedException {
        enterOnTheKeyboardElements.sendKeys(Keys.ENTER);
    }

    public void verifyTheAutomatedMessageBackFromAnExpert() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Before we get started, are you currently a T-Mobile or Sprint customer, now part of T-Mobile?";
        String actualResult = validateMessageBack.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }
}
