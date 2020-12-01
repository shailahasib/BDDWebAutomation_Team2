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

import java.awt.*;
import java.awt.event.KeyEvent;
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
    @FindBy(xpath = clickOnAPPARELFOOTWEARLocator)
    public WebElement clickOnAPPARELFOOTWEAR;
    @FindBy(className = validateAPPARELFOOTWEARLocator)
    public WebElement validateAPPARELFOOTWEAR;
    @FindBy(xpath = clickOnFitnessLocator)
    public WebElement clickOnFitness;
    @FindBy(className = validateFitnessLocator)
    public WebElement validateFitness;
    @FindBy(xpath = clickOnHEARINGVISIONLocator)
    public WebElement clickOnHEARINGVISION;
    @FindBy(className = validateHEARINGVISIONLocator)
    public WebElement validateHEARINGVISION;
    @FindBy(xpath = clickOnHOMEFAMILYLocator)
    public WebElement clickOnHOMEFAMILY;
    @FindBy(className = validateHOMEFAMILYLocator)
    public WebElement validateHOMEFAMILY;
    @FindBy(xpath = clickOnNUTRITIONLocator)
    public WebElement clickOnNUTRITION;
    @FindBy(className = validateNUTRITIONLocator)
    public WebElement validateNUTRITION;
    @FindBy(xpath = clickOnPERSONALCARELocator)
    public WebElement clickOnPERSONALCARE;
    @FindBy(className = validatePERSONALCARELocator)
    public WebElement validatePERSONALCARE;
    @FindBy(xpath = clickOnTRAVELLocator)
    public WebElement clickOnTRAVEL;
    @FindBy(className = validateTRAVELLocator)
    public WebElement validateTRAVEL;
    @FindBy(xpath = clickOnHealthyTipsLocator)
    public WebElement clickOnHealthyTips;
    @FindBy(xpath = clickOnTheHealthOfAmericaLocator)
    public WebElement clickOnTheHealthOfAmericaElements;
    @FindBy(xpath = clickOnSubscribeNewsLocator)
    public WebElement clickOnSubscribeNews;
    @FindBy(css = sendFirstName1Locator)
    public WebElement sendFirstName1;
    @FindBy(css = sendLastName1Locator)
    public WebElement sendLastName1;
    @FindBy(css = Email1Locator)
    public WebElement Email1;
    @FindBy(css = ZipCode1Locator)
    public WebElement ZipCode1;
    @FindBy(xpath = clickOnIAgreeElementsLocator)
    public WebElement clickOnIAgreeElements;
    @FindBy(xpath = clickOnSubscribeElementsLocator)
    public WebElement clickOnSubscribeElements;
    @FindBy(xpath = clickOnSubscribeSecondTimeElementsLocator)
    public WebElement clickOnSubscribeSecondTimeElements;
    @FindBy(xpath = validateSubscribeLocator)
    public WebElement validateSubscribe;
    @FindBy(xpath = clickOnReturnLocator)
    public WebElement clickOnReturn;
    @FindBy(className = validateAuthorisationLocator)
    public WebElement validateAuthorisation;
    @FindBy(xpath = clickOnDownloadImageLocator)
    public WebElement clickImageElements;
    @FindBy(linkText = clickOnDeviceComparisonLocator)
    public WebElement clickOnDeviceComparison;
    @FindBy(xpath = clickOnFitbitDealsElementsLocator)
    public WebElement clickOnFitbitDealsElements;
    @FindBy(xpath = clickOnTakeAQuizElementsLocator)
    public WebElement clickOnTakeAQuizElements;
    @FindBy(xpath = selectTheGoalLocator)
    public WebElement selectTheGoal;
    @FindBy(xpath = selectTheGoalAllLocator)
    public WebElement selectTheGoalAllLocators;

    public void sendKey(WebElement element, String Value) {
        element.sendKeys(Value);
    }

    public void navigateToBlue365HomePage() {
        Actions action = new Actions(driver);
        action.moveToElement(mouseOverElement).perform();
    }

    public void clickOnVisit() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnVisitBlue365Locator))).click();
    }

    public void VisitBlue365() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
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
        String expectedResult = "Showing 1-17 of 17 Results";
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
        String expectedResult = "Mission & Values | Blue365 Deals";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickForEmployersButton() throws InterruptedException {
        windowAndTabs();
        clickForEmployers.click();
    }

    public void clickOnRegisterForADemo() throws InterruptedException {
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
        sleepFor(4);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", clickOnAgree);
    }

    public void participateInAmazonGiftCart() throws InterruptedException {
        windowAndTabs();
        sleepFor(2);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", clickOnParticipateIn);
    }

    public void clickOnRegisterButton() throws InterruptedException {
        windowAndTabs();
        sleepFor(2);
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
        sleepFor(4);
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

    public void clickOnAPPARELFOOTWEARLink() throws InterruptedException {
        windowAndTabs();
        clickOnAPPARELFOOTWEAR.click();
    }

    public void shouldBeLandingOnAPPARELFOOTWEARPage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Apparel & Footwear Deals";
        String actualResult = validateAPPARELFOOTWEAR.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnFitnessLink() throws InterruptedException {
        windowAndTabs();
        clickOnFitness.click();
    }

    public void shouldBeLandingOnFitnessPage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Fitness Deals";
        String actualResult = validateFitness.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnHEARINGVISIONLink() throws InterruptedException {
        windowAndTabs();
        clickOnHEARINGVISION.click();
    }

    public void shouldBeLandingOnHEARINGVISIONPage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Hearing & Vision Deals";
        String actualResult = validateHEARINGVISION.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnHOMEFAMILYLink() throws InterruptedException {
        windowAndTabs();
        clickOnHOMEFAMILY.click();
    }

    public void shouldBeLandingOnHOMEFAMILYPage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Home & Family Deals";
        String actualResult = validateHOMEFAMILY.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnNUTRITIONLink() throws InterruptedException {
        windowAndTabs();
        clickOnNUTRITION.click();
    }

    public void shouldBeLandingOnNUTRITIONPage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Nutrition Deals";
        String actualResult = validateNUTRITION.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnPERSONALCARELink() throws InterruptedException {
        windowAndTabs();
        clickOnPERSONALCARE.click();
    }

    public void shouldBeLandingOnPERSONALCAREPag() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Personal Care Deals";
        String actualResult = validatePERSONALCARE.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnTRAVELLink() throws InterruptedException {
        windowAndTabs();
        clickOnTRAVEL.click();
    }

    public void shouldBeLandingOnTRAVELPage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Travel Deals";
        String actualResult = validateTRAVEL.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnAboutBlueLink() throws InterruptedException {
        windowAndTabs();
        clickOnAboutBlue.click();
    }

    public void shouldBeLandingOnAboutBluePage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Mission & Values | Blue365 Deals";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnHealthyTipsLink() throws InterruptedException {
        windowAndTabs();
        clickOnHealthyTips.click();
    }

    public void shouldBeLandingOnHealthyTipsPage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Healthy Tips Archive | Blue365 Deals";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnTheHealthOfAmerica() throws InterruptedException {
        clickOnTheHealthOfAmericaElements.click();
    }

    public void clickOnSubscribeHealthOfAmericaNews() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        clickOnSubscribeNews.click();
    }

    public void clickOnIAgree() throws InterruptedException {
        windowAndTabs();
        clickOnIAgreeElements.click();
    }

    public void clickOnSubscribe() throws InterruptedException {
        windowAndTabs();
        clickOnSubscribeElements.click();
    }

    public void clickOnSubscribeSecondTime() throws InterruptedException {
        windowAndTabs();
        sleepFor(120);
        clickOnSubscribeSecondTimeElements.click();
    }

    public void verifyTheSubscription() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "Almost finished...";
        String actualResult = validateSubscribe.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
        clickOnReturn.click();
    }

    public void verifyIfIAmAuthorizedToAccessThisPage() throws InterruptedException {
        windowAndTabs();
        sleepFor(5);
        String expectedResult = "\n" +
                "You are not authorized to access this page.\n" +
                "  ";
        String actualResult = validateAuthorisation.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickImage() throws InterruptedException, AWTException {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Actions action = new Actions(driver);
        action.contextClick(clickImageElements).perform();
        clickImageElements.click();
    }

    public void saveTheImageInMyComputer() throws InterruptedException, AWTException {
        windowAndTabs();
        WebElement image = driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[1]/div/div/div/div/picture/img"));
        //Locate Image
        //Rihgt click on Image using contextClick() method.
        Actions action = new Actions(driver);
        action.contextClick(image).build().perform();
        //To perform press Ctrl + v keyboard button action.
        action.sendKeys(Keys.CONTROL, "c").build().perform();
        action.sendKeys(Keys.CONTROL, "v").build().perform();
        action.sendKeys(Keys.CONTROL, "v").build().perform();
        Thread.sleep(3000);
        Robot robot = new Robot();
        // To press D key.
        robot.keyPress(KeyEvent.VK_D);
        // To press : key.
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        // To press \ key.
        robot.keyPress(KeyEvent.VK_BACK_SLASH);
        // To press "test" key one by one.
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);
        // To press Save button.
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public void clickOnDeviceComparisonLink() throws InterruptedException, AWTException {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Actions action = new Actions(driver);
        action.contextClick(clickOnDeviceComparison).perform();
        clickOnDeviceComparison.click();
    }

    public void clickOnTakeAQuiz() throws InterruptedException, AWTException {
        windowAndTabsnum3();
        Thread.sleep(8);
        clickOnTakeAQuizElements.click();
    }

    public void selectWhatKindOfProductAreYouLookingFor() throws InterruptedException, AWTException {
        windowAndTabsnum3();
        Thread.sleep(8);
        selectTheGoal.click();
        selectTheGoalAllLocators.click();
    }

    public void clickOnFitbitDeals() throws InterruptedException, AWTException {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(8);
        clickOnFitbitDealsElements.click();
    }
}