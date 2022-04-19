package stepDefinitions;

import Pages.HomePage;
import Pages.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class CurrencyChange extends TestBase {

    private HomePage homePage;
    private SearchPage searchPage;

    @When("user selects currency drop list and chooses Euro")
    public void userSelectsCurrencyDropListAndChoosesEuro() {
        homePage = new HomePage(driver);
        homePage.switchCurrency();
    }


    @Then("user sees the price of the product in Euro")
    public void userSeesThePriceOfTheProductInEuro() {
        searchPage = new SearchPage(driver);
        searchPage.searchItem("Apple MacBook Pro 13-inch");
        searchPage.clickButton();
        Assert.assertTrue(searchPage.getEuroIcon().getText().contains("€"));
    }

}
