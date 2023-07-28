package pages;

import org.openqa.selenium.By;

public class EightPage extends BasePage{

    By menuButton = By.id("menu-item-179");
    By testrequeridosButton = By.id("menu-item-400");
    By campoNombre = By.cssSelector("#wsf-1-field-95");
    By campoApellido = By.cssSelector("#wsf-1-field-96");
    By campoEmail = By.cssSelector("#wsf-1-field-97");
    By campoPhone = By.cssSelector("#wsf-1-field-98");
    By campoDireccion = By.cssSelector("#wsf-1-field-99");
    By submitButton = By.cssSelector("#wsf-1-field-109");
    By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");
    By phpCheckbox = By.cssSelector("#wsf-1-label-100-row-1");
    By jsCheckbox = By.cssSelector("#wsf-1-label-100-row-3");
    By seleniumRadio = By.cssSelector("#wsf-1-label-101-row-3");
    By operativeSystem = By.id("wsf-1-field-102");
    By macOptions = By.id("wsf-1-field-105");
    By eventosButton = By.id("wsf-1-field-106");
    By calendarioButton = By.id("wsf-1-field-107");
    By selectFileButton = By.id("wsf-1-field-108");
    String fileToUpload = "/Users/eduard.morenoo/Documents/testSelenium.jpg";
    By nameAlert = By.cssSelector("#wsf-1-invalid-feedback-95");
    By emailAlert = By.cssSelector("#wsf-1-invalid-feedback-97");
    By calendarAlert = By.cssSelector("#wsf-1-invalid-feedback-107");
    By fileAlert = By.cssSelector("#wsf-1-invalid-feedback-108");


    public EightPage(){

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaRequeridos(){

        clickElement(testrequeridosButton);
    }
    public void enterData(){
        write("Andres",campoNombre);
        write("Mendez",campoApellido);
        write("andres.mendez@yopmail.com",campoEmail);
        write("324555662",campoPhone);
        write("Calle 24 D",campoDireccion);
    }
    public void clickSubmit(){
        isDisplayed(submitButton);
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
    public void clickRadio(){
        clickElement(phpCheckbox);
        clickElement(jsCheckbox);
        clickElement(seleniumRadio);
    }
    public void selectOS(String options){

        selectDropdownByValue(operativeSystem, options);
    }
    public void selectMac(String options){

        selectDropdownByValue(macOptions, options);
    }
    public void selectDates() {
        write("Marzo 8, 2023",eventosButton);
        write("Julio 21, 2023",calendarioButton);
    }
    public void fileUpload(){

        write(fileToUpload,selectFileButton);
    }
    public String validateNameAlert(){

        return textFromElement(nameAlert);
    }
    public String validateEmailAlert(){

        return textFromElement(emailAlert);
    }
    public String validateCalendarAlert(){

        return textFromElement(calendarAlert);
    }
    public String validateFileAlert(){

        return textFromElement(fileAlert);
    }
}

