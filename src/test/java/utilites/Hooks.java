package utilites;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
//import org.apache.commons.io.FileUtils;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Hooks extends TestBase {


    @Before
    public void openBrowser() throws IOException {

            String browser = getProp("browser");

        if (browser.equalsIgnoreCase("chrome")) {
                  instantiateChrome();
        }

        else if (browser.equalsIgnoreCase("firefox")) {
                  instantiateFireFox();
        }
    }

    @AfterStep
    public void addScreenshot (Scenario scenario) throws IOException {
        if (scenario.isFailed()){
           File sourcePath =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
           scenario.attach(fileContent,"image/png", "image");
        }
    }

    @After
    public void closeDriver(){
        driver.quit();
    }

}