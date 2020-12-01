package cruises;

public class CruisesWebElements {

    public static final String homePageUrl="https://www.expedia.com/";
    public static final String packagesOnHeader ="//span[contains(text(),'Packages')]";
    public static final String chooseOneOrMoreItemsToBuild ="//div[contains(text(),'Choose one or more items to build your trip:')]";
    public static final String chooseOptionsExpected ="Choose one or more items to build your trip:";
    public static final String leavingFromInsertBox ="//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[1]/div/div/div/div/div/button";
    public static final String goingToInsertBox ="button[aria-label='Going to']";

    public static final String departingDateBox ="//button[@id='d1-btn']";
    public static final String returningDateBox ="//button[@id='d2-btn']";
    public static final String allCalendarDates ="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]//button[1]";
    public static final String monthSelectTextReader ="//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[3]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]";
    public static final String nextMonthNavigator ="//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[3]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
    public static final String cruisesTab ="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/figure[1]/div[3]/div[1]/div[1]/ul[1]/li[6]/a[1]/svg[1]/svg[1]/path[1]";
    public static final String flightsTab ="body.uitk-no-outline:nth-child(2) div.app-layer-base--active div.uitk-grid.pageWhiteBackground:nth-child(1) div.uitk-cell.Storefront-Homepage div.uitk-cell:nth-child(1) div.StorefrontWizardRegionBEX:nth-child(3) figure.uitk-image.bexHeroImageFigure.withBackgroundColor div.wizardCard.all-t-padding-twelve.all-x-padding-six.SimpleContainer div.uitk-card-aloha.uitk-card-aloha-roundcorner-all.all-b-padding-six.all-cell-1-1.elevation-4 div.uitk-tabs-container ul.uitk-tabs.uitk-tabs-natural.background-white.uitk-tabs-default.uitk-tabs-icon-text.lobNavigationFormWithTabs.formAlignedTabs.all-x-padding-six > li.uitk-tab.uitk-tab-icon-text.active:nth-child(2)";


    public static final String packageSearchButton="//button[contains(text(),'Search')]";

    public static final String leavingFromTextBox = "//label[contains(text(),'Leaving from')]";
    public static final String goingToButton = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[3]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]";
    public static final String flyingFromBox = "//input[@id='typeahead-originInput-0']";
    public static final String whereAreYouGoingBox = "//button[@aria-label='Going to']";
    public static final String links = "a";

    public static final String staysXpathElement = "//li[contains(@class,'active')]//*[contains(@class,'uitk-icon uitk-icon-medium')]//*[local-name()='svg']//*[name()='path' and contains(@d,'M21.61 21.')]";
    public static final String goingToStaysXpathElement = "//button[contains(@aria-label,'Going to')]"; //Click to open "where are you going?"
    public static final String goingtoStaysWhereXpathElement = "//input[@id='location-field-destination']"; //sendKeys to this element

    public static final String flightsXpathElements = "//span[normalize-space()='Flights']";
    public static final String locationsDallas = "Dallas";














}
