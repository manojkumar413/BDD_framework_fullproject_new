package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends PageFactoryPage {

    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (linkText = "shopping cart")
    WebElement shoppingCartBtn;

    @FindBy (id = "itemquantity11223")
    WebElement itemQuantity;

    @FindBy (id = "updatecart")
    WebElement updateCartBtn;

    @FindBy (id = "termsofservice")
    WebElement agreeBtn;

    @FindBy (id = "checkout")
    WebElement checkOutBtn;

    @FindBy (xpath = "//button[@class=\"button-1 register-button\"]")
    WebElement registerBtn;

    @FindBy (xpath = "//a[@href=\"/cart\"][@class=\"button-1 register-continue-button\"]")
    WebElement continueAfterRegisterBtn;

    @FindBy (id = "BillingNewAddress_CountryId")
    WebElement countryList;

    @FindBy (id = "BillingNewAddress_City")
    WebElement citytxt;

    @FindBy (id = "BillingNewAddress_Address1")
    WebElement addressTxt;

    @FindBy (id = "BillingNewAddress_ZipPostalCode")
    WebElement zibCodeTxt;

    @FindBy (id = "BillingNewAddress_PhoneNumber")
    WebElement phoneTxt;

    @FindBy (xpath = "//button[@type=\"button\"][@name=\"save\"][@class=\"button-1 new-address-next-step-button\"]")
    WebElement continueToAddress;

    @FindBy (xpath = "//button[@type=\"button\"][@class=\"button-1 shipping-method-next-step-button\"]")
    WebElement continueToShippingMethodtBtn;

    @FindBy (xpath = "//button[@type=\"button\"][@class=\"button-1 payment-method-next-step-button\"]")
    WebElement continueToPaymentBtn;

    @FindBy (xpath = "//button[@type=\"button\"][@class=\"button-1 payment-info-next-step-button\"]")
    WebElement continueToConfirm;

    @FindBy (xpath = "//button[@class=\"button-1 confirm-order-next-step-button\"]")
    WebElement confirmBtn;

    @FindBy (xpath = "//h1")
    WebElement confirmationMsg;


    public void goToShoppingCart (){
        shoppingCartBtn.click();
    }
    public void selectQuantityAndUpdateCart(){
        updateCartBtn.click();
        agreeBtn.click();
        checkOutBtn.click();
        registerBtn.click();
    }

    public void continueToOrder(String country, String city,
                                String address, String zibCode, String phone){
        continueAfterRegisterBtn.click();
        agreeBtn.click();
        checkOutBtn.click();
        select = new Select(countryList);
        select.selectByVisibleText(country);
        citytxt.sendKeys(city);
        addressTxt.sendKeys(address);
        zibCodeTxt.sendKeys(zibCode);
        phoneTxt.sendKeys(phone);
        continueToAddress.click();
        continueToShippingMethodtBtn.click();
        continueToPaymentBtn.click();
        continueToConfirm.click();
        confirmBtn.click();
    }

    public WebElement getConfirmationMsg() {
        return confirmationMsg;
    }
}
