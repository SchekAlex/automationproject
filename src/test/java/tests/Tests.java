package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.HomePage;

public class Tests extends TestData{

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "E:\\SpringProjects\\AutomationProject\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void signUpFlow(){
        HomePage home = new HomePage(driver);
        AuthenticationPage authPage = new AuthenticationPage(driver);
        home.pressSignInButton();
        authPage.waitForElement(driver,authPage.getCreateAccountButton());
        authPage.assertTextfromElement(authPage.getpEmailText(),getPTextOnEmailField() );

    }

}
