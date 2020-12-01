package memberService;

import common.WebAPI;
import io.cucumber.messages.internal.com.google.protobuf.util.Durations;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static memberService.MemberServiceWebElements.*;

public class MemberServicePage extends WebAPI {

    @FindBy(how = How.XPATH, using = memberServiceOnHeader)
    public WebElement memberService;
    @FindBy(how = How.XPATH, using = blue365Deals)
    public WebElement blue365;

    @FindBy(how = How.XPATH, using = arrowUpIconRed)
    public WebElement arrowUpIcon;

    @FindBy(how = How.LINK_TEXT, using = blueCrossLogoAtTop)
    public WebElement blueCrossLogo;

    @FindBy(how = How.CSS, using = accessibilityFooter)
    public WebElement accessibility;

    @FindBy(how = How.CSS, using = closeCookiesPolicy)
    public WebElement closeCookies;

    @FindBy(how = How.CSS, using = travelOnRight)
    public WebElement travel;

    @FindBy(how = How.CSS, using = travelDealsText)
    public WebElement travelDeals;

    @FindBy(how = How.CSS, using = searchKeyWordsBox)
    public WebElement searchKeyWords;

    @FindBy(how = How.LINK_TEXT, using = aboutBlueTab)
    public WebElement aboutBlue;

    @FindBy(how = How.CSS, using = missionAndValuesEle)
    public WebElement missionAndValues;

    @FindBy(how = How.XPATH, using = signInButton)
    public WebElement signIn;

    @FindBy(how = How.XPATH, using = sigInEmailBox)
    public WebElement sigInEmail;

    @FindBy(how = How.XPATH, using = sigInPasswordBox)
    public WebElement sigInPassword;

    @FindBy(how = How.XPATH, using = sigInButton)
    public WebElement signInOrange;

    @FindBy(how = How.XPATH, using = errorMessageSignInEmail)
    public WebElement errorMessageSign;

    @FindBy(how = How.XPATH, using = allDealsOnheader)
    public WebElement allDeals;

    @FindBy(how = How.XPATH, using = enterKeywordBox)
    public WebElement enterKeyword;

    @FindBy(how = How.XPATH, using = clickGoOnSearch)
    public WebElement clickGo;


    public String getTextGeneric(WebElement element) {
        String text = element.getText();
        return text;
    }

    public String getUrlGeneric() {
        String text = driver.getCurrentUrl();
        return text;
    }

    public void navigateToBlueCross() throws IOException {
        openBrowser(bcbsUrl);
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
        Actions action = new Actions(driver);
        action.moveToElement(element).moveToElement(element2).click().build().perform();
        sleepFor(4);
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
        } catch (org.openqa.selenium.NoSuchElementException e) {
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

    public void sendKeysGeneric(WebElement element, String keys) {
        element.clear();
        element.sendKeys(keys);
    }

    public void sendKeysEnter(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }


}
