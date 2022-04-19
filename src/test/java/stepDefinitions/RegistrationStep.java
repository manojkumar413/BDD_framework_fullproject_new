package stepDefinitions;

import Pages.HomePage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilites.TestBase;

import java.io.IOException;

public class RegistrationStep extends TestBase {

    static RegistrationPage registrationPage;
    static HomePage homePage;

    public RegistrationStep() throws IOException {
    }

    @Given("User clicks on register button")
    public void clickOnRegistrationBtn (){
        homePage = new HomePage(driver);
        homePage.clickRegistration();
    }

    @When("enters {string}, {string}, {string}, {string} and {string}")
    public void entersAndConfirm(String gender, String fname, String lname, String email,
                                 String password) {
        registrationPage = new RegistrationPage(driver);
        registrationPage.register(gender, fname, lname, email, password, password);
    }

    @Then("User registered successfully and confirmation message will appear")
    public void userRegisteredSuccessfullyAndConfirmationMessageWillAppear() {
        String message = registrationPage.getRigsteredMsg().getText();
        Assert.assertTrue(message.contains("Your registration completed"));

    }

    @And("log out")
    public void logOut() {
        registrationPage = new RegistrationPage(driver);
        registrationPage.logOut();
    }
}
