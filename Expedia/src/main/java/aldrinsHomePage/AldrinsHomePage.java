package aldrinsHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static aldrinsHomePage.AldrinsHomePageWebElements.*;


public class AldrinsHomePage extends WebAPI {
    @FindBy (how = How.ID, using = phoneInputBox) public WebElement phoneBoxForApp;
    @FindBy(how = How.XPATH, using = expediaGroupElement) public WebElement expediaGroup;

}
