package pages;

import methodclasses.GeneralMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
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

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    private WebElement emailField;

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public WebElement getpEmailText() {
        return pEmailText;
    }

    public WebElement getCreateAccountText() {
        return createAccountText;
    }

    public void insertEmail(String email){
        emailField.sendKeys(email);
    }

    public void pressCreateAccountButton(){
        createAccountButton.click();
    }

}
