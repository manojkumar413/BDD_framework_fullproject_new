package stepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class HoverCategory extends TestBase {

    private HomePage homePage;


    @When("user hover at computer category and selects notebook")
    public void userHoverAtComputerCategoryAndSelectsNotebook() {
        homePage = new HomePage(driver);
        homePage.hoverComputerMenu();
    }

    @Then("user could see all notebooks")
    public void userCouldSeeAllNotebooks() {
        Assert.assertTrue(homePage.getNotebooksWord().getText().contains("Notebook"));
    }
}
