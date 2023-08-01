package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TenPage;

public class TenSteps {
    TenPage tenPage = new TenPage();

    @Given("^navigate in the practice page disabled fields$")
    public void navigatePage(){
        tenPage.navigatePage();
        tenPage.menuPracticas();
        tenPage.clickPruebaDisabledFields();
    }
    @When("^enter complete and disabled fields data$")
    public void enterData(){
        tenPage.selectDates();
        tenPage.enterData();
        Assert.assertEquals("Villanueva",tenPage.ValidateLastName());
        Assert.assertEquals("5540786789",tenPage.ValidatePhone());
        tenPage.clickRadio();
        tenPage.selectOS("Mac");
        tenPage.selectMac("Yosemite");
    }
    @And("^click in the submit button disabled fields$")
    public void submitForm(){
        tenPage.clickSubmit();
    }
    @Then("^load personal data successfully disabled fields$")
    public void uploadedData(){
        tenPage.validateMessage();
        Assert.assertEquals("Gracias por tu encuesta.", tenPage.finalMessage());
        //tenPage.tearDown();
    }
}
