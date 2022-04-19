package stepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class AddingItemToShoppingcart extends TestBase {
   
    private HomePage homePage;


    @When("user added it to the shopping cart")
    public void userClicksOnTheProductMacAppelNoteBookAndAddedItToTheShoppingCart() {
        homePage = new HomePage(driver);
        homePage.clickAddToCart();
    }

    @Then("user can add this item to the shopping cart and a confirmation message will be shown")
    public void userCanAddThisItemToTheShoppingCartAndAConfirmationMessageWillBeShown() {
        Assert.assertTrue(homePage.getAddedToCartMsg().getText().
                contains("The product has been added to your"));
    }
}
