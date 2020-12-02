package plans;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static plans.PlansPageElement.*;

public class PlansPage extends WebAPI {
    String expectResult;
    @FindBy(xpath = plansWebElement)
    public WebElement plans;

    public void clickOnPlans() {
        plans.click();
    }

    @FindBy(xpath = seeHawToGetA3rdLineFreeWebElement)
    public WebElement seeHawToGetA3rdLineFree;

    public void clickOnSeeHawToGetA3rdLineFree() {
        seeHawToGetA3rdLineFree.click();
    }

    @FindBy(xpath = findAStoreWebElement)
    public WebElement findAStore;

    public void clickOnFindAStore() {
        findAStore.click();
    }

    public void validateSeeHawToGetA3rdLineFreeTitle(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans1WebElement)
    public WebElement plans1;

    public void clickOnPlans1() {
        plans1.click();
    }

    @FindBy(xpath = startChoppingWebElement)
    public WebElement startChopping;

    public void clickOnStartChopping() {
        startChopping.click();
    }

    @FindBy(xpath = shopPhonesWebElement)
    public WebElement shopPhones;

    public void clickOnShopPhones() {
        shopPhones.click();
    }

    public void validatesStartChopping(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans2WebElement)
    public WebElement plans2;

    public void clickOnPlans2() {
        plans2.click();
    }

    @FindBy(xpath = startChopping1WebElement)
    public WebElement startChopping1;

    public void clickOnStartChopping1() {
        startChopping1.click();
    }

    @FindBy(xpath = shopTabletsWebElement)
    public WebElement shopTablets;

    public void clickOnShopTablets() {
        shopTablets.click();
    }

    public void validateStartChopping1(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans3WebElement)
    public WebElement plans3;

    public void clickOnPlans3() {
        plans3.click();
    }

    @FindBy(xpath = startChopping3WebElement)
    public WebElement startChopping3;

    public void clickOnStartShopping3() {
        startChopping3.click();
    }

    @FindBy(xpath = shopAccessoriesWebElement)
    public WebElement shopAccessories;

    public void clickOnShopAccessories() {
        shopAccessories.click();
    }

    public void validateStartChopping3(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans4WebElement)
    public WebElement plans4;

    public void clickOnPlans4() {
        plans4.click();
    }

    @FindBy(xpath = startChopping4WebElement)
    public WebElement startChopping4;

    public void clickOnStartShopping4() {
        startChopping4.click();
    }

    @FindBy(xpath = bringYourOwnDeviceWebElement)
    public WebElement bringYourOwnDevice;

    public void clickOnBringYourOwnDevice() {
        bringYourOwnDevice.click();
    }

    public void validateStartChopping4(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans5WebElement)
    public WebElement plans5;

    public void clickOnPlans5() {
        plans5.click();
    }

    @FindBy(xpath = startChopping5WebElement)
    public WebElement startChopping5;

    public void clickOnStartShopping5() {
        startChopping5.click();
    }

    @FindBy(xpath = shopSmartWatchesWebElement)
    public WebElement shopSmartWatches;

    public void clickOnShopSmartWatches() {
        shopAccessories.click();
    }

    public void validateStartChopping5(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans6WebElement)
    public WebElement plans6;

    public void clickOnPlans6() {
        plans6.click();
    }

    @FindBy(xpath = startChopping6WebElement)
    public WebElement startChopping6;

    public void clickOnStartShopping6() {
        startChopping6.click();
    }

    @FindBy(xpath = changePlansWebElement)
    public WebElement changePlans;

    public void clickOnChangePlans() {
        changePlans.click();
    }

    public void validateStartChopping6(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans7WebElement)
    public WebElement plans7;

    public void clickOnPlans7() {
        plans7.click();
    }

    @FindBy(xpath = seeUnlimited55PlansWebElement)
    public WebElement seeUnlimited55Plans;

    public void clickOnSeeUnlimited55Plans() {
        seeUnlimited55Plans.click();
    }

    @FindBy(xpath = seePriceBreakDownWebElement)
    public WebElement seePriceBreakDown;

    public void clickOnSeePriceBreakDownWebElement() {
        seePriceBreakDown.click();
    }

    public void validateSeeUnlimited55Plans(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }
    @FindBy(xpath = plans8WebElement)
    public WebElement plans8;

    public void clickOnPlans8() {
        plans8.click();
    }

    @FindBy(xpath = seeUnlimited55Plans1WebElement)
    public WebElement seeUnlimited55Plans1;

    public void clickOnSeeUnlimited55Plans1() {
        seeUnlimited55Plans1.click();
    }

    @FindBy(xpath = shopNow1WebElement)
    public WebElement ShopNow1;

    public void shopNow1WebElement() {
        ShopNow1.click();
    }

    public void validateSeeUnlimited55Plans1(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans9WebElement)
    public WebElement plans9;

    public void clickOnPlans9() {
        plans9.click();
    }

    @FindBy(xpath = seeUnlimited55Plans2WebElement)
    public WebElement seeUnlimited55Plans2;

    public void clickOnSeeUnlimited55Plans2() {
        seeUnlimited55Plans2.click();
    }

    @FindBy(xpath = seeFulTermsWebElement)
    public WebElement seeFullTerms;

    public void clickSeeFullTermsWebElement() {
        seeFullTerms.click();
    }

    public void validateSeeUnlimited55Plans2(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }

    @FindBy(xpath = plans10WebElement)
    public WebElement plans10;

    public void clickOnPlans10() {
        plans10.click();
    }

    @FindBy(xpath = whyTMobilWebElement)
    public WebElement whyTMobil;

    public void clickOnWhyTMobil() {
        whyTMobil.click();
    }

    @FindBy(xpath = chekOutOurRewardWebElement)
    public WebElement chekOutOurReward;

    public void clickOnChekOutOurReward() {chekOutOurReward.click();

    }

    public void validateWhyTMobil(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }



    @FindBy(xpath = plans11WebElement)
    public WebElement plans11;

    public void clickOnPlans11() {
        plans11.click();
    }

    @FindBy(xpath = whyTMobil1WebElement)
    public WebElement whyTMobil1;

    public void clickOnWhyTMobil1() {
        whyTMobil1.click();
    }

    @FindBy(xpath = seeWhatWeAreDoingWebElement)
    public WebElement seeWhatWeAreDoing;

    public void clickOnSeeWhatWeAreDoing() {seeWhatWeAreDoing.click();

    }

    public void validateWhyTMobil1(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = plans12WebElement)
    public WebElement plans12;

    public void clickOnPlans12() {
        plans12.click();
    }

    @FindBy(xpath = whyTMobil2WebElement)
    public WebElement whyTMobil2;

    public void clickOnWhyTMobil2() {
        whyTMobil2.click();
    }

    @FindBy(xpath = findOutWhatNextWebElement)
    public WebElement findOutWhatNext   ;
    ;

    public void clickOnFindOutWhatNext() {findOutWhatNext.click();

    }

    public void validateWhyTMobil2(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }



    @FindBy(xpath = plans13WebElement)
    public WebElement plans13;

    public void clickOnPlans13() {
        plans13.click();
    }

    @FindBy(xpath = whyTMobil3WebElement)
    public WebElement whyTMobil3;

    public void clickOnWhyTMobil3() {
        whyTMobil3.click();
    }

    @FindBy(xpath = seeOurHistoryWebElement)
    public WebElement  seeOurHistory   ;
    ;

    public void clickOnSeeOurHistoryFindOutWhatNext() { seeOurHistory.click();

    }

    public void validateWhyTMobil3(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = plans14WebElement)
    public WebElement plans14;

    public void clickOnPlans14() {
        plans14.click();
    }

    @FindBy(xpath = whyTMobil4WebElement)
    public WebElement whyTMobil4;

    public void clickOnWhyTMobil4() {
        whyTMobil4.click();
    }

    @FindBy(xpath = chekItOutWebElement)
    public WebElement chekItOut   ;
    ;

    public void clickOnChekItOut() { chekItOut.click();

    }

    public void validateWhyTMobil4(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = plans15WebElement)
    public WebElement plans15;

    public void clickOnPlans15() {
        plans15.click();
    }

    @FindBy(xpath = whyTMobil5WebElement)
    public WebElement whyTMobil5;

    public void clickOnWhyTMobil5() {
        whyTMobil5.click();
    }

    @FindBy(xpath = moreInfoWebElement)
    public WebElement moreInfo   ;
    ;

    public void clickOnMoreInfo() { moreInfo.click();

    }

    public void validateWhyTMobil5(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = plans16WebElement)
    public WebElement plans16;

    public void clickOnPlans16() {
        plans16.click();
    }

    @FindBy(xpath = whyTMobil6WebElement)
    public WebElement whyTMobil6;

    public void clickOnWhyTMobil6() {
        whyTMobil6.click();
    }

    @FindBy(xpath = getTheDetailsWebElement)
    public WebElement getTheDetails   ;
    ;

    public void clickOnGetTheDetails() { getTheDetails.click();

    }

    public void validateWhyTMobil6(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = plans17WebElement)
    public WebElement plans17;

    public void clickOnPlans17() {
        plans17.click();
    }

    @FindBy(xpath = whyTMobil7WebElement)
    public WebElement whyTMobil7;

    public void clickOnWhyTMobil7() {
        whyTMobil7.click();
    }

    @FindBy(xpath = chekItOut1WebElement)
    public WebElement chekItOut1  ;

    public void clickOnChekItOut1() { chekItOut1.click();

    }

    public void validateWhyTMobil7(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = plans18WebElement)
    public WebElement plans18;

    public void clickOnPlans18() {
        plans18.click();
    }

    @FindBy(xpath = whyTMobil8WebElement)
    public WebElement whyTMobil8;

    public void clickOnWhyTMobil8() {
        whyTMobil8.click();
    }

    @FindBy(xpath = seeCoverageWebElement)
    public WebElement seeCoverage ;

    public void clickOnSeeCoverage() { seeCoverage.click();

    }

    public void validateWhyTMobil8(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }


    @FindBy(xpath = plans19WebElement)
    public WebElement plans19;

    public void clickOnPlans19() {
        plans19.click();
    }

    @FindBy(xpath = holidayOnWebElement)
    public WebElement holidayOn ;

    public void clickOnHolidayOn() {
        holidayOn.click();
    }

        @FindBy(xpath =seeAndroidDealsWebElement)
    public WebElement seeAndroidDeals ;

    public void clickOnSeeAndroidDeals() { seeAndroidDeals.click();

    }

    public void validateWhyTMobil9(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "not match");
    }




}