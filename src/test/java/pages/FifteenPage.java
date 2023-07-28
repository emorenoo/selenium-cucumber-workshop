package pages;

import org.openqa.selenium.By;

public class FifteenPage extends BasePage{
    By menuButton = By.id("menu-item-179");
    By testSchoolButton = By.id("menu-item-556");
    By progressOne = By.cssSelector("#wsf-1-help-183");
    By campoNombre = By.cssSelector("#wsf-1-field-184");
    By campoApellido = By.cssSelector("#wsf-1-field-185");
    By campoEmail = By.cssSelector("#wsf-1-field-187");
    By campoPhone = By.cssSelector("#wsf-1-field-186");
    By campoDireccion = By.cssSelector("#wsf-1-field-188");
    By campoCity = By.cssSelector("#wsf-1-field-190");
    By campoPostal = By.cssSelector("#wsf-1-field-192");
    By stateOptions = By.id("wsf-1-field-191");
    By submitButton = By.cssSelector("#wsf-1-field-214");
    By succesfullMessage = By.xpath("//p[contains(text(),'Thank you for your application.')]");
    By nameAlert = By.cssSelector("#wsf-1-invalid-feedback-184");
    By phoneAlert = By.cssSelector("#wsf-1-invalid-feedback-186");
    By cityAlert = By.cssSelector("#wsf-1-invalid-feedback-190");
    By stateAlert = By.cssSelector("#wsf-1-invalid-feedback-191");
    By statementButton = By.xpath("//a[contains(text(),'Personal Statement')]");
    By firstNextButton = By.cssSelector("#wsf-1-field-193");

    By highSchoolAlert = By.cssSelector("#wsf-1-invalid-feedback-195");
    By cityDoslAlert = By.cssSelector("#wsf-1-invalid-feedback-196");
    By stateDoslAlert = By.cssSelector("#wsf-1-invalid-feedback-197");
    By firstQuestionAlert = By.cssSelector("#wsf-1-invalid-feedback-198");
    By progressTwo = By.cssSelector("#wsf-1-help-194");
    By campoHigh = By.cssSelector("#wsf-1-field-195");
    By campoCityDos = By.cssSelector("#wsf-1-field-196");
    By campoStateDos = By.cssSelector("#wsf-1-field-197");
    By campoQuestionOne = By.id("wsf-1-field-198");
    By firstPreviousButton = By.cssSelector("#wsf-1-field-200");
    By secondNextButton = By.cssSelector("#wsf-1-field-201");

    By progressThree = By.cssSelector("#wsf-1-help-202");
    By secondQuestionAlert = By.cssSelector("#wsf-1-invalid-feedback-203");
    By campoQuestionTwo = By.id("wsf-1-field-203");
    By collegeAlert = By.cssSelector("#wsf-1-invalid-feedback-204");
    By cityTreslAlert = By.cssSelector("#wsf-1-invalid-feedback-205");
    By stateTreslAlert = By.cssSelector("#wsf-1-invalid-feedback-206");
    By areaOfStudyAlert = By.cssSelector("#wsf-1-invalid-feedback-207");
    By campoCollege= By.cssSelector("#wsf-1-field-204");
    By campoCityTres = By.cssSelector("#wsf-1-field-205");
    By campoStateTres = By.cssSelector("#wsf-1-field-206");
    By campoAreaOfStudy = By.id("wsf-1-field-207");
    By secondPreviousButton = By.cssSelector("#wsf-1-field-209");
    By thirdNextButton = By.cssSelector("#wsf-1-field-210");

    By progressFour = By.cssSelector("#wsf-1-help-211");
    By commentsAlert = By.cssSelector("#wsf-1-invalid-feedback-212");
    By campoComments = By.cssSelector("#wsf-1-field-212");
    By campoHelp = By.cssSelector("#wsf-1-help-212");

    public FifteenPage(){

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaSchool(){

        clickElement(testSchoolButton);
    }
    public void enterData(){
        write("Andres",campoNombre);
        write ("Mendez",campoApellido);
        write("andres.mendez@yopmail.com",campoEmail);
        write ("3205689420",campoPhone);
        write("Calle 24 D",campoDireccion);
        write("Bogota",campoCity);
        write("30323",campoPostal);
    }
    public void selectState(String options){

        selectDropdownByText(stateOptions, options);
    }
    public String progressOne(){

        return textFromElement(progressOne);
    }
    public void clickSubmit(){
        clickElement(statementButton);
        clickElement(submitButton);
    }
    public void validateMessage(){
        isDisplayed(succesfullMessage);
    }
    public String finalMessage() {
        return textFromElement(succesfullMessage);
    }
    public void tearDown(){
        driver.quit();
    }
    public String validateNameAlert(){
        return textFromElement(nameAlert);
    }
    public String validatePhoneAlert(){
        return textFromElement(phoneAlert);
    }
    public String validateCityAlert(){
        return textFromElement(cityAlert);
    }
    public String validateStateAlert(){
        return textFromElement(stateAlert);
    }
    public String validateHighSchoolAlert(){return textFromElement(highSchoolAlert);}
    public String validateCitySAlert(){
        return textFromElement(cityDoslAlert);
    }
    public String validateStateSAlert(){
        return textFromElement(stateDoslAlert);
    }
    public String validateFirstQuestionAlert(){
        return textFromElement(firstQuestionAlert);
    }
    public String validateSecondQuestionAlert(){
        return textFromElement(secondQuestionAlert);
    }
    public String validateCollegeAlert(){return textFromElement(collegeAlert);}
    public String validateCityTAlert(){
        return textFromElement(cityTreslAlert);
    }
    public String validateStateTAlert(){
        return textFromElement(stateTreslAlert);
    }
    public String validateAreaStudyAlert(){
        return textFromElement(areaOfStudyAlert);
    }
    public String validateCommentsAlert(){
        return textFromElement(commentsAlert);
    }
    public void clickNextFirstButton(){

        clickElement(firstNextButton);
    }
    public String progressTwo(){

        return textFromElement(progressTwo);
    }
    public void secondData(){
        write("Parroquial",campoHigh);
        write ("Bogota",campoCityDos);
    }
    public void selectStateTwo(String options){

        selectDropdownByText(campoStateDos, options);
    }
    public void selectQuestionOne(String options){

        selectDropdownByText(campoQuestionOne, options);
    }
    public void clickNextSecondButton(){
        clickElement(firstPreviousButton);
        clickElement(firstNextButton);
        clickElement(secondNextButton);
    }
    public String progressThree(){

        return textFromElement(progressThree);
    }
    public void selectQuestionTwo(String options){

        selectDropdownByText(campoQuestionTwo, options);
    }
    public void thirdData(){
        write("U Catolica",campoCollege);
        write ("Bogota",campoCityTres);
        write ("Engineering",campoAreaOfStudy);
    }
    public void selectStateThird(String options){

        selectDropdownByText(campoStateTres, options);
    }
    public void clickNextThirdButton(){
        clickElement(secondPreviousButton);
        clickElement(secondNextButton);
        clickElement(thirdNextButton);
    }
    public String progressFour(){

        return textFromElement(progressFour);
    }
    public void fourData(){
        write("I would like to enter to study in this institution and became to finish the tests.",campoComments);
    }
    public String helpCharactersAndWords(){

        return textFromElement(campoHelp);
    }
}


