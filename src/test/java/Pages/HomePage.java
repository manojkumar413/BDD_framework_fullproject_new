package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageFactoryPage {

    public HomePage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    @FindBy (xpath = "//a[@href=\"/register?returnUrl=%2F\"]")
    WebElement registrationLink;

    @FindBy (linkText = "Log in")
    WebElement loginBtn;

    @FindBy (id = "customerCurrency")
    WebElement currencyDropList;

    @FindBy (xpath = "//a[@href=\"/computers\"]")
    WebElement computers;

    @FindBy (xpath = "// a[@href=\"/notebooks\"]")
    WebElement notebooks;

    @FindBy (xpath = "//strong[@itemprop=\"name\"]")
    WebElement notebooksWord;

    @FindBy (linkText = "Apparel")
    WebElement apparel;

    @FindBy (linkText = "Apple MacBook Pro 13-inch")
    WebElement macAppel;

    @FindBy (id = "add-to-wishlist-button-4")
    WebElement wishListBtn;

    @FindBy (xpath = "//p[@class=\"content\"]")
    WebElement addedToWishListMsg;

    @FindBy (id = "add-to-cart-button-4")
    WebElement addToCartBtn;

    @FindBy (xpath = "//p[@class=\"content\"]")
    WebElement addedToCartMsg;

    @FindBy (css = "button.button-2.add-to-compare-list-button")
    WebElement addToCompareListBtn;

    @FindBy (xpath = "//p[@class=\"content\"]")
    WebElement addedToCompareListMsg;


    public void clickRegistration (){
        registrationLink.click();
    }

    public void clickOnLogin(){
        loginBtn.click();
    }

    public void switchCurrency (){
        select = new Select(currencyDropList);
        select.selectByVisibleText("Euro");
    }
    
    public void hoverComputerMenu(){
        actions.moveToElement(computers).moveToElement(notebooks)
                .click().build().perform();
    }

    public void clickApparel (){
        apparel.click();
    }

    public void clickOnMacApple (){
        macAppel.click();

    }

    public void clickAddToWishList(){
        wishListBtn.click();
    }

    public void clickAddToCart(){
        addToCartBtn.click();
    }

    public void clickAddToCompareL(){
        addToCompareListBtn.click();
    }

    public WebElement getNotebooksWord() {
        return notebooksWord;
    }

    public WebElement getAddedToWishListMsg() {
        return addedToWishListMsg;
    }

    public WebElement getAddedToCartMsg() {
        return addedToCartMsg;
    }

    public WebElement getAddedToCompareListMsg() {
        return addedToCompareListMsg;
    }
}
