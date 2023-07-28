package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SecondPage;

public class SecondSteps {

    SecondPage secondPage = new SecondPage();

    @Given("^navigate in the practice page checkbox$")
    public void navigatePage(){
        secondPage.navigatePage();
        secondPage.menuPracticas();
        secondPage.clickPruebaCheckBox();
    }
    @When("^enter complete and checkbox data$")
    public void enterData(){
        secondPage.enterData();
        secondPage.clickCheckbox();

    }
    @And("^click in the submit button checkbox$")
    public void submitForm(){

        secondPage.clickSubmit();
    }
    @Then("^charge personal data successfully checkbox$")
    public void uploadedData(){
        secondPage.validateMessage();
        Assert.assertEquals("Gracias por tu encuesta.",secondPage.finalMessage());
        //secondPage.tearDown();
    }
}
