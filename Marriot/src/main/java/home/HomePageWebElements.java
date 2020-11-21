package home;

public class HomePageWebElements {

    public static final String findAndReserveTab = "//p[contains(text(),'Find & Reserve')]";
    public static final String findAndReserveText = "//span[contains(text(),'Looking for Vacation Packages?')]";
    public static final String reserveExpected= "Looking for Vacation Packages?";

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
    public static final String destinationBoxForTyping= "//input[@data-target='destination']";

    public static final String clickOnCalendarFromDate = "//input[@data-target='stayDates']";
    public static final String entireCalendarBox = "//*[@id=\"find-a-hotel-homePage-form\"]/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]";

    public static final String allDatesOnTheEnabledMonth = "//*[@id=\"find-a-hotel-homePage-form\"]/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td";
    public static final String monthEnableDisplay = "//th[@class='t-month'][contains(text(),'NOVEMBER 2020')]";
    public static final String nextMonthArrow = "//th[@title='Next Month'][contains(text(),'❯')]";
    public static final String previousMonthArrow = "//*[@id=\"find-a-hotel-homePage-form\"]/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/table/thead/tr[1]/th[1]";

}
