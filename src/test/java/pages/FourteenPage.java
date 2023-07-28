package pages;

import org.openqa.selenium.By;

public class FourteenPage extends BasePage{
    By menuButton = By.id("menu-item-179");
    By testMembershipsButton = By.id("menu-item-551");
    By campoNombre = By.cssSelector("#wsf-1-field-177");
    By campoApellido = By.cssSelector("#wsf-1-field-178");
    By campoEmail = By.cssSelector("#wsf-1-field-181");
    By campoPhone = By.cssSelector("#wsf-1-field-180");
    By campoTitle = By.cssSelector("#wsf-1-field-179");
    By campoDireccion = By.cssSelector("#wsf-1-field-172");
    By campoCity = By.cssSelector("#wsf-1-field-174");
    By campoPostal = By.cssSelector("#wsf-1-field-176");
    By stateOptions = By.id("wsf-1-field-175");
    By submitButton = By.cssSelector("#wsf-1-field-182");
    By succesfullMessage = By.xpath("//p[contains(text(),'Thank you for your application.')]");
    By campoSiteName = By.cssSelector("#wsf-1-field-168");
    By campoURL = By.cssSelector("#wsf-1-field-169");
    By campoQuestionOne = By.cssSelector("#wsf-1-field-170");
    By questionOne = By.cssSelector("#wsf-1-label-170");
    By campoQuestionTwo = By.cssSelector("#wsf-1-field-171");
    By questionTwo = By.cssSelector("#wsf-1-label-171");
    By siteNameAlert = By.cssSelector("#wsf-1-invalid-feedback-168");
    By urlAlert = By.cssSelector("#wsf-1-invalid-feedback-169");
    By nameAlert = By.cssSelector("#wsf-1-invalid-feedback-177");
    By phoneAlert = By.cssSelector("#wsf-1-invalid-feedback-180");
    By cityAlert = By.cssSelector("#wsf-1-invalid-feedback-174");
    By stateAlert = By.cssSelector("#wsf-1-invalid-feedback-175");
    By titleAlert = By.cssSelector("#wsf-1-invalid-feedback-179");

    public FourteenPage(){
        super(driver);
    }
    public void navigatePage(){
        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){
        hoverOverElement(menuButton);
    }
    public void clickPruebaMembership(){
        clickElement(testMembershipsButton);
    }
    public void enterData(){
        write("Andres",campoNombre);
        write ("Mendez",campoApellido);
        write("andres.mendez@yopmail.com",campoEmail);
        write ("3205689420",campoPhone);
        write("Titulo", campoTitle);
    }
    public void enterAddress(){
        write("Calle 24 D",campoDireccion);
        write("Bogota",campoCity);
        write("30323",campoPostal);
    }
    public void selectState(String options){
        selectDropdownByText(stateOptions, options);
    }
    public void enterSiteInformation(){
        write("Mercado Libre", campoSiteName);
        write("https://www.mercadolibre.com.co/", campoURL);
        if (isDisplayed(questionOne)){
            write("1000", campoQuestionOne);}
        if (isDisplayed(questionTwo)){
            write("55", campoQuestionTwo);}
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
    public String validateCityAlert(){
        return textFromElement(cityAlert);
    }
    public String validateStateAlert(){
        return textFromElement(stateAlert);
    }
    public String validateSiteNameAlert(){
        return textFromElement(siteNameAlert);
    }
    public String validateUrlAlert(){
        return textFromElement(urlAlert);
    }
    public String validateTitleAlert(){
        return textFromElement(titleAlert);
    }
}


