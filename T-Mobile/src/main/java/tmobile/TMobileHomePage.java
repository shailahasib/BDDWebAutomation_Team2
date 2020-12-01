package tmobile;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static tmobile.TMobilePageWebElements.*;

public class TMobileHomePage extends WebAPI {


    @FindBy(how = How.ID, using = clickOnCellsWebElement)
    public WebElement clickOnCells;
    @FindBy(how = How.TAG_NAME, using = validatePhonesWebElement)
    public WebElement validatePhones;

    public void clickCells() {
        clickOnCells.click();
    }

    public void validatePhone() {
        String actualResult = validatePhones.getText();
        String expectedResult = "Phones";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = clickOnPhonesAndDevicesWebElement)
    public WebElement clickOnPhonesAndDevices;
    @FindBy(how = How.XPATH, using = clickOnTabletsAndDevicesWebElement)
    public WebElement clickOnTabletsAndDevices;
    @FindBy(how = How.TAG_NAME, using = validateOnTabletsAndDevicesWebElement)
    public WebElement validateOnTabletsAndDevices;

    public void clickPhonesAndDevices() {
        clickOnPhonesAndDevices.click();
    }

    public void clickTabletsAndDevices() {
        clickOnTabletsAndDevices.click();
    }
    public void validateTabletsAndPhones() {
        String actualResult = validateOnTabletsAndDevices.getText();
        String expectedResult = "Tablets & devices";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = clickOnSmartAndWatchesWebElement)
    public WebElement clickOnSmartAndWatches;
    @FindBy(how = How.XPATH, using = validateOnSmartAndWatchesWebElement)
    public WebElement validateOnSmartAndWatches;

    public void clickSmartAndWatches() {
        clickOnSmartAndWatches.click();
    }

    public void validateSmartAndWatches() {
        String actualResult = validateOnSmartAndWatches.getText();
        String expectedResult = "Smart watches";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickOnAccessoriesWebElement)
    public WebElement clickOnAccessories;
    @FindBy(how = How.XPATH, using = validateOnAccessoriesWebElement)
    public WebElement validateOnAccessories;

    public void clickAccessories() {
        clickOnAccessories.click();
    }

    public void validateAccessories() {
        String actualResult = validateOnAccessories.getText();
        String expectedResult = "Accessories";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = openSearchBoxWebElement)
    public WebElement openSearchBox;
    @FindBy(how = How.ID, using = enterSearchTextHeadsetWebElement)
    public WebElement enterSearchTextHeadset;
    @FindBy(how = How.ID, using = clickOnGoButtonWebElement)
    public WebElement clickOnGoButton;
    @FindBy(how = How.XPATH, using = validateSearchTestWebElement)
    public WebElement validateSearchTest;
    @FindBy(how = How.LINK_TEXT, using = inspectHeadsetWebElement)
    public WebElement inspectHeadset;
    @FindBy(how = How.LINK_TEXT, using = inspectSamsungWebElement)
    public WebElement inspectSamsung;

    public void openSearchBoxS() {
        openSearchBox.click();
    }
    public void enterSearchKeyWords(String searchHeadset) {
        enterSearchTextHeadset.sendKeys(searchHeadset);
    }
    public void clickSearchButton() throws InterruptedException {
        clickOnGoButton.click();
        Thread.sleep(5000);
    }
    public void inspectOnHeadset(String productNames) throws InterruptedException {
        inspectHeadset.click();
        Thread.sleep(5000);
    }
    public void inspectOnSamsung(String productNames)  {
        inspectSamsung.click();

    }
    public void validateSearchText(String expectedResult) {
        String actualResult = validateSearchTest.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);

    }


    @FindBy(how = How.ID, using = enterSearchText1WebElement)
    public WebElement enterSearchText1;
    @FindBy(how = How.TAG_NAME, using = validateSearchText1WebElement)
    public WebElement validateSearchText1;

    public void enterKeyWords1() {
        enterSearchText1.sendKeys(searchSamsungGalaxy11);
    }

    public void validateSearchText1(String expectedResult) {
        String actualResult = validateSearchText1.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = hoverAccessoriesWebElement)
    public WebElement hoverAccessories;
    @FindBy(how = How.XPATH, using = clickCasesAndCoversWebElement)
    public WebElement clickCasesAndCovers;
    @FindBy(how = How.XPATH, using = validateCasesAndCoversWebElement)
    public WebElement validateCasesAndCovers;

    public void HoverCasesAndCavers() {
        hoverAccessories.click();
    }

    public void clickOnCasesAndCovers() {
        clickCasesAndCovers.click();
    }

    public void validateOnCasesAndCovers() {
        String actualResult = validateCasesAndCovers.getText();
        String expectedResult = "Cases & covers";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = hoverDealsWebElement)
    public WebElement hoverDeals;
    @FindBy(how = How.XPATH, using = checkBoxWebElement)
    public WebElement checkBox;
    @FindBy(how = How.XPATH, using = validateNewCheckBoxWebElement)
    public WebElement validateNewCheckBox;

    public void clickDeals() {
        hoverDeals.click();
    }

    public void checkNewBox() {
        checkBox.click();
    }

    public void validateCheckBox() {
        String actualResult = validateNewCheckBox.getText();
        String expectedResult = "New Phones";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = hoverSortByWebElement)
    public WebElement hoverSortBy;
    @FindBy(how = How.XPATH, using = checkOnPriceLowToHighWebElement)
    public WebElement checkOnPriceLowToHigh;
    @FindBy(how = How.XPATH, using = validatePriceLowToHighWebElement)
    public WebElement validatePriceLowToHigh;

    public void hoverSortBy() throws InterruptedException {
        hoverSortBy.click();
        Thread.sleep(5000);
    }

    public void checkListName(String checkList) throws InterruptedException {
        checkOnPriceLowToHigh.click();
        Thread.sleep(4);
    }

    public void validateCheckListName(String expectedResult) throws InterruptedException {
        String actualResult = validatePriceLowToHigh.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
        Thread.sleep(5000);
    }

    public void getURL() {
    }


    @FindBy(how = How.XPATH, using = hoverDealsAWebElement)
    public WebElement hoverDealsA;
    @FindBy(how = How.XPATH, using = validateSamsungWebElement)
    public WebElement validateSamsung;


    public void dealsHover() {
        Actions action = new Actions(driver);
        action.moveToElement( hoverDealsA).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//header/div[3]/div[1]/div[2]/div[1]/div[1]/tmo-unav-dropdown-container[1]/div[1]/tmo-unav-dropdown[3]/div[1]/div[1]/div[1]/a[3]/span[1]"))).click();
    }
    public void validateOnSamsung(String expectedResult) {
        String actualResult = validateSamsung.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    //11
    @FindBy(how = How.CSS, using = hoverPlansWebElement)
    public WebElement hoverPlans;
    @FindBy(how = How.CSS, using = validatePlansWebElement)
    public WebElement validatePlans;

    public void plansHover() {
        Actions action = new Actions(driver);
        action.moveToElement( hoverPlans).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector("#nav-link-contaniner-0 > div > div > div > a:nth-child(3) > span"))).click();
    }
    public void validateEssentials(String expectedResult) {
        String actualResult = validatePlans.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = hoverPhonesAndDevicesWebElement)
    public WebElement hoverPhonesAndDevices;
    @FindBy(how = How.CSS, using = validatePhonesAndDevicesWebElement)
    public WebElement validatePhonesAndDevices;

    public void phonesAndDevicesHover() {
        Actions action = new Actions(driver);
        action.moveToElement(hoverPhonesAndDevices).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//*[@id=\"nav-link-contaniner-1\"]/div/div/div/a[6]"))).click();
    }
    public void validateYourPhone(String expectedResult) {
        String actualResult = validatePhonesAndDevices.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickPlansWebElement)
    public WebElement clickPlans;
    @FindBy(how = How.CSS, using = validatePlans1WebElement)
    public WebElement validatePlans1;

    public void plansHover1() {
        Actions action = new Actions(driver);
        action.moveToElement(clickPlans).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//a[contains(text(),'T-Mobile Connect')]"))).click();
    }
    public void validateYourPhone1(String expectedResult) {
        String actualResult = validatePlans1.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    //14
    @FindBy(how = How.XPATH, using = hoverBusinessWebElement)
    public WebElement hoverBusiness;
    @FindBy(how = How.CSS, using = validateTrendAndStoriesWebElement)
    public WebElement validateTrendAndStories;

    public void HoverOnBusiness() {
        Actions action = new Actions(driver);
        action.moveToElement(hoverBusiness).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("/html[1]/body[1]/div[3]/header[1]/div[2]/div[1]/div[1]/tmo-digital-header[1]/div[1]/header[1]/div[3]/div[1]/div[2]/div[1]/div[1]/tmo-unav-dropdown-container[1]/div[1]/tmo-unav-dropdown[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]"))).click();
    }
    public void validateTrendsAndStoriesW(String expectedResult) {
        String actualResult = validateTrendAndStories.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = hoverContactUsWebElement)
    public WebElement hoverContactUs;

    public void HoverOnContactUs() {
        Actions action = new Actions(driver);
        action.moveToElement(hoverContactUs).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector("div.wrapper:nth-child(23) div.iparys_inherited div.enterprise-unav-header-component.iparsys.parsys div.enterprise-unav-header.section tmo-digital-header.ng-tns-c64-0:nth-child(1) div.ng-tns-c64-0.ng-star-inserted header.ntm-navbar.ng-tns-c64-0.ntm-navbar--dark:nth-child(1) div.ng-tns-c64-0 div.ntm-navbar__menu-bar.ng-tns-c64-0 div.navbar__collapse.navbar__collapse--default-menu.ng-tns-c64-0.ng-trigger.ng-trigger-centerX.notSticky:nth-child(3) div.navbar__collapse--slide.ng-tns-c64-0 div.navbar__collapse--container.container--grey.ng-tns-c64-0.ng-star-inserted:nth-child(2) div.ntm-navbar__nav.ntm-navbar__nav--right.ng-tns-c64-0 tmo-unav-dropdown.ng-tns-c61-12.ng-tns-c64-0.ntm-navbar--dark.ng-star-inserted:nth-child(2) div.navbar__item.ng-tns-c61-12.tmo.is-active div.nav__link-container.ng-tns-c61-12.ng-star-inserted div.dropdown__menu.ng-tns-c61-12.nav-right-dropdown.ng-trigger.ng-trigger-centerX.ng-star-inserted.is-active:nth-child(4) > a.ng-tns-c61-12.dropdown__item.tmo.ng-star-inserted:nth-child(2)"))).click();
    }



    @FindBy(how = How.XPATH, using = hoverBusiness1WebElement)
    public WebElement hoverBusiness1;
    @FindBy(how = How.XPATH, using = validateHealthCareWebElement)
    public WebElement validateHealthCare;

    public void HoverOnHoverBusinessWeb() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hoverBusiness1).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("/html[1]/body[1]/div[3]/header[1]/div[2]/div[1]/div[1]/tmo-digital-header[1]/div[1]/header[1]/div[3]/div[1]/div[2]/div[1]/div[1]/tmo-unav-dropdown-container[1]/div[1]/tmo-unav-dropdown[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/a[1]"))).click();
       Thread.sleep(5000);
    }
    public void validateHealthCare(String expectedResult) {
        String actualResult = validateHealthCare.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = hoverBusiness1WebElement)
    public WebElement hoverBusiness1Web;
    @FindBy(how = How.XPATH, using = validateEducationWebElement)
    public WebElement validateEducation;

    public void hoverOnBusinessWeb() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hoverBusiness1Web).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("/html[1]/body[1]/div[3]/header[1]/div[2]/div[1]/div[1]/tmo-digital-header[1]/div[1]/header[1]/div[3]/div[1]/div[2]/div[1]/div[1]/tmo-unav-dropdown-container[1]/div[1]/tmo-unav-dropdown[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/a[1]"))).click();
        Thread.sleep(5000);
    }
    public void validateEducations(String expectedResult) {
        String actualResult = validateEducation.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = hoverBusinessAndSolutionsWebElement)
    public WebElement hoverBusinessAndSolutions;
    @FindBy(how = How.XPATH, using = validateFleetManagementWebElement)
    public WebElement validateFleetManagement;

    public void hoverOnBusinessWeb1() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hoverBusinessAndSolutions).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("/html[1]/body[1]/div[3]/header[1]/div[2]/div[1]/div[1]/tmo-digital-header[1]/div[1]/header[1]/div[3]/div[1]/div[2]/div[1]/div[1]/tmo-unav-dropdown-container[1]/div[1]/tmo-unav-dropdown[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]"))).click();
        Thread.sleep(5000);
    }
    public void validateOnFleetAndManagement(String expectedResult) {
        String actualResult = validateFleetManagement.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = hoverPlanWebElement)
    public WebElement hoverPlan;
    @FindBy(how = How.XPATH, using = validateMagentaWebElement)
    public WebElement validateMagenta;

    public void hoverOnPlan() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hoverPlan).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("/html[1]/body[1]/div[3]/header[1]/div[2]/div[1]/div[1]/tmo-digital-header[1]/div[1]/header[1]/div[3]/div[1]/div[2]/div[1]/div[1]/tmo-unav-dropdown-container[1]/div[1]/tmo-unav-dropdown[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"))).click();
        Thread.sleep(5000);
    }
    public void validateOnMagenta(String expectedResult) {
        String actualResult = validateMagenta.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = hoverMagentaWebElement)
    public WebElement hoverMagenta;
    @FindBy(how = How.XPATH, using = validateMagentaForBusinessWebElement)
    public WebElement validateMagentaForBusiness;

    public void hoverOnPlan1() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hoverMagenta).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector("div.wrapper:nth-child(23) div.iparys_inherited div.enterprise-unav-header-component.iparsys.parsys div.enterprise-unav-header.section tmo-digital-header.ng-tns-c64-0:nth-child(1) div.ng-tns-c64-0.ng-star-inserted header.ntm-navbar.ng-tns-c64-0.ntm-navbar--dark:nth-child(1) div.ng-tns-c64-0 div.ntm-navbar__menu-bar.ng-tns-c64-0 div.navbar__collapse.navbar__collapse--default-menu.ng-tns-c64-0.notSticky.ng-trigger.ng-trigger-centerX:nth-child(3) div.navbar__collapse--slide.ng-tns-c64-0 div.navbar__collapse--container.ng-tns-c64-0.ng-star-inserted:nth-child(1) tmo-unav-dropdown-container.ng-tns-c64-0 div.ntm-navbar__nav.ntm-navbar__nav--left tmo-unav-dropdown.ng-tns-c61-7.ng-tns-c64-0.ntm-navbar--dark.ng-star-inserted div.navbar__item.ng-tns-c61-7.tmo.is-active div.nav__link-container.ng-tns-c61-7.ng-star-inserted div.dropdown__menu.dropdown__menu--multicolum.ng-tns-c61-7.ng-trigger.ng-trigger-centerX.ng-star-inserted.is-active:nth-child(4) div.dropdown__multicolumn.ng-tns-c61-7.ng-star-inserted:nth-child(1) div.ng-tns-c61-7:nth-child(2) div.dropdown-subitems.ng-tns-c61-7.ng-star-inserted:nth-child(2) > div.main-link.ng-tns-c61-7"))).click();
        Thread.sleep(5000);
    }
    public void validateMagentaForBusiness(String expectedResult) {
        String actualResult = validateMagentaForBusiness.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = hoverCoverageWebElement)
    public WebElement hoverCoverage;
    @FindBy(how = How.XPATH, using = validateCoverageWebElement)
    public WebElement validateCoverage;

    public void hoverOnCoverage() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hoverCoverage).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector("div.wrapper:nth-child(23) div.iparys_inherited div.enterprise-unav-header-component.iparsys.parsys div.enterprise-unav-header.section tmo-digital-header.ng-tns-c64-0:nth-child(1) div.ng-tns-c64-0.ng-star-inserted header.ntm-navbar.ng-tns-c64-0.ntm-navbar--dark:nth-child(1) div.ng-tns-c64-0 div.ntm-navbar__menu-bar.ng-tns-c64-0 div.navbar__collapse.navbar__collapse--default-menu.ng-tns-c64-0.notSticky.ng-trigger.ng-trigger-centerX:nth-child(3) div.navbar__collapse--slide.ng-tns-c64-0 div.navbar__collapse--container.ng-tns-c64-0.ng-star-inserted:nth-child(1) tmo-unav-dropdown-container.ng-tns-c64-0 div.ntm-navbar__nav.ntm-navbar__nav--left tmo-unav-dropdown.ng-tns-c61-8.ng-tns-c64-0.ntm-navbar--dark.ng-star-inserted div.navbar__item.ng-tns-c61-8.tmo.is-active div.nav__link-container.ng-tns-c61-8.ng-star-inserted div.dropdown__menu.ng-tns-c61-8.ng-trigger.ng-trigger-centerX.ng-star-inserted.is-active:nth-child(4) a.ng-tns-c61-8.dropdown__item.tmo.ng-star-inserted:nth-child(3) > span.ng-tns-c61-8.ng-star-inserted"))).click();
        Thread.sleep(5000);
    }
    public void validateInternationalCoverage(String expectedResult) {
        String actualResult = validateCoverage.getText();
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    @FindBy(how = How.CSS, using = hoverCoverage1WebElement)
    public WebElement hoverCoverage1;

    public void hoverOnBusiness1() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hoverCoverage1).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector("div.wrapper:nth-child(23) div.iparys_inherited div.enterprise-unav-header-component.iparsys.parsys div.enterprise-unav-header.section tmo-digital-header.ng-tns-c64-0:nth-child(1) div.ng-tns-c64-0.ng-star-inserted header.ntm-navbar.ng-tns-c64-0.ntm-navbar--dark:nth-child(1) div.ng-tns-c64-0 div.ntm-navbar__menu-bar.ng-tns-c64-0 div.navbar__collapse.navbar__collapse--default-menu.ng-tns-c64-0.notSticky.ng-trigger.ng-trigger-centerX:nth-child(3) div.navbar__collapse--slide.ng-tns-c64-0 div.navbar__collapse--container.ng-tns-c64-0.ng-star-inserted:nth-child(1) tmo-unav-dropdown-container.ng-tns-c64-0 div.ntm-navbar__nav.ntm-navbar__nav--left tmo-unav-dropdown.ng-tns-c61-8.ng-tns-c64-0.ntm-navbar--dark.ng-star-inserted div.navbar__item.ng-tns-c61-8.tmo.is-active div.nav__link-container.ng-tns-c61-8.ng-star-inserted div.dropdown__menu.ng-tns-c61-8.ng-trigger.ng-trigger-centerX.ng-star-inserted.is-active:nth-child(4) a.ng-tns-c61-8.dropdown__item.tmo.ng-star-inserted:nth-child(2) > span.ng-tns-c61-8.ng-star-inserted"))).click();
        Thread.sleep(5000);
    }

    public void TMobileBrokenActiveLink(){
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links are "+links.size());
        for(int i=0;i<links.size();i++)
        {
            WebElement ele= links.get(i);
            String url=ele.getAttribute("href");
            verifyLinkActive(url);
        }
    }

    public void validateTransformingWireless() {
    }
}












