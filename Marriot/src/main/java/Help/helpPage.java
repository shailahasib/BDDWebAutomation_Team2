package Help;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static Help.helpPageWebElement.*;

public class helpPage extends WebAPI {

    @FindBy(how = How.XPATH,using = originField)
    public WebElement origin;
    @FindBy(how = How.XPATH,using = destinationField)
    public WebElement destination;

public void helpPageTitle(){
    String ActualHelpURL=driver.getTitle();
    Assert.assertEquals("failed",ActualHelpURL,expectedHelpURL);
}

    public void BrokenLinks() throws InterruptedException {
    sleepFor(4);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links are "+links.size());
        for(int i=0;i<links.size();i++)
        {
            WebElement ele= links.get(i);
            String url=ele.getAttribute("href");
            verifyLinkActive(url);
        }
    }
    public void enterOriginAndDestination() throws InterruptedException {
        Set<String> windowsIds=driver.getWindowHandles();
        Iterator<String> itor=windowsIds.iterator();
        String mainWindow=itor.next();
        String childWindow=itor.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(5000);
        origin.sendKeys("philadelphia");
        destination.sendKeys("hawaii");

        WebElement date =driver.findElement(By.xpath("//*[@id=\"datefrom\"]"));
        date.sendKeys("12/15/2020");
//        String dateVal="12/15/2020";
//        selectDateByJS(driver,date,dateVal);
        sleepFor(4);

        WebElement date1 =driver.findElement(By.xpath("//*[@id=\"dateto\"]"));
        String dateVal1="12/30/2020";
        selectDateByJS(driver,date1,dateVal1);
        sleepFor(4);
    }























}
