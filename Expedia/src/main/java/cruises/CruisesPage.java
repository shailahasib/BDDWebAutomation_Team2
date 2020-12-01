package cruises;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static cruises.CruisesWebElements.*;

public class CruisesPage extends WebAPI {


    @FindBy(how = How.CSS, using = packagesOnHeader)
    public WebElement packages;
    @FindBy(how = How.XPATH, using = chooseOneOrMoreItemsToBuild)
    public WebElement chooseOneOrMoreItems;
    @FindBy(how = How.CSS, using = leavingFromInsertBox)
    public WebElement leavingFromInsert;
    @FindBy(how = How.CSS, using = goingToInsertBox)
    public WebElement goingToInsert;
    @FindBy(how = How.XPATH, using = departingDateBox)
    public WebElement departingDate;
    @FindBy(how = How.XPATH, using = returningDateBox)
    public WebElement returningDate;
    @FindBy(how = How.XPATH, using = packageSearchButton)
    public WebElement packageSearch;
    @FindBy(how = How.XPATH, using = leavingFromTextBox)
    public WebElement leavingFromText;
    @FindBy(how = How.XPATH, using = allCalendarDates)
    public List<WebElement> calendarDates;
    @FindBy(how = How.XPATH, using = monthSelectTextReader)
    public WebElement monthSelectText;
    @FindBy(how = How.XPATH, using = nextMonthNavigator)
    public WebElement nextMonth;
    @FindBy(how = How.XPATH, using = cruisesTab)
    public WebElement cruises;
    @FindBy(how = How.CSS, using = flightsTab)
    public WebElement flights;

    @FindBy(how = How.CSS, using = goingToButton)
    public WebElement goingTo;

    @FindBy(how = How.XPATH, using = flyingFromBox)
    public WebElement flyingFrom;

    @FindBy(how = How.XPATH, using = whereAreYouGoingBox)
    public WebElement whereAreYouGoing;

    @FindBy(how = How.XPATH, using = links)
    public List<WebElement> allLinks;

    @FindBy(how = How.XPATH, using = staysXpathElement)
    public WebElement stays;

    @FindBy(how = How.XPATH, using = goingToStaysXpathElement)
    public WebElement goingToStay;

    @FindBy(how = How.XPATH, using = goingtoStaysWhereXpathElement)
    public WebElement goingToStaysWhere;

    @FindBy(how = How.XPATH, using = flightsXpathElements)
    public WebElement flightsEle;


    public void validateSearchText(String expectedResult) {
        String actualResult = leavingFromText.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    public void validateChooseOptionsText(String expectedResult) {
        String actualResult = chooseOneOrMoreItems.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    public void enterLeavingFrom(String searchItem) {
        leavingFromInsert.sendKeys(searchItem);
    }

    public void enterGoingTo(String searchItem) {
        goingToInsert.sendKeys(searchItem);
    }

    public void clickPackages() {
        // for(int i=0; i<=1; i++) {
        packages.click();
        //}
    }

    public void clickElement(WebElement webElement) {
        webElement.click();
    }

    public void pickDepart(String month, String date) {

        while (true) {
            String monthText = monthSelectText.getText();
            if (monthText.equals(month)) {
                break;
            } else {
                nextMonth.click();
            }
        }

        for (WebElement allDates : calendarDates) {
            String dateText = allDates.getText();
            if (dateText.equals(date)) {
                allDates.click();
            }
        }

    }

    public void pickReturn(String month, String date) {

        while (true) {
            String monthText = monthSelectText.getText();
            if (monthText.equals(month)) {
                break;
            } else {
                nextMonth.click();
            }
        }

        for (WebElement allDates : calendarDates) {
            String dateText = allDates.getText();
            if (dateText.equals(date)) {
                allDates.click();
            }
        }

    }


    public void clickOnSearchButton() {
        packageSearch.click();
    }

    public void getElementText(WebElement element) {
        element.getText();
    }

    public String getTextGeneric(WebElement element) {
        String text = element.getText();
        return text;
    }

    public void findBrokenLinks() {
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        List<WebElement> links = driver.findElements(By.tagName("a"));

        Iterator<WebElement> it = allLinks.iterator();

        while (it.hasNext()) {

            url = it.next().getAttribute("href");

            System.out.println(url);

            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if (!url.startsWith(homePageUrl)) {
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void waitUntil(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public void switchIfame(WebElement element) {
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

    public void scrollHeight() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollDownToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public boolean elementDisplayed(WebElement element) {//SELENIUM EXCEPTION******
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

    public void sendKeysGeneric(WebElement element, String keys) {
        element.clear();
        element.sendKeys(keys);
    }

    public void clickLinkText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }







}
