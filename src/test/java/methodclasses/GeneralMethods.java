package methodclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class GeneralMethods {

    private String emailAddress;
    private String password;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

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

    public String accessLineInProperty  (String field)throws IOException{
        String returnValue = loadFile().getProperty(field);
        return returnValue;
    }

    public String generateEmail(){
        emailAddress = "schek.alex"+new Random().nextInt(999999) + "@gmail.com";
        return emailAddress;
    }

    public String generatePassword(){
        password = "Parola&" + new Random().nextInt(999999);
        return password;
    }

    public void selectElem(WebElement webElem,String value){
        Select dropdown = new Select(webElem);
        dropdown.selectByValue(value);
    }

}
