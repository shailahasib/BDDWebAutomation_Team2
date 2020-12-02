package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {
    String expectedResult;
@FindBy(id = myAccountWebElement) public WebElement myAccount;
@FindBy(xpath = logInWebElement) public WebElement logIn;
@FindBy(xpath = emailOrPhoneNumberOrUsernameWebElement) public WebElement emailOrPhoneNumberOrUsername;
@FindBy(xpath = nextWebElement) public WebElement next;
@FindBy(xpath = passwordWebElement) public WebElement password;
@FindBy(xpath = logInButtonWebElement) public WebElement logInButton;

public void clickOnMyAccount(){myAccount.click();}
public void clickOnLogIn(){logIn.click();}
public void enterEmailOrPhoneNumberOrUsername(){emailOrPhoneNumberOrUsername.sendKeys(enterEmail);}
public void clickOnNext(){next.click();}
public void enterPassword(){password.sendKeys(enterPassword);}
public void clickLogInButton(){logInButton.click();}

public void validateLogIn(String expectedResult){
String actualResult=driver.getTitle();
    Assert.assertEquals("Not match", expectedResult, actualResult);

}
@FindBy(css = billPayWebElement) public WebElement billPay;
public void clickBillPay(){billPay.click();}
public void validateBillPay(String expectedResult){
    String actualResult=driver.getTitle();
    Assert.assertEquals("Not match", expectedResult, actualResult);

}
@FindBy(xpath = plansWebElement) public WebElement plans;
@FindBy(xpath = magentaStartShoppingWebElement) public WebElement magentaStartShopping;
@FindBy(xpath = changePlansWebElement) public WebElement changePlans;
@FindBy(xpath = selectPlansWebElement) public WebElement selectPlans;
public void clickOnPlans(){plans.click();}
public void clickOnStartShopping(){magentaStartShopping.click();}
public void clickOnChangePlans(){changePlans.click();}
public void clickOnSelectPlans(){selectPlans.click();}
public void validatePlans(String expectedResult){
    String actualResult=driver.getTitle();
    Assert.assertEquals("not Match",expectedResult,actualResult);

}
@FindBy(xpath = dealsWebElement) public WebElement deals;
@FindBy(xpath = shopNowWebElement) public WebElement shopNow;
@FindBy(xpath = memory128GBWebElement) public WebElement memory128GB;
@FindBy(xpath = redColorWebElement) public WebElement redColor;
@FindBy(xpath = upgradeWebElement) public WebElement upgrade;
public void clickOnDeals(){deals.click();}
public void clickOnShopNowOnIphone12(){shopNow.click();}
public void select120GB(){memory128GB.click();}
public void selectRedColor(){redColor.click();}
public void clickOnUpgrade(){upgrade.click();}
public void validateDealsTitle(String expectedResult){
    String actualResult=driver.getTitle();
    Assert.assertEquals("Not Match",expectedResult,actualResult);
}

@FindBy(xpath = chekOrderStatusWebElement) public WebElement chekOrderStatus;
@FindBy(xpath = orderNumberWebElement) public WebElement orderNumber;
@FindBy(xpath = billingZipCodWebElement) public WebElement  billingZipCod;
@FindBy(xpath = lastNameWebElement) public WebElement lastName;
@FindBy(xpath = continueButtonWebElement) public WebElement continueButton;
public void clickOnChekOrderStatus(){chekOrderStatus.click();}
public void clickOnOrderNumber(){orderNumber.sendKeys(enterOrderNumberWebElement);}
public void clickOnBillingZipCod(){ billingZipCod.sendKeys(enterBillingZipCodWebElement);}
public void clickOnLastName(){lastName.sendKeys(enterLastNameWebElement);}
public void clickOnContinueButton(){continueButton.click();}
public void validateTitle(String expectedResult){

    String actualResult=driver.getTitle();
    Assert.assertEquals("Not Match",expectedResult,actualResult);
}

@FindBy(xpath = tMobileCareersWebElement) public WebElement tMobileCareers;
@FindBy(xpath = browserOpenPositionWebElement) public WebElement browserOpenPosition;
@FindBy(xpath = keywordWebElement) public WebElement keyword;
@FindBy(xpath = zipCodOrCityOrStateWebElement) public WebElement zipCodOrCityOrState;
@FindBy(xpath = searchButtonWebElement) public WebElement searchButton;

public void clickOnTMobileCareers(){tMobileCareers.click();}
public void clickBrowserOpenPosition(){browserOpenPosition.click();}
public void enterKeyword(){keyword.sendKeys(enterKeywordWedElement);}
public void enterZipCodOrCityOrState(){zipCodOrCityOrState.sendKeys(enterCityWebElement);}
public void clickOnSearchButton(){searchButton.click();}

public void validateTitle1(String expectedResult){

    String actualResult=driver.getTitle();
    Assert.assertEquals("Not Match",expectedResult,actualResult);
}
@FindBy(xpath = prepaidWebElement) public WebElement prepaid;
@FindBy(xpath = shopPlansWebElement) public WebElement shopPlans;
@FindBy(xpath = chickItOutWebElement) public WebElement chickItOut;
@FindBy(className = choosePlansWebElement) public WebElement choosePlans;
//@FindBy(xpath = zipCodWebElement) public WebElement zipCod;
//@FindBy(id = continueButton1WebElement) public WebElement continueButton1;
//@FindBy(xpath = selectPlans1WebElement) public WebElement selectPlans1;
//@FindBy(xpath = selectButtonWebElement) public WebElement selectButton;
//@FindBy(xpath = newCustomerWebElement) public WebElement newCustomer;
public void clickOnPrepaid(){prepaid.click();}
public void clickOnShopPlans(){shopPlans.click();}
public void clickOnShopPrepaidPlans(){chickItOut.click();}
public void clickOnChoosePlans(){choosePlans.click();}
//public void enterZipCod(){zipCod.sendKeys(enterZipCodWebElement);}
//public void clickOnContinueButton1(){continueButton1.click();}
//public void selectPlan(){selectPlans1.click();}
//public void clickOnSelectButton(){selectButton.click();}
//public void clickOnNewCustomer(){newCustomer.click();}
public void validateTitleText(String expectedResult){

    String actualResult=driver.getTitle();
    Assert.assertEquals("Not Match",expectedResult,actualResult);
}

@FindBy(xpath = internationalWebElement) public WebElement international;
@FindBy(xpath = internationalWithOutUSAWebElement) public WebElement internationalWithOutUSA;
public void clickOnInternational(){international.click();}
public void clickOnInternationalCallingWithOutUSA(){internationalWithOutUSA.click();}
public void validateInternationalTitle(String expectedResult){
    String actualResult=driver.getTitle();
    org.junit.Assert.assertEquals("Not match", expectedResult, actualResult);

}
@FindBy(xpath = travelWebElement) public WebElement travel;
@FindBy(xpath = findOutMoreWebElement) public WebElement findOutMore;
@FindBy(xpath = destinationWebElement) public WebElement destination;
@FindBy(xpath = chekCoverageWebElement) public WebElement  chekCoverage;
public void clickOnTravel(){travel.click();}
public void clickOnFindOutMore(){findOutMore.click();}
public void enterDestination(){destination.sendKeys(enterDestinationWebElement);}
public void clickOnChekCoverageButton(){chekCoverage.click();}
public void validateDestinationTitle(String expectedResult){
    String actualResult=driver.getTitle();
    org.junit.Assert.assertEquals("Not match", expectedResult, actualResult);
}
@FindBy(xpath = deviceProtectionWebElement) public WebElement deviceProtection;
@FindBy(xpath = getStartedWebElement) public WebElement getStarted;
@FindBy(xpath = mobileNumberWebElement) public WebElement mobileNumber;
@FindBy(xpath = digitNumberWebElement)  public WebElement digitNumber;
//@FindBy(xpath = chekRobotWebElement) public WebElement chekRobot;
@FindBy(xpath = submitButtonWebElement) public WebElement submitButton;
public void clickOnDeviceProtection(){deviceProtection.click();}
public void clickOnGetStarted(){getStarted.click();}
public void clickOnMobileNumber(){mobileNumber.click();}
public void enter10DigitNumber(){digitNumber.sendKeys(enter10DigitNumberWebElement);}
//public void clickOnIamNotRobot(){chekRobot.click();}
public void clickOnSubmitButton(){submitButton.click();}
public void validateDeviseProtectionTitle(String expectedResult){
    String actualResult=driver.getTitle();
    Assert.assertEquals("Not match", expectedResult, actualResult);

}
@FindBy(xpath = myAccount1WebElement) public WebElement myAccount1;
@FindBy(xpath = logIn1WebElement) public WebElement logIn1;
@FindBy(xpath = forgotLogInfoWebElement) public WebElement forgotLogInfo;
@FindBy(xpath = emailOrPhoneNumberWebElement) public WebElement emailOrPhoneNumber;
@FindBy(xpath = resetYourPasswordCodWebElement) public WebElement resetYourPasswordCod;
@FindBy(xpath = continueButton1WebElement) public WebElement continueButton1;
@FindBy(xpath = sixDigitCodWebElement) public WebElement sixDigitCod;
@FindBy(xpath = submitCodWebElement) public WebElement submitCod;
@FindBy(xpath = newPasswordWebElement) public WebElement newPassword;
@FindBy(xpath = reNewPasswordWbElement) public WebElement reNewPassword;
@FindBy(xpath = resetPasswordButtonWebElement) public WebElement resetPasswordButton;


public void clickOnMyAccount1(){myAccount1.click();}
public void clickOnLogIn1(){logIn1.click();}
public void clickForgotLogInfo(){forgotLogInfo.click();}
public void enterEmailOrPhoneNumber(){emailOrPhoneNumber.sendKeys(enterEmailOrPhoneNumber);}
public void enterCod(){resetYourPasswordCod.click();}
public void clickContinueButton1(){continueButton1.click();}
public void enter6DigitCod(){sixDigitCod.sendKeys(enter6DigitCodWebElement);}
public void clickSubmitCod(){submitCod.click();}
public void enterNewPassword(){newPassword.sendKeys(enterNewPasswordWebElement);}
public void reEnterNewPassword(){reNewPassword.sendKeys(reEnterNewPasswordWebElement);}
public void clickResetPasswordButton(){resetPasswordButton.click();}
public void validateNewPasswordTitle(String expectedResult){
    String actualResult=driver.getTitle();
    Assert.assertEquals("Test Fail",expectedResult,actualResult);
}








}

