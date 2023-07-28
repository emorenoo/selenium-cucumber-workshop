package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SevenPage;

public class SevenSteps {
    SevenPage sevenPage = new SevenPage();

    @Given("^navigate in the practice page file$")
    public void navigatePage(){
        sevenPage.navigatePage();
        sevenPage.menuPracticas();
        sevenPage.clickPruebaCalendario();
    }
    @When("^enter complete and file data$")
    public void enterData() {
        sevenPage.enterData();
        sevenPage.clickRadio();
        sevenPage.selectOS("Mac");
        sevenPage.selectMac("Yosemite");
        sevenPage.selectDates();
        sevenPage.fileUpload();
    }
    @And("^click in the submit button file$")
    public void submitForm() {
        sevenPage.clickSubmit();
    }
    @Then("^charge personal data successfully file$")
    public void uploadedData(){
        sevenPage.validateMessage();
        Assert.assertEquals("Gracias por tu encuesta.", sevenPage.finalMessage());
        //sevenPage.tearDown();
    }
}
