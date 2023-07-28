package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SixPage;

public class SixSteps {
    SixPage sixPage = new SixPage();

    @Given("^navigate in the practice page calendar$")
    public void navigatePage(){
        sixPage.navigatePage();
        sixPage.menuPracticas();
        sixPage.clickPruebaCalendario();
    }
    @When("^enter complete and calendar data$")
    public void enterData(){
        sixPage.enterData();
        sixPage.clickRadio();
        sixPage.selectOS("Mac");
        sixPage.selectMac("Yosemite");
        sixPage.selectDates();
    }
    @And("^click in the submit button calendar$")
    public void submitForm(){
        sixPage.clickSubmit();
    }
    @Then("^charge personal data successfully calendar$")
    public void uploadedData(){
        sixPage.validateMessage();
        Assert.assertEquals("Gracias por tu encuesta.",sixPage.finalMessage());
        //sixPage.tearDown();
    }
}
