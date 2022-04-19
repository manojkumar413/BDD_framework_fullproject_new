package stepDefinitions;

import Pages.ApparelPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilites.TestBase;

public class SelectTagStep extends TestBase {

    HomePage homePage;
    ApparelPage apparelPage;


    @Then("user navigates to awesome tag")
    public void userNavigatesToAwesomeTag() {
        apparelPage = new ApparelPage(driver);
        apparelPage.clickOnAwesome();
    }

    @And("user could find all products under the awesome tag")
    public void userCouldFindAllProductsUnderTheAwesomeTag() {
        Assert.assertTrue(apparelPage.getProductsTaggedTxt().getText().contains("Products tagged with 'awesome"));
    }
}
