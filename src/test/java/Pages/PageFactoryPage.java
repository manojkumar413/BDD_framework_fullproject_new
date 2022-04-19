package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageFactoryPage {

     static protected WebDriver driver;
     static protected Select select;
     static Actions actions;

    public PageFactoryPage(WebDriver driver) {
        this.driver = driver;
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }
}
