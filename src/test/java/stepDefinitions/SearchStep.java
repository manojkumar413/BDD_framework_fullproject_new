package stepDefinitions;

import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class SearchStep extends TestBase {
    private SearchPage searchPage;

    @Given("user writes item name {string} to search it")
    public void userWritesItemNameToSearchIt(String itemName) {
        searchPage = new SearchPage(driver);
        searchPage.searchItem(itemName);

    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button(){
        searchPage.clickButton();
    }

    @Then("user finds the product and can add it to the cart")
    public void userFindsTheProductAndCanAddItToTheCart() {
        Assert.assertEquals(searchPage.getAddToCartBtn().getText(), "ADD TO CART");
    }

}
