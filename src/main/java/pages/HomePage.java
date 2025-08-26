package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    // Locators
private By selectParentCompanyBtn = By.xpath("(//button[text()='Select'])[3]");
private By selectParentCompanyDropdown = By.xpath("(//div[contains(@class, 'cursor-pointer') and contains(@class,'d-flex')])[1]");
    private By selectDropdown = By.xpath("(//span[@class='menu-title'])[2]") ;
    private By selectCompanies = By.xpath("//a[@href='/settings/company']//p[normalize-space()='Companies']");
    private By addNewSubCompanyBtn = By.xpath("//button[text()='Add New Sub Company']");

    // Constructor

    public HomePage(WebDriver driver)

        {
            this.driver = driver;
        }

   // Selecting Parent Company
public HomePage clickSelectParentCompany()
{
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(selectParentCompanyBtn));
   btn.click();
    return this;

}
    // Clicks parent company dropdown
public HomePage clickParentCompanyDropDown () throws InterruptedException
        {

            driver.findElement(selectParentCompanyDropdown).click();
            return new HomePage(driver);
        }

        public HomePage clickSelectDropdown ()
        {
            driver.findElement(selectDropdown).click();
            return new HomePage(driver);
        }
        public HomePage clickSelectCompanies ()
        {
            driver.findElement(selectCompanies).click();
            return new HomePage(driver);
        }
       public HomePage clickAddNewSubCompany () throws InterruptedException {
            driver.findElement(addNewSubCompanyBtn).click();
            return new HomePage(driver);
        }



}
