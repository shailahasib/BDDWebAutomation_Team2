package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import memberService.MemberServicePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class MemberServicePageStepDefinitions extends WebAPI {
    static MemberServicePage memberServicePage;

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @BeforeStep
    public static void getInit() {
        memberServicePage = PageFactory.initElements(driver, MemberServicePage.class);
    }

//    @Given("I am at home page")
//    public void i_am_at_home_page() throws IOException {
//        // Write code here that turns the phrase above into concrete actions
//        openBrowser("https://www.BCBS.com/");
//
//    }
    @Given("I am at the home page")
    public void i_am_at_the_home_page() throws IOException {
    openBrowser("https://www.BCBS.com/");
    }

    @When("I click on member service")
    public void i_click_on_member_service() {memberServicePage.clickOnMemberService();

    }

    @Then("I click on individual Families")
    public void i_click_on_individual_families() {memberServicePage.clickOnIndividualFamilies();

    }

    @Then("I click on help with Finding Insurance")
    public void i_click_on_help_with_finding_insurance() {memberServicePage.clickOnHelpWithFindingInsurance();

    }

    @Then("I validate member service")
    public void i_validate_member_service() {memberServicePage.validateMemberService("Individuals & Families | Blue Cross Blue Shield");

    }

    @When("I click on member service1")
    public void i_click_on_member_service1() {memberServicePage.clickOnMemberService1();

    }

    @Then("I click on individual Families1")
    public void i_click_on_individual_families1() {memberServicePage.clickOnIndividualFamilies1();

    }

    @Then("I click on changesToCoverage")
    public void i_click_on_changes_to_coverage() {memberServicePage.clickOnChangesToCoverage();

    }

    @Then("I validate member service1")
    public void i_validate_member_service1() {memberServicePage.validateMemberService1("Individuals & Families | Blue Cross Blue Shield");

    }



    @When("I click on member service2")
    public void i_click_on_member_service2() {memberServicePage.clickOnMemberService2();

    }

    @Then("I click on individual Families2")
    public void i_click_on_individual_families2() {memberServicePage.clickOnIndividualFamilies2();

    }

    @Then("I click on global Coverage")
    public void i_click_on_global_coverage() {memberServicePage.clickOnGlobalCoverage();

    }

    @Then("I validate member service2")
    public void i_validate_member_service2() {memberServicePage.validateMemberService2("Individuals & Families | Blue Cross Blue Shield");

    }



    @When("I click on member service3")
    public void i_click_on_member_service3() {memberServicePage.clickOnMemberService3();

    }

    @Then("I click on individual Families3")
    public void i_click_on_individual_families3() {memberServicePage.clickOnIndividualFamilies3();

    }

    @Then("I click on BCBS global")
    public void i_click_on_bcbs_global() {memberServicePage.clickOnBCBSGlobal();

    }

    @Then("I validate member service3")
    public void i_validate_member_service3() {memberServicePage.validateMemberService3("BCBSGlobal | Solutions for International Healthcare Needs");

    }


    @When("I click on member service4")
    public void i_click_on_member_service4() {memberServicePage.clickOnMemberService4();

    }

    @Then("I click on individual Families4")
    public void i_click_on_individual_families4() {memberServicePage.clickOnIndividualFamilies4();

    }

    @Then("I click on visitBue365")
    public void i_click_on_visit_bue365() {memberServicePage.clickOnVisitBlue365();

    }

    @Then("I validate member service4")
    public void i_validate_member_service4() {memberServicePage.validateMemberService4("Home Page | Blue365 Deals");

    }



    @When("I click on member service5")
    public void i_click_on_member_service5() {memberServicePage.clickOnMemberService5();
    }

    @Then("I click on individual Families5")
    public void i_click_on_individual_families5() {memberServicePage.clickOnIndividualFamilies5();
    }

    @Then("I click on learn About Blue Distinction")
    public void i_click_on_learn_about_blue_distinction() {memberServicePage.clickOnLearnAboutBlueDistinction();
    }

    @Then("I validate member service5")
    public void i_validate_member_service5() {memberServicePage.validateMemberService5("Quality Care That's Right for You | Blue Cross Blue Shield");

    }


    @When("I click on member service6")
    public void i_click_on_member_service6() {memberServicePage.clickOnMemberService6();

    }

    @Then("I click on individual Families6")
    public void i_click_on_individual_families6() {memberServicePage.clickOnIndividualFamilies6();

    }

    @Then("I click On  blue Cross Blue Shield")
    public void i_click_on_blue_cross_blue_shield() {memberServicePage.clickOnBlueCrossBlueShield();

    }

    @Then("I validate member service6")
    public void i_validate_member_service6() {memberServicePage.validateMemberService6("Individuals & Families | Blue Cross Blue Shield");

    }




    @When("I click on member service7")
    public void i_click_on_member_service7() {memberServicePage.clickOnMemberService7();

    }

    @Then("I click on employers")
    public void i_click_on_employers() {memberServicePage.clickOnEmployers();

    }

    @Then("I click On  findADoctor")
    public void i_click_on_find_a_doctor() {memberServicePage.clickOnFindADoctor();

    }

    @Then("I validate member service7")
    public void i_validate_member_service7() {memberServicePage.validateMemberService7("Find a Doctor | Blue Cross Blue Shield");

    }

    @When("I click on member service8")
    public void i_click_on_member_service8() {memberServicePage.clickOnMemberService8();

    }

    @Then("I click On medicare")
    public void i_click_on_medicare() {memberServicePage.clickOnMedicare();

    }

    @Then("I validate member service8")
    public void i_validate_member_service8() {memberServicePage.validateMemberService8("Medicare | Benefit of Blue | Blue Cross Blue Shield");

    }

    @When("I click on member service9")
    public void i_click_on_member_service9() {memberServicePage.clickOnMemberService9();

    }

    @Then("I click On exploreBlue365")
    public void i_click_on_explore_blue365() {memberServicePage.clickOnExploreBlue365();

    }

    @Then("I validate member service9")
    public void i_validate_member_service9() {memberServicePage.validateMemberService9("Home Page | Blue365 Deals");

    }


    @When("I click on member service10")
    public void i_click_on_member_service10() {memberServicePage.clickOnMemberService10();

    }

    @Then("I click On sitemap")
    public void i_click_on_sitemap() {memberServicePage.clickOnSitemap();

    }

    @Then("I validate member service10")
    public void i_validate_member_service10() {memberServicePage.validateMemberService10("Sitemap | Blue Cross Blue Shield");

    }


    @When("I click on member service12")
    public void i_click_on_member_service12() {memberServicePage.clickOnMemberService12();

    }

    @Then("I click On contact us")
    public void i_click_on_contact_us() {memberServicePage.clickOnContactUs();

    }

    @Then("I validate member service12")
    public void i_validate_member_service12() {memberServicePage.validateMemberService12("Contact Us | Blue Cross Blue Shield");
    }

    @When("I click on member service13")
    public void i_click_on_member_service13() {memberServicePage.clickOnMemberService13();

    }

    @Then("I click On health Car Fraud")
    public void i_click_on_health_car_fraud() {memberServicePage.clickOnHealthCarFraud();

    }

    @Then("I validate member service13")
    public void i_validate_member_service13() {memberServicePage.validateMemberService13("Healthcare Fraud | Blue Cross Blue Shield");

    }


    @When("I click on member service14")
    public void i_click_on_member_service14() {memberServicePage.clickOnMemberService14();

    }

    @Then("I click On  privacy Policy")
    public void i_click_on_privacy_policy() {memberServicePage.clickOnPrivacyPolicy();

    }

    @Then("I validate member service14")
    public void i_validate_member_service14() {memberServicePage.validateMemberService14("Privacy Policy | Blue Cross Blue Shield");

    }

    @When("I click on member service15")
    public void i_click_on_member_service15() {memberServicePage.clickOnMemberService15();

    }

    @Then("I click On  term And Condition")
    public void i_click_on_term_and_condition() {memberServicePage.clickOnTermAndCondition();

    }

    @Then("I validate member service15")
    public void i_validate_member_service15() {memberServicePage.validateMemberService15("Terms & Conditions | Blue Cross Blue Shield");

    }

    @When("I click on member service16")
    public void i_click_on_member_service16() {memberServicePage.clickOnMemberService16();

    }

    @Then("I click On  cookie policy")
    public void i_click_on_cookie_policy() {memberServicePage.clickOnCookiePolicy();

    }

    @Then("I validate member service16")
    public void i_validate_member_service16() {memberServicePage.validateMemberService16("Cookie Policy | Blue Cross Blue Shield");

    }


    @When("I click on member service17")
    public void i_click_on_member_service17() {memberServicePage.clickOnMemberService17();

    }

    @Then("I click on about Us")
    public void i_click_on_about_us() {memberServicePage.clickOnAboutUs();

    }

    @Then("I click On   BCBS System")
    public void i_click_on_bcbs_system() {memberServicePage.clickOnBCBSSystem();

    }

    @Then("I validate member service17")
    public void i_validate_member_service17() {memberServicePage.validateMemberService17("The Blue Cross Blue Shield System | Blue Cross Blue Shield");

    }

    @When("I click on member service18")
    public void i_click_on_member_service18() {memberServicePage.clickOnMemberService18();

    }

    @Then("I click On   BCBS  Companies And Liceensees")
    public void i_click_on_bcbs_companies_and_Licensees() {memberServicePage.clickOnBCBSCompaniesAndLicensees();

    }

    @Then("I validate member service18")
    public void i_validate_member_service18() {memberServicePage.validateMemberService18("BCBS® Companies and Licensees | Blue Cross Blue Shield");

    }


    @When("I click on member service19")
    public void i_click_on_member_service19() {memberServicePage.clickOnMemberService19();

    }

    @Then("I click On   corporate Social Responsibility")
    public void i_click_on_corporate_social_responsibility() {memberServicePage.clickOnCorporateSocialResponsibility();

    }
    @Then("I validate member service19")
    public void i_validate_member_service19() {memberServicePage.validateMemberService19("Investing in healthier communities | Blue Cross Blue Shield");

    }


}