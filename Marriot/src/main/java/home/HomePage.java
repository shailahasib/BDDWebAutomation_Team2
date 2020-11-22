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
    @FindBy(how= How.ID,using =dates)
    WebElement MarriotCalender;
    @FindBy(how= How.XPATH,using =datesclick)
    WebElement Marriotdatesclick;
 @FindBy(how= How.XPATH,using =siginIn)
    WebElement MarriotsiginIn;
 @FindBy(how= How.ID,using =Sendemail)
    WebElement MarriotSendemail;
 @FindBy(how= How.ID,using =password)
    WebElement Marriotpassword;
 @FindBy(how= How.CSS,using =signIn)
    WebElement MarriotsignIn;
 @FindBy(how= How.XPATH,using =signInorJoin)
    WebElement MarriotsignInorJoin;
 @FindBy(how= How.XPATH,using =findHotel)
    WebElement MarriotfindHotel;
 @FindBy(how= How.ID,using =destination)
    WebElement Marriotdestination;
 @FindBy(how= How.XPATH,using =rates)
    WebElement Marriotrates;
 @FindBy(how= How.XPATH,using =ratesNone)
    WebElement MarriotratesNone;
@FindBy(how= How.XPATH,using =findHotels)
    WebElement MarriotfindHotels;
@FindBy(how= How.XPATH,using =specialoffer)
    WebElement Marriotspecialoffer;
@FindBy(how= How.XPATH,using =findandreserv)
    WebElement Marriotfindandreserv;
@FindBy(how= How.XPATH,using =aboutMarriot)
    WebElement MarriotaboutMarriot;
@FindBy(how= How.ID,using =destinations)
    WebElement Marriotdestinations;
@FindBy(how= How.XPATH,using =specialrests)
    WebElement Marriotspecialrests;
@FindBy(how= How.LINK_TEXT,using =FindReserve)
    WebElement MarriotFindReserve;
@FindBy(how= How.XPATH,using =destinationbox)
    WebElement Marriotdestinationbox;
@FindBy(how= How.XPATH,using =specialBox)
    WebElement MarriotspecialBox;
@FindBy(how= How.XPATH,using =vactions)
    WebElement Marriotvactions;
@FindBy(how= How.LINK_TEXT,using =homesAndVillas)
    WebElement MarriothomesAndVillas;


    @FindBy(how = How.XPATH, using = clickOnCalendarFromDate)
    public WebElement clickOnCalendarFrom;

    @FindBy(how = How.XPATH, using = destinationBoxOnHomePage)
    public WebElement destinationBox;

    @FindBy(how = How.XPATH, using = destinationBoxForTyping)
    public WebElement destinationTyping;

    @FindBy(how = How.XPATH, using = allDatesOnTheEnabledMonth)
    public List<WebElement> allDatesOnFirstCal;

    @FindBy(how = How.XPATH, using = monthEnableDisplay)
    public WebElement monthEnabled;
    @FindBy(how = How.XPATH, using = nextMonthArrow)
    public WebElement nextMonth;

    @FindBy(how = How.XPATH, using = entireCalendarBox)
    public WebElement entireCalendar;

    @FindBy(how = How.XPATH, using = previousMonthArrow)
    public WebElement previousMonth;








    public void DatesClick() throws InterruptedException {
    Thread.sleep(5000);
    ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
    Thread.sleep(5000);
    Marriotdatesclick.click();



}
public void datePicker() throws InterruptedException {

    Thread.sleep(5000);
  String flag="False";
  while (flag=="False"){
      if(driver.findElements(By.xpath("//*[@id='find-a-hotel-homePage-form']/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[3]/td[7]/div/a")).size()>0){

driver.findElement(By.xpath("//*[@id='find-a-hotel-homePage-form']/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[3]/td[7]/div/a")).click();
flag="true";
      }
      else {Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='find-a-hotel-homePage-form']/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[2]/table/thead/tr[1]/th[3]")).click();
      }
      }
  }

public void signIn() throws InterruptedException {Thread.sleep(5000);
    MarriotsignInorJoin.click();
}
public void MarriotSendemail(String Searchkeys) throws InterruptedException {Thread.sleep(5000);
    MarriotsiginIn.sendKeys(Searchkeys);
}
public void Marriotpassword(String Searchkeys) throws InterruptedException {Thread.sleep(5000);
    Marriotpassword.sendKeys(Searchkeys);
}
public void signInClick() throws InterruptedException {Thread.sleep(5000);
    MarriotsignIn.click();
}

public void MarriotfindHotel() throws InterruptedException {Thread.sleep(5000);
    ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
    MarriotfindHotel.click();

}
public void Marriotdestination() throws InterruptedException {Thread.sleep(5000);
    ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
    Marriotdestination.sendKeys("bangladesh");

}
public void Marriotrates() throws InterruptedException {Thread.sleep(5000);
    Marriotrates.click();

}
public void MarriotratesNone() throws InterruptedException {Thread.sleep(5000);
    MarriotratesNone.click();

}
public void MarriotfindHotels() throws InterruptedException {Thread.sleep(5000);
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

public void findresrve(){
    Marriotdestinations.sendKeys("bangladesh");


}
public void Marriotspecialrests(){
    Marriotspecialrests.click();


}
public void MarriotFindReserve(){
    MarriotFindReserve.click();


}
public void Marriotdestinationbox(){
    Marriotdestinationbox.sendKeys("bangladeh");


}
public void MarriotspecialBox(){
    MarriotspecialBox.click();


}
public void Marriotvactions(){
    Marriotvactions.click();


}
public void MarriothomesAndVillas(){
    MarriothomesAndVillas.click();


}
public void MarriothomesAndVillasValided(String exp){
 String act= "MarriothomesAndVillas";
 act=driver.getTitle();
    Assert.assertEquals("Failed", act,exp);


}

    public void pickStartDate(String month, String date) {

        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOf(entireCalendar));
        while (true) {
            String monthText = monthEnabled.getText();
            if (monthText.equalsIgnoreCase(month)) {
                break;
            } else {
                nextMonth.click();
            }
        }
        for (WebElement allDates : allDatesOnFirstCal) {

            while (allDates.equals(date)) {
                for(int i=0; i<=1; i++) {
                    allDates.click();
                    break;
                }
            }
        }

    }








}











