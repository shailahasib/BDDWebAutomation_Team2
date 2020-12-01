package aldrinsHomePage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static aldrinsHomePage.AldrinsHomePageWebElements.*;


public class AldrinsHomePage extends WebAPI {
    @FindBy (how = How.ID, using = phoneInputBox) public WebElement phoneBoxForApp;
    @FindBy(how = How.XPATH, using = expediaGroupElement) public WebElement expediaGroup;
    @FindBy(how = How.XPATH, using = languageSelectorXpath) public WebElement languageSelector;
    @FindBy(how = How.CSS, using = selectLanguageCss) public WebElement selectLanguage;
    @FindBy(how = How.XPATH, using = startHotelSearchXpath) public WebElement startHotelSearch;

    public void assertTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Test Failed. Title is not as expected.", expectedTitle, actualTitle);
    }

        public void assertURL(String expectedURL){
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals("Test Failed. Title is not as expected.", expectedURL,actualURL);
    }
    public void typeByXpathNEnter(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
}
