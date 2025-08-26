package tests;

import base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest
{



    @Test(priority = 0)
    public void selectCompany() throws InterruptedException {
        new HomePage(driver).clickSelectParentCompany();

        //.selectParentCompany()
        Thread.sleep(2000);
        new HomePage(driver).clickParentCompanyDropDown();
        Thread.sleep(2000);
        new HomePage(driver).clickSelectDropdown();
        Thread.sleep(2000);
        new HomePage(driver).clickSelectCompanies();
        Thread.sleep(2000);
        new HomePage(driver).clickAddNewSubCompany();
        Thread.sleep(2000);
    }

    @AfterClass
    public void closeBrowser()
    {
        tearDown();
    }
}
