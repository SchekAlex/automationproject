package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    private static String baseURL = "http://automationpractice.com/index.php";

    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@class=\"login\"]")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@title=\"Contact Us\"]")
    private WebElement contactUsButton;

    public void pressSignInButton(){
        signInButton.click();
    }

    public void pressContactUsButton(){
        contactUsButton.click();
    }


}
