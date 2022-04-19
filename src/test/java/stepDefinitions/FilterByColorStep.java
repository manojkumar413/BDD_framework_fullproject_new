package stepDefinitions;

import Pages.ApparelPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class FilterByColorStep extends TestBase {

    private HomePage homePage;
    private ApparelPage apparelPage;



    @Given("user navigates to Apparel & shoes")
    public void userNavigatesToApparelShoes() {
        homePage =new HomePage(driver);
        homePage.clickApparel();
    }


    @When("selects the red shoes")
    public void selectsTheRedShoes() {
        apparelPage = new ApparelPage(driver);
        apparelPage.selectColor();
    }

    @Then("user could see the price of the red shoes")
    public void userCouldSeeThePriceOfTheRedShoes() {
        Assert.assertTrue(apparelPage.getShoePrice().getText().contains("$27"));
    }
}
