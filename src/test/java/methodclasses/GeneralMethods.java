package methodclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GeneralMethods {

    public void waitForElement(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,40);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void assertTextfromElement(WebElement element,String expected){
        String actual = element.getText();
        Assert.assertEquals(actual,expected);
    }

    public Properties loadFile() throws IOException {
        Properties property = new Properties();
        InputStream fisier = new FileInputStream("C:\\Users\\AlexandruSchek\\IdeaProjects\\automationproject\\src\\test\\resources\\app.properties");
        property.load(fisier);
        return property;
    }


}
