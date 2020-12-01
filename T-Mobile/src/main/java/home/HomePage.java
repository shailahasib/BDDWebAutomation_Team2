package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = cartWebElement)
    public WebElement cartButton;
    @FindBy(how = How.XPATH, using = myCartDisplay)
    public WebElement myCart;
    @FindBy(how = How.XPATH, using = searchButton1)
    public WebElement openSearchBox;
    @FindBy(how = How.XPATH, using = searchBoxWeb)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButton1Web)
    public WebElement searchBoxOk;
    @FindBy(how = How.ID, using = plansWebElement)
    public WebElement plans;
    @FindBy(how = How.XPATH, using = EssentialsWebElement)
    public WebElement Essentials;
    //    @FindBy(how = How.ID,using = PhonesAndDevicesWeb)
//    public WebElement phonesAndDevices;
    @FindBy(how = How.XPATH, using = FiveGPhonesWeb)
    public WebElement FiveGPhones;
    @FindBy(how = How.XPATH, using = FiveGPhonesLogo)
    public WebElement FiveGPhonesValidate;
    @FindBy(how = How.XPATH, using = appleWeb)
    public WebElement apple;
    @FindBy(how = How.XPATH, using = myAccountWeb)
    public WebElement myAccount;
    @FindBy(how = How.XPATH, using = loginWebElement)
    public WebElement login;
    @FindBy(how = How.ID, using = emailField)
    public WebElement Email;
    @FindBy(how = How.ID, using = passwordField)
    public WebElement password;
    @FindBy(how = How.XPATH, using = errorMessage)
    public WebElement error;
    @FindBy(how = How.XPATH, using = chatWebElement)
    public WebElement chat;
    @FindBy(how = How.XPATH, using = feedbackWebElement)
    public WebElement feedback;




    public void ValidateHomePageTitle() {
        String ExpectedHomePageTile = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String ActualHomePageTile = driver.getTitle();
        Assert.assertEquals(ActualHomePageTile, ExpectedHomePageTile, titleMessage);


    }

    public void CartButton() {
        cartButton.click();
    }

    public void CartValidation() {
        boolean b = myCart.isDisplayed();
        System.out.println("is displayed :" + b);
    }

    public void OpenSearchBox() {
        openSearchBox.click();
    }

    public void searchBox(String searchFor) {
        searchBox.sendKeys(searchFor);
    }


    public void searchBoxOk() throws InterruptedException {
        searchBoxOk.click();
        Thread.sleep(4000);
    }

    public void validateCurrentURL() {
        String actualSearchURL = "https://www.t-mobile.com/search?q=iphone";
        String expectedSearchURL = driver.getCurrentUrl();
        Assert.assertEquals(actualSearchURL, expectedSearchURL, "test failed !");
    }

    public void mouseOverPlans() {
        Actions action = new Actions(driver);
        action.moveToElement(plans).build().perform();
        Essentials.click();
    }

    public void validatePlansURL() {
        String expectedPlansURL = "https://www.t-mobile.com/cell-phone-plans";
        String ActualPlansURL = driver.getCurrentUrl();
        System.out.println(ActualPlansURL);
        Assert.assertEquals(ActualPlansURL, expectedPlansURL, "test failed");
    }


    public void mouseOverPhonesAndDevices() throws InterruptedException {
        //mouseHover
        mouseOverID(PhonesAndDevicesWeb);
        Thread.sleep(4000);
    }


    public void FiveGPhones() throws InterruptedException {
        FiveGPhones.click();
        Thread.sleep(4000);
    }
    public void FiveGPhonesValidate(){
        boolean b=FiveGPhonesValidate.isDisplayed();
        System.out.println("is displayed :"+b);
    }



    public void BrokenLinks(){
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links are "+links.size());
        for(int i=0;i<links.size();i++)
        {
            WebElement ele= links.get(i);
            String url=ele.getAttribute("href");
            verifyLinkActive(url);
        }
    }


    public void mouseOverDeals() throws InterruptedException {
        mouseOverID(dealsWeb);
        Thread.sleep(3000);
    }

    public void SelectApple() throws InterruptedException {
        apple.click();
        Thread.sleep(4000);
    }


    public void validateDealsTitle(){
        String actualDealsTitle=driver.getTitle();
        Assert.assertEquals(actualDealsTitle,expectedDealsPage,"failed ");
    }

    public void myAccount() throws InterruptedException {
        myAccount.click();
        Thread.sleep(3000);

    }
    public void Login() throws InterruptedException {
        login.click();
        Thread.sleep(3000);

    }
    public void setEmail(String emailData) throws InterruptedException {
        Email.sendKeys( emailData);
        Thread.sleep(3000);
    }

    public void clickNext(){
     //clickById(nextWeb);
        driver.findElement(By.id("lp1-next-btn")).click();

    }
    public void setPassword(String passwordData){
        password.sendKeys(passwordData);
    }

    public void nextButton(){
        clickById(loginButtonWebElement);
    }

    public void loginErrorMessage(){
        boolean b=error.isDisplayed();
        System.out.println("is displayed :"+b);
    }

    public void clickOurNetwork(){
        driver.findElement(By.xpath(ourNetworkWeb)).click();
    }

    public void validateOurNetWorkTitle(){
        String actualNetWorkTitle=driver.getTitle();
        Assert.assertEquals(actualNetWorkTitle,expectedNetworkTitle,"test failed !");
    }



    public void mouseOverChat(){
        Actions action = new Actions(driver);
        action.moveToElement(chat).build().perform();

    }

    public void clickFeedback(){
        feedback.click();
    }






}
