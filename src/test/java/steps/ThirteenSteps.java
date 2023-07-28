package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ThirteenPage;

public class ThirteenSteps {
    ThirteenPage thirteenPage = new ThirteenPage();

    @Given("^navigate in the practice page products$")
    public void navigatePage(){
        thirteenPage.navigatePage();
        thirteenPage.menuPracticas();
        thirteenPage.clickPruebaProducts();
    }
    @And("^click in the submit button products$")
    public void submitForm(){

        thirteenPage.clickSubmit();
    }
    @Then("^does not load data and generate alerts in products$")
    public void validateFirstAlerts(){
        Assert.assertEquals("Please provide a valid first name.", thirteenPage.validateNameAlert());
        Assert.assertEquals("Please provide a valid phone.", thirteenPage.validatePhoneAlert());
        Assert.assertEquals("Please select a product.", thirteenPage.validateProductAlert());
        Assert.assertEquals("Please provide a valid city.", thirteenPage.validateCityAlert());
        Assert.assertEquals("Please select a valid state.", thirteenPage.validateStateAlert());
    }
    @When("^enter products data without address$")
    public void enterData(){

        thirteenPage.enterData();
    }
    @Then("^does not load data and generate alerts again in products$")
    public void validateSecondAlerts(){
        Assert.assertEquals("Please select a product.", thirteenPage.validateProductAlert());
        Assert.assertEquals("Please provide a valid city.", thirteenPage.validateCityAlert());
        Assert.assertEquals("Please select a valid state.", thirteenPage.validateStateAlert());
    }
    @When("^enter complete products form$")
    public void agreeAddress(){
        thirteenPage.enterProduct();
        thirteenPage.enterAddress();
        thirteenPage.selectState("Florida");
    }
    @Then("^load products form successfully$")
    public void uploadedData(){
        thirteenPage.validateMessage();
        Assert.assertEquals("Thank you for placing your order.", thirteenPage.finalMessage());
        //thirteenPage.tearDown();
    }
}
