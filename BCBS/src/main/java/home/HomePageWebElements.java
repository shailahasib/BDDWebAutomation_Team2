package home;

import common.WebAPI;

public class HomePageWebElements extends WebAPI {

    public static final String homePageURL = "https://www.bcbs.com/";
    public static final String headerContactUS = "nav[id='block-utilitynavigation-2'] li[class='menu-item'] a";
    public static final String expectedPhoneNumber = "888.630.2583";
    public static final String contactUsPhone = "div[class='paragraph paragraph--type--paragraph-single-card paragraph--view-mode--default paragraph--background-color--medium-blue paragraph--background-color__true paragraph--hero-image__false paragraph--vertical-alignment--top paragraph--card-theme--light paragraph--gradient--color--none'] div p strong";

    public static final String searchKey = "//button[@id='edit-submit']//i[@class='icon']";
    public static final String openSearchKey = "edit-keys";
    public static final String searchBoxToClean = "edit-keys";

    public static final String hoaButton = "nav[id='block-utilitynavigation-2'] a[class='hoa-nav-button']";

    public static final String memberServices = "body.path-bcbscom-homepage.path__bcbscom-homepage.page-node-45.path-frontpage.page-node-type-page.language-en:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(4) div.layout-container div.bcbs-header-container div.sticky-wrapper header.main-header div.region.region-headerleft:nth-child(1) nav.block.block-menu.navigation.menu--main:nth-child(3) ul.menu.menu__level-0 > li.menu-item.menu-item__level-0.menu-item--expanded:nth-child(1)";
    public static final String memberDiscounts = "//nav[@id='block-bcbs-main-menu']//a[normalize-space()='Member Discounts']";
    public static final String noMembersCard = "#edit-zip-state-container > summary";
    public static final String enterZipCode = "edit-zip";
    public static final String idCardGoButton = "edit-submit-zip";
    public static final String assertMessageZip = "//p[@class='planfinder--results--message']";
    public static final String healthIndexMap = "//img[@alt='map']";
    public static final String bcbsLogo = "//img[@alt='BCBS - The Health of America']";

    public static final String footerContactUS = "//nav[@id='block-footernavigation']//a[normalize-space()='Contact Us']";

    public static final String findADoctor ="button[aria-label='Show the Find a Doctor links']";
    public static final String findDoctorInUSA = "#bcbs-find-a-doctor > p:nth-child(2) > a";
    public static final String buttonWelcome = "button-welcome";
    public static final String sendZipcode = "input-location";
    public static final String confirmZipcode = "CONFIRM_LOCATION_TRIGGER";
    public static final String boxOne = "alpha-one-input";
    public static final String boxTwo = "alpha-two-input";
    public static final String boxThree = "alpha-three-input";
    public static final String continueButton = "ember162";





}
