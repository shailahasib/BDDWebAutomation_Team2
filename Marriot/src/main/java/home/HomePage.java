package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static home.HomePageWebElements.*;


public class HomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = findAndReserveTab)
    public WebElement findAndReserve;
    @FindBy(how = How.XPATH, using = findAndReserveText)
    public WebElement findAndReserveActualText;

    @FindBy(how = How.XPATH, using = specialOffersTab)
    public WebElement specialOffer;
    @FindBy(how = How.XPATH, using = dealsElementDisplayed)
    public WebElement dealsElement;

    @FindBy(how = How.XPATH, using = vacationsTab)
    public WebElement vacations;
    @FindBy(how = How.XPATH, using = vacationsExploreVerifyText)
    public WebElement vacationsExplore;

    @FindBy(how = How.XPATH, using = ourBrandsTab)
    public WebElement ourBrands;
    @FindBy(how = How.CSS, using = ritzCarltonLogo)
    public WebElement ritzCarlton;

    @FindBy(how = How.XPATH, using = ourCreditCardsTab)
    public WebElement ourCreditCards;

    @FindBy(how = How.XPATH, using = aboutMarriotTab)
    public WebElement aboutMarriot;
    @FindBy(how = How.XPATH, using = bonvoyOverviewDisplayed)
    public WebElement bonvoyOverview;

    @FindBy(how = How.XPATH, using = whereDoYouWantToGoBox)
    public WebElement whereDoYouWantToGo;

    @FindBy(how = How.XPATH, using = clickOnCalendarFromDate)
    public WebElement clickOnCalendarFrom;

    @FindBy(how = How.XPATH, using = destinationBoxOnHomePage)
    public WebElement destinationBox;

    @FindBy(how = How.XPATH, using = destinationBoxForTyping)
    public WebElement destinationTyping;

    @FindBy(how = How.XPATH, using = allDatesOnTheEnabledMonth)
    public List<WebElement> allDatesOnFirstCal;

    @FindBy(how = How.XPATH, using = monthEnableDisplay)
    public WebElement monthEnabled;
    @FindBy(how = How.XPATH, using = nextMonthArrow)
    public WebElement nextMonth;

    @FindBy(how = How.XPATH, using = entireCalendarBox)
    public WebElement entireCalendar;

    @FindBy(how = How.XPATH, using = previousMonthArrow)
    public WebElement previousMonth;


    public void goToNyc() {
        destinationTyping.sendKeys("NYC,NY");
    }

    public void enterDestination() {
        sendKeysForNYC(destinationBox);
    }

    public void findDestinationBox() {
//        Actions action = new Actions(driver);
//        action.moveToElement(destinationBox);
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.elementToBeClickable(destinationBox));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", destinationBox);

        // destinationBox.click();
    }

    public void clickOnCalendarFrom() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement(clickOnCalendarFrom);
    }


//    public void gotToNyc(){
//        sendKeysForNYC();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    }

    public void sendKeysForNYC(WebElement element) {
        element.sendKeys(goToNYC);
    }

    public void clickWhereTo() {
        clickElement(whereDoYouWantToGo);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void findAndReserveAction() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        findAndReserve.click();
    }

    public void findAndReserveVerify() {
        String actual = findAndReserveActualText.getText();
        String expected = reserveExpected;
        Assert.assertEquals("Failed", actual, expected);
    }

    public void specialOffersAction() {
        specialOffer.click();
    }

    public void specialOffersVerify() {
        boolean dealsAreDisplayed = dealsElement.isDisplayed();
        Assert.assertTrue(dealsAreDisplayed);
    }

    public void vacationsAction() {
        vacations.click();
    }

    public void vacationsVerify() {
        boolean exploreArIsDisplayed = vacationsExplore.isDisplayed();
        Assert.assertTrue(exploreArIsDisplayed);
    }

    public void ourBrandsAction() {
        ourBrands.click();
    }

    public void ourBrandsVerify() {
        boolean ritzCarltonDisplayed = ritzCarlton.isDisplayed();
        Assert.assertTrue(ritzCarltonDisplayed);
    }

    public void ourCreditCardsAction() {
        ourCreditCards.click();
    }

    public void ourCreditCardsVerify() {
        String actual = driver.getTitle();
        String expected = creditCardTitle;
        Assert.assertEquals("Failed", actual, expected);
    }

    public void aboutMarriotAction() {
        aboutMarriot.click();
    }

    public void aboutMarriotVerify() {
        boolean bonvoyDisplayed = bonvoyOverview.isDisplayed();
        Assert.assertTrue(bonvoyDisplayed);
    }


    public void pickStartDate(String month, String date) {

        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOf(entireCalendar));
        while (true) {
            String monthText = monthEnabled.getText();
            if (monthText.equalsIgnoreCase(month)) {
                break;
            } else {
                nextMonth.click();
            }
        }
        for (WebElement allDates : allDatesOnFirstCal) {

            while (allDates.equals(date)) {
                for(int i=0; i<=1; i++) {
                    allDates.click();
                    break;
                }
            }
        }

    }


//    public void pickStartDate(String month, String date) {
//        WebDriverWait wait = new WebDriverWait(driver, 6);
//        wait.until(ExpectedConditions.visibilityOf(entireCalendar));
//        while (true) {
//            String monthText = monthEnabled.getText();
//            if (monthText.equalsIgnoreCase(month)) {
//                break;
//            } else {
//                nextMonth.click();
//            }
//        }
//        for (WebElement allDates : allDatesOnFirstCal) {
//            String dateText = allDates.getText();
//            System.out.println(dateText);
//            //sleepFor(2);
//            while (dateText.equals(date)) {
//                for(int i=0; i<=1; i++) {
//                    allDates.click();
//                    break;
//                }
//            }
//        }
//
//    }
//

}
