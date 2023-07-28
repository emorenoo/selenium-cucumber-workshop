package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ElevenPage;

public class ElevenSteps {
    ElevenPage elevenPage = new ElevenPage();

    @Given("^navigate in the practice page course$")
    public void navigatePage(){
        elevenPage.navigatePage();
        elevenPage.menuPracticas();
        elevenPage.clickPruebaCourse();
    }
    @And("^click in the submit button course$")
    public void submitForm(){
        elevenPage.clickSubmit();
    }
    @Then("^does not load personal data and generate alerts course$")
    public void validateFirstAlerts(){
        Assert.assertEquals("Please provide a valid first name.", elevenPage.validateNameAlert());
        Assert.assertEquals("Please provide a valid phone.", elevenPage.validatePhoneAlert());
        Assert.assertEquals("Please provide a valid city.", elevenPage.validateCityAlert());
        Assert.assertEquals("Please select a valid state.", elevenPage.validateStateAlert());
    }
    @When("^enter course data without address$")
    public void enterData(){
        elevenPage.enterData();
    }
    @Then("^does not load personal data and generate alerts again course$")
    public void validateSecondAlerts(){
        Assert.assertEquals("Please provide a valid city.", elevenPage.validateCityAlert());
        Assert.assertEquals("Please select a valid state.", elevenPage.validateStateAlert());
    }
    @When("^enter complete course data$")
    public void agreeAddress(){
        elevenPage.enterAddress();
        elevenPage.selectState("Florida");
        elevenPage.enterPersonal();
    }
    @Then("^load personal data successfully course$")
    public void uploadedData(){
        elevenPage.validateMessage();
        Assert.assertEquals("Thank you for your entry.", elevenPage.finalMessage());
        //elevenPage.tearDown();
    }
}
