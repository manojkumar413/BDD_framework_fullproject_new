package stepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class AddingProductToWishList extends TestBase {

    private HomePage homePage;


    @Given("")
    @Given("user clicks on the product mac appel note book")
    public void userClicksOnTheProductMacAppelNoteBookAndAddedItToWishList() {
        homePage = new HomePage(driver);
        homePage.clickOnMacApple();
    }

    @When("user add the product to wish list")
    public void userAddTheProductToWishList(){
        homePage.clickAddToWishList();
    }

    @Then("user can add this item to the wish list and a confirmation message will be shown")
    public void userCanAddThisItemToTheWishListAndAConfirmationMessageWillBeShown() {
        Assert.assertTrue(homePage.getAddedToWishListMsg().getText().
                contains("The product has been added to your"));
    }
}
