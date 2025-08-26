package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.Random;

public class CreateMediaAgencyPage {
    private WebDriver driver;

    private By signUpLink = By.xpath("//a[text()= 'Sign up']");
    private By createMediaAgencyButton = By.xpath("//div[@id='root']//h5[normalize-space()='Media Agency']");

    private By continueBtn = By.xpath("//button[@class='btn mainbtn']");
    private By startFreeBtn = By.xpath("(//button[contains(@class, 'mainbtn')])[1]");
    private By firstName = By.xpath("//input[@name='first_name']");
    private By lastName = By.xpath("//input[@name='last_name']");
    private By companyName = By.xpath("//input[@name='company_name']");
    private By emailAddress = By.xpath("//input[@name='email']");
    private By countryCode = By.xpath("//select[@name='phone_code']");
    private By contactNumber = By.xpath("//input[@name='contact_number']");
    private By submitBtn = By.xpath("//button[@type='submit']");
    private By continueMainBtn = By.xpath("//button[@class='btn mainbtn']");

   //Random Number Generation
   Random r= new Random();
    int rnum = r.nextInt(10000);
////select[@name='phone_code']/option[normalize-space(.)='United Arab Emirates(+971)']
    public CreateMediaAgencyPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public CreateMediaAgencyPage clickSignUp() throws InterruptedException
    {
        driver.findElement(signUpLink).click();
        Thread.sleep(5000);
        return this;
    }
    public CreateMediaAgencyPage ClickMediaAgencyButton()
    {
        driver.findElement(createMediaAgencyButton).click();
        return this;
    }
    public CreateMediaAgencyPage clickcontinueBtn()
    {
        driver.findElement(continueBtn).click();
        return this;
    }
    public CreateMediaAgencyPage clickstartFreeBtn()
    {
        driver.findElement(startFreeBtn).click();
        return this;
    }
    public CreateMediaAgencyPage enterfirstName()
    {
        driver.findElement(firstName).sendKeys("Abcd");
        return this;
    }
    public CreateMediaAgencyPage enterlastName()
    {
        driver.findElement(lastName).sendKeys("pqr");
        return this;
    }
    public CreateMediaAgencyPage entercompanyName()
    {

        driver.findElement(companyName).sendKeys("Infominez1"+rnum);
        return this;
    }
    public CreateMediaAgencyPage enteremailAddress()
    {
        driver.findElement(emailAddress).sendKeys("aaaa@anand.com");
        return this;
    }
    public CreateMediaAgencyPage selectcountryCode()
    {
        WebElement Cddn = driver.findElement(countryCode);
        Select select = new Select(Cddn);
        select.selectByVisibleText("United Arab Emirates(+971)");
        return this;
    }
    public CreateMediaAgencyPage enterontactNumber()
    {
        driver.findElement(contactNumber).sendKeys("7019720900");
        return this;
    }
    public CreateMediaAgencyPage clicksubmitBtn()
    {
        driver.findElement(submitBtn).click();
        return this;
    }
    public CreateMediaAgencyPage clickcontinueMainBtn()
    {
        driver.findElement(continueMainBtn).click();
        return this;
    }
    /*
     Correct way to handle dropdowns in Selenium (Java)
    //Locate the dropdown
WebElement countryDropdown = driver.findElement(countryCode);

// Wrap it in a Select object
Select select = new Select(countryDropdown);

// Select by visible text
select.selectByVisibleText("United Arab Emirates (+971)");

// OR select by value (if the <option> has a value attribute)
select.selectByValue("971");

// OR select by index
select.selectByIndex(5);
*/}
