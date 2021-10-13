package pages;

import methodclasses.GeneralMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

public class CreateAccountPage extends GeneralMethods {

    private WebDriver driver;

    public CreateAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="id_gender1")
    private WebElement titleElement;

    @FindBy(id= "id_gender2")
    private WebElement titleElement2;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameField;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "days")
    private WebElement daysDropdown;

    @FindBy(id ="months")
    private WebElement monthsDropdown;

    @FindBy(id = "years")
    private WebElement yearsDropdown;

    @FindBy(id = "firstname")
    private WebElement firstNameAddressField;

    @FindBy(id = "lastname")
    private WebElement lastNameAddressField;

    @FindBy(id = "company")
    private WebElement companyField;

    @FindBy(id = "address1")
    private WebElement addressField;

    @FindBy(id  = "city")
    private WebElement cityField;

    @FindBy(id = "id_state")
    private WebElement stateField;

    @FindBy(id = "postcode")
    private WebElement postCodeField;

    @FindBy(id = "other")
    private WebElement additInfo;

    @FindBy(id = "phone_mobile")
    private WebElement mobPhoneField;

    @FindBy(id = "alias")
    private WebElement addressAliasField;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
    private WebElement registerButtonText;

    @FindBy(xpath = "//*[@class=\"alert alert-danger\"]/p")
    private WebElement errorText;

    private Select selectDaysDropdown = new Select(daysDropdown);

    private Select selectMonthsDropdown = new Select(monthsDropdown);

    private Select selectYearsDropdown = new Select(yearsDropdown);

    private Select selectStateDropdown = new Select(stateField);

    public void completeSignUpForm() throws IOException {
        waitForElement(driver,registerButton);
        titleElement.click();
        firstNameField.sendKeys(loadFile().getProperty("firstNameField"));
        lastNameField.sendKeys(loadFile().getProperty("lastNameField"));
        passwordField.sendKeys(generatePassword());
        selectDaysDropdown.selectByVisibleText("12");
        selectMonthsDropdown.selectByVisibleText("1");
        selectYearsDropdown.selectByVisibleText("1999");
        firstNameAddressField.sendKeys(loadFile().getProperty("firstNameField"));
        lastNameAddressField.sendKeys(loadFile().getProperty("lastNameField"));
        companyField.sendKeys(loadFile().getProperty("companyField"));
        addressField.sendKeys(loadFile().getProperty("addressField"));
        cityField.sendKeys(loadFile().getProperty("cityField"));
        selectStateDropdown.selectByVisibleText("7");
        postCodeField.sendKeys(loadFile().getProperty("zipCodeField"));
        additInfo.sendKeys(loadFile().getProperty("additionalInfo"));
        mobPhoneField.sendKeys(loadFile().getProperty("mobilePhoneField"));
        addressAliasField.sendKeys(loadFile().getProperty("addressAlias"));
        registerButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void checkErrorMessage() throws IOException{
        waitForElement(driver,registerButton);
        registerButton.click();
        waitForElement(driver,registerButtonText);
        assertTextfromElement(registerButtonText, loadFile().getProperty("8errorsText"));
    }
}
