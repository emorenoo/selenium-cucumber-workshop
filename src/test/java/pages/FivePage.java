package pages;

import org.openqa.selenium.By;

public class FivePage extends BasePage{

    By menuButton = By.id("menu-item-179");
    By testComboBoxDButton = By.id("menu-item-252");
    By campoNombre = By.cssSelector("#wsf-1-field-54");
    By campoApellido = By.cssSelector("#wsf-1-field-55");
    By campoEmail = By.cssSelector("#wsf-1-field-56");
    By campoPhone = By.cssSelector("#wsf-1-field-57");
    By campoDireccion = By.cssSelector("#wsf-1-field-58");
    By submitButton = By.cssSelector("#wsf-1-field-62");
    By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");
    By phpCheckbox = By.cssSelector("#wsf-1-label-59-row-1");
    By jsCheckbox = By.cssSelector("#wsf-1-label-59-row-3");
    By seleniumRadio = By.cssSelector("#wsf-1-label-60-row-3");
    By operativeSystem = By.id("wsf-1-field-61");
    By macOptions = By.id("wsf-1-field-65");

    public FivePage() {

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaComboBoxD(){

        clickElement(testComboBoxDButton);
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
}

