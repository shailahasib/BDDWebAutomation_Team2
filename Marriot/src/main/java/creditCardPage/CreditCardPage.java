package creditCardPage;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static creditCardPage.creditCardPageWebElements.*;

public class CreditCardPage extends WebAPI {


    @FindBy(how = How.ID, using = covidBannerElement)
    public WebElement covidBanner;
    @FindBy(how = How.ID, using = emailElement) public WebElement email;
    @FindBy(how = How.ID, using = passwordElement) public WebElement password;

    public void covidBannerVisibility() {
        covidBanner.isDisplayed();
    }
    public void sendEmailAndPassword(String emailText, String passwordText){
        email.sendKeys(emailText);
        sleepFor(1);
        password.sendKeys(passwordText);

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
