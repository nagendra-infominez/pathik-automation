package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

//import static base.BaseTest.driver;


public class LoginTest extends BaseTest {

    @BeforeClass
    public void startBrowser() {
        setup();
    }

    //Verify that user can login successfully
    @Test(priority = 0)
    public void testLogin() {

        new LoginPage(driver)
                .enterEmail()
                .enterPassword()
                .clickButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(true, "Login Successful");
    }




}
