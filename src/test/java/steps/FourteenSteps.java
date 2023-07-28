package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FourteenPage;

public class FourteenSteps {
    FourteenPage fourteenPage = new FourteenPage();

    @Given("^navigate in the practice page membership$")
    public void navigatePage(){
        fourteenPage.navigatePage();
        fourteenPage.menuPracticas();
        fourteenPage.clickPruebaMembership();
    }
    @And("^click in the submit button membership$")
    public void submitForm(){

        fourteenPage.clickSubmit();
    }
    @Then("^does not load data and generate alerts in membership$")
    public void validateFirstAlerts(){
        Assert.assertEquals("Please provide a valid site name.", fourteenPage.validateSiteNameAlert());
        Assert.assertEquals("Please provide a valid url.", fourteenPage.validateUrlAlert());
        Assert.assertEquals("Please provide a valid first name.", fourteenPage.validateNameAlert());
        Assert.assertEquals("Please provide a valid phone.", fourteenPage.validatePhoneAlert());
        Assert.assertEquals("Please provide a valid city.", fourteenPage.validateCityAlert());
        Assert.assertEquals("Please select a valid state.", fourteenPage.validateStateAlert());
        Assert.assertEquals("Please provide a valid title.", fourteenPage.validateTitleAlert());
    }
    @When("^enter membership data without address$")
    public void enterData(){
        fourteenPage.enterData();
        fourteenPage.enterAddress();
        fourteenPage.selectState("Florida");
    }
    @Then("^does not load data and generate alerts again in membership$")
    public void validateSecondAlerts(){
        Assert.assertEquals("Please provide a valid site name.", fourteenPage.validateSiteNameAlert());
        Assert.assertEquals("Please provide a valid url.", fourteenPage.validateUrlAlert());
    }
    @When("^enter complete membership form$")
    public void agreeSiteInformation(){
        fourteenPage.enterSiteInformation();
    }
    @Then("^load membership form successfully$")
    public void uploadedData(){
        fourteenPage.validateMessage();
        Assert.assertEquals("Thank you for your application.", fourteenPage.finalMessage());
        //fourteenPage.tearDown();
    }
}
