package phonesAndDevices;

import java.net.HttpURLConnection;

public class PhonesAndDevicesWebElements {

    public static final String homeUrl = "https://www.t-mobile.com/";
    public static final String phonesAndDevice = "#digital-header-nav-link-head-1";
    public static final String accessoriesOption = "//a[@href='/accessories']";
    public static final String accessoriesText = "//h1[normalize-space()='Accessories']";
    public static final String accessoriesExpectedText = "//h1[normalize-space()='Accessories']";
    public static final String iframeSeeExactlyWhat = "//body/iframe[8]";
    public static final String dismissPopUpForFinancing = "//span[contains(text(),\"No thanks, I'll do it later\")]";
    //public static final String dismissPopUpForFinancing = "//a[@href='/accessories']";
    public static final String syncUpPetsBand = "//p[contains(text(),'T-Mobile SyncUp Pets Bands')]";
    public static final String syncUpPetsBandInCart = "button[class='mat-focus-indicator cta-button full-width fixed-width mat-flat-button mat-button-base mat-accent ng-star-inserted']";
    public static final String checkOutAsAGuestButton = "//span[normalize-space()='Check out as a guest']";
    public static final String myCartSignEle = "//h1[normalize-space()='My cart']";
    public static final String myCartSignText = "My cart";
    public static final String startCheckoutButton = "//tmo-cart-price-total[@class='desktop-only margin-below']//span[@class='mat-button-wrapper'][normalize-space()='Start checkout']";
    public static final String finalizeInStoreButton = "a[id='finalizeInStoreLinkDesktop'] span[class='ng-binding']";

    public static final String enterFName = "//div[@class='form-group col-sm-12 p-b-20 m-b-0 ng-scope']//input[@id='firstName']";
    public static final String enterLName = "#lastName";
    public static final String enterEmail = "//input[@id='finalizeInStoreEmail']";
    public static final String enterPhone = "//input[@id='phoneNumber']";
    public static final String enterZip = "//input[@id='zipCode']";

    public static final String fName = "Shaila";
    public static final String lName = "Hasib";
    public static final String email = "shaila@gmail.com";
    public static final String phone = "67739394448";
    public static final String zip = "11102";

    public static final String smartWatchesButton = "//span[@class='hide-on-mobile filter-button font-weight-bold margin-0 ng-tns-c261-10'][normalize-space()='Smart watches']";

    public static final String linkTagCollection = "a";
    public static final String searchMagnifierClick = "//a[@id='digital-header-utility-3']";
    public static final String checkTotalInCart = "//section[@class='padding-top-0 ng-tns-c58-16']//div[@class='font-weight-bold'][normalize-space()='Total']";
    public static final String monthlyOptionForPayments = "//header[normalize-space()='Due Monthly']";
    public static final String removeFromCart = "button[aria-label='Remove T-Mobile SyncUp Pets Bands'] span[class='mat-button-wrapper']";
    public static final String cartTextNextStep = "//article[normalize-space()='Next step: add a device to your cart.']";
    public static final String accessoriesDropDown = "//mat-icon[normalize-space()='keyboard_arrow_up']";
    public static final String accountLogin = "//button[@id='user-links-dropdown']";
    public static final String payABillLogin = "//a[@u1st-aria-label='Bill pay']";
    public static final String userNameIdInput = "//input[@id='usernameTextBox']";
    public static final String nextButton = "//button[contains(text(),'Next')]";
    public static final String errorMessageForId = "//span[contains(text(),'Sorry, something you entered does not match our re')]";
    public static final String searchBoxInput = "//input[@id='nav_search_input-desktop']";



}