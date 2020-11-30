package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.ID, using = dates)
    WebElement MarriotCalender;
    @FindBy(how = How.XPATH, using = datesclick)
    WebElement Marriotdatesclick;
    @FindBy(how = How.XPATH, using = siginIn)
    WebElement MarriotsiginIn;
    @FindBy(how = How.ID, using = Sendemail)
    WebElement MarriotSendemail;
    @FindBy(how = How.ID, using = password)
    WebElement Marriotpassword;
    @FindBy(how = How.CSS, using = signIn)
    WebElement MarriotsignIn;
    @FindBy(how = How.XPATH, using = signInorJoin)
    WebElement MarriotsignInorJoin;
    @FindBy(how = How.XPATH, using = findHotel)
    WebElement MarriotfindHotel;
    @FindBy(how = How.ID, using = destination)
    WebElement Marriotdestination;
    @FindBy(how = How.XPATH, using = rates)
    WebElement Marriotrates;
    @FindBy(how = How.XPATH, using = ratesNone)
    WebElement MarriotratesNone;
    @FindBy(how = How.XPATH, using = findHotels)
    WebElement MarriotfindHotels;
    @FindBy(how = How.XPATH, using = specialoffer)
    WebElement Marriotspecialoffer;
    @FindBy(how = How.XPATH, using = findandreserv)
    WebElement Marriotfindandreserv;
    @FindBy(how = How.XPATH, using = aboutMarriot)
    WebElement MarriotaboutMarriot;
    @FindBy(how = How.ID, using = destinations)
    WebElement Marriotdestinations;
    @FindBy(how = How.XPATH, using = specialrests)
    WebElement Marriotspecialrests;
    @FindBy(how = How.XPATH, using = specialBox)
    WebElement MarriotspecialBox;
    @FindBy(how = How.XPATH, using = vactions)
    WebElement Marriotvactions;
    @FindBy(how = How.LINK_TEXT, using = homesAndVillas)
    WebElement MarriothomesAndVillas;
    @FindBy(how = How.XPATH, using = clickOnCalendarFromDate)
    public WebElement clickOnCalendarFrom;
    @FindBy(how = How.XPATH, using = destinationBoxOnHomePage)
    public WebElement destinationBox;
    @FindBy(how = How.XPATH, using = allDatesOnTheEnabledMonth)
    public List<WebElement> sleectdatefromfirstCal;
    @FindBy(how = How.XPATH, using = monthEnableDisplay)
    public WebElement monthEnabled;
    @FindBy(how = How.XPATH, using = nextMonthArrow)
    public WebElement selectnextMonth;
    @FindBy(how = How.XPATH, using = entireCalendarBox)
    public WebElement entireCalendar;
    @FindBy(how = How.XPATH, using = previousMonthArrow)
    public WebElement previousMonth;
    @FindBy(how = How.XPATH, using = findAndReserveTab)
    public WebElement MarriotfindAndReserveTab;
    @FindBy(how = How.XPATH, using = destinationBoxWhereToGo)
    public WebElement MarriotdestinationBox;
    @FindBy(how = How.XPATH, using = FirstdestinationBox)
    public WebElement MarriotFirstdestinationBox;
    @FindBy(how = How.ID, using = selectNyc)
    public WebElement MarriotselectNyc;
    @FindBy(how = How.XPATH, using = signInclick)
    public WebElement MarriotsignInclick;
    @FindBy(how = How.ID, using = emailId)
    public WebElement MarriotemailId;
    @FindBy(how = How.ID, using = passwordId)
    public WebElement MarriotpasswordId;
    @FindBy(how = How.XPATH, using = mytrips)
    public WebElement Marriotmytrips;
    @FindBy(how = How.ID, using = confirmationNumber)
    public WebElement MarriotconfirmationNumber;
    @FindBy(how = How.ID, using = chekindate)
    public WebElement Marriotchekindate;
    @FindBy(how = How.XPATH, using = chekindatepicker)
    public WebElement Marriotchekindatepicker;
    @FindBy(how = How.ID, using = fisrstName)
    public WebElement MarriotfisrstName;
    @FindBy(how = How.ID, using = lastName)
    public WebElement MarriotlastName;
    @FindBy(how = How.ID, using = find)
    public WebElement Marriotfind;
    @FindBy(how = How.XPATH, using = signin)
    public WebElement Marriotsignin;
    @FindBy(how = How.ID, using = email)
    public WebElement Marriotemail;
    @FindBy(how = How.ID, using = passworddown)
    public WebElement Marriotpassworddown;
    @FindBy(how = How.ID, using = signinclick)
    public WebElement Marriotsigninclick;
    @FindBy(how = How.LINK_TEXT, using = forgotAccount)
    public WebElement MarriotforgotAccount;
    @FindBy(how = How.ID, using = forgotaccountEmali)
    public WebElement MarriotforgotaccountEmali;
    @FindBy(how = How.ID, using = forgotaccountFirtName)
    public WebElement MarriotforgotaccountFirtName;
    @FindBy(how = How.ID, using = forgotaccountLastName)
    public WebElement MarriotforgotaccountLastName;
    @FindBy(how = How.XPATH, using = selectUsa)
    public WebElement MarriotselectUsa;
    @FindBy(how = How.ID, using = selectUsaclick)
    public WebElement MarriotselectUsaclick;
    @FindBy(how = How.ID, using = zipcode)
    public WebElement Marriotzipcode;
    @FindBy(how = How.XPATH, using = submit)
    public WebElement Marriotsubmit;
    @FindBy(how = How.XPATH, using = clickFirstSignIn)
    public WebElement signinbuttonClick;
    @FindBy(how = How.XPATH, using = mariotBonvoy)
    public WebElement mariotBonvoyclick;
    @FindBy(how = How.XPATH, using = mariotBonvoyCreditCard)
    public WebElement mariotmariotBonvoyCreditCard;
    @FindBy(how = How.XPATH, using = vcation)
    public WebElement mariotVcation;
    @FindBy(how = How.XPATH, using = homesAndVilas)
    public WebElement mariotHomesAndVilas;
    @FindBy(how = How.XPATH, using = allpackages)
    public WebElement mariotallpackages;
    @FindBy(how = How.XPATH, using = marriotVacationClub)
    public WebElement mariotVrriotVacationClub;


    public void DatesClick() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        Thread.sleep(5000);
        Marriotdatesclick.click();
    }
    public void datePicker() throws InterruptedException {
        Thread.sleep(5000);
        String flag = "False";
        while (flag == "False") {
            if (driver.findElements(By.xpath("//*[@id='find-a-hotel-homePage-form']/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[3]/td[7]/div/a")).size() > 0) {

                driver.findElement(By.xpath("//*[@id='find-a-hotel-homePage-form']/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[3]/td[7]/div/a")).click();
                flag = "true";
            } else {
                Thread.sleep(5000);
                driver.findElement(By.xpath("//*[@id='find-a-hotel-homePage-form']/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[2]/table/thead/tr[1]/th[3]")).click();
            }
        }
    }

    public void signIn() throws InterruptedException {
        Thread.sleep(5000);
        MarriotsignInorJoin.click();
    }
    public void MarriotSendemail(String Searchkeys) throws InterruptedException {
        Thread.sleep(5000);
        MarriotsiginIn.sendKeys(Searchkeys);
    }

    public void Marriotpassword(String Searchkeys) throws InterruptedException {
        Thread.sleep(5000);
        Marriotpassword.sendKeys(Searchkeys);
    }
    public void signInClick() throws InterruptedException {
        Thread.sleep(5000);
        MarriotsignIn.click();
    }
    public void MarriotfindHotel() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        MarriotfindHotel.click();
    }
    public void Marriotdestination() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        Marriotdestination.sendKeys("bangladesh");
    }
    public void Marriotrates() throws InterruptedException {
        Thread.sleep(5000);
        Marriotrates.click();
    }
    public void MarriotratesNone() throws InterruptedException {
        Thread.sleep(5000);
        MarriotratesNone.click();
    }
    public void MarriotfindHotels() throws InterruptedException {
        Thread.sleep(5000);
        MarriotfindHotels.click();
    }
    public void clickOnElement(String locator) {
        try {
            MarriotsiginIn.click();
        } catch (Exception ex) {
            try {
                Marriotspecialoffer.click();
            } catch (Exception ex2) {
                try {
                    Marriotfindandreserv.click();
                } catch (Exception ex3) {
                    MarriotaboutMarriot.click();
                }
            }
        }
    }

    public void findresrve() {
        Marriotdestinations.sendKeys("bangladesh");
    }
    public void Marriotspecialrests() {
        Marriotspecialrests.click();
    }
    public void MarriotspecialBox() {
        MarriotspecialBox.click();
    }
    public void Marriotvactions() {
        Marriotvactions.click();
    }
    public void MarriothomesAndVillas() {
        MarriothomesAndVillas.click();
    }
    public void MarriothomesAndVillasValided(String exp) {
        String act = "MarriothomesAndVillas";
        act = driver.getTitle();
        Assert.assertEquals("Failed", act, exp);
    }
    public void findAReserv() throws InterruptedException {
        Thread.sleep(5000);
        MarriotfindAndReserveTab.click();
    }
    public void MarriotdestinationBox() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(MarriotdestinationBox));
        element.sendKeys("NyC");
    }
    public void pickStartDate(String month, String date) {
        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOf(entireCalendar));
        while (true) {
            String monthText = monthEnabled.getText();
            if (monthText.equalsIgnoreCase(month)) {
                break;
            } else {
                selectnextMonth.click();

            }
        }

        for (WebElement allDates : sleectdatefromfirstCal) {

            while (allDates.equals(date)) {
                for (int i = 0; i <= 1; i++) {
                    allDates.click();
                    break;
                }
            }
        }

    }

    public void MarriotFirstdestinationBox() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        MarriotFirstdestinationBox.sendKeys("Nyc");
        MarriotselectNyc.click();
    }
    public void marriotsignin() throws InterruptedException {
        Thread.sleep(5000);
        MarriotsignInclick.click();
    }
    public void enterEmail(String emaillist) throws InterruptedException {

        MarriotemailId.sendKeys(emaillist);
    }
    public void passwordlist(String passwordlist) throws InterruptedException {
        MarriotpasswordId.sendKeys(passwordlist);
    }
    public void myTrips() {
        Marriotmytrips.click();
    }

    public void MarriotconfirmationNumber(String numberList) throws InterruptedException {
        MarriotconfirmationNumber.sendKeys(numberList);
    }
    public void clickDate() {
        Marriotchekindate.click();
    }

    public void Marriotchekindater(String numberList) throws InterruptedException {

        Marriotchekindatepicker.sendKeys(numberList);
    }
    public void MarriotfisrstName(String fName) {
        MarriotfisrstName.sendKeys(fName);
    }
    public void MarriotlastName(String lastName) {
        MarriotlastName.sendKeys(lastName);
    }
    public void Marriotfind() {
        Marriotfind.click();
    }

    public void Marriotsignin() throws InterruptedException {
        Marriotsignin.click();
    }
    public void enterKeywords(WebElement element, String value) throws InterruptedException {
        sleepFor(5);
        element.sendKeys(value);
    }
    public void enterKeywordsclick(WebElement element, String value) {
        element.click();
    }

    public void Marriotsigninclick() throws InterruptedException {
        Marriotsigninclick.click();
        Thread.sleep(5000);
    }

    public void MarriotforgotAccount() {
        MarriotforgotAccount.click();
    }
    public void sendKeysinbox(WebElement element, String value1, String vaLue2) {
        element.sendKeys(value1, vaLue2);
    }


    public void lastSignin() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        signinbuttonClick.click();
    }
    public void mariotBonVoy() {
        mariotBonvoyclick.click();
    }
    public void mariotBonVoyCreditCrad() {
        mariotmariotBonvoyCreditCard.click();
    }
    public void mariotVcationClick() {
        mariotVcation.click();
    }

    public void mariotHomesAndVilas() {
        mariotHomesAndVilas.click();
    }
    public void mariotMriotallpackages() {
        mariotallpackages.click();
    }
    public void mariotVrriotVacationClub() {
        mariotVrriotVacationClub.click();
    }
}









