package memberService;

import common.WebAPI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static memberService.MemberServiceElement.*;

public class MemberServicePage extends WebAPI {
    String expectResult;
    @FindBy(xpath = memberServiceWebElement)
    public WebElement memberService;

    public void clickOnMemberService() {
        memberService.click();
    }

    @FindBy(xpath = individualFamiliesWebElement)
    public WebElement individualFamilies;

    public void clickOnIndividualFamilies() {
        individualFamilies.click();
    }

    @FindBy(xpath = helpWithFindingInsuranceWebElement)
    public WebElement helpWithFindingInsurance;

    public void clickOnHelpWithFindingInsurance() {
        helpWithFindingInsurance.click();
    }

    public void validateMemberService(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }

    @FindBy(xpath = memberService1WebElement)
    public WebElement memberService1;

    public void clickOnMemberService1() {
        memberService1.click();
    }

    @FindBy(xpath = individualFamilies1WebElement)
    public WebElement individualFamilies1;

    public void clickOnIndividualFamilies1() {
        individualFamilies1.click();
    }

    @FindBy(xpath = changesToCoverageWebElement)
    public WebElement changesToCoverage;

    public void clickOnChangesToCoverage() {
        changesToCoverage.click();
    }

    public void validateMemberService1(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }

    @FindBy(xpath = memberService2WebElement)
    public WebElement memberService2;

    public void clickOnMemberService2() {
        memberService2.click();
    }

    @FindBy(xpath = individualFamilies2WebElement)
    public WebElement individualFamilies2;

    public void clickOnIndividualFamilies2() {
        individualFamilies2.click();
    }

    @FindBy(xpath = globalCoverageWebElement)
    public WebElement globalCoverage;

    public void clickOnGlobalCoverage() {
        globalCoverage.click();
    }

    public void validateMemberService2(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService3WebElement)
    public WebElement memberService3;

    public void clickOnMemberService3() {
        memberService3.click();
    }

    @FindBy(xpath = individualFamilies3WebElement)
    public WebElement individualFamilies3;

    public void clickOnIndividualFamilies3() {
        individualFamilies3.click();
    }

    @FindBy(xpath = BCBSGlobalWebElement)
    public WebElement BCBSGlobal;

    public void clickOnBCBSGlobal() {
        BCBSGlobal.click();
    }

    public void validateMemberService3(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }

    @FindBy(xpath = memberService4WebElement)
    public WebElement memberService4;

    public void clickOnMemberService4() {
        memberService4.click();
    }

    @FindBy(xpath = individualFamilies4WebElement)
    public WebElement individualFamilies4;

    public void clickOnIndividualFamilies4() {
        individualFamilies4.click();
    }

    @FindBy(xpath = visitBlue365WebElement)
    public WebElement visitBlue365;

    public void clickOnVisitBlue365() {
        visitBlue365.click();
    }

    public void validateMemberService4(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService5WebElement)
    public WebElement memberService5;

    public void clickOnMemberService5() {
        memberService5.click();
    }

    @FindBy(xpath = individualFamilies5WebElement)
    public WebElement individualFamilies5;

    public void clickOnIndividualFamilies5() {
        individualFamilies5.click();
    }

    @FindBy(xpath = learnAboutBlueDistinctionWebElement)
    public WebElement learnAboutBlueDistinction;

    public void clickOnLearnAboutBlueDistinction() {
        learnAboutBlueDistinction.click();
    }

    public void validateMemberService5(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService6WebElement)
    public WebElement memberService6;

    public void clickOnMemberService6() {
        memberService6.click();
    }

    @FindBy(xpath = individualFamilies6WebElement)
    public WebElement individualFamilies6;

    public void clickOnIndividualFamilies6() {
        individualFamilies6.click();
    }

    @FindBy(xpath = blueCrossBlueShieldWebElement)
    public WebElement blueCrossBlueShield;

    public void clickOnBlueCrossBlueShield() {
        blueCrossBlueShield.click();
    }

    public void validateMemberService6(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService7WebElement)
    public WebElement memberService7;

    public void clickOnMemberService7() {
        memberService7.click();
    }

    @FindBy(xpath = employersWebElement)
    public WebElement employers;
    ;

    public void clickOnEmployers() {
        employers.click();
    }

    @FindBy(xpath = findADoctorWebElement)
    public WebElement findADoctor;

    public void clickOnFindADoctor() {
        findADoctor.click();
    }

    public void validateMemberService7(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService8WebElement)
    public WebElement memberService8;

    public void clickOnMemberService8() {
        memberService8.click();
    }

    @FindBy(xpath = employers1WebElement)
    public WebElement employers1;
    ;

    public void clickOnEmployers1() {
        employers1.click();
    }

    @FindBy(xpath = medicareWebElement)
    public WebElement medicare;

    public void clickOnMedicare() {
        medicare.click();
    }

    public void validateMemberService8(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService9WebElement)
    public WebElement memberService9;

    public void clickOnMemberService9() {
        memberService9.click();
    }

    @FindBy(xpath = employers2WebElement)
    public WebElement employers2;
    ;

    public void clickOnEmployers2() {
        employers2.click();
    }

    @FindBy(xpath = exploreBlue365WebElement)
    public WebElement exploreBlue365;

    public void clickOnExploreBlue365() {
        exploreBlue365.click();

    }

    public void validateMemberService9(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService10WebElement)
    public WebElement memberService10;

    public void clickOnMemberService10() {
        memberService10.click();
    }

    @FindBy(xpath = employers3WebElement)
    public WebElement employers3;
    ;

    public void clickOnEmployers3() {
        employers3.click();
    }

    @FindBy(xpath = sitemapWebElement)
    public WebElement sitemap;

    public void clickOnSitemap() {
        sitemap.click();

    }

    public void validateMemberService10(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService11WebElement)
    public WebElement memberService11;

    public void clickOnMemberService11() {
        memberService11.click();
    }

    @FindBy(xpath = employers4WebElement)
    public WebElement employers4;
    ;

    public void clickOnEmployers4() {
        employers4.click();
    }

    @FindBy(xpath = careersWebElement)
    public WebElement careers;

    public void clickOnCareers() {
        careers.click();

    }

    public void validateMemberService11(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService12WebElement)
    public WebElement memberService12;

    public void clickOnMemberService12() {
        memberService12.click();
    }

    @FindBy(xpath = employers5WebElement)
    public WebElement employers5;
    ;

    public void clickOnEmployers5() {
        employers5.click();
    }

    @FindBy(xpath = contactUsWebElement)
    public WebElement contactUs;

    public void clickOnContactUs() {
        contactUs.click();

    }

    public void validateMemberService12(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService13WebElement)
    public WebElement memberService13;

    public void clickOnMemberService13() {
        memberService13.click();
    }

    @FindBy(xpath = employers6WebElement)
    public WebElement employers6;
    ;

    public void clickOnEmployers6() {
        employers6.click();
    }

    @FindBy(xpath = healthCarFraudWebElement)
    public WebElement healthCarFraud;

    public void clickOnHealthCarFraud() {
        healthCarFraud.click();

    }

    public void validateMemberService13(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService14WebElement)
    public WebElement memberService14;

    public void clickOnMemberService14() {
        memberService13.click();
    }

    @FindBy(xpath = employers7WebElement)
    public WebElement employers7;
    ;

    public void clickOnEmployers7() {
        employers7.click();
    }

    @FindBy(xpath = privacyPolicyWebElement)
    public WebElement privacyPolicy;

    public void clickOnPrivacyPolicy() {
        privacyPolicy.click();

    }

    public void validateMemberService14(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }

    @FindBy(xpath = memberService15WebElement)
    public WebElement memberService15;

    public void clickOnMemberService15() {
        memberService15.click();
    }

    @FindBy(xpath = employers8WebElement)
    public WebElement employers8;
    ;

    public void clickOnEmployers8() {
        employers8.click();
    }

    @FindBy(xpath = termAndConditionWebElement)
    public WebElement termAndCondition;

    public void clickOnTermAndCondition() {
        termAndCondition.click();

    }

    public void validateMemberService15(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService16WebElement)
    public WebElement memberService16;

    public void clickOnMemberService16() {
        memberService16.click();
    }

    @FindBy(xpath = employers9WebElement)
    public WebElement employers9;
    ;

    public void clickOnEmployers9() {
        employers9.click();
    }

    @FindBy(xpath = cookiePolicyWebElement)
    public WebElement cookiePolicy;

    public void clickOnCookiePolicy() {
        cookiePolicy.click();

    }

    public void validateMemberService16(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }


    @FindBy(xpath = memberService17WebElement)
    public WebElement memberService17;

    public void clickOnMemberService17() {
        memberService17.click();
    }

    @FindBy(xpath = aboutUsWebElement)
    public WebElement aboutUs;
    ;

    public void clickOnAboutUs() {
        aboutUs.click();
    }

    @FindBy(xpath = BCBSSystemWebElement)
    public WebElement BCBSSystem;

    public void clickOnBCBSSystem() {
        BCBSSystem.click();

    }

    public void validateMemberService17(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }

    @FindBy(xpath = memberService18WebElement)
    public WebElement memberService18;

    public void clickOnMemberService18() {
        memberService18.click();
    }

    @FindBy(xpath = aboutUs1WebElement)
    public WebElement aboutUs1;
    ;

    public void clickOnAboutUs1() {
        aboutUs1.click();
    }

    @FindBy(xpath = BCBSCompaniesAndLicenseesWebElement)
    public WebElement BCBSCompaniesAndLicensees;

    public void clickOnBCBSCompaniesAndLicensees() {
        BCBSCompaniesAndLicensees.click();

    }

    public void validateMemberService18(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);
    }

    @FindBy(xpath = memberService19WebElement)
    public WebElement memberService19;

    public void clickOnMemberService19() {
        memberService19.click();
    }

    @FindBy(xpath = aboutUs2WebElement)
    public WebElement aboutUs2;


    public void clickOnAboutUs2() {
        aboutUs2.click();
    }

    @FindBy(xpath = corporateSocialResponsibilityWebElement)
    public WebElement corporateSocialResponsibility;

    public void clickOnCorporateSocialResponsibility() {
        corporateSocialResponsibility.click();

    }

    public void validateMemberService19(String expectResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("not match", expectResult, actualResult);

    }
}


