package tests;

import methodclasses.GeneralMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.HomePage;

import java.io.IOException;

public class Tests extends GeneralMethods {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AlexandruSchek\\IdeaProjects\\automationproject\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void signUpFlow() throws IOException {
        HomePage home = new HomePage(driver);
        AuthenticationPage authPage = new AuthenticationPage(driver);
        home.pressSignInButton();
        waitForElement(driver,authPage.getCreateAccountButton());
        assertTextfromElement(authPage.getpEmailText(),loadFile().getProperty("pTextOnEmailField"));

    }

}
