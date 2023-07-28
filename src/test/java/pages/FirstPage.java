package pages;

import org.openqa.selenium.By;

public class FirstPage extends BasePage{

     By menuButton = By.id("menu-item-179");
     By datosPersonalesButton = By.id("menu-item-218");
     By campoNombre = By.cssSelector("#wsf-1-field-21");
     By campoApellido = By.cssSelector("#wsf-1-field-22");
     By campoEmail = By.cssSelector("#wsf-1-field-23");
     By campoPhone = By.cssSelector("#wsf-1-field-24");
     By campoDireccion = By.cssSelector("#wsf-1-field-28");
     By submitButton = By.cssSelector(" #wsf-1-field-27");
     By succesfullMessage = By.xpath("//p[contains(text(),'Gracias por tu encuesta.')]");

    public FirstPage() {

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){
        hoverOverElement(menuButton);
    }
    public void clickDatosPersonales(){
        clickElement(datosPersonalesButton);
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

}