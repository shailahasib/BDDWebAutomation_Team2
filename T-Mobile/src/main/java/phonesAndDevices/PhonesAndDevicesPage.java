package phonesAndDevices;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.HttpURLConnection;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static phonesAndDevices.PhonesAndDevicesWebElements.*;

public class PhonesAndDevicesPage extends WebAPI {


    @FindBy(how = How.CSS, using = phonesAndDevice)
    public WebElement phonesAndDevices;

    @FindBy(how = How.XPATH, using = accessoriesOption)
    public WebElement accessories;

    @FindBy(how = How.XPATH, using = accessoriesText)
    public WebElement accessoriesTextEle;

    @FindBy(how = How.XPATH, using = iframeSeeExactlyWhat)
    public WebElement iframeSeeExactly;

    @FindBy(how = How.XPATH, using = dismissPopUpForFinancing)
    public WebElement dismissPopUp;

    @FindBy(how = How.XPATH, using = syncUpPetsBand)
    public WebElement syncUpPets;

    @FindBy(how = How.CSS, using = syncUpPetsBandInCart)
    public WebElement syncUpPetsInCart;

    @FindBy(how = How.XPATH, using = checkOutAsAGuestButton)
    public WebElement checkOutAsAGuest;

    @FindBy(how = How.XPATH, using = myCartSignEle)
    public WebElement myCartSign;

    @FindBy(how = How.XPATH, using = startCheckoutButton)
    public WebElement startCheckout;

    @FindBy(how = How.CSS, using = finalizeInStoreButton)
    public WebElement finalizeInStore;

    @FindBy(how = How.XPATH, using = enterFName)
    public WebElement enterFNameBox;

    @FindBy(how = How.CSS, using = enterLName)
    public WebElement enterLNameBox;

    @FindBy(how = How.XPATH, using = enterEmail)
    public WebElement enterEmailBox;

    @FindBy(how = How.XPATH, using = enterPhone)
    public WebElement enterPhoneBox;

    @FindBy(how = How.XPATH, using = enterZip)
    public WebElement enterZipBox;

    @FindBy(how = How.XPATH, using = smartWatchesButton)
    public WebElement smartWatches;

    @FindBy(how = How.XPATH, using = linkTagCollection)
    public List<WebElement> allLinks;

    @FindBy(how = How.XPATH, using = searchMagnifierClick)
    public WebElement searchMagnifier;

    @FindBy(how = How.CSS, using = checkTotalInCart)
    public WebElement checkTotal;

    @FindBy(how = How.CSS, using = monthlyOptionForPayments)
    public WebElement monthlyOption;

    @FindBy(how = How.CSS, using = removeFromCart)
    public WebElement remove;

    @FindBy(how = How.XPATH, using = cartTextNextStep)
    public WebElement cartTextNext;

    @FindBy(how = How.XPATH, using = accountLogin)
    public WebElement accountLoginIcon;

    @FindBy(how = How.XPATH, using = payABillLogin)
    public WebElement payABill;

    @FindBy(how = How.XPATH, using = userNameIdInput)
    public WebElement userNameId;

    @FindBy(how = How.XPATH, using = nextButton)
    public WebElement next;

    @FindBy(how = How.XPATH, using = errorMessageForId)
    public WebElement errorMessageId;

    @FindBy(how = How.XPATH, using = searchBoxInput)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = helpBubbleBottom)
    public WebElement helpBubble;

    @FindBy(how = How.XPATH, using = enterMessageForBubble)
    public WebElement enterMessage;

    @FindBy(how = How.XPATH, using = toolTipDisplayEle)
    public WebElement toolTip;



    public String getTextGeneric(WebElement element) {
        String text = element.getText();
        return text;
    }

    public void findBrokenLinks(){
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        Iterator<WebElement> it = allLinks.iterator();

        while(it.hasNext()){

            url = it.next().getAttribute("href");

            System.out.println(url);

            if(url == null || url.isEmpty()){
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if(!url.startsWith(homeUrl)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }

    public void login(String userName){
        clickGeneric(accountLoginIcon);
        clickGeneric(payABill);
        sendKeysGeneric(userNameId,userName);
        clickGeneric(next);
    }

    public void navigateToTMobile() throws IOException {
        openBrowser(homeUrl);
    }

    public void fluentWaitingForIframe(WebElement element) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(200, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
        iframeSeeExactly.click();
    }

    public void waitUntil(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public void switchIframe(WebElement element) {
        driver.switchTo().frame(element);
    }

    public String getTitleGeneric() {
        String title = driver.getTitle();
        return title;
    }

    public void nextTabHandle() {
        String currentTabHandle = driver.getWindowHandle();
        String newTabHandle = driver.getWindowHandles()
                .stream()
                .filter(handle -> !handle.equals(currentTabHandle))
                .findFirst()
                .get();
        driver.switchTo().window(newTabHandle);
    }

    public void equalAssertion(String expected, String actual) {
        Assert.assertEquals("Failed", expected, actual);
    }


    public void actionClick(WebElement element) {
        Actions action = new Actions(driver);
        action.click(element).build().perform();

    }

    public void hoverOverElementThenClick(WebElement element, WebElement element2) {
        sleepFor(6);
        Actions action = new Actions(driver);
        action.moveToElement(element).moveToElement(element2).click().build().perform();
    }

    public void clickGeneric(WebElement element) {
        element.click();
    }

    public void scrollIntoView(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollDownToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public boolean elementDisplayed(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void waitForVisibility(WebElement element, int sec) {
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void switchFrameIndex(int index) {
        driver.switchTo().frame(index);
    }

    public void sendKeysGeneric(WebElement element, String keys){
        element.clear();
        element.sendKeys(keys);
    }




}
