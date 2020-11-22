package home;


import common.WebAPI;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.LINK_TEXT, using = memberAndservices)
    public WebElement BcBSmemberAndservices;
    @FindBy(how = How.LINK_TEXT, using = AccessMyBenefits)
    public WebElement BcBSAccessMyBenefits;
    @FindBy(how = How.XPATH, using = clicksearchbutton)
    public WebElement BcBSclicksearchbutton;
    @FindBy(how = How.ID, using = enterSearchKey)
    public WebElement BcBSenterSearchKey;
    @FindBy(how = How.XPATH, using = clickSearch)
    public WebElement BcBSclickSearch;
    @FindBy(how = How.LINK_TEXT, using = WomenHealth)
    public WebElement BcBSWomenHealth;
    @FindBy(how = How.LINK_TEXT, using = Medicare)
    public WebElement BcBSMedicare;
    @FindBy(how = How.LINK_TEXT, using = FindDoctor)
    public WebElement BcBSFindDoctor;
    @FindBy(how = How.LINK_TEXT, using = FindDoctor)
    public WebElement BcBSFindDoctormovemouse;
    @FindBy(how = How.XPATH, using = FindDoctoroutside)
    public WebElement BcBSFindDoctoroutside;
    @FindBy(how = How.XPATH, using = accessMybenifits)
    public WebElement BcBSaccessMybenifits;
    @FindBy(how = How.ID, using = accessMybenifitsBox)
    public WebElement BcBSaccessMybenifitsBox;
    @FindBy(how = How.XPATH, using = accessMybenifitsGo)
    public WebElement BcBSaccessMybenifitsGo;
    @FindBy(how = How.XPATH, using = getText)
    public WebElement BcBSgetText;
    @FindBy(how = How.LINK_TEXT, using = theHeathOfAmerica)
    public WebElement BcBStheHeathOfAmerica;
    @FindBy(how = How.XPATH, using = theHeathOfAmericaSearch)
    public WebElement BcBStheHeathOfAmericaSearch;
    @FindBy(how = How.XPATH, using = click)
    public WebElement BcBSclick;
    @FindBy(how = How.LINK_TEXT, using = womens)
    public WebElement BcBwomens;
    @FindBy(how = How.XPATH, using = menu)
    public WebElement BcBsmenu;
    @FindBy(how = How.LINK_TEXT, using = employes)
    public WebElement BcBsemploye;
    @FindBy(how = How.LINK_TEXT, using = ContactUs)
    public WebElement BcBsContactUs;
    @FindBy(how = How.LINK_TEXT, using = IndividualsFamilies)
    public WebElement BcBsIndividualsFamilies;
    @FindBy(how = How.ID, using = editzip)
    public WebElement BcBseditzip;
    @FindBy(how = How.XPATH, using = editzipGo)
    public WebElement BcBseditzipGo;
    @FindBy(how = How.LINK_TEXT, using = learn)
    public WebElement BcBslearn;
    @FindBy(how = How.XPATH, using = learnvlided)
    public WebElement BcBslearnvlided;
    @FindBy(how = How.LINK_TEXT, using = healthofAmerrica)
    public WebElement BcBshealthofAmerrica;
    @FindBy(how = How.LINK_TEXT, using = data$Reported)
    public WebElement BcBsdata$Reported;
    @FindBy(how = How.LINK_TEXT, using = VisitMemberServices)
    public WebElement BcBsVisitMemberServices;
    @FindBy(how = How.LINK_TEXT, using = privacyPolicy)
    public WebElement BcBsprivacyPolicy;
@FindBy(how = How.ID, using = chooseState)
    public WebElement BcBschooseState;
@FindBy(how = How.XPATH, using =chosestateClick)
    public WebElement BcBschosestateClick;


    public void memberAndServicemouseHouver() {


        Actions act = new Actions(driver);
        WebElement tmoble = BcBSmemberAndservices;
        act.moveToElement(tmoble).perform();

    }

    public void memberAndServiceClick() {
        BcBSAccessMyBenefits.click();

    }

    public void memberAndServiceValided(String exp) {
        String act = "BcBSAccessMyBenefits";
        act = driver.getTitle();
        Assert.assertEquals("Failed", act, exp);

    }

    public void BcBSclicksearchbutton() {
        BcBSclicksearchbutton.click();

    }

    public void BcBSMedicare() {
        BcBSMedicare.click();

    }

    public void BcBSenterSearchKey(String searchItem) throws InterruptedException {
        Thread.sleep(5000);
        BcBStheHeathOfAmericaSearch.sendKeys(searchItem);
    }

    public void clicSearch() throws InterruptedException {
        Thread.sleep(5000);
        BcBSclicksearchbutton.click();
    }

    public void FindDr() throws InterruptedException {
        Thread.sleep(5000);
        Actions act = new Actions(driver);
        WebElement tmoble = BcBSFindDoctormovemouse;
        act.moveToElement(tmoble).perform();

    }

    public void outsidedr() throws InterruptedException {
        Thread.sleep(5000);
        BcBSFindDoctoroutside.click();

    }


    public void outsidedrvalided(String exp) throws InterruptedException {
        Thread.sleep(5000);

        String act = "BcBSFindDoctoroutside";
        act = driver.getTitle();
        Assert.assertEquals("Failed", "act", exp);


    }

    public void BcBSaccessMybenifits() {
        BcBSaccessMybenifits.click();

    }

    public void BcBSaccessMybenifitsBox() {
        BcBSaccessMybenifitsBox.sendKeys("234");

    }

    public void BcBSaccessMybenifitsGo() {
        BcBSaccessMybenifitsGo.click();

    }

    public void getText() {
        System.out.println();
        BcBSgetText.getText();

    }


    public void BcBStheHeathOfAmerica() {
        BcBStheHeathOfAmerica.click();

    }

    public void BcBStheHeathOfAmericaSearch() {
        BcBStheHeathOfAmericaSearch.sendKeys("Women's Health");

    }

    public void BcBSclick() {
        BcBSclick.click();

    }

    public void searchtex(String exp) {
        String act = BcBwomens.getText();

        Assert.assertEquals("Failed", act, exp);


    }

    public void getTitle(String exp) {
        String act = BcBSenterSearchKey.toString();
        act = driver.getTitle();
        Assert.assertEquals("Faied", "act", "exp");

    }

    public void menu() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        BcBsmenu.click();
    }

    public void employes() {
        BcBsemploye.click();


    }

    public void BcBsContactUs() throws InterruptedException {
        BcBsContactUs.click();
        Thread.sleep(5000);
    }

    public void clear1() throws InterruptedException {
        Thread.sleep(5000);
        BcBStheHeathOfAmericaSearch.sendKeys("Women's Health");
        BcBStheHeathOfAmericaSearch.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
        BcBStheHeathOfAmericaSearch.clear();


    }

    public void clear2() throws InterruptedException {


        Thread.sleep(5000);
        BcBStheHeathOfAmericaSearch.sendKeys("Behavire health");
        BcBStheHeathOfAmericaSearch.sendKeys(Keys.RETURN);
        try {
            Thread.sleep(5000);
            BcBStheHeathOfAmericaSearch.clear();

        } catch (Exception e) {
            System.out.println("Unablbe to located");
        }

    }


    public void typeOnInputBox() {

        try {
            Thread.sleep(5000);
            BcBStheHeathOfAmericaSearch.sendKeys("Behavire health");
            ;
        } catch (Exception ex1) {
            System.out.println("ID locator didn't work");
        }
        try {
            BcBStheHeathOfAmericaSearch.sendKeys("MentalHealth");
            ;
        } catch (Exception ex2) {
            System.out.println("Name locator didn't work");
        }
        try {
            BcBStheHeathOfAmericaSearch.sendKeys("Behavire Health");
            ;
        } catch (Exception ex3) {
            System.out.println("CSS locator didn't work");
        }
    }

    public void indivudal() throws InterruptedException {
        Thread.sleep(5000);
        BcBsIndividualsFamilies.click();
    }

    public void BcBseditzip() throws InterruptedException {
        Thread.sleep(5000);
        BcBseditzip.sendKeys(" 11427");
    }

    public void editzipGo() throws InterruptedException {
        Thread.sleep(5000);
        BcBseditzipGo.click();
    }


    public void alertDismis() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.confirm('Alert.dismiss in 5 sec')");
        try {
            Alert confirmation = driver.switchTo().alert();
            String alertText = confirmation.getText();
            System.out.println("Alert text is:" + alertText);
            Thread.sleep(5000);
            confirmation.dismiss();
        } catch (InterruptedException e) {
            // e.printStackTrace();
            System.out.println(e);

        }
    }

    public void alertAccept() {
        JavascriptExecutor jsx1 = (JavascriptExecutor) driver;
        jsx1.executeScript("window.confirm('Alert.accept in 5 sec')");
        try {
            Alert confirmation = driver.switchTo().alert();
            String alertText = confirmation.getText();
            System.out.println("Alert text is:" + alertText);
            Thread.sleep(5000);
            confirmation.accept();
        } catch (InterruptedException e) {
            // e.printStackTrace();
            System.out.println(e);

        }
    }

    public void learncheck() {
        BcBslearn.click();

    }

    public void BcBslearnvlided(String exp) {
        String act = BcBslearnvlided.getText();
        Assert.assertEquals("Failed", act, exp);

    }


    public void healthofamerica() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        BcBshealthofAmerrica.click();

    }

    public void data$reports() {
        BcBsdata$Reported.click();

    }

    public void data$reports(String exp) {
        String act = "BcBsdata$Reported";
        act = driver.getTitle();
        Assert.assertEquals("Failed", act, exp);
    }

    public void scrollDown() throws InterruptedException {
        Thread.sleep(5000);

        ((JavascriptExecutor) driver).executeScript("scroll(0,1600)");

    }

    public void visitMember() {
        BcBsVisitMemberServices.click();

    }

    public void visitMemberValied(String exp) {
        String act = "BcBsVisitMemberServices";
        act = driver.getTitle();
        Assert.assertEquals("Failed", act, exp);

    }


    public void healthOfAmerica() {
        BcBStheHeathOfAmerica.click();

    }

    public void BcBStheHeathOfAmericasearchKey() {
        BcBStheHeathOfAmericaSearch.sendKeys("mentalHealth");

    }

    public void BcBSclickwait() {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(BcBSclick));
        element.click();

    }


    public void waitUntilVisible() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(BcBStheHeathOfAmericaSearch));
        element.sendKeys("mentalHealth");
    }

    public void privacyPolicyValided(String exp) throws InterruptedException {
        Thread.sleep(5000);
        String act = BcBsprivacyPolicy.getText();
        Assert.assertEquals("Failed", act, exp);
    }
public void BcBsIndividualsFamilies(){
    BcBsIndividualsFamilies.click();

}
public void BcBseditzip1(String searchIteam) throws InterruptedException {
        Thread.sleep(5000);
    BcBseditzip.sendKeys(searchIteam);

}public void BcBschosestateClick() throws InterruptedException {

        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,100)");
        BcBschosestateClick.click();

}
public void  BcBschooseState(String sendkeys) throws InterruptedException {
        Thread.sleep(5000);
    BcBschooseState.sendKeys(sendkeys);

}
























}



















