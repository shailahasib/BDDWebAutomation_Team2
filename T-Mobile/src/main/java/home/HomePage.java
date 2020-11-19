package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomePageWebElements.*;


public class HomePage extends WebAPI {

    @FindBy(how = How.ID, using = Phones$devices)
    public WebElement TmoblePhones$devices;
    @FindBy(how = How.XPATH, using = varifyPhones$devices)
    public WebElement TmoblevarifyPhones$devices;
    @FindBy(how = How.XPATH, using = ClickSearch)
    public WebElement TmobleClickSearch;
    @FindBy(how = How.ID, using = Search)
    public WebElement TmobleSearch;
    @FindBy(how = How.XPATH, using = SearchButtonClick)
    public WebElement TmobleSearchButtonClick;
    @FindBy(how = How.XPATH, using = galaxyNoteUltra)
    public WebElement TmoblegalaxyNoteUltra;
    @FindBy(how = How.ID, using = myAcconut)
    public WebElement TmoblemyAcconut;
    @FindBy(how = How.XPATH, using = clickLogin)
    public WebElement TmobleclickLogin;
    @FindBy(how = How.ID, using = enterEmail)
    public WebElement TmobleenterEmail;
    @FindBy(how = How.ID, using = Next)
    public WebElement TmobleNext;
    @FindBy(how = How.LINK_TEXT, using = billPay)
    public WebElement TmoblebillPay;
    @FindBy(how = How.XPATH, using = findaStore)
    public WebElement TmoblefindaStore;
    @FindBy(how = How.ID, using = findaStoreSearch)
    public WebElement TmoblefindaStoreSearch;
    @FindBy(how = How.CSS, using = findaStoreSearchClick)
    public WebElement TmoblefindaStoreSearchClick;
    @FindBy(how = How.ID, using = findaStorevalided)
    public WebElement TmoblefindaStorevalided;
    @FindBy(how = How.XPATH, using = contact$support)
    public WebElement Tmoblecontact$support;
    @FindBy(how = How.XPATH, using = contactUs)
    public WebElement TmoblecontactUs;
    @FindBy(how = How.ID, using = plans)
    public WebElement Tmobleplans;
    @FindBy(how = How.XPATH, using = Essential)
    public WebElement TmobleEssential;
    @FindBy(how = How.ID, using = Deals)
    public WebElement TmobleDeals;
    @FindBy(how = How.XPATH, using = apple)
    public WebElement Tmobleapple;
    @FindBy(how = How.LINK_TEXT, using = Prepaid)
    public WebElement TmoblePrepaid;
    @FindBy(how = How.ID, using = searchBox)
    public WebElement TmoblesearchBox;
    @FindBy(how = How.ID, using = TV)
    public WebElement TmobleTV;
    @FindBy(how = How.ID, using = TVvisioin)
    public WebElement TmobleTVvisioin;
    @FindBy(how = How.XPATH, using = galaxynote)
    public WebElement Tmoblegalaxynote;
    @FindBy(how = How.XPATH, using = AddtoCart)
    public WebElement TmobleAddtoCart;
    @FindBy(how = How.ID, using = wireless)
    public WebElement Tmoblewireless;
    @FindBy(how = How.LINK_TEXT, using = BANKING)
    public WebElement TmobleBANKING;
    @FindBy(how = How.ID, using = Coverage)
    public WebElement TmobleCoverage;
    @FindBy(how = How.XPATH, using = ourNet)
    public WebElement TmobleourNet;
    @FindBy(how = How.XPATH, using = ourNetvalided)
    public WebElement TmobleourNetvalided;
    @FindBy(how = How.XPATH, using = whatIs5G)
    public WebElement TmoblewhatIs5G;
    @FindBy(how = How.XPATH, using = whyTmoble)
    public WebElement TmoblewhyTmoble;
    @FindBy(how = How.XPATH, using = travel)
    public WebElement Tmobletravel;

    @FindBy(how = How.XPATH, using = travelValided)
    public WebElement TmobletravelValided;
    @FindBy(how = How.XPATH, using = plansmousehouvr)
    public WebElement Tmobleplansmousehouvr;
    @FindBy(how = How.XPATH, using = clickmelitary)
    public WebElement Tmobleclickmelitary;
    @FindBy(how = How.XPATH, using = seepricebearrkdown)
    public WebElement Tmobleseepricebearrkdown;
    @FindBy(how = How.ID, using = myaccount)
    public WebElement Tmoblemyaccount;
    @FindBy(how = How.XPATH, using = login)
    public WebElement Tmoblelogin;
    @FindBy(how = How.XPATH, using = forgotAccount)
    public WebElement TmobleforgotAccount;
    @FindBy(how = How.ID, using = forgotAccountbox)
    public WebElement TmobleforgotAccountbox;
    @FindBy(how = How.XPATH, using = HoliodyOn)
    public WebElement TmobleHoliodyOn;
    @FindBy(how = How.XPATH, using = HoliodyOnValided)
    public WebElement TmobleHoliodyOnValided;
    @FindBy(how = How.XPATH, using = seeAllDeals)
    public WebElement TmobleseeAllDeals;
    @FindBy(how = How.XPATH, using = iphone11)
    public WebElement Tmobleiphone11;
    @FindBy(how = How.XPATH, using = SearchbuttonClick)
    public WebElement TmobleSearchbuttonClick;
    @FindBy(how = How.XPATH, using = SearchClick)
    public WebElement TmobleSearchClick;


    public void Clickpnoes$devices() {
        TmoblePhones$devices.click();

    }

    public void validedClickpnoes$devices() {
        TmoblevarifyPhones$devices.click();


    }

    public void validedTmobleClickSearch() {
        TmobleClickSearch.click();


    }

    public void SendTmobleSearch() {
        TmobleSearch.sendKeys("Galaxy Note20 Ultra 5G");

    }

    public void TmobleSearchButton() {
        TmobleSearchButtonClick.click();

    }

    public void TmoblegalaxyNoteUltra(String expectedResult) throws InterruptedException {
        Thread.sleep(7000);
        String actualResult = TmoblegalaxyNoteUltra.getText();
        Assert.assertEquals("Not Match", expectedResult, actualResult);

    }

    public void validedTmoblemyAcconut() {
        TmoblemyAcconut.click();

    }

    public void login() throws InterruptedException {
        Thread.sleep(5000);
        TmobleclickLogin.click();

    }

    public void Email() throws InterruptedException {
        Thread.sleep(5000);
        TmobleenterEmail.sendKeys(" runa11427@gmail.com");

    }

    public void clickNextl() throws InterruptedException {
        Thread.sleep(5000);
        TmobleNext.click();

    }

    public void Tmoblebill() throws InterruptedException {
        Thread.sleep(5000);
        TmoblebillPay.click();

    }

    public void TmoblefindaStore() throws InterruptedException {
        Thread.sleep(5000);
        TmoblefindaStore.click();

    }

    public void TmoblefindaStoresearch() throws InterruptedException {
        Thread.sleep(5000);
        TmoblefindaStoreSearch.sendKeys(" 11427");

    }

    public void TmoblefindaStoreClick() throws InterruptedException {
        Thread.sleep(5000);
        TmoblefindaStoreSearchClick.click();

    }

    public void TmoblefindaStorevalided(String expectedResult) throws InterruptedException {
        Thread.sleep(7000);
        String actualResult = TmoblefindaStorevalided.getText();
        Assert.assertEquals("Not Match", expectedResult, actualResult);

    }

    public void Tmoblecontact$supportClick() throws InterruptedException {
        Thread.sleep(5000);
        Tmoblecontact$support.click();

    }

    public void contact$support(String expectedResult) throws InterruptedException {
        Thread.sleep(7000);
        String actualResult = TmoblecontactUs.getText();
        Assert.assertEquals("Not Match", expectedResult, actualResult);

    }

    public void Tmobleplans() throws InterruptedException {
        Thread.sleep(5000);
        Tmobleplans.click();
    }

    public void palnsValided() throws InterruptedException {
        Thread.sleep(7000);
        String expectedResult = "Compare Our Best Cell Phone Plans & Deals for the Family | T-Mobile";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Not Match", expectedResult, actualResult);

    }

    public void TmobleEssentialvalided(String expectedResult) throws InterruptedException {
        Thread.sleep(7000);
        String actualResult = TmobleEssential.getText();
        Assert.assertEquals("Not Match", expectedResult, actualResult);

    }

    public void TmobleDealsclick() throws InterruptedException {
        Thread.sleep(7000);
        TmobleDeals.click();

    }

    public void TmobleDealsvalided() throws InterruptedException {
        String expectedResult = "Our Best Deals & Promotions on Cell Phones, Devices & Plans | T-Mobile";
        Thread.sleep(7000);
        String actualResult = driver.getTitle();
        Assert.assertEquals("Not Match", expectedResult, actualResult);

    }

    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = TmobleDeals;
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
            hover.click().build().perform();
        } catch (Exception ex) {
            System.out.println("unalbe to move mouse");

        }

    }

    public void ClickApplle() {
        Tmobleapple.click();

    }

    public void appleTitle() throws InterruptedException {
        String expectedResult = "Deals on New iPhones, iPads & Apple Watches | T-Mobile";
        Thread.sleep(7000);
        String actualResult = driver.getTitle();
        Assert.assertEquals("Not Match", expectedResult, actualResult);

    }

    public void TmoblePrepaid() {
        TmoblePrepaid.click();

    }

    public void TmoblePrepaidvalidated(String expectedResult) {
        String actualResult = TmoblePrepaid.getText();
        Assert.assertEquals("Not match", actualResult, expectedResult);
    }


    public void SearchBoxValided(String expectedResult) {
        String actualResult = TmoblePrepaid.getText();
        Assert.assertEquals("Not match", actualResult, expectedResult);
    }

    public void enterSearchKeyword(String searchItem) {
        TmobleSearch.sendKeys(searchItem);
    }

    public void validateSearchText(String expectedResult) {
        String actualResult = TmoblesearchBox.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);

    }

    public void TmobleTVCheck() {
        TmobleTV.click();

    }


    public void TmobleTVCheckValided(String expectedResult) {
        String actualResult = TmobleTVvisioin.getText();
        Assert.assertEquals("Not match", actualResult, expectedResult);
    }

    public void Tmoblegalaxynote() {
        Tmoblegalaxynote.click();

    }

    public void TmobleAddtoCart() {
        TmobleAddtoCart.click();

    }

    public void Tmoblewireless() {
        Tmoblewireless.click();
    }

    public void TmoblewirelessValided() {
        String expectedResult = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Not match", actualResult, expectedResult);
    }

    public void TmobleBANKING() {
        TmobleBANKING.click();
    }

    public void TmobleBANKINGvalided(String expectedResult) throws InterruptedException {
        Thread.sleep(5000);
        String actualResult = TmobleBANKING.getText();
        Assert.assertEquals("Not match", actualResult, expectedResult);
    }

    public void coverage() {
        Actions action = new Actions(driver);
        WebElement main = TmobleCoverage;
        action.moveToElement(main).perform();
        TmobleourNet.click();
    }


    public void TmobleourNetvalided(String expectedResult) throws InterruptedException {
        Thread.sleep(5000);
        String actualResult = TmobleourNetvalided.getText();
        Assert.assertEquals("Not match", actualResult, expectedResult);
    }

    public void TmoblewhatIs5G() {
        TmoblewhatIs5G.click();
    }

    public void TmoblewhatIs5Gtvalided(String expectedResult) throws InterruptedException {
        Thread.sleep(5000);
        String actualResult = TmoblewhatIs5G.getText();
        Assert.assertEquals("Not match", actualResult, expectedResult);
    }

    public void TmoblewhyTmoblesubmenuvalided() {
        Actions act = new Actions(driver);
        WebElement tmoble = TmoblewhyTmoble;
        act.moveToElement(tmoble).perform();
        Tmobletravel.click();
    }

    public void TmobletravelValided(String exp) {
        String act = TmobletravelValided.getText();
        Assert.assertEquals("Failed", act, exp);


    }

    public void Tmobleplansmousehouvr() {
        Actions act = new Actions(driver);
        WebElement tmoble = Tmobleplansmousehouvr;
        act.moveToElement(tmoble).perform();

    }

    public void clickmilitary$vetarians() {
        Tmobleclickmelitary.click();

    }

    public void Tmobleseepricebearrkdown() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1400)");
        Thread.sleep(5000);
        Tmobleseepricebearrkdown.click();

    }

    public void myaccount() {
        Tmoblemyaccount.click();


    }

    public void Tmoblelogin() {

        Tmoblelogin.click();


    }

    public void TmobleforgotAccount() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1400)");
        TmobleforgotAccount.click();


    }

    public void TmobleforgotAccountbox() throws InterruptedException {
        Thread.sleep(5000);
        TmobleforgotAccountbox.sendKeys(" runa123456576587");


    }

    public void holidayOn() {
        TmobleHoliodyOn.click();
    }


    public void TmobleHoliodyOnValided(String exp) {
        String act = TmobleHoliodyOnValided.getText();
        Assert.assertEquals("Failed", act, exp);


    }

    public void Tmobledealsmousehover() {
        Actions act = new Actions(driver);
        WebElement tmoble = TmobleDeals;
        act.moveToElement(tmoble).perform();

    }


    public void seeallDeals() {
        TmobleseeAllDeals.click();

    }

    public void seeallDealsValided(String exp) {
        String act = "TmobleseeAllDeals";
        act = driver.getTitle();
        Assert.assertEquals("Failed", act, exp);


    }

    public void TmobleSearchbuttonClick() {
        TmobleSearchbuttonClick.click();

    }


    public void TmobleSearch() {
        TmobleSearch.sendKeys("iphone 11 pro max");

    }

    public void TmobleSearchClick() {
        TmobleSearchClick.click();

    }

    public void iphone11() {
        Tmobleiphone11.click();

    }


    public void iphone11valided(String exp) {
        String act = "Tmobleiphone11";
        act = driver.getTitle();
        Assert.assertEquals("Failed", act, exp);

    }


}



