package pages;

import org.openqa.selenium.By;

public class TwelvePage extends BasePage{
    By menuButton = By.id("menu-item-179");
    By testSurveyButton = By.id("menu-item-509");
    By firstAnswer = By.id("wsf-1-label-144-row-3");
    By secondAnswer = By.id("wsf-1-label-145-row-4");
    By thirdAnswer = By.id("wsf-1-label-146-row-2");
    By fourAnswer = By.id("wsf-1-label-147-row-4");
    By fiveAnswer = By.id("wsf-1-field-148");
    By sixAnswer = By.id("wsf-1-label-149-row-5");
    By sevenAnswer = By.id("wsf-1-field-150");
    By eightAnswer = By.id("wsf-1-label-151-row-5");
    By nineAnswer = By.id("wsf-1-label-152-row-4");
    By tenAnswer = By.id("wsf-1-label-153-row-2");
    By elevenAnswer = By.id("wsf-1-field-154");
    By firstQuestion = By.xpath("//legend[contains(text(),'For how long have you been using our product / ser')]");
    By secondQuestion = By.xpath("//legend[contains(text(),'How often do you use our product / service?')]");
    By thirdQuestion = By.xpath("//legend[contains(text(),'How satisfied are you with the product / service?')]");
    By fourQuestion = By.xpath("//legend[contains(text(),'What impressed you most about the product / servic')]");
    By fiveQuestion = By.xpath("//label[@id='wsf-1-label-148']");
    By sixQuestion = By.xpath("//legend[contains(text(),'What disappointed you most about the product / ser')]");
    By sevenQuestion = By.xpath("//label[@id='wsf-1-label-150']");
    By eightQuestion = By.xpath("//legend[contains(text(),'Compared to similar products offered by other comp')]");
    By nineQuestion = By.xpath("//legend[contains(text(),'Would you use our product / service in the future?')]");
    By tenQuestion = By.xpath("//legend[contains(text(),'Would you recommend our product / service to other')]");
    By elevendQuestion = By.xpath("//label[@id='wsf-1-label-154']");
    By submitButton = By.cssSelector("#wsf-1-field-155");
    By succesfullMessage = By.xpath("//p[contains(text(),'Thank you for your feedback.')]");


    public TwelvePage(){

        super(driver);
    }
    public void navigatePage(){

        navigateTo("https://testingqarvn.com.es/practicas-qa/");
    }
    public void menuPracticas(){

        hoverOverElement(menuButton);
    }
    public void clickPruebaSurvey(){

        clickElement(testSurveyButton);
    }
    public void enterData(){
        if (isDisplayed(firstQuestion)){
            clickElement(firstAnswer);
        }
        if (isDisplayed(secondQuestion)){
            clickElement(secondAnswer);
        }
        if (isDisplayed(thirdQuestion)){
            clickElement(thirdAnswer);
        }
        if (isDisplayed(fourQuestion)){
            clickElement(fourAnswer);
        }
        if (isDisplayed(fiveQuestion)){
            write("Lo que sea 1",fiveAnswer);
        }
        if (isDisplayed(sixQuestion)){
            clickElement(sixAnswer);
        }
        if (isDisplayed(sevenQuestion)){
            write("Lo que sea 2",sevenAnswer);
        }
        if (isDisplayed(eightQuestion)){
            clickElement(eightAnswer);
        }
        if (isDisplayed(nineQuestion)){
            clickElement(nineAnswer);
        }
        if (isDisplayed(tenQuestion)){
            clickElement(tenAnswer);
        }
        if (isDisplayed(elevendQuestion)){
            write("Lo que sea 3",elevenAnswer);
        }
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
