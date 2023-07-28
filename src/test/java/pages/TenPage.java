package pages;

import org.openqa.selenium.By;

public class TenPage extends BasePage{

    By menuButton = By.id("menu-item-179");
    By testDisabledFielsButton = By.id("menu-item-415");
    By campoNombre = By.cssSelector("#wsf-1-field-117");
    By campoApellido = By.cssSelector("#wsf-1-field-118");
    By campoEmail = By.cssSelector("#wsf-1-field-119");
    By campoPhone = By.cssSelector("#wsf-1-field-120");
    By campoDireccion = By.cssSelector("#wsf-1-field-121");
    By submitButton = By.cssSelector("#wsf-1-field-130");
    By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");
    By phpCheckbox = By.cssSelector("#wsf-1-label-122-row-1");
    By jsCheckbox = By.cssSelector("#wsf-1-label-122-row-3");
    By seleniumRadio = By.cssSelector("#wsf-1-label-123-row-3");
    By operativeSystem = By.id("wsf-1-field-124");
    By macOptions = By.id("wsf-1-field-127");
    By eventosButton = By.id("wsf-1-field-128");
    By calendarioButton = By.id("wsf-1-field-129");


    public TenPage(){

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaDisabledFields(){

        clickElement(testDisabledFielsButton);
    }
    public void enterData(){
        write("Andres",campoNombre);
        isDisplayed(campoApellido);
        write("andres.mendez@yopmail.com",campoEmail);
        isDisplayed(campoPhone);
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

    public String ValidateLastName(){
        return getText(campoApellido);
    }
    public String ValidatePhone(){

        return getText(campoPhone);
    }
}
