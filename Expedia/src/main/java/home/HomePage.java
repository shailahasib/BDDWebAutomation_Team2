package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = SearchBox)
    public WebElement  expediaSearchBox;

  @FindBy(how = How.XPATH, using =SearchBoxSelectBangladesh)
    public WebElement  expediaSearchBoxSelectBangladesh;


@FindBy(how = How.XPATH, using = clicksearch)
    public WebElement  expediaclicksearchbutton;
@FindBy(how = How.ID, using =sendSearcBox)
    public WebElement  expediasendSearcBox;
@FindBy(how = How.XPATH, using =leavinfrom)
    public WebElement  expedialeavinfrom;
@FindBy(how = How.XPATH, using =leavinfrom)
    public WebElement  expedialeavinfrom1;
@FindBy(how = How.XPATH, using = flight)
    public WebElement  expediaflight;
@FindBy(how = How.XPATH,using =departing)
    public WebElement  expediadeparting;
@FindBy(how = How.CSS,using =cars)
    public WebElement  expediacars;
//@FindBy(how = How.XPATH,using =pickUp)
//    public WebElement  expediapickUp;
@FindBy(how = How.XPATH,using = pickUplocation)
    public WebElement  expediapickUplocation;
@FindBy(how = How.XPATH,using =buildApagckae)
    public WebElement  expediabuildApagckae;
@FindBy(how = How.XPATH,using = thingsToDo)
    public WebElement  expediathingsToDo;
@FindBy(how = How.XPATH,using =expediaSignin)
    public WebElement  expediaexpediaSignin;
@FindBy(how = How.LINK_TEXT,using =expediainsideSignin)
    public WebElement  expediaexpediainsideSignin;

@FindBy(how = How.ID,using =emaildKeys)
    public WebElement  expediaemaildKeys;
@FindBy(how = How.ID,using =passldKeys)
    public WebElement  expediapassldKeys;
@FindBy(how = How.XPATH,using =signinclick)
    public WebElement  expediasigninclick;

//@FindBy(how = How.CLASS_NAME,using =pickdate)
//    public WebElement  expediapickdate;
//@FindBy(how = How.XPATH,using =monthpickdate)
//    public WebElement  expediamonthpickdate;
//
//@FindBy(how = How.XPATH,using =monthpickdateclick)
//    public WebElement  expediamonthpickdateclick;
//



public void expediaSearchBoxCheck(){
    expediaSearchBox.click();

}public void expediasendSearcBoxCheck(){
        expediasendSearcBox.sendKeys("Bangladesh");

}
public void expediaSearchBoxSendLocation(){
    expediaSearchBoxSelectBangladesh.click();

}
public void expediaclicksearchbutton(){
    expediaclicksearchbutton.click();

}

public void expediaclicksearcvalided(String exp) throws InterruptedException {
    Thread.sleep(5000);
  String act=" expediasendSearcBox";
act=driver.getTitle();
    Assert.assertEquals("Failed",act,exp);
}


    public void  expedialeavinfrom(){
        expedialeavinfrom1.click();

    }

    public void  expediaflight(){
        expediaflight.click();

    }
    public void  expediadeparting(){
        expediadeparting.click();

    }
    public void calender() throws InterruptedException {
       ;

//    while ( !expediamonthpickdate.getText().contains("December")){
//        expediamonthpickdateclick.click();

//    }
//    Thread.sleep(5000);
// List<WebElement> dates= driver.findElements(By.className("uitk-new-date-picker-day"));
//  int count =driver.findElements(By.className("uitk-new-date-picker-day")).size();
//for (int i=0;i<count;i++){
//   String text= driver.findElements(By.className("uitk-new-date-picker-day")).get(i).getText();
//   if(text.equalsIgnoreCase("23")){
//       driver.findElements(By.className("uitk-new-date-picker-day")).get(i).click();
//       break;
//   }
//
//        }

    }

public void carsClick() throws InterruptedException {
    Thread.sleep(8000);
    expediacars.click();


}
//public void expediapickUp() throws InterruptedException {
//    Thread.sleep(5000);
//    expediapickUp.sendKeys("QueensVillage");
//
//
//}
public void pickUplocation() throws InterruptedException {
    Thread.sleep(5000);
    expediapickUplocation.click();


}

    public void  expediabuildApagckaecheck() throws InterruptedException {
        Thread.sleep(8000);
        expediabuildApagckae.click();
    }
public void  expediathingsToDo() throws InterruptedException {
        Thread.sleep(7000);
    expediathingsToDo.click();
    }

public void expediaexpediaSignin(){
    expediaexpediaSignin.click();
}


    public void sendKeysinbox1( String emailList ) {
        expediaemaildKeys.sendKeys(emailList);
    }

    public void sendKeysinbox (String passwordList) {
        expediapassldKeys.sendKeys(passwordList);
    }
public void expediasigninclick(){

    expediasigninclick.click();
}
public void expediaexpediainsideSignin(){
    expediaexpediainsideSignin.click();
}







}
