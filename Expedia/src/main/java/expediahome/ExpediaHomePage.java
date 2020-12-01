package expediahome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.DataReader;
import utilities.ReadExcel;
import utilities.WriteExcelFile;

import java.io.IOException;

import static expediahome.ExpediaWebElements.*;

public class ExpediaHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = clickSignInWebElement)
    public WebElement clickSignIn;
    @FindBy(how = How.XPATH, using = clickCreateAccountWebElement)
    public WebElement clickCreateAccount;
    @FindBy(how = How.XPATH, using = customerNameWebElement)
    public WebElement customerName;
    @FindBy(how = How.XPATH, using = customerLastWebElement)
    public WebElement customerLast;
    @FindBy(how = How.XPATH, using = customerEmailAddressWebElement)
    public WebElement customerEmailAddress;
    @FindBy(how = How.XPATH, using = customerPasswordWebElement)
    public WebElement customerPassword;
    @FindBy(how = How.XPATH, using = clickRadioButtonWebElement)
    public WebElement clickRadioButton;
    @FindBy(how = How.XPATH, using = clickSignUpWebElement)
    public WebElement clickSignUp;
    @FindBy(how = How.XPATH, using = validateAccountWebElement)
    public WebElement validateAccount;


    public void clickOnSignInButton() {
        clickSignIn.click();
    }

    public void clickOnCreateFreeAccount() throws InterruptedException {
        clickCreateAccount.click();
        Thread.sleep(6000);
    }

    public void clickOnRadioButton() throws InterruptedException {
        clickRadioButton.click();
        Thread.sleep(5000);

    }

    public void clickOnSignUp() {
        clickSignUp.click();
    }

    public void enterKeywords(WebElement element, String value) throws InterruptedException {
        element.sendKeys(value);
        Thread.sleep(5000);
    }

    public void enterCustomerName(String value) {
        customerName.sendKeys(value);
    }

    public void validateAccount(String expectedResult) {
        String actualResult = validateAccount.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);

    }

    @FindBy(how = How.ID, using = enterBookingWebElement)
    public WebElement enterBooking;
    @FindBy(how = How.XPATH, using = clickSearchButtonWebElement)
    public WebElement clickSearchButton;
    @FindBy(how = How.XPATH, using = validateBookingWebElement)
    public WebElement validateBooking;

    public void enterSearchKeyWord(String searchBooking) {
        enterBooking.sendKeys(searchBooking);
    }

    public void clickOnSearchButton() {
        clickSearchButton.click();
    }

    public void validateSearchText(String expectedResult) {
        String actualResult = validateBooking.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);

    }

    @FindBy(how = How.XPATH, using = clickSignInWebElement)
    public WebElement clickSignIn2;
    @FindBy(how = How.LINK_TEXT, using = clickSignIn1WebElement)
    public WebElement clickSignIn1;
    @FindBy(how = How.ID, using = enterUserNameWebElement)
    public WebElement enterUserName;
    @FindBy(how = How.ID, using = enterPasswordWebElement)
    public WebElement enterPassword;
    @FindBy(how = How.XPATH, using = clickRadioButtonKeepMeSignInWebElement)
    public WebElement clickRadioButtonKeepMeSignIn;
    @FindBy(how = How.XPATH, using = clickOnSignInWebElement)
    public WebElement clickOnSignIn;


    public void clickOnSignInButton2() {
        clickSignIn2.click();
    }

    public void clickSignIn() {
        clickSignIn1.click();
    }

    public void clickKeepSignMeRadioButton() {
        clickRadioButtonKeepMeSignIn.click();
    }

    public void enterKeywords1(WebElement element, String value) throws InterruptedException {
        element.sendKeys(value);
        Thread.sleep(2000);
    }

    public void clickOnSignIn() {
        clickOnSignIn.click();

    }

    public void getURL() {
    }

    public void checkExcelWrite() {
        WriteExcelFile obj = new WriteExcelFile();
        obj.writeExcel("Text.xlsx");

    }

    public void readDataSearchBox() {
        ReadExcel obj = new ReadExcel();
        obj.readExcelFile("dataTest/ExpediaSearchBox.xlsx", 0);

    }
//        public void checkWithDataReader() throws IOException {
//            DataReader obj = new DataReader();
//            String[] searchItem= obj.fileReaderStringXSSF("C:\\Users\\Owner\\IdeaProjects\\BDDWebAutomation_Team2\\Expedia\\DataTest\\ExpediaSearchBox.xlsx",1);
//            enterBooking.click();
//            typeOnElement(enterBookingWebElement,searchItem[1]);
//        }
    }
