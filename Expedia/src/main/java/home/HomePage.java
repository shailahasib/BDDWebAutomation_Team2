package home;

import common.WebAPI;
import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {


    @FindBy(xpath = clickOnJobsLocator)
    public WebElement clickOnJobsElements;
    @FindBy(xpath = clickOnWhyExpediaLocator)
    public WebElement clickOnWhyExpedia;
    @FindBy(xpath = validateWhyExpediaLocator)
    public WebElement validateWhyExpediaActual;
    @FindBy(xpath = clickOnCareerPathLocator)
    public WebElement clickOnCareerPath;
    @FindBy(xpath = validateCareerPathLocator)
    public WebElement validateCareerPathActual;
    @FindBy(xpath = clickOnOurCultureLocator)
    public WebElement clickOnOurCulture;
    @FindBy(xpath = validateClickOnOurCultureLocator)
    public WebElement validateClickOnOurCulture;
    @FindBy(xpath = clickOnManyBrandsOneTeamLocator)
    public WebElement manyBrandsOneTeamElements;
    @FindBy(xpath = clickOnWeWorkEverywhereLocator)
    public WebElement weWorkEverywhere;
    @FindBy(xpath = clickOnBenefitsPerksLocator)
    public WebElement clickOnBenefitsPerks;
    @FindBy(xpath = clickOnJoinOurTalentCommunityLocator)
    public WebElement clickOnJoinOurTalentCommunity;
    @FindBy(xpath = SignUpUsingYourEMailAddressLocator)
    public WebElement SignUpUsingYourEMailAddress;
    @FindBy(xpath = sendEmailLocator)
    public WebElement sendEmail;
    @FindBy(xpath = sendPasswordLocator)
    public WebElement sendPassword;
    @FindBy(xpath = sendConfirmPasswordLocator)
    public WebElement sendConfirmPassword;
    @FindBy(xpath = clickOnSignUpButtonLocator)
    public WebElement clickOnSignUpButton;
    @FindBy(xpath = verifyActualJoinedToTheTeamLocator)
    public WebElement verifyActualJoinedToTheTeam;
    @FindBy(css = enterInSearchOpeningsLocator)
    public WebElement enterInSearchOpenings;
    @FindBy(xpath = clickOnLogoSearchLocator)
    public WebElement clickOnLogoSearch;
    @FindBy(className = actualEnterInSearchOpeningsLocator)
    public WebElement actualEnterInSearchOpenings;
    @FindBy(css = sendFirstnameLocator)
    public WebElement sendFirstname;
    @FindBy(css = sendLastnameLocator)
    public WebElement sendLastname;
    @FindBy(xpath = sendMobilePhoneLocator)
    public WebElement sendMobilePhone;
    @FindBy(xpath = sendWebsiteLocator)
    public WebElement sendWebsite;
    @FindBy(css = sendDiplomaLocator)
    public WebElement sendDiploma;
    @FindBy(css = sendUniversityLocator)
    public WebElement sendUniversity;
    @FindBy(css = sendProfessionalExperienceLocator)
    public WebElement sendProfessionalExperience;
    @FindBy(css = sendOrganisationNameLocator)
    public WebElement sendOrganisationName;
    @FindBy(css = clickIAmHappyLocator)
    public WebElement clickIAmHappyElements;
    @FindBy(xpath = clickOnSubmitButtonLocator)
    public WebElement clickOnSubmitButton;
    @FindBy(xpath = clickOnSAreYouInterestedInLocator)
    public WebElement clickOnSAreYouInterestedIn;
    @FindBy(xpath = clickOnSignOutLocator)
    public WebElement clickOnSignOut;
    @FindBy(css = sendJobNameElementsLocator)
    public WebElement JobNameElements;
    @FindBy(css = enterTheInLocation)
    public WebElement enterTheIn;
    @FindBy(xpath = validateResultActualLocation)
    public WebElement validateResultActual;
    @FindBy(xpath = clickOnSearchLogoLocation)
    public WebElement clickOnSearchLogoelement;

    public void sendKey(WebElement element, String Value) {
        element.sendKeys(Value);
    }

    public void clickOnJobs() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1100)");
        clickOnJobsElements.click();
        Thread.sleep(8000);
    }

    public void validateClickOnJobs() throws InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "Expedia Group | Careers";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnWhyExpediaGroup() throws InterruptedException {
        clickOnWhyExpedia.click();
        Actions action = new Actions(driver);
        action.moveToElement(clickOnWhyExpedia).doubleClick();
    }

    public void validateClickOnWhyExpediaGroup() throws InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "Explore Our New\n" +
                "Seattle Campus";
        String actualResult = validateWhyExpediaActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnCareerPath() {
        clickOnCareerPath.click();
    }

    public void validateClickOnCareerPath() throws InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "STARTING RIGHT";
        String actualResult = validateCareerPathActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnOurCulture() {
        clickOnOurCulture.click();
    }

    public void validateClickOnOurCulture() throws NullPointerException, InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "OUR CULTURE";
        String actualResult = validateClickOnOurCulture.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnManyBrandsOneTeam() {
        manyBrandsOneTeamElements.click();
    }

    public void validateClickOnManyBrandsOneTeam() throws NullPointerException, InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "Brands | Expedia Group Careers";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnWeWorkEverywhere() {
        weWorkEverywhere.click();
    }

    public void validateClickOnWeWorkEverywhere() throws NullPointerException, InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "Our Locations | Expedia Group Careers";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnBenefitsPerks() {
        clickOnBenefitsPerks.click();
    }

    public void validateClickOnBenefitsPerks() throws NullPointerException, InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "Benefits | Expedia Group Careers";
        String actualResult = driver.getTitle();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void clickOnJoinOurTalentCommunity() throws InterruptedException {
        Thread.sleep(5000);
        clickOnJoinOurTalentCommunity.click();
    }

    public void clickOnSignUpUsingYourEMailAddress() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5000);
        SignUpUsingYourEMailAddress.click();
    }

    public void clickOnSignUpButton() throws InterruptedException {
        windowAndTabs();
        clickOnSignUpButton.submit();
        Thread.sleep(5000);
    }

    public void verifyJoinedToTheTeam() throws NullPointerException, InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "Expedia Group Talent Community";
        String actualResult = verifyActualJoinedToTheTeam.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void enterInSearchOpenings(String searches) throws InterruptedException {
        enterInSearchOpenings.sendKeys(searches);
    }

    public void clickOnTheArrowLogoSearchSigne() throws InterruptedException {
        Thread.sleep(5000);
        clickOnLogoSearch.click();
    }

    public void clickIAmHappy() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5000);
        clickIAmHappyElements.click();
    }

    public void clickWhatCareerPathsAreYouInterestedIn() throws InterruptedException {
        windowAndTabs();
        clickOnSAreYouInterestedIn.click();
    }

    public void iSignOutElements() throws InterruptedException {
        windowAndTabs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)");
        clickOnSignOut.click();
    }

    public void clickOnSubmitButton() throws InterruptedException {
        windowAndTabs();
        Thread.sleep(5000);
        clickOnSubmitButton.click();
    }

    public void validateEnterInSearchOpenings() throws NullPointerException, InterruptedException {
        Thread.sleep(5000);
        String expectedResult = "Come along on our journey to\n" +
                "bring the world within reach";
        String actualResult = actualEnterInSearchOpenings.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }

    public void sendJobNameElements(String JobNames) throws InterruptedException {

        JobNameElements.sendKeys(JobNames);
    }

    public void enterTheInLocation(String enterLocation) throws InterruptedException {

        enterTheIn.sendKeys(enterLocation);
    }

    public void clickOnSearchLogo() throws InterruptedException {

        clickOnSearchLogoelement.click();
    }

    public void validateSearchResultElements(String expectedResult) throws NullPointerException, InterruptedException {
        String actualResult = validateResultActual.getText();
        Assert.assertEquals("Test Fail, Expected Not Match With Actual ", expectedResult, actualResult);
    }
}
