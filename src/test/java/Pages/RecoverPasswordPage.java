package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecoverPasswordPage extends PageFactoryPage {


    public RecoverPasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "Email")
    WebElement emailToRecover;

    @FindBy (xpath = "//button[@name=\"send-email\"]")
    WebElement recoverBtn;

    @FindBy (xpath = "//p[@class=\"content\"]")
    WebElement recoverMsg;

    public void recoverPassword(String email){
        emailToRecover.sendKeys(email);
        recoverBtn.click();
    }

    public WebElement getRecoverMsg() {
        return recoverMsg;
    }
}
