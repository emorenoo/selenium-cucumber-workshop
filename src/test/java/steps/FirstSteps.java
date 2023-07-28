package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FirstPage;

public class FirstSteps {

    FirstPage firstPage = new FirstPage();

    @Given("^navigate in the practice page$")
    public void navigatePage(){
        firstPage.navigatePage();
        firstPage.menuPracticas();
        firstPage.clickDatosPersonales();
    }
    @When("^enter complete and mandatory data$")
    public void enterData(){
        firstPage.enterData();

    }
    @And("^click in the submit button$")
    public void submitForm(){

       firstPage.clickSubmit();
    }
    @Then("^charge personal data successfully$")
    public void uploadedData(){
        firstPage.validateMessage();
        Assert.assertEquals("Gracias por tu encuesta.",firstPage.finalMessage());
        //firstPage.tearDown();
    }
}