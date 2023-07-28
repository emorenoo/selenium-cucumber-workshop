package pages;

import org.openqa.selenium.By;

public class SecondPage extends BasePage{

    By menuButton = By.id("menu-item-179");
    By testCheckboxButton = By.id("menu-item-238");
    By campoNombre = By.cssSelector("#wsf-1-field-29");
    By campoApellido = By.cssSelector("#wsf-1-field-30");
    By campoEmail = By.cssSelector("#wsf-1-field-31");
    By campoPhone = By.cssSelector("#wsf-1-field-32");
    By campoDireccion = By.cssSelector("#wsf-1-field-33");
    By submitButton = By.cssSelector("#wsf-1-field-34");
    By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");
    By phpCheckbox = By.cssSelector("#wsf-1-label-36-row-1");
    By jsCheckbox = By.cssSelector("#wsf-1-label-36-row-3");

    public SecondPage() {

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){
        hoverOverElement(menuButton);
    }
    public void clickPruebaCheckBox(){
        clickElement(testCheckboxButton);
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
    public void clickCheckbox(){
        clickElement(phpCheckbox);
        clickElement(jsCheckbox);
    }

}

