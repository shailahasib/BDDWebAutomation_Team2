package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// enter phone number
public class Internet_HomePageWebElements {
    //navigate to Internet homePage
    public static final String clickOnInternetLocator = "//header/div[2]/div[6]";
    // why we do it link
    public static final String clickOnWhyWeDoItLocator = "//header/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]";
    public static final String validateWhyWeDoItLocator = "//h2[contains(text(),'Our customers are the focus of everything we do.')]";
    // Customer Stories Link
    public static final String clickOnCustomerStoriesLocator = "//header/nav[1]/div[2]/div[1]/ul[1]/li[2]/a[1]";
    public static final String validateCustomerStoriesLocator = "//body/div[@id='maincontent']/div[1]/section[1]/div[1]/div[2]/p[1]";
    //  Support Link
    public static final String clickOnSupportLinkLocator = "//header/nav[1]/div[2]/div[1]/ul[1]/li[3]/a[1]";
    //5G network
    public static final String clickOnExploreOurNetworkLocator = "//a[contains(text(),'Explore our network')]";
    public static final String mainSliderLocator = "//body/div[@id='maincontent']/div[6]/image-comparison-slider[1]/div[1]/div[1]";
    public static final String sliderLocator = "//body/div[@id='maincontent']/div[6]/image-comparison-slider[1]/div[1]/div[1]/div[2]";
    public static final String validate5GNetworkingLocator = "//body/div[@id='maincontent']/div[4]/section[1]/div[1]/div[2]/p[1]";
    // click on the video
    public static final String clickOnTheVideoLocator = "//*[@id='myYTCode']/div[1]/video";
    public static final String clickOnStartVideoLocator = "//*[@id='movie_player']/div[29]/div[2]/div[1]/div[1]/span[1]";
    public static final String clickOnStopVideoLocator = "//*[@id='movie_player']/div[29]/div[2]/div[1]/button";
    // purchase T-Mobile Home Internet
    public static final String sendFirstNameLocator = "#contact-firstName";
    public static final String sendLastNameLocator = "#contact-lastName";
    public static final String sendEmailLocator = "#contact-email";
    public static final String sendZipLocator = "#contact-zip";
    public static final String enterMyPhoneNumberLocator = "#contact-phone";
    public static final String wirelessPhoneLocator = "#contact-lead-gen-CUSTOM1_TEXT";
    public static final String clickOnSubmitBLocator = "//button[contains(text(),'Submit')]";
    public static final String validateSingingUpLocator = "//*[@id='a4a6b3f78b8df1a19e844554f898d574ea316c55fa7c76046a86c75ffcf44ad3']/div[1]/div[2]/h2";
    // Check availability
    public static final String clickOnCheckAvailabilityLocator = "//header/nav[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
    public static final String sendPhoneNumLocator = "#mat-input-0";
    public static final String sendHomeAddressLocator = "#mat-input-1";
    public static final String clickOnNextCheckAvailabilityLocator = "//span[contains(text(),'Check availability')]";
    // More info
    public static final String sendFirstName2Locator = "#mat-input-2";
    public static final String sendLastName2Locator = "#mat-input-3";
    public static final String sendEmailAddress2Locator = "#mat-input-5";
    public static final String selectOnForNewCostumerLocator = "//*[@id='mat-checkbox-1']/label/div";
    public static final String clickOnSubmitElementsLocator = "/html/body/isp-root/isp-eligibility/isp-eligibility-form/mat-card/form/section[3]/div[2]/button[1]";


}