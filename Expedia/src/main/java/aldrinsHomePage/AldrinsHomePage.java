package aldrinsHomePage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static aldrinsHomePage.AldrinsHomePageWebElements.*;


public class AldrinsHomePage extends WebAPI {
    @FindBy(how = How.CSS, using = packagesOnHeader)public WebElement packages;
    @FindBy (how = How.ID, using = phoneInputBox) public WebElement phoneBoxForApp;
    @FindBy(how = How.XPATH, using = links)public List<WebElement> allLinks;
    @FindBy(how = How.XPATH, using = expediaGroupElement) public WebElement expediaGroup;
    @FindBy(how = How.XPATH, using = languageSelectorXpath) public WebElement languageSelector;
    @FindBy(how = How.CSS, using = selectLanguageCss) public WebElement selectLanguage;
    @FindBy(how = How.XPATH, using = startHotelSearchXpath) public WebElement startHotelSearch;
    @FindBy(how = How.XPATH, using = termsHeaderXpath) public WebElement termsHeader;
    @FindBy(how = How.XPATH, using = chooseOneOrMoreItemsToBuild)public WebElement chooseOneOrMoreItems;


    public void assertTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Test Failed. Title is not as expected.", expectedTitle, actualTitle);
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

            if (!url.startsWith(homePageURL)) {
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
    public void valildateOptionByText(String expectedResult) {
        String actualResult = chooseOneOrMoreItems.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

        public void assertURL(String expectedURL){
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals("Test Failed. Title is not as expected.", expectedURL,actualURL);
    }
    public void typeByXpathNEnter(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public void clickPackages() {

        packages.click();
    }
}
