package home;

public class HomePageWebElements {


    public static final String findAndReserveTab = "//p[contains(text(),'Find & Reserve')]";
    public static final String findAndReserveText = "//span[contains(text(),'Looking for Vacation Packages?')]";
    public static final String reserveExpected = "Looking for Vacation Packages?";

    public static final String specialOffersTab = "//p[contains(text(),'Special Offers')]";
    public static final String dealsElementDisplayed = "//a[@class='m-ctaLink t-alt-link t-no-hover-link t-font-m l-display-inline-block'][normalize-space()='Deals']";

    public static final String vacationsTab = "//p[normalize-space()='Find & Reserve']";
    public static final String vacationsExploreVerifyText = "//a[normalize-space()='Explore Destinations']";

    public static final String ourBrandsTab = "//p[normalize-space()='Find & Reserve']";
    public static final String ritzCarltonLogo = "a[class='t-brand-logo-icon-RZ t-alt-link t-no-hover-link']";

    public static final String ourCreditCardsTab = "//p[normalize-space()='Find & Reserve']";
    public static final String creditCardTitle = "Chase & Amex Travel Credit Cards | Marriott Bonvoy";

    public static final String aboutMarriotTab = "//p[normalize-space()='Find & Reserve']";
    public static final String bonvoyOverviewDisplayed = "//a[normalize-space()='Marriott Bonvoy Overview']";

    public static final String whereDoYouWantToGoBox = "#IR8GRFUL_search-location";
    public static final String goToNYC = "NYC,NY";
    public static final String destinationBoxOnHomePage = "//div[@class='search-field-box']";
    public static final String destinationBoxForTyping = "//input[@data-target='destination']";

    public static final String clickOnCalendarFromDate = "//input[@data-target='stayDates']";
    public static final String entireCalendarBox = "//*[@id=\"find-a-hotel-homePage-form\"]/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]";

    public static final String allDatesOnTheEnabledMonth = "//*[@id=\"find-a-hotel-homePage-form\"]/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td";
    public static final String monthEnableDisplay = "//th[@class='t-month'][contains(text(),'DECEMBER 2020')]";
    public static final String nextMonthArrow = "//th[@title='Next Month'][contains(text(),'❯')]";
    public static final String previousMonthArrow = "//*[@id=\"find-a-hotel-homePage-form\"]/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/table/thead/tr[1]/th[1]";

    public static final String findHotelsSearch = "//*[@id=\"find-a-hotel-homePage-form\"]/div[2]/div[6]/button";
    public static final String nycHotelSearchResult = "//a[contains(text(),'New York, NY,US')]";

    public static final String listViewOption = "//*[@id=\"PropertyRecordsSearchToolBar4719\"]/div/a[1]";
    public static final String listViewClass = "m-button m-button-toolbar js-toggle-view l-padding-left-none t-line-height-l is-hidden";

    public static final String errorMessageForNoSearchLocation = "//div[@id='error-messages']";

    public static final String destinationTextOnPageText = "//*[@id=\"destination\"]/a";
    public static final String stayDatesPageText = "//*[@id=\"staydates\"]/a/span[1]";

    public static final String languageGlobalOption = "//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]";
    public static final String espanolAmericasOptions = "//*/div/div/div[1]/div[1]/ul/li[2]/a[contains(text(),'Español')]";
    public static final String espanolAmericasPageText = "//span[contains(text(),'Español')]";
    public static final String espanolExpectedText = "Español";

    public static final String signInOrJoinButton = "//span[contains(text(),'Sign In or Join')]";
    public static final String typeUserID = "//input[@id='user-id']";
    public static final String socialMediaLinksAtFooter = "//div[@class='m-socialLinksWrapper l-clear']";


}
