package pages;

import org.openqa.selenium.By;

public class ElevenPage extends BasePage{
    By menuButton = By.id("menu-item-179");
    By testCourseButton = By.id("menu-item-504");
    By campoNombre = By.cssSelector("#wsf-1-field-131");
    By campoApellido = By.cssSelector("#wsf-1-field-132");
    By campoEmail = By.cssSelector("#wsf-1-field-133");
    By campoPhone = By.cssSelector("#wsf-1-field-134");
    By campoDireccion = By.cssSelector("#wsf-1-field-135");
    By campoCity = By.cssSelector("#wsf-1-field-137");
    By campoPostal = By.cssSelector("#wsf-1-field-139");
    By stateOptions = By.id("wsf-1-field-138");
    By submitButton = By.cssSelector("#wsf-1-field-143");
    By succesfullMessage = By.xpath("//p[contains(text(),'Thank you for your entry.')]");
    By campoAge = By.cssSelector("#wsf-1-field-140");
    By maleCheckbox = By.cssSelector("#wsf-1-label-141-row-2");
    By campoComments = By.cssSelector("#wsf-1-field-142");
    By nameAlert = By.cssSelector("#wsf-1-invalid-feedback-131");
    By phoneAlert = By.cssSelector("#wsf-1-invalid-feedback-134");
    By cityAlert = By.cssSelector("#wsf-1-invalid-feedback-137");
    By stateAlert = By.cssSelector("#wsf-1-invalid-feedback-138");

    public ElevenPage(){

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaCourse(){

        clickElement(testCourseButton);
    }
    public void enterData(){
        write("Andres",campoNombre);
        write ("Mendez",campoApellido);
        write("andres.mendez@yopmail.com",campoEmail);
        write ("3205689420",campoPhone);
    }
    public void enterAddress(){
        write("Calle 24 D",campoDireccion);
        write("Bogota",campoCity);
        write("303230",campoPostal);
    }
    public void selectState(String options){

        selectDropdownByText(stateOptions, options);
    }
    public void enterPersonal(){
        write("30",campoAge);
        clickElement(maleCheckbox);
        write("Lo que sea.",campoComments);
    }
    public void clickSubmit(){

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
}
