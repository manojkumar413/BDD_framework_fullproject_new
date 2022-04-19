package stepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class LoginStep extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;

    @Given("user at home page password forgotten")
    @Given("user at home home page and click log in")
    public void userLoginWithValidData() {
        homePage = new HomePage(driver);
        homePage.clickOnLogin();
    }

    @When ("user enters valid {string} and {string}")
    public void user_enters_valid_data(String email, String password){
        loginPage = new LoginPage(driver);
        loginPage.login(email, password);
    }

    @Then("user can log in successfully to his account")
    public void userCanLogInSuccessfullyToHisAccount() {

        registrationPage = new RegistrationPage(driver);
        String logOut = registrationPage.getLogoutBtn().getText();
        Assert.assertTrue(logOut.equals("Log out"));
    }

}
