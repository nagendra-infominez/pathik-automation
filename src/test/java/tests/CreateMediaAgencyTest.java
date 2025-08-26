package tests;

import base.BaseTest;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CreateMediaAgencyPage;

import java.time.Duration;

public class CreateMediaAgencyTest extends BaseTest {
    @BeforeClass
    public void startBrowser() {
        setup();
    }

    @Test(priority = 0)
    public void testCreateMediaAgency() throws InterruptedException {
        new CreateMediaAgencyPage(driver).clickSignUp();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void testcreateMediaAgencyButton() throws InterruptedException {
        new CreateMediaAgencyPage(driver).ClickMediaAgencyButton();
        Thread.sleep(1000);
    }
    @Test(priority = 2)
    public void testcontinueBtn() throws InterruptedException {
        new CreateMediaAgencyPage(driver).clickcontinueBtn();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void teststartFreeBtn() throws InterruptedException {
        new CreateMediaAgencyPage(driver).clickstartFreeBtn();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void testfirstName() throws InterruptedException {
        new CreateMediaAgencyPage(driver).enterfirstName();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void testlastName() throws InterruptedException {
        new CreateMediaAgencyPage(driver).enterlastName();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void testcompanyName() throws InterruptedException {
        new CreateMediaAgencyPage(driver).entercompanyName();
        Thread.sleep(1000);
    }
    @Test(priority = 7)
    public void testemailAddress() throws InterruptedException {
        new CreateMediaAgencyPage(driver).enteremailAddress();
        Thread.sleep(1000);
    }
    @Test(priority = 7)
    public void testcountryCode() throws InterruptedException {
        new CreateMediaAgencyPage(driver).selectcountryCode();
        Thread.sleep(1000);
    }
    @Test(priority = 8)
    public void testcontactNumber() throws InterruptedException {
        new CreateMediaAgencyPage(driver).enterontactNumber();
        Thread.sleep(1000);
    }
    @Test(priority = 9)
    public void testSubmitBtn() throws InterruptedException {
        new CreateMediaAgencyPage(driver).clicksubmitBtn();
        Thread.sleep(1000);
    }
    @Test(priority = 10)
    public void testcontinueMainBtn() throws InterruptedException {
        Thread.sleep(1000);
        new CreateMediaAgencyPage(driver).clickcontinueMainBtn();
        Thread.sleep(1000);
    }
   @AfterClass
    public void closeBrowser() {
       tearDown();
    }


}
