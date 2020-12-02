package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {
    String expectedResult;

    @FindBy(xpath = singInOrJoinWebElement) public WebElement singInOrJoin;
    @FindBy(xpath = emailOrMemberNumberWebElement) public WebElement emailOrMemberNumber;
    @FindBy(xpath = passwordWebElement) public WebElement password;
    @FindBy(xpath = singInButtonWebElement) public WebElement singInButton;
    public void clickOnSingInOrJoin(){singInOrJoin.click();}
    public void enterEmailOrMemberNumber(){emailOrMemberNumber.sendKeys(enterEmailOrMemberNumberWebElement);}
    public void enterPassword(){password.sendKeys(enterPasswordWebElement);}
    public void clickOnSingInButton(){singInButton.click();}
    public void validateSingInTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = forgotPasswordWebElement) public WebElement forgotPassword;
    @FindBy(xpath = emailOrMemberNumber1WebElemen) public WebElement emailOrMemberNumber1;
    @FindBy(xpath = firsNameWebElement) public WebElement firsName;
    @FindBy(xpath = lastNameWebElement) public WebElement lastName;
    @FindBy(xpath = zipCodWebElement) public WebElement zipCod;
    @FindBy(xpath = submitButtonWebElement) public WebElement  submitButton;

    public void clickOnForgotPassword(){forgotPassword.click();}
    public void enterEmailOrMemberNumber1(){emailOrMemberNumber1.sendKeys(enterEmailOrMemberNumber1WebElement);}
    public void enterFirstName(){firsName.sendKeys(enterFirsNameWebElement);}
    public void enterLastName(){lastName.sendKeys(enterLastNameWebElement);}
    public void enterZipCod(){zipCod.sendKeys(enterZipCodWebElement);}
    public void clickOnSubmitButton(){submitButton.click();}
    public void validateForgotTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = findAndReserveWebElement) public WebElement findAndReserve;
    @FindBy(xpath = findHotelWebElement) public WebElement findHotel;
    @FindBy(xpath=  hotelKeywordSearchWebElement) public WebElement hotelKeywordSearch;
    @FindBy(xpath = searchHotelWebElement) public WebElement searchHotelButton;


    public void clickFindAndReserve(){findAndReserve.click();}
    public void findHotel(){findHotel.click();}
    public void enterHotelKeywordSearch(){hotelKeywordSearch.sendKeys(enterHotelKeywordSearchWebElement);}
    public void clickOnSearchHotelButton(){searchHotelButton.click();}
    public void validateFindAndReserveTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = specialOffersWebElement) public WebElement specialOffers;
    @FindBy(xpath = dealsWebElement) public WebElement deals;

    public void clickOnSpecialOffers(){specialOffers.click();}
    public void clickOnDeals(){deals.click();}
    public void validateDealsTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = shopMarriottWebElement) public WebElement shopMarriott;
    @FindBy(xpath = emailAddressWebElement) public WebElement emailAddress;
    @FindBy(xpath = signMeUpButtonWebElement) public WebElement signMeUpButton;
    public void clickOnShopMarriott(){shopMarriott.click(); }
    public void enterEmailAddress(){emailAddress.sendKeys(enterEmailAddressWebElement);}
    public void clickOnSignMeUpButton(){signMeUpButton.click();}
    public void validateShopMarriott(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }
    @FindBy(xpath = shopWestinWebElement) public WebElement shopWestin;
    @FindBy(xpath = emailAddress1WebElement) public WebElement emailAddress1;
    @FindBy(xpath = subscribeNowWebElement) public WebElement subscribeNow;
    public void clickOnShopWestin(){shopWestin.click();}
    public void enterEmailAddress1(){emailAddress1.sendKeys(enterEmailAddress1WebElement);}
    public void clickOnSubscribeNow(){subscribeNow.click();}
    public void validateShopWestinTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = ourBrandsWebElement) public WebElement ourBrands;
    @FindBy(xpath = marriottSignWebElement) public WebElement marriottSign;
    public void clickOnOurBrands(){ourBrands.click();}
    public void clickOnMarriottSign(){marriottSign.click();}
    public void validateTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = deltaHotelMarriottWebElement) public WebElement deltaHotelMarriott;
    public void clickOnDeltaHotelMarriott(){deltaHotelMarriott.click();}
    public void validateTitle1(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }
    @FindBy(xpath = marriottVacationClubWebElement) public WebElement marriottVacationClub;
    public void clickOnMarriottVacationClub(){marriottVacationClub.click();}
    public void validateTitle2(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }
    @FindBy(xpath = aloftHotelsWebElement) public WebElement aloftHotels;
    public void clickOnAloftHotels(){aloftHotels.click();}
    public void validateTitle3(String expectedResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }
    @FindBy(xpath = vacationWebElement) public WebElement vacation;
    @FindBy(xpath = homeAndVillasWebElement) public WebElement homeAndVillas;
    @FindBy(xpath = startExploringWebElement) public WebElement startExploring;
    public void clickOnVacation(){vacation.click();}
    public void clickOnHomeAndVillas(){homeAndVillas.click();}
    public void clickStartExploring(){startExploring.click();}
    public void validateVacationTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = residencesWebElement) public WebElement residences;
    public void clickOnResidences(){residences.click();}
    public void validateResidencesTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = travelTipsAndIdeaWebElement) public WebElement travelTipsAndIdea;
    public void clickOnTravelTipsAndIdea(){travelTipsAndIdea.click();}
    public void validateTravelTipsAndIdeaTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = aboutMarriottBonvoyWebElement) public WebElement aboutMarriottBonvoy;
    @FindBy(xpath = marriottInsidersWebElement) public WebElement marriottInsiders;
    public void clickAboutMarriottBonvoy(){aboutMarriottBonvoy.click();}
    public void clickOnMarriottInsiders(){marriottInsiders.click();}
    public void validateMarriottInsidersTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = memberBenefitsWebElement) public WebElement memberBenefits;
    public void clickMemberBenefits(){memberBenefits.click();}
    public void validateMemberBenefitsTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = howToEarnPointWebElement) public WebElement howToEarnPoint;
    public void clickHowToEarnPoint(){howToEarnPoint.click();}
    public void validateHowtoEarnPointTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = howToUsePointWebElement) public WebElement howToUsePoint;
    public void clickHowToUsePoint(){howToUsePoint.click();}
    public void validateHowToUsePointTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }

    @FindBy(xpath = sheratonWebElement) public WebElement sheraton;
    public void clickSheraton(){sheraton.click();}
    public void validateSheratonTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }
    @FindBy(xpath = editionWebElement) public WebElement edition;
    public void clickEdition(){edition.click();}
    public void validateEditionTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }
    @FindBy(xpath = JWMarriottWebElement) public WebElement JWMarriott;
    public void clickJWMarriott(){JWMarriott.click();}
    public void validateJWMarriottTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }
    @FindBy(xpath = WHotelsWebElement) public WebElement WHotels;
    public void clickWHotels(){JWMarriott.click();}
    public void validateWHotelsTitle(String expectedResult){
        String actualResult=driver.getTitle();
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
    }





}
