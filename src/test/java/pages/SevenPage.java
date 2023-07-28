package pages;

import org.openqa.selenium.By;

public class SevenPage extends BasePage{

    By menuButton = By.id("menu-item-179");
    By testcalendarioButton = By.id("menu-item-393");
    By campoNombre = By.cssSelector("#wsf-1-field-80");
    By campoApellido = By.cssSelector("#wsf-1-field-81");
    By campoEmail = By.cssSelector("#wsf-1-field-82");
    By campoPhone = By.cssSelector("#wsf-1-field-83");
    By campoDireccion = By.cssSelector("#wsf-1-field-83");
    By submitButton = By.id("wsf-1-field-93");
    By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");
    By phpCheckbox = By.cssSelector("#wsf-1-label-85-row-1");
    By jsCheckbox = By.cssSelector("#wsf-1-label-85-row-3");
    By seleniumRadio = By.cssSelector("#wsf-1-label-86-row-3");
    By operativeSystem = By.id("wsf-1-field-87");
    By macOptions = By.id("wsf-1-field-90");
    By eventosButton = By.id("wsf-1-field-91");
    By calendarioButton = By.id("wsf-1-field-92");
    By selectFileButton = By.id("wsf-1-field-94");
    String fileToUpload = "/Users/eduard.morenoo/Documents/testSelenium.jpg";


    public SevenPage(){

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaCalendario(){

        clickElement(testcalendarioButton);
    }
    public void enterData(){
        write("Andres",campoNombre);
        write("Mendez",campoApellido);
        write("andres.mendez@yopmail.com",campoEmail);
        write("324555662",campoPhone);
        write("Calle 24 D",campoDireccion);
    }
    public void clickSubmit(){
        if (isDisplayed(submitButton)){
        clickElement(submitButton);}
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
        clickElement(calendarioButton);
    }
    public void fileUpload(){

        write(fileToUpload,selectFileButton);
    }
}
