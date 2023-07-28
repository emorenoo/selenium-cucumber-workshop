package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = { "pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumberreport.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/report.html"},
        //plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        tags = "@Test"
)

public class runner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.CloseBrowser();

    }

}