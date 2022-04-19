package stepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class AddingItemToCompareList extends TestBase {

    private HomePage homePage;

    @When("user added it to compare list")
    public void userClicksOnAProductMacAppelNoteBookAndAddedItToCompareList() {
        homePage = new HomePage(driver);
        homePage.clickAddToCompareL();
    }

    @Then("user can add this item to the compare list and a confirmation message will be shown")
    public void userCanAddThisItemToTheCompareListAndAConfirmationMessageWillBeShown() {
        Assert.assertTrue(homePage.getAddedToCompareListMsg().getText().
                contains("The product has been added to your"));
    }
}
