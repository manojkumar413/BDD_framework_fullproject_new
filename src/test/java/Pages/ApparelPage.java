package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelPage extends PageFactoryPage {

    public ApparelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[@title=\"Show products in category Shoes\"]")
    WebElement shoes;

    @FindBy (id = "attribute-option-15")
    WebElement shoeColor;

    @FindBy (xpath = "//img[@alt=\"Picture of adidas Consortium Campus 80s Running Shoes\"][@src=\"https://demo.nopcommerce.com/images/thumbs/0000053_adidas-consortium-campus-80s-running-shoes_415.jpg\"]")
    WebElement redShoe;

    @FindBy (xpath = "//span[@class=\"price actual-price\"]")
    WebElement shoPrice;

    @FindBy(xpath = "//h1")
    WebElement shoeName;

    @FindBy (xpath = "//a[@href=\"/awesome\"]")
    WebElement awesomeTag;

    @FindBy (xpath = "//h1")
    WebElement productsTaggedTxt;

    public void selectColor(){
        shoes.click();
        shoeColor.click();
    }

    public void clickOnRedShoe(){
        redShoe.click();
    }

    public void clickOnAwesome(){
        awesomeTag.click();
    }

    public WebElement getShoePrice() {
        return shoPrice;
    }

    public WebElement getProductsTaggedTxt() {
        return productsTaggedTxt;
    }

    public WebElement getShoeName() {
        return shoeName;
    }
}




