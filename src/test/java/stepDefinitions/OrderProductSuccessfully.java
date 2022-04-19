package stepDefinitions;

import Pages.HomePage;
import Pages.OrderPage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class OrderProductSuccessfully extends TestBase {

    private HomePage homePage;
    private RegistrationPage registrationPage;
    private OrderPage orderPage;
    static private int count = 2;
    static private String gender = "Male";
    static private String firstName = "Mof";
    static private String lastName = "Zak";
    static private String email = "m99@test.com";
    static private String password = "12341234";
    static private String country = "Egypt";
    static private String city = "Cairo";
    static private String address = "12St";
    static private String zibCode = "10";
    static private String phoneNr = "01203320000";



    @Given("user add mac appel note book to shopping cart")
    public void userCouldAddMacAppelNoteBookToShoppingCart() {
        homePage = new HomePage(driver);
        homePage.clickOnMacApple();
        homePage.clickAddToCart();
    }

    @And("user go to shopping cart")
    public void userGoToShoppingCart() {
        orderPage = new OrderPage(driver);
        orderPage.goToShoppingCart();
    }

    @And("update the shopping cart")
    public void selectsNoteBooksAndUpdateTheShoppingCart() {
        orderPage.selectQuantityAndUpdateCart();
    }


    @And("should register to continue with order")
    public void shouldRegisterToContinueWithOrder() {
        registrationPage = new RegistrationPage(driver);
        registrationPage.register(gender, firstName, lastName,email, password, password);
    }

    @And("enters the shipping address and payment")
    public void entersTheShippingAddressAndPayment() {
        orderPage.continueToOrder(country, city, address, zibCode, phoneNr);
    }

    @Then("user could order his product successfully")
    public void userCouldOrderHisProductSuccessfully() {
        String confirmationMsg = orderPage.getConfirmationMsg().getText();
        Assert.assertTrue(confirmationMsg.contains("Checkout"));
    }
}
