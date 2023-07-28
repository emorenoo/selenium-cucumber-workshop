package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    protected static WebDriver driver;
    public static WebDriverWait wait;
    Actions action = new Actions(driver);

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    public BasePage (WebDriver driver) {
        BasePage.driver = driver;
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public WebElement findElement(By locator) {

        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){

        return driver.findElements(locator);
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public String getText(By locator) {

        return driver.findElement(locator).getAttribute("value");
    }

    public void clickElement(By locator) {
        //driver.findElement(locator).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(driver.findElement(locator))).click();
    }
    public void doubleclickElement(By locator){

        action.doubleClick(driver.findElement(locator));
    }
    public void navigateTo(String url) {

        driver.get(url);
    }

    public static void CloseBrowser(){
        driver.quit();
    }
    public void write(String textToWrite, By locator) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(textToWrite);
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }
    public void selectFromDropdownByValue(By locator, String valueToSelect){
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByValue(valueToSelect);
    }
    public void selectFromDropdownByIndex(By locator, int valueToSelect){
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByIndex(valueToSelect);
    }

    public void hoverOverElement(By locator) {
        action.moveToElement(driver.findElement(locator)).perform();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public String textFromElement(By locator){

        return driver.findElement(locator).getText();
    }

    public void selectDropdownByValue(By locator, String valueToSelect){
        Select dropdown = new Select(driver.findElement(locator));

        dropdown.selectByValue(valueToSelect);
    }
    public void selectDropdownByIndex(By locator, int valueToSelect){
        Select dropdown = new Select(driver.findElement(locator));

        dropdown.selectByIndex(valueToSelect);
    }
    public void selectDropdownByText(By locator, String valueToSelect){
        Select dropdown = new Select(driver.findElement(locator));

        dropdown.selectByVisibleText(valueToSelect);
    }
    public void switchToiFrame(By locator){
        driver.switchTo().frame(driver.findElement(locator));
    }
    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

}