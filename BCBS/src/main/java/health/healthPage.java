package health;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static health.healthPageWebElement.*;

public class healthPage extends WebAPI {

    @FindBy(how = How.CSS, using = searchBoxWeb)
    public WebElement searchBox;
    @FindBy(how = How.XPATH,using = researchText)
    public WebElement research;
    @FindBy(how = How.XPATH,using = subscribeWeb)
    public WebElement subscribe;
    @FindBy(how = How.CSS,using = firstNameWeb)
    public WebElement firstName;
    @FindBy(how = How.CSS,using = lastNameWeb)
    public WebElement lastName;
    @FindBy(how = How.CSS,using = emailField)
    public WebElement email;
    @FindBy(how = How.CSS,using = zipCodeField)
    public WebElement zipCode;
    @FindBy(how = How.XPATH,using = subscribeElement)
    public WebElement subscribeButton;
    @FindBy(how = How.XPATH,using = subscribeEror)
    public WebElement subscribeError;
    @FindBy(how = How.XPATH,using = contactMsg)
    public WebElement contactText;
    @FindBy(how = How.XPATH,using = mustErrorWeb)
    public WebElement mustError;



    public void validateHealthOfAmericaTitle() throws InterruptedException {
        sleepFor(3);
        String ActualHealthTitle = driver.getTitle();
        Assert.assertEquals("test failed", ActualHealthTitle, expectedHealthTitle);

    }

    public void searchBox(String search) {
        searchBox.sendKeys(search);
    }

    public void verifyURL(String expectedPageURL) throws InterruptedException {
        sleepFor(3);
        String actualPageURL = driver.getCurrentUrl();
        System.out.println("we checked for url ");
        Assert.assertEquals("URL does not match!", expectedPageURL, actualPageURL);
    }

    public void validateAboutPageTitle() {
        String actualAboutTitle = driver.getTitle();
        Assert.assertEquals("failed", actualAboutTitle, expectedAboutTitle);
    }

    public void verifyIndexPageTitle() {
        String actualIndexPageTitle = driver.getTitle();
        Assert.assertEquals("failed", actualIndexPageTitle, expectedIndexTitle);
    }


    public void verifyDataAndReportsTitle() {

        String actualDataAndReportsTitle = driver.getTitle();
        Assert.assertEquals("failed", actualDataAndReportsTitle, expectedDatAndReports);

    }

    public void verifyTextDisplay(){
        boolean b = research.isDisplayed();
        System.out.println("is displayed "+b);
    }

    public void clickSubscribe() throws InterruptedException {
        sleepFor(3);
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",subscribe);
        subscribe.click();
    }



    public void enterKeywords(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void switchWindow() throws InterruptedException {
        sleepFor(4);
        Set<String> windowsIds = driver.getWindowHandles();
        Iterator<String> itor = windowsIds.iterator();
        String mainWindow = itor.next();
        String childWindow = itor.next();
        driver.switchTo().window(childWindow);
        sleepFor(4);
    }






    public void clickSubscribeF() throws InterruptedException {
        subscribeButton.click();
        sleepFor(3);
    }

    public void validateErrorSubscribe(){
        boolean b =subscribeError.isDisplayed();
        System.out.println("is displayed "+b);
    }

    public void VerifyIAmAtContactUsPage(){
        boolean b =contactText.isDisplayed();
        System.out.println("is displayed "+b);
    }

    public void VerifyErrorMessage(){
        boolean b=mustError.isDisplayed();
        System.out.println("is displayed "+b);

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
}
