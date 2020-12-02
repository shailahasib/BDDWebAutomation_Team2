package support;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import static support.SupportPageElement.*;

public class SupportPage extends WebAPI {
    String expectedResult;
    @FindBy(css = supportWebElement)public  WebElement support;
    public void clickOnSupport(){support.click();
    }
    @FindBy(xpath = addYourPropertyToExpediaWebElement)public WebElement addYourPropertyToExpedia;
    public void clickAOnAddYourPropertyToExpedia(){addYourPropertyToExpedia.click();
    }
    @FindBy(css = learnMoreWebElement)public WebElement learnMore;
    public void  clickOnLearnMore(){learnMore.click();}

    public void validateAddYourPropertyToExpedia(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }



    @FindBy(xpath = support1WebElement)public  WebElement support1;
    public void clickOnSupport1(){support1.click();
    }
    @FindBy(id= chatNowWebElement)public WebElement chatNow;
    public void clickOnChatNow() {
        chatNow.click();
    }
     @FindBy(xpath = cancelBookingWebElement)public WebElement cancelBooking;
    public  void clickOnCancelBooking(){cancelBooking.click();
    }
    public void validateChtNow(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }




    @FindBy(xpath = support2WebElement)public  WebElement support2;
    public void clickOnSupport2(){support2.click();
    }
    @FindBy(xpath = hotelsWebElement)public WebElement hotels;
    public void clickOnHotels(){hotels.click();}

    @FindBy(xpath = bookingWebElement)public WebElement booking;
    public void clickOnBooking(){booking.click();}

    public void validateHotels(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = support3WebElement)public  WebElement support3;
    public void clickOnSupport3(){support3.click();
    }
    @FindBy(xpath = thingsToDoWebElement)public WebElement  thingsToDo;
    public void clickOnThingsToDo(){ thingsToDo.click();}

    @FindBy(xpath = shopTheSaleWebElement)public WebElement  shopTheSale;
    public void clickOnShopTheSale(){ shopTheSale.click();}

    public void validateThingsToDo(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = support4WebElement)public  WebElement support4;
    public void clickOnSupport4(){support4.click();
    }
    @FindBy(xpath = carsWebElement)public WebElement  cars;
    public void clickOnCars(){ cars.click();}

    @FindBy(xpath = rentalCarsWebElement)public WebElement rentalCars;
    public void clickOnRentalCars(){ rentalCars.click();}

    public void validateCars(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = support5WebElement)public  WebElement support5;
    public void clickOnSupport5(){support5.click();
    }
    @FindBy(xpath = hotHotelDealsWebElement)public WebElement  hotHotelDeals;
    public void clickOnHotHotelDeals(){hotHotelDeals.click();}

    @FindBy(xpath = showMoreWebElement)public WebElement showMore;
    public void clickOnShowMore(){ showMore.click();}

    public void validateHotHotelDeals(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }



    }


