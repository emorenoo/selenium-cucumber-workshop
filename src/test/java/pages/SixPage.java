package pages;

import org.openqa.selenium.By;

public class SixPage extends BasePage{

    By menuButton = By.id("menu-item-179");
    By testcalendarioButton = By.id("menu-item-388");
    By campoNombre = By.cssSelector("#wsf-1-field-66");
    By campoApellido = By.cssSelector("#wsf-1-field-67");
    By campoEmail = By.cssSelector("#wsf-1-field-68");
    By campoPhone = By.cssSelector("#wsf-1-field-69");
    By campoDireccion = By.cssSelector("#wsf-1-field-70");
    By submitButton = By.cssSelector("#wsf-1-field-77");
    By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");
    By phpCheckbox = By.cssSelector("#wsf-1-label-71-row-1");
    By jsCheckbox = By.cssSelector("#wsf-1-label-71-row-3");
    By seleniumRadio = By.cssSelector("#wsf-1-label-72-row-3");
    By operativeSystem = By.id("wsf-1-field-73");
    By macOptions = By.id("wsf-1-field-76");
    By eventosButton = By.id("wsf-1-field-79");
    By calendarioButton = By.id("wsf-1-field-78");



    public SixPage(){

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

    public void selectDates(){
        write("Marzo 8, 2023",eventosButton);
        write("Julio 21, 2023",calendarioButton);
    }
}
