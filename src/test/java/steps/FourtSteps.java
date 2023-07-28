package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FourtPage;

public class FourtSteps {
    FourtPage fourtPage = new FourtPage();

    @Given("^navigate in the practice page combobox$")
    public void navigatePage(){
        fourtPage.navigatePage();
        fourtPage.menuPracticas();
        fourtPage.clickPruebaComboBox();
    }
    @When("^enter complete and combobox data$")
    public void enterData(){
        fourtPage.enterData();
        fourtPage.clickRadio();
        fourtPage.selectOS("Mac");
    }
    @And("^click in the submit button combobox$")
    public void submitForm(){
        fourtPage.clickSubmit();
    }
    @Then("^charge personal data successfully combobox$")
    public void uploadedData(){
        fourtPage.validateMessage();
        Assert.assertEquals("Gracias por tu encuesta.",fourtPage.finalMessage());
        //fourtPage.tearDown();
    }
}
