package blueCrossblue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static blueCrossblue.BlueCrossBlueWebPageElements.*;



public class BlueCrossBlueHomePage {


    @FindBy(how = How.XPATH, using = clickOnCareersWebElement)
    public WebElement clickOnCareers;
    @FindBy(how = How.XPATH, using = validateCareersWebElement)
    public WebElement validateCareers;

    public void clickOnCareers() {
        clickOnCareers.click();
    }
    public void validateCareersAtBlueCross() {
        String actualResult = validateCareers.getText();
        String expectedResult = "Careers at Blue Cross";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = clickAboutUsWebElement)
    public WebElement clickAboutUs;
    @FindBy(how = How.XPATH, using = validateClickAboutUsWebElement)
    public WebElement validateClickAboutUs;


    public void clickAboutOnAbout() {
        clickAboutUs.click();
    }

    public void validateAboutUs() {
        String actualResult = validateClickAboutUs.getText();
        String expectedResult = "About Blue Cross and Blue Shield of Minnesota";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = clickContactUsWebElement)
    public WebElement clickContactUs;
    @FindBy(how = How.XPATH, using = validateContactUsWebElement)
    public WebElement validateContactUs;

    public void clickContactUs() {
        clickContactUs.click();
    }
    public void validateContact() {
        String actualResult = validateContactUs.getText();
        String expectedResult = "Contact us";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    @FindBy(how = How.CSS, using = clickLogInWebElement)
    public WebElement clickLogIn;
    @FindBy(how = How.CSS, using = validateLogInWebElement)
    public WebElement validateLogIn;

    public void clickLogIn() {
        clickLogIn.click();
    }
    public void validateLogIn() {
        String actualResult = validateLogIn.getText();
        String expectedResult = "Member Log In";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = hoverForMembersWebElement)
    public WebElement hoverForMembers;
    @FindBy(how = How.XPATH, using = clickLogInAndRegisterWebElement)
    public WebElement clickLogInAndRegister;
    @FindBy(how = How.CSS, using = validateMemberLogInWebElement)
    public WebElement validateMemberLogIn;


    public void hoverForMembers() {
        hoverForMembers.click();
    }
    public void clickLogInAndRegister() {
        clickLogInAndRegister.click();
    }
    public void validateMemberLogIn() {
        String actualResult = validateMemberLogIn.getText();
        String expectedResult = "Member Log In";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    @FindBy(how = How.CSS, using = clickOnShopPlansWebElement)
    public WebElement clickOnShopPlans;
    @FindBy(how = How.XPATH, using = validateShopPlansElement)
    public WebElement validateShop;

    public void clickShopPlans() {
        clickOnShopPlans.click();
    }
    public void validateShopPlans() {
        String actualResult = validateShop.getText();
        String expectedResult = "Shop Plans";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    @FindBy(how = How.CSS, using = clickFindADoctorWebElement)
    public WebElement clickFindADoctor;
    @FindBy(how = How.XPATH, using = validateFindADoctorWebElement)
    public WebElement validateFindADoctor;

    public void clickFindADoctor() {
        clickFindADoctor.click();
    }
    public void validateFindADoctor() {
        String actualResult = validateFindADoctor.getText();
        String expectedResult = "Find a Doctor";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickWellBeingWebElement)
    public WebElement clickWellBeing;
    @FindBy(how = How.XPATH, using = validateWellBeingWebElement)
    public WebElement validateWellBeing;

    public void clickWellBeing() {
        clickWellBeing.click();
    }
    public void validateWellBeing() {
        String actualResult = validateWellBeing.getText();
        String expectedResult = "Health & Wellbeing";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickShopMedicarePlansWebElement)
    public WebElement clickShopMedicarePlans;
    @FindBy(how = How.CSS, using = clickViewMedicarePlansWebElement)
    public WebElement clickViewMedicarePlans;
    @FindBy(how = How.XPATH, using = validateMedicarePlansWebElement)
    public WebElement validateMedicarePlans;

    public void clickShopMedicarePlans() {
        clickShopMedicarePlans.click();
    }
    public void clickViewMedicarePlans1() {
        clickViewMedicarePlans.click();
    }
    public void validateMedicarePlans() {
        String actualResult = validateMedicarePlans.getText();
        String expectedResult = "2021 Medicare Plans";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickOnShopIndividualAndFamilyPlansWebElement)
    public WebElement clickOnShopIndividualAndFamilyPlans;
    @FindBy(how = How.CSS, using = clickShopPlansWebElement)
    public WebElement clickShopPlans;
    @FindBy(how = How.XPATH, using = clickSeeIndividualAndFamilyPlansWebElement)
    public WebElement clickSeeIndividualAndFamilyPlans;
    @FindBy(how = How.XPATH, using = validateSeeIndividualAndFamilyPlansWebElement)
    public WebElement validateSeeIndividualAndFamilyPlans;

    public void clickShopIndividualAndFamilyPlans() {
        clickOnShopIndividualAndFamilyPlans.click();
    }
    public void clickOnShopPlans() {
        clickShopPlans.click();
    }
    public void clickSeeIndividualAndFamilyPlans() {
        clickSeeIndividualAndFamilyPlans.click();
    }
    public void validateIndividualsAndFamilies() {
        String actualResult = validateSeeIndividualAndFamilyPlans.getText();
        String expectedResult = "2021 Individual and family health plans";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickSaveWithVisionPlanWebElement)
    public WebElement clickSaveWithVisionPlan;
    @FindBy(how = How.XPATH, using = clickSeeSmallGroupVisionPlanWebElement)
    public WebElement clickSeeSmallGroupVisionPlan;
    @FindBy(how = How.CSS, using = clickSmallGroupsWebElement)
    public WebElement clickSmallGroups;
    @FindBy(how = How.XPATH, using = validateSaveWithVisionPlanWebElement)
    public WebElement validateSaveWithVisionPlan;

    public void clickSaveWithVisionPlan() {
        clickSaveWithVisionPlan.click();
    }
    public void clickSeeSmallGroupVisionPlan() {
        clickSeeSmallGroupVisionPlan.click();
    }
    public void clickForSmallGroups() {
        clickSmallGroups.click();
    }
    public void validateBlueCrossVisionPlansForSmallGroups() {
        String actualResult = validateSaveWithVisionPlan.getText();
        String expectedResult = "Blue Cross vision plans for small groups";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickCareersWebElement)
    public WebElement clickCareers;
    @FindBy(how = How.ID, using = clickOurStoryWebElement)
    public WebElement clickOurStory;
    @FindBy(how = How.XPATH, using = validateOurStoryWebElement)
    public WebElement validateOurStory;

    public void clickCareers() {
        clickCareers.click();
    }
    public void sendKeyWords() {
        clickOurStory.click();
    }
    public void validateOurStory() {
        String actualResult = validateOurStory.getText();
        String expectedResult = "Our story";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickCareersWebElement)
    public WebElement clickCareers1;
    @FindBy(how = How.ID, using = clickLocationsWebElement)
    public WebElement clickLocations;
    @FindBy(how = How.XPATH, using = validateLocationsWebElement)
    public WebElement validateLocations;

    public void clickCareers1() {
        clickCareers.click();
    }
    public void clickLocations() {
        clickLocations.click();
    }
    public void validateLocations() {
        String actualResult = validateLocations.getText();
        String expectedResult = "Primary office locations";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickCareersWebElement)
    public WebElement clickCareers2;
    @FindBy(how = How.ID, using = clickCareersAreasWebElement)
    public WebElement clickCareersAreas;
    @FindBy(how = How.XPATH, using = validateCareerAreasWebElement)
    public WebElement validateCareerAreas;

    public void clickCareers2() {
        clickCareers2.click();
    }
    public void clickCareersAreas() {
        clickCareersAreas.click();
    }
    public void validateCareerAreas() {
        String actualResult = validateCareerAreas.getText();
        String expectedResult = "Career areas";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickCareersWebElement)
    public WebElement clickCareers3;
    @FindBy(how = How.ID, using = hoverWhyWorkForUsWebElement)
    public WebElement hoverWhyWorkForUs;
    @FindBy(how = How.ID, using = clickCandidateFAQsWebElement)
    public WebElement clickCandidateFAQs;
    @FindBy(how = How.CSS, using = validateCandidateFAQsWebElement)
    public WebElement validateCandidateFAQs;

    public void clickCareers3() {
        clickCareers3.click();
    }
    public void hoverWhyWorkForUs() {
        hoverWhyWorkForUs.click();
    }
    public void clickCandidateFAQs() {
        clickCandidateFAQs.click();
    }
    public void ValidateCandidateFAQs() {
        String actualResult = validateCandidateFAQs.getText();
        String expectedResult = "Candidate FAQs";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    //16
    @FindBy(how = How.CSS, using = hoverWellBeingWebElement)
    public WebElement hoverWellBeing;
    @FindBy(how = How.CSS, using = clickSeeHealthProgramsWebElement)
    public WebElement clickSeeHealthPrograms;
    @FindBy(how = How.XPATH, using = validateSeeHealthProgramsWebElement)
    public WebElement validateSeeHealthPrograms;

    public void clickOnWellBeing() {
        hoverWellBeing.click();
    }
    public void clickSeeHealthPrograms() {
        clickSeeHealthPrograms.click();
    }
    public void ValidateSeeHealthPrograms() {
        String actualResult = validateSeeHealthPrograms.getText();
        String expectedResult = "Health Programs";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    //17
    @FindBy(how = How.CSS, using = hoverWellBeingWebElement)
    public WebElement hoverWellBeing1;
    @FindBy(how = How.CSS, using = clickSeeHealthProgramsWebElement)
    public WebElement clickSeeHealthPrograms1;
    @FindBy(how = How.CSS, using = clickShareCareIconWebElement)
    public WebElement clickShareCareIcon;
    @FindBy(how = How.CSS, using = validateLiveYourHealthiestLifeWebElement)
    public WebElement validateLiveYourHealthiestLife;

    public void clickOnWellBeing1() {
        hoverWellBeing1.click();
    }
    public void clickSeeHealthPrograms1() {
        clickSeeHealthPrograms1.click();
    }
    public void clickShareCareRealAgeTestIcon() {
        clickShareCareIcon.click();
    }
    public void validateLiveYourHealthiestLife() {
        String actualResult = validateLiveYourHealthiestLife.getText();
        String expectedResult = "Live your healthiest life";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.ID, using = enterSearchKeyWebElement)
    public WebElement enterSearchKey;
    @FindBy(how = How.ID, using = clickSearchButtonWebElement)
    public WebElement clickSearchButton;
    @FindBy(how = How.XPATH, using = validateSearchTextWebElement)
    public WebElement validateSearchText;

    public void enterKeyWords() {
        enterSearchKey.sendKeys(searchCOVID19);
    }
    public void clickSearchButton() {
        clickSearchButton.click();
    }
    public void validateCovid() {
        String actualResult = validateSearchText.getText();
        String expectedResult = "COVID-19";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.ID, using = enterSearchKeysWebElement)
    public WebElement enterSearchKeys;
    @FindBy(how = How.ID, using = clickSearchButtonWebElement)
    public WebElement clickSearchButton1;
    @FindBy(how = How.XPATH, using = validateTextWebElement)
    public WebElement validateText;

    public void enterSearchKey() {
        enterSearchKeys.sendKeys(searchCareGiver);
    }
    public void clickSearchButton1() {
        clickSearchButton1.click();
    }
    public void validateSearchText() {
        String actualResult = validateText.getText();
        String expectedResult = "CareGiver";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = clickLogToYourAccountWebElement)
    public WebElement clickLogToYourAccount;
    @FindBy(how = How.CSS, using = enterUsernameWebElement)
    public WebElement enterUsername;
    @FindBy(how = How.CSS, using = enterPasswordWebElement)
    public WebElement enterPassword;
    @FindBy(how = How.XPATH, using = clickLogInButtonWebElement)
    public WebElement clickLogInButton;
    @FindBy(how = How.CSS, using = validateLogInToYourAccountWebElement)
    public WebElement validateLogInToYourAccount;

    public void clickLogInToYourAccount() {
        clickLogToYourAccount.click();
    }
    public void enterInvalidUserName() {
        enterUsername.sendKeys(searchSadia10);
    }
    public void enterValidPassword() {
        enterPassword.sendKeys(searchSadouche1990);
    }
    public void clickLogInButton() {
        clickLogInButton.click();
    }
    public void validateIncorrectUserNameOrPassWord() {
        String actualResult = validateLogInToYourAccount.getText();
        String expectedResult = "LOG IN TO YOUR ACCOUNT";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.XPATH, using = enterMemberIdWebElement)
    public WebElement enterMemberId;
    @FindBy(how = How.CSS, using = clearMemberIdWebElement)
    public WebElement clearMemberId;
    @FindBy(how = How.XPATH, using = clickNextButtonWebElement)
    public WebElement clickNextButton;
    @FindBy(how = How.XPATH, using = validateRegisterSuccessWebElement)
    public WebElement validateRegisterSuccess;

    public void enterKeyWords1() {
        enterMemberId.sendKeys(search12345678900);

    }

    public void deleteMemberID() {
        clearMemberId.clear();
    }
    public void clickNextButton() {
        clickNextButton.click();
    }
    public void validateMemberID() {
        String actualResult = validateRegisterSuccess.getText();
        String expectedResult = "Member ID";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


    @FindBy(how = How.CSS, using = hoverOnSelectLanguageWebElement)
    public WebElement hoverOnSelectLanguage;
    @FindBy(how = How.CSS, using = clickAllLanguagesWebElement)
    public WebElement clickAllLanguages;

    public void hoverSelectLanguage() {
        hoverOnSelectLanguage.click();
    }
    public void clickAllLanguages() {
        clickAllLanguages.click();
    }
    public void validateSelectLanguages() {

    }

    @FindBy(how = How.XPATH, using = hoverFontSizeWebElement)
    public WebElement hoverFontSize;
    @FindBy(how = How.CSS, using = clickMediumFontSizeWebElement)
    public WebElement clickMediumFontSize;
    @FindBy(how = How.XPATH, using = hoverNeedHelpWebElement)
    public WebElement hoverNeedHelp;
    @FindBy(how = How.XPATH, using = validateFontSizeWebElement)
    public WebElement validateFontSize;
    @FindBy(how = How.XPATH, using = validaCallWebElement)
    public WebElement validaCall;

    public void hoverSelectSize() {
        hoverFontSize.click();
    }
    public void clickInMediumFontSize() {
        clickMediumFontSize.click();
    }
    public void clickNeedHelpButton() {
        hoverNeedHelp.click();
    }
    public void validateMediumSize() {
        String actualResult = validateFontSize.getText();
        String expectedResult = "";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }

    public void validateCallForHelp() {
        String actualResult = validaCall.getText();
        String expectedResult = "CALL";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }
    @FindBy(how = How.XPATH, using = clickOnNewsRoomWebElement)
    public WebElement clickOnNewsRoom;
    @FindBy(how = How.XPATH, using = validateNewsRoomWebElement)
    public WebElement validateNewsRoom;

    public void clickNewsRoom() {
        clickOnNewsRoom.click();
    }
    public void validateTheNewsRoom() {
        String actualResult = validateNewsRoom.getText();
        String expectedResult = "NewsRoom";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }
    @FindBy(how = How.CSS, using = clickBoardWebElement)
    public WebElement clickBoard;
    @FindBy(how = How.XPATH, using = validateBoardWebElement)
    public WebElement validateBoard;

    public void clickOnBoard() {
        clickBoard.click();
    }
    public void validateBoardOfTrustees() {
        String actualResult = validateBoard.getText();
        String expectedResult = "About the Board of Trustees";
        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
    }


}











