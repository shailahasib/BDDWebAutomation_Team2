package cellPhones;

import common.WebAPI;

public class CellphonePageWebElements extends WebAPI {
    public static final String cellPhonePageURL = "https://www.t-mobile.com/cell-phones";
    public static final String popupDialogID = "mat-dialog-0";
    public static final String popupCancelID = "//*[@id=\"mat-dialog-0\"]/tmo-pre-screen-modal-content/div/div/button[2]/span";

    public static final String myAccountDropDownID = "user-links-dropdown";
    public static final String myAccountLoginXpath = "//a[@class='mat-focus-indicator ntm-btn cta-button full-width mat-button mat-button-base mat-flat-button mat-accent MAGENTA ng-star-inserted']";
    public static final String loginKeysID = "usernameTextBox";
    public static final String loginInvalidEmailText = "test1@testserver.com";
    public static final String loginNextButtonID = "lp1-next-btn";
    public static final String loginAlertMessage = "Sorry, something you entered does not match our records. Please try again.";
    public static final String loginAlertCss = "span[class='alert-message']";
    public static final String loginRetryBoxText = "Log in";

    public static final String sortByDropDownCss = "div[class='fx-row fx-layout-align-start-center']";
    public static final String sortLowHighXpath = "//div[@class='cdk-overlay-container']//button[2]";
    public static final String sortHighLowXpath = "//*[@id=\"mat-menu-panel-1\"]/div/div/button[3]";
    public static final String softHighestRating = "//button[@class='mat-focus-indicator selected mat-menu-item ng-star-inserted']";

    public static final String openChatBubbleCss = "p[class='bub-text-pri chat-copy-pri normal-font']";
    public static final String chatBoxCss = "textarea[placeholder='Type your message']";
    public static final String chatQuesryVACss = "span[title='text tooltip']";
    public static final String chatBoxAutoMessage = "Before we get started, are you currently a T-Mobile or Sprint customer, now part of T-Mobile?";

    public static final String FilterDealsCss = "#mat-expansion-panel-header-2";
    public static final String filterDealsNewCss = "label[for='mat-checkbox-1-input'] div[class='mat-checkbox-inner-container']";
    public static final String filterDealsOnSaleCss = "label[for='mat-checkbox-2-input'] div[class='mat-checkbox-inner-container']";
    public static final String filterDealsSpecialCss = "label[for='mat-checkbox-3-input'] div[class='mat-checkbox-inner-container']";

    public static final String filterNetworkSpeedID = "mat-expansion-panel-header-5";
    public static final String filterByFiveGCss = "label[for='mat-checkbox-16-input'] div[class='mat-checkbox-inner-container']";
    public static final String filterSearchHeaderCss = "label[for='mat-checkbox-16-input'] div[class='mat-checkbox-inner-container']";

    public static final String filterByFourGLTECss = "label[for='mat-checkbox-17-input'] div[class='mat-checkbox-inner-container']";
    public static final String filterByFourGCss = "label[for='mat-checkbox-18-input'] div[class='mat-checkbox-inner-container']";

    public static final String socialInstagramIconCss = "a[id='digital-footer-tmobile-icon-0'] span[class='mdi mdi-instagram']";
    public static final String footerCareersID = "digital-footer-category-name-13";

    public static final String browseForCareers = "//section[contains(@data-maintain-aspect-ratio,'true')]//div//div//div//a[contains(@aria-label,'Browse open positions')]";
    public static final String openPositionsCss = "input[placeholder='Enter Keyword']";
    public static final String areaZipcodeCss = "#locationSearch";
    public static final String jobSearchButtonCss = "button[type='submit'] i";

    public static final String financeOptionsCss = "div[class='verify-pricing-banner hide-on-mobile ng-tns-c268-23 ng-star-inserted'] span[class='mat-button-wrapper']";
    public static final String foFirstNameCss = "//input[@formcontrolname='firstName']";
    public static final String foLastNameCss = "//input[@formcontrolname='lastName']";
    public static final String foEmailCss = "//input[@type='email']";
    public static final String foAddressLineCss = "//body//div[@aria-label='To make this website accessible to screen reader, Press combination of alt and 1 keys. To stop getting this message, press the combination of alt and 2 keys']//div//div[2]//div[1]//mat-form-field[1]//div[1]//div[1]//div[1]//input[1]";
    public static final String foZipcodeCss = "//body//div[@aria-label='To make this website accessible to screen reader, Press combination of alt and 1 keys. To stop getting this message, press the combination of alt and 2 keys']//div//div[2]//div[2]//mat-form-field[1]//div[1]//div[1]//div[1]//input[1]";
    public static final String foDOBCss = "//input[@formcontrolname='dateOfBirth']";
    public static final String foSSNCss = "//input[@type='password']";
    public static final String foSeePaymentsButtonCss = "button[type='submit']";
    public static final String foNoOfferCss = "div.pre-screen-container:nth-child(1) > h2";


}
