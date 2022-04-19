package stepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RecoverPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

public class RecoverForgottenPassword extends TestBase {

    static private HomePage homePage;
    static private LoginPage loginPage;
    static private RecoverPasswordPage recoverPasswordPage;


    @When("clicks on forgot password")
    public void clicksOnForgotPassword() {
        loginPage = new LoginPage(driver);
        loginPage.clickForgotPassword();
    }

    @Then("user enters the email {string} to become the link to recover his password")
    public void userEntersTheEmailToBecomeTheLinkToRecoverHisPassword(String email) {
        recoverPasswordPage = new RecoverPasswordPage(driver);
        recoverPasswordPage.recoverPassword(email);
    }

    @And("user becomes an email and could recover password")
    public void userBecomesAnEmailAndCouldRecoverPassword() {
        Assert.assertTrue(recoverPasswordPage.getRecoverMsg().getText().
                contains("Email with instructions has been sent to you"));
    }

}
