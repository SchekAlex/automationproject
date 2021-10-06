package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GeneralMethods {

    public void waitForElement(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,40);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void assertTextfromElement(WebElement element,String expected){
        String actual = element.getText();
        Assert.assertEquals(actual,expected);
    }




}
