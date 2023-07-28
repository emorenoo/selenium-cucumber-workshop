package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.NinePage;

public class NineSteps {
    NinePage ninePage = new NinePage();

    @Given("^navigate in the practice page contact information$")
    public void navigatePage(){
        ninePage.navigatePage();
        ninePage.menuPracticas();
        ninePage.clickPruebaContacto();
    }

    @When("^click in the submit button contact information$")
    public void submitForm(){

        ninePage.clickSubmit();
    }
    @Then("^does not load personal data and generate alerts contact information$")
    public void validateFirstAlerts(){
        Assert.assertEquals("Please provide a valid first name.", ninePage.validateNameAlert());
        Assert.assertEquals("Please provide a valid last name.", ninePage.validateLastNameAlert());
        Assert.assertEquals("Please provide a valid email.", ninePage.validateEmailAlert());
        Assert.assertEquals("Please provide consent.", ninePage.validateConsentAlert());
    }
    @When("^enter contact information data without consent$")
    public void enterData(){
        ninePage.enterData();
    }
    @Then("^does not load personal data and generate alerts again contact information$")
    public void validateSecondAlerts(){
        Assert.assertEquals("Please provide consent.", ninePage.validateConsentAlert());
    }
    @When("^enter contact information data with consent$")
    public void agreeConsent(){
        ninePage.clickCheckConsent();
    }

    @Then("^load personal data successfully contact information$")
    public void uploadedData(){
        ninePage.validateMessage();
        Assert.assertEquals("Thank you for your inquiry.", ninePage.finalMessage());
        //ninePage.tearDown();
    }
}
