package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FifteenPage;

public class FifteenSteps {
    FifteenPage fifteenPage = new FifteenPage();

    @Given("^navigate in the practice page school$")
    public void navigatePage(){
        fifteenPage.navigatePage();
        fifteenPage.menuPracticas();
        fifteenPage.clickPruebaSchool();
        Assert.assertEquals("0%", fifteenPage.progressOne());
    }
    @Then("^does not load data and generate alerts in school - personal information$")
    public void validateFirstAlerts(){
        Assert.assertEquals("Please provide a valid first name.", fifteenPage.validateNameAlert());
        Assert.assertEquals("Please provide a valid phone.", fifteenPage.validatePhoneAlert());
        Assert.assertEquals("Please provide a valid city.", fifteenPage.validateCityAlert());
        Assert.assertEquals("Please select a valid state.", fifteenPage.validateStateAlert());
    }
    @When("^enter school - personal information data$")
    public void enterFirstData(){
        fifteenPage.enterData();
        fifteenPage.selectState("Florida");
    }
    @And("^click in the next button school - personal information$")
    public void nextFirstForm(){
        fifteenPage.clickNextFirstButton();
    }
    @When("^show school - secondary education form$")
    public void showSecondPage(){
        Assert.assertEquals("57%", fifteenPage.progressTwo());
    }
    @Then("^does not load data and generate alerts in school - secondary education$")
    public void validateSecondAlerts(){
        Assert.assertEquals("Please provide a valid high school.", fifteenPage.validateHighSchoolAlert());
        Assert.assertEquals("Please provide a valid city.", fifteenPage.validateCitySAlert());
        Assert.assertEquals("Please select a valid state.", fifteenPage.validateStateSAlert());
        Assert.assertEquals("Please provide a valid answer.", fifteenPage.validateFirstQuestionAlert());
    }
    @When("^enter complete school - secondary education form$")
    public void enterSecondData(){
        fifteenPage.secondData();
        fifteenPage.selectStateTwo("Kansas");
        fifteenPage.selectQuestionOne("Yes");
    }
    @And("^click in the next button school - secondary education$")
    public void nextSecondForm(){

        fifteenPage.clickNextSecondButton();
    }
    @When("^show school - post secondary education form$")
    public void showThirdPage(){
        Assert.assertEquals("86%", fifteenPage.progressThree());
    }
    @Then("^does not load data and generate alerts in school - post secondary education$")
    public void validateThirdAlerts(){
        Assert.assertEquals("Please provide a valid answer.", fifteenPage.validateSecondQuestionAlert());
    }
    @When("^enter complete school - post secondary education form$")
    public void enterThirdData(){
        fifteenPage.selectQuestionTwo("Yes");
        fifteenPage.clickSubmit();
        Assert.assertEquals("Please provide a valid college/technical.", fifteenPage.validateCollegeAlert());
        Assert.assertEquals("Please provide a valid city.", fifteenPage.validateCityTAlert());
        Assert.assertEquals("Please select a valid state.", fifteenPage.validateStateTAlert());
        Assert.assertEquals("Please provide a valid area of study.", fifteenPage.validateAreaStudyAlert());
        fifteenPage.thirdData();
        fifteenPage.selectStateThird("Georgia");
    }
    @And("^click in the next button school - post secondary education$")
    public void nextThirdForm(){

        fifteenPage.clickNextThirdButton();
    }
    @When("^show school - personal statement form$")
    public void showFourPage(){
        Assert.assertEquals("94%", fifteenPage.progressFour());
    }
    @Then("^does not load data and generate alerts in school - personal statement$")
    public void validateFourAlerts(){
        Assert.assertEquals("Please provide a valid personal statement.", fifteenPage.validateCommentsAlert());
    }
    @When("^enter complete school - personal statement form$")
    public void enterFourData(){
        fifteenPage.fourData();
        Assert.assertEquals("100%", fifteenPage.progressFour());
        Assert.assertEquals("82 characters / 16 words", fifteenPage.helpCharactersAndWords());

    }
    @When("^click in the submit button school$")
    public void submitForm(){

        fifteenPage.clickSubmit();
    }
    @Then("^load school form successfully$")
    public void uploadedData(){
        fifteenPage.validateMessage();
        Assert.assertEquals("Thank you for your application.", fifteenPage.finalMessage());
        //fifteenPage.tearDown();
    }
}
