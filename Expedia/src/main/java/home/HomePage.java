package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {
    String expectedResult;

    @FindBy(xpath = singInWebElement) public WebElement singIn;
    @FindBy(xpath = singIn1WebElement) public WebElement singIn1;
    @FindBy(xpath = emailAddressWebElement) public WebElement emailAddress;
    @FindBy(xpath = passwordWebElement) public WebElement password;
    @FindBy(xpath = singInButtonWebElement) public WebElement singInButton;
    public void clickSingIn(){singIn.click();}
    public void clickOnSingIN1(){singIn1.click();}
    public void enterEmailAddress(){emailAddress.sendKeys(enterEmailAddressWebElement);}
    public void enterPassword(){password.sendKeys(enterPasswordWebElement);}
    public void clickOnSingInButton(){singInButton.click();}
    public void validateSingInTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }
}
