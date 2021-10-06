package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.GeneralMethods;

public class AuthenticationPage extends GeneralMethods {
    private WebDriver driver;

    public AuthenticationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    private WebElement createAccountButton;

    @FindBy(xpath = "//*[@class=\"form_content clearfix\"]/p")
    private WebElement pEmailText;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span/i")
    private WebElement createAccountText;

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public WebElement getpEmailText() {
        return pEmailText;
    }

    public WebElement getCreateAccountText() {
        return createAccountText;
    }
}
