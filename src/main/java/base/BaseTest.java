package base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ConfigReader;

import java.time.Duration;

public class BaseTest
{
    // Making driver 'protected static' so child classes can access it
    protected static WebDriver driver;

    public void setup()
    {
        //Load Config first
        ConfigReader.loadConfig();
        String browser = ConfigReader.get("browser");
// Based on config value, initiate browser
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
         //Browser Settings
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //Navigate to the base URL
            driver.get(ConfigReader.get("baseUrl"));

        }


    public void tearDown()
    {
        if (driver!= null)
        {
            driver.quit();
        }
    }

}