package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends PageFactoryPage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "Email")
    WebElement emailTxt;

    @FindBy (id = "Password")
    WebElement passwordTxt;

    @FindBy (xpath = "//button[@class=\"button-1 login-button\"]")
    WebElement loginBtn;

    @FindBy(linkText = "Forgot password?")
    WebElement forgotPasswordBtn;


    public void login (String email, String password){
        emailTxt.sendKeys(email);
        passwordTxt.sendKeys(password);
        loginBtn.click();
    }

    public void clickForgotPassword(){
        forgotPasswordBtn.click();
    }

}

