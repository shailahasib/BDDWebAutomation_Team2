package home;

public class HomePageWebElements {
    // navigate to career home padge
    public static final String clickOnJobsLocator = "//a[contains(text(),'Jobs')]";
    // click on Why Expedia
    public static final String clickOnWhyExpediaLocator = "//*[@id='nav-why-expedia-button']";
    public static final String validateWhyExpediaLocator = "//body/nav[@id='nav-why-expedia']/div[1]/div[1]/div[1]/a[1]";
    // Click On Career Path
    public static final String clickOnCareerPathLocator = "//*[@id='nav-paths-button']";
    public static final String validateCareerPathLocator = "//*[@id='nav-paths']/div/div/div[3]/a/div[2]/h3[1]";
    // click On Our Culture
    public static final String clickOnOurCultureLocator = "//*[@id='nav-culture-button']";
    public static final String validateClickOnOurCultureLocator = "//body/nav[@id='nav-culture']/div[1]/div[1]/div[1]/h1[1]";
    // Many Brands One Team
    public static final String clickOnManyBrandsOneTeamLocator = "//*[@id='nav-why-expedia']/div/div/div/ul/li[1]/a";
    // WeWork Every where
    public static final String clickOnWeWorkEverywhereLocator = "//*[@id='nav-why-expedia']/div/div/div/ul/li[2]";
    //Benefits Perks
    public static final String clickOnBenefitsPerksLocator = "//*[@id='nav-why-expedia']/div/div/div/ul/li[3]/a";
    //Join Our Talent Community
    public static final String clickOnJoinOurTalentCommunityLocator = "//body/section[@id='navbar-scroll']/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]";
    public static final String SignUpUsingYourEMailAddressLocator = "//a[contains(text(),'Sign up using your e-mail address')]";
    public static final String sendEmailLocator = "//*[@id='candidate-sign-up-email']/form/input[1]";
    public static final String sendPasswordLocator = "//*[@id='candidate-sign-up-email']/form/input[2]";
    public static final String sendConfirmPasswordLocator = "//*[@id='candidate-sign-up-email']/form/input[3]";
    public static final String clickOnSignUpButtonLocator = "//candidate-sign-up[1]/form[1]/input[4]";
    public static final String verifyActualJoinedToTheTeamLocator = "//*[@id='candidate-sign-up-container-7b3e87f7-546f-49dc-90ce-c7a391f9b4ea']/div/div/h";
    //About you
    public static final String sendFirstnameLocator = "#profile-firstName";
    public static final String sendLastnameLocator = "#profile-lastName";
    public static final String sendMobilePhoneLocator = "//div[1]/div[2]/candidate-profile[1]/div[1]/form[1]/section[1]/div[3]/input[1]";
    public static final String sendWebsiteLocator =     "//div[1]/div[2]/candidate-profile[1]/div[1]/form[1]/section[1]/div[5]/input[1]";
    public static final String sendDiplomaLocator = "#profile-degree";
    public static final String sendUniversityLocator = "#profile-institution";
    public static final String sendProfessionalExperienceLocator = "#profile-job-title";
    public static final String sendOrganisationNameLocator = "#profile-job-company";
    public static final String clickIAmHappyLocator = "#gdpr-checkbox";
    public static final String clickOnSAreYouInterestedInLocator = "//*[@id='form-form']/div[1]/div[13]/label/input";
    public static final String clickOnSubmitButtonLocator = "//*[@id='bmr-button-c9114ed8-db72-485b-b896-3526d31f7759']/button";
    public static final String clickOnSignOutLocator = "//*[@id='header-1c8614a3-ce35-4b13-b6af-787d13242451']/div/div/div[2]/span/a";

    // search functions
    public static final String enterInSearchOpeningsLocator = "#hero_keyword_search_1";
    public static final String clickOnLogoSearchLocator = "//*[@id='navbar-scroll']/div[1]/div[2]/div/ul/li[4]/form/ul/li[2]/button/img";
    public static final String actualEnterInSearchOpeningsLocator = "hero__sub";
    // search job name and locations
    public static final String sendJobNameElementsLocator = "#hero_keyword_search_3";
    public static final String enterTheInLocation = "#hero_location_search_3";
    public static final String validateResultActualLocation = "//h4[contains(text(),'')]";
    public static final String clickOnSearchLogoLocation = "//*[@id='top']/section[2]/div[1]/div/div/form/ul/li[3]/button/img";


}
