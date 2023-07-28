package pages;

import org.openqa.selenium.By;

public class ThirteenPage extends BasePage{
    By menuButton = By.id("menu-item-179");
    By testProductsButton = By.id("menu-item-516");
    By campoNombre = By.cssSelector("#wsf-1-field-156");
    By campoApellido = By.cssSelector("#wsf-1-field-157");
    By campoEmail = By.cssSelector("#wsf-1-field-158");
    By campoPhone = By.cssSelector("#wsf-1-field-159");
    By campoDireccion = By.cssSelector("#wsf-1-field-162");
    By campoCity = By.cssSelector("#wsf-1-field-164");
    By campoPostal = By.cssSelector("#wsf-1-field-166");
    By stateOptions = By.id("wsf-1-field-165");
    By submitButton = By.cssSelector("#wsf-1-field-167");
    By succesfullMessage = By.xpath("//p[contains(text(),'Thank you for placing your order.')]");
    By campoQuantity = By.cssSelector("#wsf-1-field-161");
    By productCheckbox = By.cssSelector("#wsf-1-label-160-row-3");
    By productAlert = By.cssSelector("#wsf-1-invalid-feedback-160");
    By nameAlert = By.cssSelector("#wsf-1-invalid-feedback-156");
    By phoneAlert = By.cssSelector("#wsf-1-invalid-feedback-159");
    By cityAlert = By.cssSelector("#wsf-1-invalid-feedback-164");
    By stateAlert = By.cssSelector("#wsf-1-invalid-feedback-165");

    public ThirteenPage(){
        super(driver);
    }
    public void navigatePage(){
        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){
        hoverOverElement(menuButton);
    }
    public void clickPruebaProducts(){
        clickElement(testProductsButton);
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
        write("30323",campoPostal);
    }
    public void selectState(String options){
        selectDropdownByText(stateOptions, options);
    }
    public void enterProduct(){
        clickElement(productCheckbox);
        write("30", campoQuantity);
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
    public String validateProductAlert(){
        return textFromElement(productAlert);
    }
    public String validateCityAlert(){
        return textFromElement(cityAlert);
    }
    public String validateStateAlert(){
        return textFromElement(stateAlert);
    }
}
