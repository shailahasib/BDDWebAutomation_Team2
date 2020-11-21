package cruises;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static cruises.CruisesWebElements.*;

public class CruisesPage extends WebAPI {


    @FindBy(how = How.CSS, using = packagesOnHeader)
    public WebElement packages;
    @FindBy(how = How.XPATH, using = chooseOneOrMoreItemsToBuild)
    public WebElement chooseOneOrMoreItems;
    @FindBy(how = How.CSS, using = leavingFromInsertBox)
    public WebElement leavingFromInsert;
    @FindBy(how = How.CSS, using = goingToInsertBox)
    public WebElement goingToInsert;
    @FindBy(how = How.XPATH, using = departingDateBox)
    public WebElement departingDate;
    @FindBy(how = How.XPATH, using = returningDateBox)
    public WebElement returningDate;
    @FindBy(how = How.XPATH, using = packageSearchButton)
    public WebElement packageSearch;
    @FindBy(how = How.XPATH, using = leavingFromTextBox)
    public WebElement leavingFromText;
    @FindBy(how = How.XPATH, using = allCalendarDates)
    public List<WebElement> calendarDates;
    @FindBy(how = How.XPATH, using = monthSelectTextReader)
    public WebElement monthSelectText;
    @FindBy(how = How.XPATH, using = nextMonthNavigator)
    public WebElement nextMonth;
    @FindBy(how = How.XPATH, using = cruisesTab)
    public WebElement cruises;
    @FindBy(how = How.CSS, using = flightsTab)
    public WebElement flights;

    @FindBy(how = How.CSS, using = goingToButton)
    public WebElement goingTo;

    @FindBy(how = How.XPATH, using = flyingFromBox)
    public WebElement flyingFrom;



    public void validateSearchText(String expectedResult) {
        String actualResult = leavingFromText.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    public void validateChooseOptionsText(String expectedResult) {
        String actualResult = chooseOneOrMoreItems.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    public void enterLeavingFrom(String searchItem) {
        leavingFromInsert.sendKeys(searchItem);
    }

    public void enterGoingTo(String searchItem) {
        goingToInsert.sendKeys(searchItem);
    }

    public void clickPackages() {
        //for(int i=0; i<=1; i++) {
            packages.click();
        //}
    }

    public void clickElement(WebElement webElement) {
        webElement.click();
    }

    public void pickDepart(String month, String date) {

        while (true) {
            String monthText = monthSelectText.getText();
            if (monthText.equals(month)) {
                break;
            } else {
                nextMonth.click();
            }
        }

        for (WebElement allDates : calendarDates) {
            String dateText = allDates.getText();
            if (dateText.equals(date)) {
                allDates.click();
            }
        }

    }

    public void pickReturn(String month, String date) {

        while (true) {
            String monthText = monthSelectText.getText();
            if (monthText.equals(month)) {
                break;
            } else {
                nextMonth.click();
            }
        }

        for (WebElement allDates : calendarDates) {
            String dateText = allDates.getText();
            if (dateText.equals(date)) {
                allDates.click();
            }
        }

    }


    public void clickOnSearchButton() {
        packageSearch.click();
    }

    public void getElementText(WebElement element){
        element.getText();
    }


}
