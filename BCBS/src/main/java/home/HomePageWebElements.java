package home;

public class HomePageWebElements {

    public static final String mouseOverLocator ="//*[@id='block-bcbs-main-menu']/ul/li[1]/a";
    public static final String clickOnVisitBlue365Locator="//header/div[1]/nav[2]/ul[1]/li[1]/div[1]/div[1]/div[2]/p[2]/strong[1]/a[1]";
    public static final String expectedResultLocator="Blue Cross Blue Shield";
    //empty search box
    public static final String emptySearchBoxLocator="//*[@id='edit-keywords--2']";
    public static final String sportSearchBoxLocator="//input[@id='edit-keywords--2']";

    public static final String clickSearchButtonLocator="//*[@id='edit-actions--2']";
    public static final String validateErrorMessage="/html/body/div[2]/div/main/div/div[2]/div/div/h2";
    // valid search box with sport value
    public static final String validateMessageLocator="views__result-text";

    //All deals filter
    public static final String clickOnAllDealsLocator="//*[@id='block-offercategorymenublock']/nav/ul/li[1]/a";
    public static final String clickFitnessLocator="//*[@id='edit-category']/span[2]/label/span";
    public static final String actualCategoryInFilter="//*[@id='views-exposed-form-browse-deals-browse-page']/div[1]/fieldset/div/button/span[3]";

    // scroll Up
    public static final String clickOnScrollUpLocator="//*[@id='block-backtotoplink']/div/p/a";
    public static final String validateScrollUpLocator="//h2/span[1]";
    // check eligibility
    public static final String clickOnCheckEligibility ="//a[contains(text(),'Check Eligibility')]";
    public static final String sendIdNUmLocator ="//input[@id='edit-plan-prefix']";
    public static final String clickOnSubmitLocator ="//input[@id='edit-submit--2']";
    public static final String validateCheckEligibalActual ="//p[contains(text(),'Unfortunately, it looks like Anthem Blue Cross and')]";
    // registration
    public static final String clickOnJoinButtonLocator  ="//*[@id='block-useraccountmenufull']/div/a[2]";
    public static final String enter3DigitElementsLocator  ="//input[@id='edit-plan-prefix']";
    public static final String clickOnSubmitElementsLocator  ="//*[@id='edit-submit--2']";
    public static final String sendFirstNameLocator ="#edit-first-name";
    public static final String sendLastNameLocator ="#edit-last-name";
    public static final String emailLocator ="#edit-email";
    public static final String zipCodeLocator ="#edit-zip-code";
    //plan
    public static final String selectPlanLocator ="bcbs_member_plan";
    public static final String selectByValue  = "AnthemNH" ;


    public static final String submitLocator ="//*[@name='op'][@value='Submit']";
    public static final String validateRegisterActual ="//div/h1";
    // About Blue365
    public static final String clickOnAboutBlueLocator ="//*[@id='block-utility']/ul/li[1]/a";
    public static final String clickOnHowBlueWorksLocator ="//a[contains(text(),'How Blue365 Works')]";
    // employee information data
    public static final String clickForEmployersLocator ="//*[@id='block-utility']/ul/li[2]/a";
    public static final String clickRegisterForDemoLocator ="//a[contains(text(),'Register for a Demo')]";
    public static final String sendFirstnameLocator ="#FirstName";
    public static final String sendLastnameLocator ="#LastName";
    public static final String sendemailaddressLocator ="#Email";
    public static final String sendcompanynameLocator ="#Company";
    public static final String sendjobtitileLocator ="#Title";
    public static final String selectEmployeeNumLocator ="#formSubmittedNumEmployee";
    public static final String selectByValueLocator  = "500-1500" ;
    public static final String selectBCBSPlanLocator  = "#submittedBCBSAPlan" ;
    public static final String selectByValueValue = "LA - Blue Cross and Blue Shield of Louisiana";
    public static final String WebinarDateLocator = "//select[@id='formWebinarDate']";
    public static final String WebinarDateValue = "January 26";
    public static final String clickOnAgreeLocator= "#LblmktoCheckbox_4383_0";
    public static final String clickOnParticipateInLocator= "#LblmktoCheckbox_4384_0";
    public static final String clickOnRegisterLocator= "//*[@id='mktoForm_1001']/div[12]/span/button";
    public static final String verifyMyRegistrationLocator= "//*[@id='C6733-title-2']/div/span[1]";
    // play video
    public static final String clickOnTheVideoLocator= "//*[@class= 'ytp-large-play-button ytp-button']";
    public static final String validateTheVideoLocator= "ytp-time-current";


}
