package creditCardPage;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static creditCardPage.creditCardPageWebElements.*;

public class CreditCardPage extends WebAPI {


    @FindBy(how = How.ID, using = covidBannerElement)
    public WebElement covidBanner;
    @FindBy(how = How.ID, using = emailElement)
    public WebElement email;
    @FindBy(how = How.ID, using = passwordElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = openFindReserveElement)
    public WebElement openFindReserve;
    @FindBy(how = How.ID, using = inputDestinationElement)
    public WebElement inputDestination;
    @FindBy(how = How.XPATH, using = leftCalendarBoxElement)
    public WebElement leftCalendarBox;


    public void covidBannerVisibility() {
        covidBanner.isDisplayed();
    }

    public void sendEmailAndPassword(String emailText, String passwordText) {
        email.sendKeys(emailText);
        sleepFor(1);
        password.sendKeys(passwordText);
    }

    public void clickFindReserve() {
        openFindReserve.click();
    }

    public void enterDesination(String destination) {
        inputDestination.sendKeys(destination);
    }

    public void pickStartDate(String month, String date) {

        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOf(leftCalendarBox));
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
                for (int i = 0; i <= 1; i++) {
                    allDates.click();
                    break;
                }
            }
        }

    }
//    public static void main(String[] args) {
//        //getInit
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("https://www.marriott.com/loyalty/earn/credit-card-rewards.mi");
//        sleepFor(5);
//        driver.findElement(By.className(signInOrJoinElement)).click();
//        driver.findElement(By.className(joinInElement)).click();
//
//        //tearDown
//        sleepFor(3);
//        driver.manage().deleteAllCookies();
//        driver.close();
//
//    }
}
