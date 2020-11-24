package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {


    @FindBy(xpath = clickOnMeetingAndEventsLocator)
    public WebElement clickOnMeetingAndEvents;
    @FindBy(xpath = validateEventsHomePage)
    public WebElement validateEventsHomePageActual;
    @FindBy(css = clickOnMarriottBONVoYLogoLocator)
    public WebElement clickOnMarriottBONVoYLogo;

//    public void clickOnMeetingAndEventsLink() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,900)");
//        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(3))
//                .withMessage("Time out after 30 seconds")
//                .ignoring(NoSuchElementException.class);
////        fluentWaitWithPolling();
//        clickOnMeetingAndEvents.click();
//    }
//
//    public void validateMeetingAndEventsHomePage() throws InterruptedException {
////        sleepFor(8);
//        String expectedResult = "CONNECT WITH CONFIDENCE";
//        String actualResult = validateEventsHomePageActual.getText();
//        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
//    }

        public void clickOnMarriottBONVoYLogo () throws InterruptedException {
//        sleepFor(10);
        fluentWaitWithPolling();
//        windowAndTabs();
//        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(3))
//                .withMessage("Time out after 30 seconds")
//                .ignoring(NoSuchElementException.class);
            clickOnMarriottBONVoYLogo.click();
        }


    public void VerifyTheTableShowsUpAndBeAbleToUseIt() throws InterruptedException {
//        sleepFor(8);
        String expectedResult = "Hotels & Resorts | Book your Hotel directly with Marriott";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }
}
