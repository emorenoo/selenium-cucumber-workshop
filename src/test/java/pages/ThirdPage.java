package pages;

import org.openqa.selenium.By;

public class ThirdPage extends BasePage{

    By menuButton = By.id("menu-item-179");
    By testRadioButton = By.id("menu-item-243");
    By campoNombre = By.cssSelector("#wsf-1-field-37");
    By campoApellido = By.cssSelector("#wsf-1-field-38");
    By campoEmail = By.cssSelector("#wsf-1-field-39");
    By campoPhone = By.cssSelector("#wsf-1-field-40");
    By campoDireccion = By.cssSelector("#wsf-1-field-41");
    By submitButton = By.cssSelector("#wsf-1-field-43");
    By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");
    By phpCheckbox = By.cssSelector("#wsf-1-label-42-row-1");
    By jsCheckbox = By.cssSelector("#wsf-1-label-42-row-3");
    By seleniumRadio = By.cssSelector("#wsf-1-label-44-row-3");

    public ThirdPage() {

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){
        hoverOverElement(menuButton);
    }
    public void clickPruebaRadio(){
        clickElement(testRadioButton);
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

}
