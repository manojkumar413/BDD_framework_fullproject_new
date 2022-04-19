package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageFactoryPage {


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "gender-male")
    WebElement genderMale;

    @FindBy (id = "gender-female")
    WebElement genderFemale;

    @FindBy (id = "FirstName")
    WebElement firstNameText;

    @FindBy (id = "LastName")
    WebElement lastNameText;

    @FindBy (id = "Email")
    WebElement emailText;

    @FindBy (id = "Password")
    WebElement passwordText;

    @FindBy (id = "ConfirmPassword")
    WebElement confirmPasswordText;

    @FindBy (id = "register-button")
    WebElement registerBtn;

    @FindBy (css = "div.result")
    WebElement rigsteredMsg;

    @FindBy (xpath = "//a[@class=\"ico-logout\"]")
    WebElement logoutBtn;


    public void register(String gender, String firstName, String lastName, String email,
                         String password, String confirmPassword){
        if (gender == "Male") {
            genderMale.click();
        }
        else {
            genderFemale.click();
        }
        firstNameText.sendKeys(firstName);
        lastNameText.sendKeys(lastName);
        emailText.sendKeys(email);
        passwordText.sendKeys(password);
        confirmPasswordText.sendKeys(confirmPassword);
        registerBtn.click();
    }

    public void logOut (){
        logoutBtn.click();
    }

    public WebElement getRigsteredMsg() {
        return rigsteredMsg;
    }

    public WebElement getLogoutBtn() {
        return logoutBtn;
    }
}
