package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageFactoryPage {


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "small-searchterms")
    WebElement searchTxt;

    @FindBy (xpath = "//button[@class=\"button-1 search-box-button\"]")
    WebElement searchBtn;

    @FindBy (xpath = "//button[@class=\"button-2 product-box-add-to-cart-button\"]")
    WebElement addToCartBtn;

    @FindBy (xpath = "//span[@class=\"price actual-price\"]")
    WebElement euroIcon;

    public void searchItem (String itemName){
        searchTxt.sendKeys(itemName);
    }

    public void clickButton(){
        searchBtn.click();
    }

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }

    public WebElement getEuroIcon() {
        return euroIcon;
    }
}
