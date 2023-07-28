package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ThirdPage;

public class ThirdSteps {
    ThirdPage thirdPage = new ThirdPage();

    @Given("^navigate in the practice page radio$")
    public void navigatePage(){
        thirdPage.navigatePage();
        thirdPage.menuPracticas();
        thirdPage.clickPruebaRadio();
    }
    @When("^enter complete and radio data$")
    public void enterData(){
        thirdPage.enterData();
        thirdPage.clickRadio();
    }
    @And("^click in the submit button radio$")
    public void submitForm(){
        thirdPage.clickSubmit();
    }
    @Then("^charge personal data successfully radio$")
    public void uploadedData(){
        thirdPage.validateMessage();
        Assert.assertEquals("Gracias por tu encuesta.",thirdPage.finalMessage());
        //thirdPage.tearDown();
    }
}
