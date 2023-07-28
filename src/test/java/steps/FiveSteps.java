package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FivePage;

public class FiveSteps {

    FivePage fivePage = new FivePage();

    @Given("^navigate in the practice page combobox2$")
    public void navigatePage(){
        fivePage.navigatePage();
        fivePage.menuPracticas();
        fivePage.clickPruebaComboBoxD();
    }
    @When("^enter complete and combobox2 data$")
    public void enterData(){
        fivePage.enterData();
        fivePage.clickRadio();
        fivePage.selectOS("Mac");
        fivePage.selectMac("Yosemite");
    }
    @And("^click in the submit button combobox2$")
    public void submitForm(){
        fivePage.clickSubmit();
    }
    @Then("^charge personal data successfully combobox2$")
    public void uploadedData(){
        fivePage.validateMessage();
        Assert.assertEquals("Gracias por tu encuesta.",fivePage.finalMessage());
        //fivePage.tearDown();
    }
}
