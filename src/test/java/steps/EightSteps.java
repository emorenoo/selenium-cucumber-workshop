package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EightPage;

public class EightSteps {
    EightPage eightPage = new EightPage();

    @Given("^navigate in the practice page mandatory fields$")
    public void navigatePage(){
        eightPage.navigatePage();
        eightPage.menuPracticas();
        eightPage.clickPruebaRequeridos();
    }

    @When("^click in the submit button mandatory$")
    public void submitForm() throws InterruptedException {
        eightPage.clickSubmit();
    }
    @Then("^does not load personal data and generate alerts$")
    public void validateFirstAlerts(){
        Assert.assertEquals("Minimum character count: 4", eightPage.validateNameAlert());
        Assert.assertEquals("Please provide a valid email.", eightPage.validateEmailAlert());
        Assert.assertEquals("Please choose a valid calendario.", eightPage.validateCalendarAlert());
        Assert.assertEquals("Please choose a valid file upload.", eightPage.validateFileAlert());
    }
    @When("^enter not mandatory data$")
    public void enterNonData() {
        eightPage.enterData();
        eightPage.clickRadio();
        eightPage.selectOS("Mac");
        eightPage.selectMac("Yosemite");
    }
    @Then("^does not load personal data and generate alerts again$")
    public void validateSecondAlerts(){
        Assert.assertEquals("Please choose a valid calendario.", eightPage.validateCalendarAlert());
        Assert.assertEquals("Please choose a valid file upload.", eightPage.validateFileAlert());
    }
    @When("^enter mandatory data$")
    public void enterData() {
        eightPage.selectDates();
        //eightPage.fileUpload();
    }

    @Then("^charge personal data successfully mandatory$")
    public void uploadedData(){
        //eightPage.validateMessage();
        //Assert.assertEquals("Gracias por tu encuesta.", eightPage.finalMessage());
        //eightPage.tearDown();
    }
}
