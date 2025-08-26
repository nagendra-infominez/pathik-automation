package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

import java.sql.Driver;

public class LoginPage
{
    private WebDriver driver;
    // Locators for elements on login page

    private By emailField =By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[@type='submit']");

public LoginPage(WebDriver driver)
{
    this.driver=driver;
}
public LoginPage enterEmail()
{
    driver.findElement(emailField).sendKeys(ConfigReader.get("email"));
    return this;
}
public LoginPage enterPassword()
{
    driver.findElement(passwordField).sendKeys(ConfigReader.get("password"));
    return this;
}
public HomePage clickButton()
{
    driver.findElement(loginButton).click();
    return new HomePage(driver);
}
}
