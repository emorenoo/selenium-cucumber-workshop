package pages;

import org.openqa.selenium.By;

public class FourtPage extends BasePage{

    By menuButton = By.id("menu-item-179");
    By testcomboBoxButton = By.id("menu-item-249");
    By campoNombre = By.cssSelector("#wsf-1-field-45");
    By campoApellido = By.cssSelector("#wsf-1-field-46");
    By campoEmail = By.cssSelector("#wsf-1-field-47");
    By campoPhone = By.cssSelector("#wsf-1-field-48");
    By campoDireccion = By.cssSelector("#wsf-1-field-49");
    By submitButton = By.cssSelector("#wsf-1-field-52");
    By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");
    By phpCheckbox = By.cssSelector("#wsf-1-label-50-row-1");
    By jsCheckbox = By.cssSelector("#wsf-1-label-50-row-3");
    By seleniumRadio = By.cssSelector("#wsf-1-label-51-row-3");
    By operativeSystem = By.id("wsf-1-field-53");

    public FourtPage() {

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaComboBox(){

        clickElement(testcomboBoxButton);
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
}
