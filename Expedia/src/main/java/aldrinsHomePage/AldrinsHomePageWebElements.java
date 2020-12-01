package aldrinsHomePage;

public class AldrinsHomePageWebElements {
    public static final String homePageURL = "https://www.expedia.com/";
    public static final String links = "a";
    public static final String packagesOnHeader ="//span[contains(text(),'Packages')]";
    public static final String chooseOneOrMoreItemsToBuild ="//div[contains(text(),'Choose one or more items to build your trip:')]";
    public static final String validateOptionText ="Choose one or more items to build your trip:";
    public static final String phoneInputBox = "phoneNumber";
    public static final String getTheAppBtn = "submitBtn";
    public static final String confirmationText = "uitk-type-300 all-b-padding-three uitk-text-positive-theme";

    public static final String toHotel = "//button[@aria-label='Going to']";

    public static final String expediaGroupElement = "//img[@alt='https://www.expediagroup.com']";

    public static final String languageSelectorXpath = "//button[contains(@type,'button')]//div[contains(@class,'uitk-text-secondary-theme')]";
    public static final String selectLanguageCss = "#language-selector";
    public static final String languageSelectorSaveCss = "div[class='uitk-scrim fade-button'] button[type='button']";

    public static final String staysTabXpath = "//div[@data-testid='storefront-region']//li[1]//a[1]";
    public static final String staysSearchFieldCss = "button[aria-label='Going to']";
    public static final String staysLocationSearchFieldCss = "#location-field-destination";
    public static final String staysEmptyClickBoxXpath = "//div[contains(@data-testid,'travelers-inline-link')]";
    public static final String staysAddAFlightRadioCss = "#add-flight-switch";
    public static final String staysLeavingFromXpath = "//button[contains(@aria-label,'Leaving from')]";
    public static final String staysLeavingFromFieldXpath = "//input[@placeholder='Where are you leaving from?']";
    public static final String staysSearchButtonCss = "button[data-testid='submit-button']";
    //sleep5
    public static final String startHotelSearchXpath = "//main[@itemtype='https://schema.org/Hotel']//div//h1";

    public static final String navToTermPage = "//a[normalize-space()='Terms of Use']";
    public static final String termsHeaderXpath = "//h2[@class='itemHeading title-main']";


    public static final String signUpButtonCss = "a[class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-has-text uitk-button-tertiary']";
    public static final String firstNameCss = "//input[@id='create-account-firstname']";
    public static final String lastNameCss = "#create-account-lastname";
    public static final String emailAddressCss = "#create-account-emailId";
    public static final String passwordCss ="#create-account-password";
    public static final String passwordConfirmCss = "#create-account-confirm-password";
    public static final String checkTOCCss = "#create-account-expedia-policy";
    public static final String signupSubmitCss ="#create-account-submit-button";
    public static final String accountCreationSuccessURL = "https://www.expedia.com/?mtype=4&rfrr=Account.Create.FullAccount.Success";



}
