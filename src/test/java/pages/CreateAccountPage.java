package pages;

import methodclasses.GeneralMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CreateAccountPage extends GeneralMethods {

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

    private Select selectDaysDropdown = new Select(daysDropdown);

    @FindBy(id ="months")
    private WebElement monthsDropdown;

    private Select selectMonthsDropdown = new Select(monthsDropdown);

    @FindBy(id = "years")
    private WebElement yearsDropdown;

    private Select selectYearsDropdown = new Select(yearsDropdown);

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

    private Select selectStateField = new Select(stateField);

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


    public void completeSignUpForm() throws IOException {
        titleElement.click();
        firstNameField.sendKeys(loadFile().getProperty("firstNameField"));
        lastNameField.sendKeys(loadFile().getProperty("lastNameField"));
        passwordField.sendKeys(generatePassword());
        selectDaysDropdown.selectByValue("12");
        selectMonthsDropdown.selectByValue("1");
        selectYearsDropdown.selectByValue("1999");
        firstNameAddressField.sendKeys(loadFile().getProperty("firstNameField"));
        lastNameAddressField.sendKeys(loadFile().getProperty("lastNameField"));
        companyField.sendKeys(loadFile().getProperty(""));
    }


}
