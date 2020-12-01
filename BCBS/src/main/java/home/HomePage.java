package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {
    //@@FindBy(how = How.CSS, using = contactUsPhone) public WebElement phoneContactUS;
    @FindBy(how = How.ID,using = openSearchKey) public static WebElement enterSearchKeyword;
    @FindBy (how = How.ID, using = searchBoxToClean) public WebElement cleanSearchBox;
    @FindBy (how = How.CSS,using = prefixInputFieldCss) public WebElement prefixInputField;

    public void assertURLEquals(String expected) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Failed");
    }


}
