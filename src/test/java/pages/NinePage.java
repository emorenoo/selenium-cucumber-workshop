package pages;

import org.openqa.selenium.By;

public class NinePage extends BasePage{
    By menuButton = By.id("menu-item-179");
    By testcontactoButton = By.id("menu-item-409");
    By campoNombre = By.cssSelector("#wsf-1-field-110");
    By campoApellido = By.cssSelector("#wsf-1-field-111");
    By campoEmail = By.cssSelector("#wsf-1-field-112");
    By campoPhone = By.cssSelector("#wsf-1-field-113");
    By campoInquiry = By.cssSelector("#wsf-1-field-114");
    By submitButton = By.cssSelector("#wsf-1-field-116");
    By succesfullMessage = By.xpath("//p[contains(text(),'Thank you for your inquiry.')]");
    By consentCheckbox = By.cssSelector("#wsf-1-label-115-row-1");
    By nameAlert = By.cssSelector("#wsf-1-invalid-feedback-110");
    By emailAlert = By.cssSelector("#wsf-1-invalid-feedback-112");
    By lastNameAlert = By.cssSelector("#wsf-1-invalid-feedback-111");
    By consentAlert = By.cssSelector("#wsf-1-invalid-feedback-115-row-1");


    public NinePage(){

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaContacto(){

        clickElement(testcontactoButton);
    }
    public void enterData(){
        write("Andres",campoNombre);
        write("Mendez",campoApellido);
        write("andres.mendez@yopmail.com",campoEmail);
        write("324555662",campoPhone);
        write("Quiero consultar acerca de mi solicitud", campoInquiry);
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
    public void clickCheckConsent(){
        clickElement(consentCheckbox);
    }
    public String validateNameAlert(){

        return textFromElement(nameAlert);
    }
    public String validateEmailAlert(){

        return textFromElement(emailAlert);
    }
    public String validateLastNameAlert(){

        return textFromElement(lastNameAlert);
    }
    public String validateConsentAlert(){

        return textFromElement(consentAlert);
    }
}
