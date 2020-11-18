package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static home.homePageWebElements.*;


public class homePage extends WebAPI {


    @FindBy(how = How.XPATH, using = findAndReserveTab)
    public WebElement findAndReserve;
    @FindBy(how = How.XPATH, using = findAndReserveText)
    public WebElement findAndReserveActualText;

    @FindBy(how = How.CSS, using = specialOffersTab)
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





    public void findAndReserveAction(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        findAndReserve.click();
    }

    public void findAndReserveVerify(){
        String actual = findAndReserveActualText.getText();
        String expected = reserveExpected;
        Assert.assertEquals("Failed",actual,expected);
    }

    public void specialOffersAction(){
        specialOffer.click();
    }

    public void specialOffersVerify(){
        boolean dealsAreDisplayed = dealsElement.isDisplayed();
        Assert.assertTrue(dealsAreDisplayed);
    }

    public void vacationsAction(){
        vacations.click();
    }

    public void vacationsVerify(){
        boolean exploreArIsDisplayed = vacationsExplore.isDisplayed();
        Assert.assertTrue(exploreArIsDisplayed);
    }

    public void ourBrandsAction(){
        ourBrands.click();
    }

    public void ourBrandsVerify(){
        boolean ritzCarltonDisplayed = ritzCarlton.isDisplayed();
        Assert.assertTrue(ritzCarltonDisplayed);
    }

    public void ourCreditCardsAction(){
        ourCreditCards.click();
    }

    public void ourCreditCardsVerify(){
        String actual = driver.getTitle();
        String expected = creditCardTitle;
        Assert.assertEquals("Failed",actual,expected);
    }

    public void aboutMarriotAction(){
        aboutMarriot.click();
    }

    public void aboutMarriotVerify(){
        boolean bonvoyDisplayed = bonvoyOverview.isDisplayed();
        Assert.assertTrue(bonvoyDisplayed);
    }









}
