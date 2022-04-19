package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "target/cucumber-reports/rerun.txt",
        glue = {"stepDefinitions", "utilites"},
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        })

public class RerunnerFailedTests extends AbstractTestNGCucumberTests {
}
