package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = SearchBox)
    public WebElement  expediaSearchBox;

  @FindBy(how = How.XPATH, using =SearchBoxSelectBangladesh)
    public WebElement  expediaSearchBoxSelectBangladesh;


@FindBy(how = How.XPATH, using = clicksearch)
    public WebElement  expediaclicksearchbutton;




public void expediaSearchBoxCheck(){
    expediaSearchBox.click();

}
public void expediaSearchBoxSendLocation(){
    expediaSearchBoxSelectBangladesh.click();

}
public void expediaclicksearchbutton(){
    expediaSearchBoxSelectBangladesh.click();

}



















}
