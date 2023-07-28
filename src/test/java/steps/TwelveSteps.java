package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TwelvePage;

public class TwelveSteps {
    TwelvePage twelvePage = new TwelvePage();

    @Given("^navigate in the practice page survey$")
    public void navigatePage(){
        twelvePage.navigatePage();
        twelvePage.menuPracticas();
        twelvePage.clickPruebaSurvey();
    }

    @When("^enter complete survey$")
    public void enterData(){
        twelvePage.enterData();
    }
    @And("^click in the submit button survey$")
    public void submitForm(){
        twelvePage.clickSubmit();
    }

    @Then("^load survey successfully$")
    public void uploadedData(){
        twelvePage.validateMessage();
        Assert.assertEquals("Thank you for your feedback.", twelvePage.finalMessage());
        //twelvePage.tearDown();
    }
}
