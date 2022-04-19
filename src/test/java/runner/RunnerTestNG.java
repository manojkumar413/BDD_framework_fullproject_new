package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilites.TestBase;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions","utilites"},
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/cucumber-reports/rerun.txt"
        })


public class RunnerTestNG extends AbstractTestNGCucumberTests {

}

