package ourBrands;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static ourBrands.OurBrandsPageWebElements.ourBrandsWebElement;
import static ourBrands.OurBrandsPageWebElements.*;


    public class OurBrandsPage extends WebAPI{

            @FindBy(xpath = ourBrandsWebElement) public WebElement ourBrands ;
            public void clickOnOurBrands() {ourBrands.click(); }
        @FindBy(xpath = editionWebElement)public WebElement edition  ;
        ;
            public void clickOnEdition(){
                edition.click();
            }
            @FindBy(xpath = learnMoreWebElement)public WebElement  learnMore;
            public void clickOnLearnMore(){
                learnMore.click();
            }
            public void validateOurBrands(String expectResult) {
                String actualResult = driver.getTitle();
                Assert.assertEquals("Test Fail",expectResult,actualResult);
            }


    }

