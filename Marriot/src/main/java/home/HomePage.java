package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {


    @FindBy(xpath = clickOnMeetingAndEventsLocator)
    public WebElement clickOnMeetingAndEvents;
    @FindBy(css = validateEventsHomePageLocator)
    public WebElement validateEventsHomePage;
    @FindBy(className = clickOnSignInOrJoinLocator)
    public WebElement clickOnSignInOrJoin;
    @FindBy(xpath = clickJoinNowLocator)
    public WebElement clickJoinNow;
    @FindBy(css = sendFirstNameLocator)
    public WebElement sendFirstName;
    @FindBy(css = sendLastNameLocator)
    public WebElement sendLastName;
    @FindBy(css = PostalCodeLocator)
    public WebElement PostalCode;
    @FindBy(xpath = EmailLocator)
    public WebElement Email;
    @FindBy(css = PasswordLocator)
    public WebElement Password;
    @FindBy(css = ConfirmPasswordLocator)
    public WebElement ConfirmPassword;
    @FindBy(id = clickOnJoinButtonLocator)
    public WebElement clickOnJoinButton;
    @FindBy(xpath = clickOnMyTripLocator)
    public WebElement clickOnMyTrip;
    @FindBy(css = ConfirmationNumberLocator)
    public WebElement ConfirmationNumber;
    @FindBy(css = FirsNameLocator)
    public WebElement FirsName;
    @FindBy(css = LastNameLocator)
    public WebElement LastName;
    @FindBy(xpath = calendarLocator)
    public WebElement calendar;
    @FindBy(xpath = dateLocator)
    public WebElement date;
    @FindBy(css = clickOnFindButtonLocator)
    public WebElement clickOnFindButton;
    @FindBy(id = validateErrorMessageLocator)
    public WebElement validateErrorMessage;
    @FindBy(xpath = EspañolLocator)
    public WebElement Español;
    @FindBy(xpath = FrançaisLocator)
    public WebElement Français;
    @FindBy(partialLinkText = ItalianoLocator)
    public WebElement Italiano;
    @FindBy(partialLinkText = РусскийLocator)
    public WebElement Русский;
    @FindBy(xpath = 日本語Locator)
    public WebElement 日本語;
    @FindBy(xpath = PortuguesLocator)
    public WebElement Portugues;
    @FindBy(css = clickOnLanguageLocator)
    public WebElement clickOnLanguage;
    @FindBy(xpath = setDistinctionLocator)
    public WebElement setDistinction;
    @FindBy(xpath = setGuestLocator)
    public WebElement setGuest;
    @FindBy(xpath = setSpaceLocator)
    public WebElement setSpace;
    @FindBy(className = clickOnTheCalendarLocator)
    public WebElement clickOnTheCalendar;
    @FindBy(xpath = enterTheEventTypeLocator)
    public WebElement enterTheEventType;
    @FindBy(xpath = selectBusunessLocator)
    public WebElement selectBusiness;
    @FindBy(xpath = clickOnsubmitbookingLocator)
    public WebElement clickOnSubmitting;
    @FindBy(css = validateBookingResultLocator)
    public WebElement validateBookingResult;


    public void sendKey(WebElement element, String Value) {
        element.sendKeys(Value);
    }

    public void clickOnMeetingAndEventsLinkElements() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)");
        fluentWaitWithPolling();
        clickOnMeetingAndEvents.click();
        sleepFor(15);
    }

    public void validateMeetingAndEventsHomePage() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "CONNECT WITH CONFIDENCE";
        String actualResult = validateEventsHomePage.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnSignInOrJoinElements() throws InterruptedException {
        sleepFor(5);
        clickOnSignInOrJoin.click();
    }

    public void clickOnJoinNowElements() throws InterruptedException {
        waitTimeExplicitClickable(clickJoinNowLocator);
        clickJoinNow.click();
    }

    public void clickOnJoinButtonElements() throws InterruptedException {
        sleepFor(5);
        clickOnJoinButton.click();
    }

    public void verifyLoginToMyProfileElements() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Marriott Bonvoy™ Benefits";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnMyTripElements() throws InterruptedException {
        sleepFor(5);
        clickOnMyTrip.click();
    }

    public void calendarElements() throws InterruptedException {
        sleepFor(5);
        calendar.click();
        date.click();
    }

    public void clickOnFindButtonElements() throws InterruptedException {
        sleepFor(5);
        clickOnFindButton.click();
    }

    public void verifyErrorMessageReservationElements() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Reservation not found\n" +
                "We cannot locate your reservation. If you believe you entered the correct information, please call the Reservation Center in your area.";
        String actualResult = validateErrorMessage.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }
    @FindBy(linkText= DeutschLocator)
    public WebElement Deutsch;
    public void clickOnTheCurrentLanguageElements(String language) throws InterruptedException {
        sleepFor(5);
        fluentWaitWithPolling();
        clickOnLanguage.click();
        sleepFor(10);
        while (true) {
            if (language.equals("Deutsch")) {
                Deutsch.click();
                sleepFor(3);
                break;
            } else if (language.equals("Español")) {
                waitTimeExplicitVisibilityOf(EspañolLocator);
               Español.click();
                sleepFor(3);
                break;
            } else if (language.equals("Français")) {
                waitTimeExplicitVisibilityOf(FrançaisLocator);
                Français.click();
                sleepFor(3);
                break;
            }else if (language.equals("Italiano")) {
             Italiano.click();
                sleepFor(3);
                break;
            } else if (language.equals("Русский")) {
                Русский.click();
                sleepFor(3);
                break;
            } else if (language.equals("Portugues")) {
                Portugues.click();
                sleepFor(3);
                break;
            }
        }
    }

    public void enterTheEventTypeElements() throws InterruptedException {
        sleepFor(5);
        enterTheEventType.click();
        selectBusiness.submit();
    }
 public void VerifyTheElements(String expectedResult) throws InterruptedException {
        sleepFor(5);
     String actualResult = driver.getCurrentUrl();
     Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnFindReservationButton() throws InterruptedException {
        sleepFor(10);
        clickOnSubmitting.submit();
    }

    public void verifyTheResultOfBookingEvents() throws InterruptedException {
        sleepFor(5);
        String expectedResult = "Showing ";
        String actualResult = validateBookingResult.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void enterTheDateElements() throws InterruptedException, ParseException {
        sleepFor(5);
        clickOnTheCalendar.click();
        String d = "12/01/2021";
        String months[] = {"January", "February", "March", "April", "May", "Jun", "July", "August",
                "September", "October", "November", "december"};
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date mydate = df.parse(d);
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(mydate);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        System.out.println(day);
        System.out.println(months[month]);
        System.out.println(year);
        String ForwardArrow = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/input[7]";
        String travelMonth = months[month] + " " + year;
        System.out.println(travelMonth);
        String xpathMonthYearSection = "//*[@id='23DI0PWS_hotel-fromToDate_root']/div/div[1]/div[3]/div/div/div[1]";
        while (!driver.findElement(By.xpath(xpathMonthYearSection)).getText().equals(travelMonth)) {
            driver.findElement(By.xpath(ForwardArrow)).click();
        }
        driver.findElement(By.xpath("//div[text()='" + day + "']")).click();
        driver.findElement(By.xpath("//*[@id='EWEPRPDW_hotel-fromToDate_table']/tbody/tr[3]/td[3]/div")).click();
    }

}
