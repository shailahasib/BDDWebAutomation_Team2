package cellPhones;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static cellPhones.CellphonePageWebElements.*;

abstract class ElementProxy implements InvocationHandler {

}

public class CellphonePage extends WebAPI {

    @FindBy(how = How.ID, using = loginNextButtonID)
    public WebElement loginNextButton;
    @FindBy(how = How.CSS, using = socialInstagramIconCss)
    public WebElement socialInstagramIcon;

    public void switchTab(int waitForSecond) {
        sleepFor(waitForSecond);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
public void scrollElementIntoView(WebElement element){
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
}
    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void findBrokenLinks(String expectedURL) {

        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        List<WebElement> linktag = driver.findElements(By.tagName("a"));

        for (WebElement element : linktag) {

            url = element.getAttribute("href");

            System.out.println(url);

            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if (!url.startsWith(expectedURL)) {
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

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void assertURL(String expected) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("Test Failed, URL DOES NOT MATCH", expected, actual);
    }
}
